/** Clase Negocio para PASAJE. Se encarga de pasar los elementos
 * a la vista gráfica del programa, maneja todos los métodos
 * para que Swing pueda acceder a los datos.
 */

package negocio;

import datos.PasajeDatos;
import entidades.Pasaje;
import java.util.List;

public class PasajeNegocio 
{
    private static PasajeNegocio instancia;
    
    public static PasajeNegocio getInstancia()
    {
        if(instancia == null)
            instancia = new PasajeNegocio();
        return instancia;
    }
    
    public int crearPasaje(Pasaje pasaje) throws Exception
    {
        int registrosAfectados = PasajeDatos.getInstancia().ingresar(pasaje);
        return registrosAfectados;
    }
    
    public List<Pasaje> buscarPasajes(String estado) throws Exception
    {
        List<Pasaje> pasajes = PasajeDatos.getInstancia().buscar(estado);
        return pasajes;
    }
}
