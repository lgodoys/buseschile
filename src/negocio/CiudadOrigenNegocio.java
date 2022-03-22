/** Clase Negocio para CIUDADORIGEN. Se encarga de pasar los elementos
 * a la vista gráfica del programa, maneja todos los métodos
 * para que Swing pueda acceder a los datos.
 */

package negocio;

import datos.CiudadOrigenDatos;
import entidades.CiudadOrigen;

public class CiudadOrigenNegocio 
{
    private static CiudadOrigenNegocio instancia;
    public static CiudadOrigenNegocio getInstancia()
    {
        if(instancia == null)
            instancia = new CiudadOrigenNegocio();
        return instancia;
    }
    
    public int crearCiudad(CiudadOrigen ciudadOrigen) throws Exception
    {
        int registrosAfectados = CiudadOrigenDatos.getInstancia().ingresar(ciudadOrigen);
        return registrosAfectados;
    }
}
