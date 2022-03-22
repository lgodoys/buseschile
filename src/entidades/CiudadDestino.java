/** Constructor de entidades para CIUDADDESTINO. Define todos los atributos
 * que son usados más adelante en todas las clases, interfaces y
 * controladores de los datos. * 
 */

package entidades;

public class CiudadDestino 
{
    private String ciudadDestinoID;
    private String nombre;
    private String provincia;
    private String region;
    
    public void setIDCiudad(String ciudadDestinoID)
    {
        this.ciudadDestinoID = ciudadDestinoID;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setProvincia(String provincia)
    {
        this.provincia = provincia;
    }
    public void setRegion(String region)
    {
        this.region = region;
    }
        
    public String getIDCiudad()
    {
        return ciudadDestinoID;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getProvincia()
    {
        return provincia;
    }
    public String getRegion()
    {
        return region;
    }
}
