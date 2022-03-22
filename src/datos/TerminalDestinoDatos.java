/**
 * Clase Terminal Destino para manejar los datos del Terminal de Destino
 * Está asociado con la tabla TERMINALDESTINO en BD.
 * Los campos de la BD sobre los cuales realiza acciones son:
 * iddestino tipo CHAR, 5 caracteres => idTermDestino
 * nombre tipo VARCHAR, 30 caracteres => nombre
 * direccion tipo VARCHAR, 50 caracteres => direccion
 * telefono tipo VARCHAR, 12 caracteres => telefono
 * idciudaddestino tipo CHAR, 5 caracteres => ciudadDestino
 * 
 * Utiliza SQL para poder realizar las acciones, sin embargo, el conector
 * lo ejecuta desde otra clase.
 */

package datos;

import interfaces.TerminalDestinoInterfaz;
import entidades.CiudadDestino;
import entidades.TerminalDestino;
import java.sql.*;
import java.util.*;

//Genera la clase TerminalDestinoDatos que es utilizada en la GUI

public class TerminalDestinoDatos implements TerminalDestinoInterfaz
{
    //Genera la conexión a la Base de datos llamando la clase Conexion
    Connection conexion;
    
    private static TerminalDestinoDatos instancia;
    //Genera una instancia nueva (método constructor)    
    public static TerminalDestinoDatos getInstancia()
    {
        if(instancia == null)
            instancia = new TerminalDestinoDatos();
        return instancia;
    }

    /**Genera los métodos para operar sobre la base de datos 
     * (ingresar o leer datos)
     */
    
    @Override
    public int ingresar(TerminalDestino destino) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        PreparedStatement sentencia = null;
        String sentenciaSQL = "INSERT INTO terminaldestino(iddestino, nombre, direccion, telefono, idciudaddestino)"
            + "VALUES(?,?,?,?,?)";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            sentencia.setString(1, destino.getIDTermDest());
            sentencia.setString(2, destino.getNombre());
            sentencia.setString(3, destino.getDireccion());
            sentencia.setString(4, destino.getTelefono());
            sentencia.setString(5, destino.getCiudadDestino().getIDCiudad());
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
    public List<TerminalDestino> buscar() throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        List<TerminalDestino> destinos = new ArrayList<>();
        TerminalDestino terminalDestino = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "SELECT *"
            + "FROM terminaldestino";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            while(resultado.next())
            {
                terminalDestino = new TerminalDestino();
                terminalDestino.setIDTermDest(resultado.getString("iddestino"));
                terminalDestino.setNombre(resultado.getString("nombre"));
                terminalDestino.setDireccion(resultado.getString("direccion"));
                terminalDestino.setTelefono(resultado.getString("telefono"));
                String idCiudad = resultado.getString("idciudaddestino");
                CiudadDestino ciudadDestino = CiudadDestinoDatos.getInstancia().buscar(idCiudad);
                terminalDestino.setCiudadDestino(ciudadDestino);
                destinos.add(terminalDestino);
            }
        }
        catch(SQLException e)
        {
            throw e;
        }
        finally
        {
            conexion.close();
            sentencia.close();
            resultado.close();
        }
        return destinos;
    }
    
    @Override
    public TerminalDestino buscar(String nombre) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        TerminalDestino terminalDestino = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "SELECT * "
            + "FROM terminaldestino t"
            + "INNER JOIN ciudaddestino c on t.idciudaddestino = c.idciudaddestino"
            + "WHERE c.nombre = '"+nombre+"'";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                terminalDestino = new TerminalDestino();
                terminalDestino.setIDTermDest(resultado.getString("iddestino"));
                terminalDestino.setNombre(resultado.getString("nombre"));
                terminalDestino.setDireccion(resultado.getString("direccion"));
                terminalDestino.setTelefono(resultado.getString("telefono"));
                String idCiudad = resultado.getString("idciudaddestino");
                CiudadDestino ciudadDestino = CiudadDestinoDatos.getInstancia().buscar(idCiudad);
                terminalDestino.setCiudadDestino(ciudadDestino);
            }
        }
        catch(SQLException e)
        {
            throw e;
        }
        finally
        {
            conexion.close();
            sentencia.close();
            resultado.close();
        }
        return terminalDestino;
    }
    
    @Override
    public TerminalDestino buscarPorID(String id) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        TerminalDestino terminalDestino = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "SELECT *"
            + "FROM terminaldestino t"
            + "INNER JOIN ciudaddestino c on t.idciudaddestino = c.idciudaddestino"
            + "WHERE t.iddestino = '"+id+"'";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                terminalDestino = new TerminalDestino();
                terminalDestino.setIDTermDest(resultado.getString("iddestino"));
                terminalDestino.setNombre(resultado.getString("nombre"));
                terminalDestino.setDireccion(resultado.getString("direccion"));
                terminalDestino.setTelefono(resultado.getString("telefono"));
                String idCiudad = resultado.getString("idciudaddestino");
                CiudadDestino ciudadDestino = CiudadDestinoDatos.getInstancia().buscar(idCiudad);
                terminalDestino.setCiudadDestino(ciudadDestino);
            }
        }
        catch(SQLException e)
        {
            throw e;
        }
        finally
        {
            conexion.close();
            sentencia.close();
            resultado.close();
        }
        return terminalDestino;
    }
    
}
