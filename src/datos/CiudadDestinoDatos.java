/**
 * Clase CiudadDestino para manejar los datos de la Ciudad de Destino
 * Está asociado con la tabla CIUDADDESTINO en BD.
 * Los campos de la BD sobre los cuales realiza acciones son:
 * idCiudadDestino tipo CHAR, 5 caracteres => ciudadDestinoID
 * nombre tipo VARCHAR, 30 caracteres => nombre
 * provincia tipo VARCHAR, 30 caracteres => provincia
 * region tipo VARCHAR, 30 caracteres => region
 * 
 * Utiliza SQL para poder realizar las acciones, sin embargo, el conector
 * lo ejecuta desde otra clase.
 */

package datos;

import interfaces.CiudadDestinoInterfaz;
import entidades.CiudadDestino;
import java.sql.*;
import java.util.*;

//Genera la clase CiudadDestinoDatos que es utilizada en la GUI
public class CiudadDestinoDatos implements CiudadDestinoInterfaz
{
    //Genera la conexión a la Base de datos llamando la clase Conexion
    Connection conexion;
    
    private static CiudadDestinoDatos instancia;
    //Genera una instancia nueva (método constructor)
    public static CiudadDestinoDatos getInstancia()
    {
        if(instancia == null)
            instancia = new CiudadDestinoDatos();
        return instancia;
    }

    /**Genera los métodos para operar sobre la base de datos 
     * (ingresar o leer datos)
     */

    @Override
    public int ingresar(CiudadDestino ciudad) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        PreparedStatement sentencia = null;
        String sentenciaSQL = "insert into ciudaddestino(idciudaddestino, nombre, provincia, region)"
            + "values(?,?,?,?)";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            sentencia.setString(1,ciudad.getIDCiudad());
            sentencia.setString(2,ciudad.getNombre());
            sentencia.setString(3,ciudad.getProvincia());
            sentencia.setString(4,ciudad.getRegion());
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
    public List<CiudadDestino> listado() throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        List<CiudadDestino> ciudades = new ArrayList<>();
        CiudadDestino ciudadDestino = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "SELECT idciudaddestino, nombre, provincia, region"
            + "from ciudaddestino";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            while(resultado.next())
            {
                ciudadDestino = new CiudadDestino();
                ciudadDestino.setIDCiudad(resultado.getString("idciudaddestino"));
                ciudadDestino.setNombre(resultado.getString("nombre"));
                ciudadDestino.setProvincia(resultado.getString("provincia"));
                ciudadDestino.setRegion(resultado.getString("region"));
                ciudades.add(ciudadDestino);
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
        return ciudades;
    }
    
    @Override
    public CiudadDestino buscar(String idciudad) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        CiudadDestino ciudadDestino = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "select idciudaddestino, nombre, provincia, region"
            + "from ciudaddestino"
            + "where idciudaddestino = '"+idciudad+"'";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                ciudadDestino = new CiudadDestino();
                ciudadDestino.setIDCiudad(resultado.getString("idciudaddestino"));
                ciudadDestino.setNombre(resultado.getString("nombre"));
                ciudadDestino.setProvincia(resultado.getString("provincia"));
                ciudadDestino.setRegion(resultado.getString("region"));
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
        return ciudadDestino;
    }
    
    @Override
    public CiudadDestino buscarPorNombre(String nombre) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        CiudadDestino ciudadDestino = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "select idciudaddestino, nombre, provincia, region"
            + "from ciudaddestino where nombre = '"+nombre+"'";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                ciudadDestino = new CiudadDestino();
                ciudadDestino.setIDCiudad(resultado.getString("idciudaddestino"));
                ciudadDestino.setNombre(resultado.getString("nombre"));
                ciudadDestino.setProvincia(resultado.getString("provincia"));
                ciudadDestino.setRegion(resultado.getString("region"));
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
        return ciudadDestino;
    }
}
