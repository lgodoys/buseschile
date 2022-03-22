/**
 * Clase Reserva para manejar los datos de la Reserva de pasajes
 * Está asociado con la tabla RESERVA en BD.
 * Los campos de la BD sobre los cuales realiza acciones son:
 * idreserva tipo CHAR, 5 caracteres => idReserva
 * fechareserva tipo date => fechaReserva
 * pasajeroid tipo CHAR, 5 caracteres => idPasajero
 * pasajeid tipo CHAR, 5 caracteres => idPasaje
 * precio tipo decimal, 9 caracteres, 2 decimales => precioReserva
 * pagado tipo tinyint, 1 caracter => isPagado
 * vencido tipo tinyint, 1 caracter => isVencido
 * 
 * Utiliza SQL para poder realizar las acciones, sin embargo, el conector
 * lo ejecuta desde otra clase.
 */
package datos;

import interfaces.ReservaInterfaz;
import entidades.Pasaje;
import entidades.Pasajero;
import entidades.Reserva;
import java.sql.*;
import java.util.*;

//Genera la clase ReservaDatos que es utilizada en la GUI

public class ReservaDatos implements ReservaInterfaz
{
    //Genera la conexión a la Base de datos llamando la clase Conexion
    Connection conexion;
    
    private static ReservaDatos instancia;
    //Genera una instancia nueva (método constructor)    
    public static ReservaDatos getInstancia()
    {
        if(instancia == null)
            instancia = new ReservaDatos();
        return instancia;
    }

    /**Genera los métodos para operar sobre la base de datos 
     * (ingresar o leer datos)
     */
    
    @Override
    public int ingresar(Reserva reserva) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        int registrosAfectados;
        PreparedStatement sentencia = null;
        String sentenciaSQL = "INSERT INTO reserva(idreserva,fechareserva,pasajeroid,pasajeid,precio,pagado,vencido)"
            + "VALUES(?,?,?,?,?,?,?)";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            sentencia.setString(1, reserva.getIDReserva());
            sentencia.setDate(2, reserva.getFechaReserva());
            sentencia.setString(3, reserva.getPasajero().getIDPasajero());
            sentencia.setString(4, reserva.getPasaje().getIDPasaje());
            sentencia.setDouble(5, reserva.getPrecioReserva());
            sentencia.setBoolean(6, reserva.getPagado());
            sentencia.setBoolean(7, reserva.getVencido());
            registrosAfectados = sentencia.executeUpdate();
            if(registrosAfectados == 1)
                PasajeDatos.getInstancia().modificarEstado(reserva.getPasaje());
            return registrosAfectados;
        }
        catch (SQLException e)
        {
            throw e;
        }
        finally
        {
            conexion.close();
            sentencia.close();
        }
    }
    
    @Override
    public List<Reserva> listado() throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "SELECT *"
            + "FROM reserva";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            while(resultado.next())
            {
                reserva = new Reserva();
                reserva.setIDReserva(resultado.getString("idreserva"));
                reserva.setFechaReserva(resultado.getDate("fechareserva"));
                String idPasajero = resultado.getString("idpasajero");
                Pasajero pasajero = PasajeroDatos.getInstancia().buscarPorID(idPasajero);
                reserva.setPasajero(pasajero);
                String idPasaje = resultado.getString("idpasaje");
                Pasaje pasaje = PasajeDatos.getInstancia().buscarPorID(idPasaje);
                reserva.setPasaje(pasaje);
                reserva.setPrecioReserva(resultado.getDouble("precio"));
                reserva.setPagado(resultado.getBoolean("pagado"));
                reserva.setVencido(resultado.getBoolean("vencido"));
                reservas.add(reserva);
            }
        }
        catch (SQLException e)
        {
            throw e;
        }
        finally
        {
            conexion.close();
            sentencia.close();
            resultado.close();
        }
        return reservas;
    }
}
