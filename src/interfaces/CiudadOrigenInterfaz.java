/** Interfaz para CiudadOrigen.
 * Agrega los métodos ingresar, listado, buscar y buscarPorNombre con el catch de SQLException
 */

package interfaces;

import entidades.CiudadOrigen;
import java.sql.SQLException;
import java.util.List;

public interface CiudadOrigenInterfaz 
{
    public int ingresar(CiudadOrigen ciudad) throws SQLException;
    
    public List<CiudadOrigen> listado() throws SQLException;
    
    public CiudadOrigen buscar(String idciudad) throws SQLException;
    
    public CiudadOrigen buscarPorNombre(String nombre) throws SQLException;
}
