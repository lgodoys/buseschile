/** Constructor de entidades para TERMINALDESTINO. Define todos los atributos
 * que son usados más adelante en todas las clases, interfaces y
 * controladores de los datos. * 
 */

package entidades;

public class TerminalDestino 
{
    private String idTermDestino;
    private String nombre;
    private String direccion;
    private String telefono;
    private CiudadDestino ciudadDestino;
    
    public void setIDTermDest(String idTermDestino)
    {
        this.idTermDestino = idTermDestino;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }
    
    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
    
    public void setCiudadDestino(CiudadDestino ciudad)
    {
        this.ciudadDestino = ciudad;
    }
    
    public String getIDTermDest()
    {
        return idTermDestino;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getDireccion()
    {
        return direccion;
    }
    
    public String getTelefono()
    {
        return telefono;
    }
    
    public CiudadDestino getCiudadDestino()
    {
        return ciudadDestino;
    }
}
