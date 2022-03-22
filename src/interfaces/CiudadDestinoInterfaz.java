/** Interfaz para CiuadDestino.
 * Agrega los métodos ingresar, listado buscar y buscarPorNombre con el catch de SQLException
 */
package interfaces;

import entidades.CiudadDestino;
import java.sql.SQLException;
import java.util.List;

public interface CiudadDestinoInterfaz 
{
    public int ingresar(CiudadDestino ciudad) throws SQLException;
    
    public List<CiudadDestino> listado() throws SQLException;
    
    public CiudadDestino buscar(String ciudadId) throws SQLException;
    
    public CiudadDestino buscarPorNombre(String nombre) throws SQLException;
}
