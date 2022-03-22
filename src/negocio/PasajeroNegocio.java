/** Clase Negocio para PASAJERO. Se encarga de pasar los elementos
 * a la vista gráfica del programa, maneja todos los métodos
 * para que Swing pueda acceder a los datos.
 */

package negocio;

import datos.PasajeroDatos;
import entidades.Pasajero;
import java.util.List;

public class PasajeroNegocio 
{
    private static PasajeroNegocio instancia;
    
    public static PasajeroNegocio getInstancia()
    {
        if(instancia == null)
            instancia = new PasajeroNegocio();
        return instancia;
    }

    public int crearPasajero(Pasajero pasajero) throws Exception
    {
        int registrosAfectados = PasajeroDatos.getInstancia().ingresar(pasajero);
        return registrosAfectados;
    }
    
    public int modificarPasajero(Pasajero pasajero) throws Exception
    {
        int registrosAfectados = PasajeroDatos.getInstancia().modificar(pasajero);
        return registrosAfectados;
    }

    public int eliminarPasajero(Pasajero pasajero) throws Exception
    {
        int registrosAfectados = PasajeroDatos.getInstancia().eliminar(pasajero);
        return registrosAfectados;
    }
    
    public List<Pasajero> buscarPasajeros(String nombre) throws Exception
    {
        List<Pasajero> pasajeros = PasajeroDatos.getInstancia().buscar(nombre);
        return pasajeros;
    }
    
    public Pasajero buscarPasajero(String idPasajero) throws Exception
    {
        Pasajero pasajero = PasajeroDatos.getInstancia().buscarPorID(idPasajero);
        return pasajero;
    }
}
