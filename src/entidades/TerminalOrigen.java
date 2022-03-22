/** Constructor de entidades para TERMINALORIGEN. Define todos los atributos
 * que son usados más adelante en todas las clases, interfaces y
 * controladores de los datos. * 
 */

package entidades;

public class TerminalOrigen 
{
    private String idTermOrigen;
    private String nombre;
    private String direccion;
    private String telefono;
    private CiudadOrigen ciudadOrigen;
    
    public void setIDTermOrig(String idTermOrigen)
    {
        this.idTermOrigen = idTermOrigen;
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
    
    public void setCiudadOrigen(CiudadOrigen ciudad)
    {
        this.ciudadOrigen = ciudad;
    }
    
    public String getIDTermOrig()
    {
        return idTermOrigen;
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
    
    public CiudadOrigen getCiudadOrigen()
    {
        return ciudadOrigen;
    }
    
}