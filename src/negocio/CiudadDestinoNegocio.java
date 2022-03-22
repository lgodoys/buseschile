/** Clase Negocio para CIUDADDESTINO. Se encarga de pasar los elementos
 * a la vista gráfica del programa, maneja todos los métodos
 * para que Swing pueda acceder a los datos.
 */

package negocio;

import datos.CiudadDestinoDatos;
import entidades.CiudadDestino;

public class CiudadDestinoNegocio 
{
    private static CiudadDestinoNegocio instancia;
    
    public static CiudadDestinoNegocio getInstancia()
    {
        if(instancia == null)
            instancia = new CiudadDestinoNegocio();
        return instancia;
    }
    
    public int crearCiudad(CiudadDestino ciudadDestino) throws Exception
    {
        int registrosAfectados = CiudadDestinoDatos.getInstancia().ingresar(ciudadDestino);
        return registrosAfectados;
    }
}
