/**
 * Clase Pasaje para manejar los datos de Pasajes
 * Está asociado con la tabla PASAJE en BD.
 * Los campos de la BD sobre los cuales realiza acciones son:
 * idPasaje tipo CHAR, 5 caracteres => idPasaje
 * horaSalida tipo VARCHAR, 10 caracteres => horaViaje
 * fechaSalida tipo DATE => fechaViaje
 * asiento tipo int => asientoPax
 * busId tipo CHAR, 5 caracteres => idBus
 * idPasajero tipo CHAR, 5 caracteres => idPasajero
 * precioPasaje tipo DOUBLE => precioPasaje
 * 
 * Utiliza SQL para poder realizar las acciones, sin embargo, el conector
 * lo ejecuta desde otra clase.
 */

package datos;

import interfaces.PasajeInterfaz;
import entidades.Bus;
import entidades.Pasaje;
import java.sql.*;
import java.util.*;

//Genera la clase PasajeDatos que es utilizada en la GUI
public class PasajeDatos implements PasajeInterfaz
{
    //Genera la conexión a la Base de datos llamando la clase Conexion
    Connection conexion;
    
    private static PasajeDatos instancia;
    //Genera una instancia nueva (método constructor)    
    public static PasajeDatos getInstancia()
    {
        if(instancia == null)
            instancia = new PasajeDatos();
        return instancia;
    }

    /**Genera los métodos para operar sobre la base de datos 
     * (ingresar o leer datos)
     */
    
    @Override
    public int ingresar(Pasaje pasaje) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        PreparedStatement sentencia = null;
        String sentenciaSQL = "INSERT INTO pasaje(idpasaje, horasalida, fechasalida, estado, asiento, busid, idpasajero, preciopasaje)"
            + "VALUES(?,?,?,?,?,?,?,?)";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            sentencia.setString(1, pasaje.getIDPasaje());
            sentencia.setString(2, pasaje.getHoraViaje());
            sentencia.setDate(3, pasaje.getFechaViaje());
            sentencia.setString(4, pasaje.getEstado());
            sentencia.setInt(5, pasaje.getAsientoPax());
            sentencia.setString(6, pasaje.getBus().getIDBus());
            sentencia.setString(7, pasaje.getIDPasajero());
            sentencia.setDouble(8, pasaje.getPrecioPasaje());
            return sentencia.executeUpdate();
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
    public List<Pasaje> buscar(String estado) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        List<Pasaje> pasajeros = new ArrayList<>();
        Pasaje pasaje;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "SELECT * "
            + "FROM pasaje p"
            + "INNER JOIN bus b on p.idbus = b.idbus"
            + "WHERE p.estado = '"+estado+"'";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            while(resultado.next())
            {
                pasaje = new Pasaje();
                pasaje.setIDPasaje(resultado.getString("idpasaje"));
                pasaje.setHoraViaje(resultado.getString("horasalida"));
                pasaje.setFechaViaje(resultado.getDate("fechasalida"));
                pasaje.setEstado(resultado.getString("estado"));
                pasaje.setAsientoPax(resultado.getInt("asiento"));
                String idBus = resultado.getString("busid");
                Bus bus = BusDatos.getInstancia().buscar(idBus);
                pasaje.setBus(bus);
                pasaje.setIDPasajero(resultado.getString("idpasajero"));
                pasaje.setPrecioPasaje(resultado.getDouble("preciopasaje"));
                pasajeros.add(pasaje);
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
        return pasajeros;
    }
    
    @Override
    public int modificarEstado(Pasaje pasaje) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        PreparedStatement sentencia = null;
        String sentenciaSQL = "UPDATE pasaje SET estado = ?"
            + "WHERE idpasaje = ?";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            sentencia.setString(1, pasaje.getEstado());
            sentencia.setString(2, pasaje.getIDPasaje());
            return sentencia.executeUpdate();
        }
        catch(SQLException e)
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
    public Pasaje buscarPorID(String idPasaje) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        Pasaje pasaje = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "SELECT *"
            + "FROM pasaje p"
            + "INNER JOIN bus b on p.idbus = b.idbus"
            + "WHERE p.idpasaje = '"+idPasaje+"'";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            while(resultado.next())
            {
                pasaje = new Pasaje();
                pasaje.setIDPasaje(resultado.getString("idpasaje"));
                pasaje.setHoraViaje(resultado.getString("horasalida"));
                pasaje.setFechaViaje(resultado.getDate("fechasalida"));
                pasaje.setEstado(resultado.getString("estado"));
                pasaje.setAsientoPax(resultado.getInt("asiento"));
                String idBus = resultado.getString("idbus");
                Bus bus = BusDatos.getInstancia().buscar(idBus);
                pasaje.setBus(bus);
                pasaje.setIDPasajero(resultado.getString("idpasajero"));
                pasaje.setPrecioPasaje(resultado.getDouble("preciopasaje"));
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
        return pasaje;
    }
}
