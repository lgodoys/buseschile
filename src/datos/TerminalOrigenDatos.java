/**
 * Clase TerminalOrigen para manejar los datos del Terminal de Origen
 * Está asociado con la tabla TERMINALDESTINO en BD.
 * Los campos de la BD sobre los cuales realiza acciones son:
 * idorigen tipo CHAR, 5 caracteres => idOrigen
 * nombre tipo VARCHAR, 30 caracteres => nombre
 * direccion tipo VARCHAR, 50 caracteres => direccion
 * telefono tipo VARCHAR, 12 caracteres => telefono
 * idciudadorigen tipo CHAR, 5 caracteres => idCiudadOrigen
 * 
 * Utiliza SQL para poder realizar las acciones, sin embargo, el conector
 * lo ejecuta desde otra clase.
 */

package datos;

import entidades.TerminalOrigen;
import entidades.CiudadOrigen;
import interfaces.TerminalOrigenInterfaz;
import java.sql.*;
import java.util.*;

//Genera la clase TerminalOrigenDatos que es utilizada en la GUI

public class TerminalOrigenDatos implements TerminalOrigenInterfaz
{
    //Genera la conexión a la Base de datos llamando la clase Conexion
    Connection conexion;
    
    private static TerminalOrigenDatos instancia;
    //Genera una instancia nueva (método constructor)    
    public static TerminalOrigenDatos getInstancia()
    {
        if(instancia == null)
            instancia = new TerminalOrigenDatos();
        return instancia;
    }

    /**Genera los métodos para operar sobre la base de datos 
     * (ingresar o leer datos)
     */
    
    @Override
    public int ingresar(TerminalOrigen terminalOrigen) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        PreparedStatement sentencia = null;
        String sentenciaSQL = "INSERT INTO terminalorigen(idorigen,nombre,direccion,telefono,idciudadorigen)"
            + "values(?,?,?,?,?)";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            sentencia.setString(1,terminalOrigen.getIDTermOrig());
            sentencia.setString(2,terminalOrigen.getNombre());
            sentencia.setString(3,terminalOrigen.getDireccion());
            sentencia.setString(4,terminalOrigen.getTelefono());
            sentencia.setString(5,terminalOrigen.getCiudadOrigen().getIDCiudad());
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
    public List<TerminalOrigen> buscar() throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        List<TerminalOrigen> origenes = new ArrayList<>();
        TerminalOrigen terminal = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "SELECT *"
            + "FROM terminalorigen";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            while(resultado.next())
            {
                terminal = new TerminalOrigen();
                terminal.setIDTermOrig(resultado.getString("idorigen"));
                terminal.setNombre(resultado.getString("nombre"));
                terminal.setDireccion(resultado.getString("direccion"));
                terminal.setTelefono(resultado.getString("telefono"));
                String idCiudad = resultado.getString("idciudadorigen");
                CiudadOrigen ciudadOrigen = CiudadOrigenDatos.getInstancia().buscar(idCiudad);
                terminal.setCiudadOrigen(ciudadOrigen);
                origenes.add(terminal);
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
        return origenes;
    }
    
    @Override
    public TerminalOrigen buscar(String nombreCiudad) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        TerminalOrigen terminalOrigen = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "SELECT *"
            + "FROM terminalorigen t"
            + "INNER JOIN ciudadorigen c on t.idciudadorigen = c.idciudadorigen"
            + "where t.nombre = '"+nombreCiudad+"'";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            while(resultado.next())
            {
                terminalOrigen = new TerminalOrigen();
                terminalOrigen.setIDTermOrig(resultado.getString("idorigen"));
                terminalOrigen.setNombre(resultado.getString("nombre"));
                terminalOrigen.setDireccion(resultado.getString("direccion"));
                terminalOrigen.setTelefono(resultado.getString("telefono"));
                String idCiudad = resultado.getString("idciudadorigen");
                CiudadOrigen ciudadOrigen = CiudadOrigenDatos.getInstancia().buscar(idCiudad);
                terminalOrigen.setCiudadOrigen(ciudadOrigen);
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
        return terminalOrigen;
    }
    
    @Override
    public TerminalOrigen buscarPorID(String id) throws SQLException
    {
        conexion = Conexion.getInstancia().miConexion();
        TerminalOrigen terminalOrigen = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        String sentenciaSQL = "SELECT *"
            + "FROM terminalorigen t"
            + "INNER JOIN ciudadorigen c on t.idciudadorigen = c.idciudadorigen"
            + "WHERE idorigen = '"+id+"'";
        try
        {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            resultado = sentencia.executeQuery();
            if(resultado.next())
            {
                terminalOrigen = new TerminalOrigen();
                terminalOrigen.setIDTermOrig(resultado.getString("idorigen"));
                terminalOrigen.setNombre(resultado.getString("nombre"));
                terminalOrigen.setDireccion(resultado.getString("direccion"));
                terminalOrigen.setTelefono(resultado.getString("telefono"));
                String idCiudad = resultado.getString("idciudadorigen");
                CiudadOrigen ciudadOrigen = CiudadOrigenDatos.getInstancia().buscar(idCiudad);
                terminalOrigen.setCiudadOrigen(ciudadOrigen);
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
        return terminalOrigen;
    }
}