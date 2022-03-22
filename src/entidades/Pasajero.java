/** Constructor de entidades para PASAJERO. Define todos los atributos
 * que son usados más adelante en todas las clases, interfaces y
 * controladores de los datos. * 
 */

package entidades;

import java.sql.Date;

public class Pasajero
{
    private String idPasajero;
    private String rut;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private Date fechaNac;
    private int edad;
    
    public void setIDPasajero(String idPasajero)
    {
        this.idPasajero = idPasajero;
    }
    
    public void setRUT(String rut)
    {
        this.rut = rut;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setAPaterno(String apPaterno)
    {
        this.apPaterno = apPaterno;
    }
    
    public void setAMaterno(String apMaterno)
    {
        this.apMaterno = apMaterno;
    }
    
    public void setFechaNac(Date fechaNac)
    {
        this.fechaNac = fechaNac;
    }
    
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    
    public String getIDPasajero()
    {
        return idPasajero;
    }
    
    public String getRUT()
    {
        return rut;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getAPaterno()
    {
        return apPaterno;
    }
    
    public String getAMaterno()
    {
        return apMaterno;
    }
    
    public Date getFechaNac()
    {
        return fechaNac;
    }
    
    public int getEdad()
    {
        return edad;
    }
}