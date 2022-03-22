/**
 * Clase Pasajero para manejar los datos de Pasajeros
 * Está asociado con la tabla PASAJERO en BD.
 * Los campos de la BD sobre los cuales realiza acciones son:
 * idpasajero tipo CHAR, 5 caracteres => idPasajero
 * rut tipo CHAR, 10 caracteres => rut
 * nombre tipo VARCHAR, 20 caracteres => nombre
 * appaterno tipo VARCHAR, 30 caracteres => apPaterno
 * apmaterno tipo VARCHAR, 30 caracteres => apMaterno
 * fechaNacimiento tipo DATE => fechaNac
 * edad tipo int => edad
 * 
 * Utiliza SQL para poder realizar las acciones, sin embargo, el conector
 * lo ejecuta desde otra clase.
 */

package datos;

import interfaces.PasajeroInterfaz;
import entidades.Pasajero;
import java.sql.*;
import java.util.*;

//Genera la clase PasajeroDatos que es utilizada en la GUI

public class PasajeroDatos implements PasajeroInterfaz
{
    //Genera la conexión a la Base de datos llamando la clase Conexion
    Connection conexion = null;
    
    private static PasajeroDatos instancia;
    //Genera una instancia nueva (método constructor)    
    public static PasajeroDatos getInstancia()
    {
        if(instancia == null)
            instancia = new PasajeroDatos();
        return instancia;
    }

    /**Genera los métodos para operar sobre la base de datos 
     * (ingresar o leer datos)
     */
    
    @Override
    public int ingresar(Pasajero pasajero) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        PreparedStatement sentencia = null;
        String sentenciaSQL = "INSERT INTO pasajero(idPasajero, rut, nombre, appaterno, apmaterno, fechanacimiento, edad)"
            + "values(?,?,?,?,?,?,?)";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            sentencia.setString(1, pasajero.getIDPasajero());
            sentencia.setString(2, pasajero.getRUT());
            sentencia.setString(3, pasajero.getNombre());
            sentencia.setString(4, pasajero.getAPaterno());
            sentencia.setString(5, pasajero.getAMaterno());
            sentencia.setDate(6, pasajero.getFechaNac());
            sentencia.setInt(7, pasajero.getEdad());
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
    public int modificar(Pasajero pasajero) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        PreparedStatement sentencia = null;
        String sentenciaSQL = "UPDATE pasajero SET rut = ?, nombre = ?, appaterno = ?, apmaterno = ?, fechanacimiento = ?, edad = ?"
            + "WHERE idpasajero = ?";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            sentencia.setString(1, pasajero.getRUT());
            sentencia.setString(2, pasajero.getNombre());
            sentencia.setString(3, pasajero.getAPaterno());
            sentencia.setString(4, pasajero.getAMaterno());
            sentencia.setDate(5, pasajero.getFechaNac());
            sentencia.setInt(6, pasajero.getEdad());
            sentencia.setString(7, pasajero.getIDPasajero());
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
    public int eliminar(Pasajero pasajero) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        PreparedStatement sentencia = null;
        String sentenciaSQL = "DELETE FROM pasajero "
            + "WHERE rut = ?";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            sentencia.setString(1, pasajero.getRUT());
            return sentencia.executeUpdate();
        }
        catch (Exception e)
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
    public List<Pasajero> buscar(String nombre) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        List<Pasajero> pasajeros = new ArrayList<>();
        Pasajero pasajero;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "SELECT *"
            + "FROM pasajero"
            + "WHERE rut like '%"+nombre+"%'";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            while(resultado.next())
            {
                pasajero = new Pasajero();
                pasajero.setIDPasajero(resultado.getString("idpasajero"));
                pasajero.setRUT(resultado.getString("rut"));
                pasajero.setNombre(resultado.getString("nombre"));
                pasajero.setAPaterno(resultado.getString("appaterno"));
                pasajero.setAMaterno(resultado.getString("apmaterno"));
                pasajero.setFechaNac(resultado.getDate("fechanacimiento"));
                pasajero.setEdad(resultado.getInt("edad"));
                pasajeros.add(pasajero);
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
    public Pasajero buscarPorID(String idPasajero) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        Pasajero pasajero = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "SELECT * "
            + "FROM pasajero"
            + "WHERE idpasajero = '"+idPasajero+"'";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                pasajero = new Pasajero();
                pasajero.setIDPasajero(resultado.getString("idpasajero"));
                pasajero.setRUT(resultado.getString("rut"));
                pasajero.setNombre(resultado.getString("nombre"));
                pasajero.setAPaterno(resultado.getString("appaterno"));
                pasajero.setAMaterno(resultado.getString("apmaterno"));
                pasajero.setFechaNac(resultado.getDate("fechanacimiento"));
                pasajero.setEdad(resultado.getInt("edad"));
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
        return pasajero;
    }
    
    @Override
    public Pasajero buscarPorRUT(String rut) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        Pasajero pasajero = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "SELECT *"
            + "FROM pasajero"
            + "WHERE rut = '"+rut+"'";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                pasajero = new Pasajero();
                pasajero.setIDPasajero(resultado.getString("idpasajero"));
                pasajero.setRUT(resultado.getString("rut"));
                pasajero.setNombre(resultado.getString("nombre"));
                pasajero.setAPaterno(resultado.getString("appaterno"));
                pasajero.setAMaterno(resultado.getString("apmaterno"));
                pasajero.setFechaNac(resultado.getDate("fechanacimiento"));
                pasajero.setEdad(resultado.getInt("edad"));
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
        return pasajero;
    }
}
