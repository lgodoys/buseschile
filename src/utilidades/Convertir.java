/**
 * Utilidad conversor de formatos.
 * Convierte formato Date a SQLDate para su uso en SQL.
 * Convierte formato de fecha a formato Simple para su uso
 * en los campos de fecha/hora donde es requerido
 */

package utilidades;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Convertir 
{
    public static java.sql.Date convierteDateToSQLDate(java.util.Date date)
    {
        return new java.sql.Date(date.getTime());
    }
    
    public static String convertirFechaString(Date date)
    {
        Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(date);
    }
}
