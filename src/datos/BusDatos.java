/**
 * Clase Bus para manejar los datos del Bus
 * Está asociado con la tabla BUS en BD.
 * Los campos de la BD sobre los cuales realiza acciones son:
 * idBus tipo CHAR, 5 caracteres => idBus
 * terminalOrigenID tipo CHAR, 5 caracteres => origen
 * terminalDestinoID tipo CHAR, 5 caracteres => destino.
 * 
 * Utiliza SQL para poder realizar las acciones, sin embargo, el conector
 * lo ejecuta desde otra clase.
 */

package datos;

import interfaces.BusInterfaz;
import entidades.Bus;
import entidades.TerminalOrigen;
import entidades.TerminalDestino;
import java.sql.*;

//Genera la clase BusDatos que es utilizada en la GUI
public class BusDatos implements BusInterfaz
{
    //Genera la conexión a la Base de datos llamando la clase Conexion
    Connection conexion;
    
    private static BusDatos instancia;
    //Genera una instancia nueva (método constructor)
    public static BusDatos getInstancia(){
        if(instancia == null)
            instancia = new BusDatos();
        return instancia;
    }
    /**Genera los métodos para operar sobre la base de datos 
     * (ingresar o leer datos)
     */
    
    @Override
    public int ingresar(Bus bus) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        PreparedStatement sentencia = null;
        String sentenciaSQL = "INSERT INTO bus(idBus, terminalOrigenID, terminalDestinoID, estado) values (?,?,?,?)";
        try {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            sentencia.setString(1,bus.getIDBus());
            sentencia.setString(2,bus.getOrigen().getIDTermOrig());
            sentencia.setString(3,bus.getDestino().getIDTermDest());
            sentencia.setString(4,bus.getEstado());
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
    public Bus buscar(String idBus) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        Bus bus = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "SELECT * "
            + "FROM bus b"
            + "inner join terminalorigen as o on b.terminalOrigenID = o.idOrigen"
            + "inner join destino as d on b.terminalDestinoID = d.idDestino"
            + "where b.idBus = '"+idBus+"'";
        
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                bus = new Bus();
                bus.setIDBus(resultado.getString("idBus"));
                String terminalorigenid = resultado.getString("terminalOrigenID");
                TerminalOrigen terminalOrigen = TerminalOrigenDatos.getInstancia().buscarPorID(terminalorigenid);
                bus.setOrigen(terminalOrigen);
                String terminaldestinoid = resultado.getString("terminalDestinoID");
                TerminalDestino terminalDestino = TerminalDestinoDatos.getInstancia().buscarPorID(terminaldestinoid);
                bus.setDestino(terminalDestino);
                bus.setEstado(resultado.getString("estado"));
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
        return bus;
    }
    
}
