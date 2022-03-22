/**
 * Clase Bus para manejar los datos del Bus
 * Está asociado con la tabla CIUDADORIGEN en BD.
 * Los campos de la BD sobre los cuales realiza acciones son:
 * idCiudadOrigen tipo CHAR, 5 caracteres => idCiudadOrigen
 * nombre tipo VARCHAR, 30 caracteres => nombre
 * provincia tipo VARCHAR, 30 caracteres => provincia
 * region tipo VARCHAR, 30 caracteres => region
 * 
 * Utiliza SQL para poder realizar las acciones, sin embargo, el conector
 * lo ejecuta desde otra clase.
 */

package datos;

import interfaces.CiudadOrigenInterfaz;
import entidades.CiudadOrigen;
import java.sql.*;
import java.util.*;

//Genera la clase BusDatos que es utilizada en la GUI
public class CiudadOrigenDatos implements CiudadOrigenInterfaz
{
    //Genera la conexión a la Base de datos llamando la clase Conexion
    Connection conexion;
    
    private static CiudadOrigenDatos instancia;
    //Genera una instancia nueva (método constructor)    
    public static CiudadOrigenDatos getInstancia()
    {
        if(instancia == null)
            instancia = new CiudadOrigenDatos();
        return instancia;
    }

    /**Genera los métodos para operar sobre la base de datos 
     * (ingresar o leer datos)
     */

    @Override
    public int ingresar(CiudadOrigen ciudadOrigen) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        PreparedStatement sentencia = null;
        String sentenciaSQL = "insert into ciudadorigen(idciudadorigen, nombre, provincia, region)"
            + "values(?,?,?,?)";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            sentencia.setString(1, ciudadOrigen.getIDCiudad());
            sentencia.setString(2, ciudadOrigen.getNombre());
            sentencia.setString(3, ciudadOrigen.getProvincia());
            sentencia.setString(4, ciudadOrigen.getRegion());
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
    public List<CiudadOrigen> listado() throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        List<CiudadOrigen> ciudades = new ArrayList<>();
        CiudadOrigen ciudadOrigen = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "SELECT *"
            + "FROM ciudadorigen";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            while(resultado.next())
            {
                ciudadOrigen = new CiudadOrigen();
                ciudadOrigen.setIDCiudad(resultado.getString("idciudadorigen"));
                ciudadOrigen.setNombre(resultado.getString("nombre"));
                ciudadOrigen.setProvincia(resultado.getString("provincia"));
                ciudadOrigen.setRegion(resultado.getString("region"));
                ciudades.add(ciudadOrigen);
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
    public CiudadOrigen buscar(String idCiudad) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        CiudadOrigen ciudad = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "select *"
            + "FROM ciudadorigen"
            + "WHERE idciudadorigen = '"+idCiudad+"'";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                ciudad = new CiudadOrigen();
                ciudad.setIDCiudad(resultado.getString("idciudadorigen"));
                ciudad.setNombre(resultado.getString("nombre"));
                ciudad.setProvincia(resultado.getString("provincia"));
                ciudad.setRegion(resultado.getString("region"));
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
        return ciudad;
    }
    
    @Override
    public CiudadOrigen buscarPorNombre(String nombre) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        CiudadOrigen ciudadOrigen = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "SELECT *"
            + "FROM ciudadorigen"
            + "where nombre = '"+nombre+"'";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                ciudadOrigen = new CiudadOrigen();
                ciudadOrigen.setIDCiudad(resultado.getString("idciudadorigen"));
                ciudadOrigen.setNombre(resultado.getString("nombre"));
                ciudadOrigen.setProvincia(resultado.getString("provincia"));
                ciudadOrigen.setRegion(resultado.getString("region"));
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
        return ciudadOrigen;
    }
}
