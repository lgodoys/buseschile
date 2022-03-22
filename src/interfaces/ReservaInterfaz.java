/** Interfaz para Reserva.
 * Agrega los métodos ingresar y listado con el catch de SQLException
 */
package interfaces;

import entidades.Reserva;
import java.sql.SQLException;
import java.util.List;

public interface ReservaInterfaz 
{
    public int ingresar(Reserva reserva) throws SQLException;
    
    public List<Reserva> listado() throws SQLException;
}
