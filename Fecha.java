import java.util.List;
import java.util.ArrayList;
/**
 * Fecha: clase cuyos objetos representan fechas calendarias, para el 
 * calendario gregoriano. Esta clase implementa una variedad de 
 * funcionalidades sobre fechas, como comparaciones, c�mputos de d�as,
 * etc.
 * 
 * @author N. Aguirre 
 * @version 0.1
 */
public class Fecha
{
    // dia de la fecha
    private int dia;
    
    // mes de la fecha
    private int mes;
    
    // a�o de la fecha
    private int anho;
    
    private int diasValidos;
    private boolean esBisiesto;
    
    /**
     * Constructor por defecto, para la clase fecha.
     * Crea como fecha por defecto la fecha inicial del 
     * calendario gregoriano (15/10/1582)
     */
    public Fecha()
    {
        dia = 15;
        mes = 10;
        anho = 1582;
    }

    /**
     * Constructor de la clase Fecha, que recibe la fecha a 
     * crear como par�metro. La fecha no puede ser previa
     * al 15/10/1582. Debe tenerse en cuenta la creaci�n de
     * fechas v�lidas, en relaci�n a n�mero de d�as en los
     * meses, a�os bisiestos, etc.
     */
    public Fecha(int nuevoDia, int nuevoMes, int nuevoAnho){
        // Implementar este constructor
        assert nuevoDia >= 1 && nuevoDia <=31:"introduzca un dia valido";
        assert nuevoMes >= 1 && nuevoMes <=12:"introduzca un mes correcto";
        assert nuevoAnho >= 1582:"introduzca un a�o mayor o igual a 1582";
        
        if (nuevoAnho == 1582){
        assert nuevoMes >= 10:"introduzca un mes mayor o igual a 10";
        if (nuevoMes == 10){
        assert nuevoDia >= 15:"introduzca un dia mayor o igual a 15";
        }
        }
        
        
        }
    
    /**
     * Retorna el dia de la fecha
     */
    public int obtenerDia() {
        // Implementar este m�todo, reemplazando la l�nea siguiente
        return dia;
    }
    
    /**
     * Retorna el mes de la fecha
     */
    public int obtenerMes() {
        // Implementar este m�todo, reemplazando la l�nea siguiente
        return mes;
    }
    
    /**
     * Retorna el a�o de la fecha
     */
    public int obtenerAnho() {
        // Implementar este m�todo, reemplazando la l�nea siguiente
        return anho;
    }
    
    /**
     * Cambia el d�a de la fecha. El nuevo d�a debe ser v�lido
     * para el mes y a�o actuales.
     */
    public void cambiarDia(int nuevoDia) {
        //Implementar este m�todo
        
        dia=nuevoDia;
    }
    
    /**
     * Cambia el mes de la fecha. El nuevo mes debe ser v�lido
     * para el d�a y a�o actuales.
     */
    public void cambiarMes(int nuevoMes) {
        //Implementar este m�todo
        assert nuevoMes >= 1 && nuevoMes <=12:"introduzca un mes correcto";
        mes=nuevoMes;
    }
    
    /**
     * Cambia el a�o de la fecha. El nuevo a�o debe ser v�lido
     * para el d�a y mes aactuales.
     */
    public void cambiarAnho(int nuevoAnho) {
        //Implementar este m�todo
        assert nuevoAnho >= 1582:"introduzca un a�o mayor o igual a 1582";
        anho=nuevoAnho;
    }
    
    /**
     * Chequea si la fecha es igual a otra fecha dada
     */
    public boolean equals(Fecha otraFecha) {
        // Implementar este m�todo, reemplazando la l�nea siguiente
        return true;
    }
    
    /**
     * Chequea si la fecha es anterior a otra fecha dada
     */
    public boolean esAnterior(Fecha otraFecha) {
        // Implementar este m�todo, reemplazando la l�nea siguiente
        return true;
    }
    
    /**
     * Computa distancia en d�as entre dos fechas.
     * El par�metro otraFecha debe corresponder a una fecha igual o 
     * posterior a la fecha del objeto.
     */
    public int cantidad(Fecha otraFecha) {
        // Implementar este m�todo, reemplazando la l�nea siguiente
        return 0;
    }
    
    /**
     * Computa la cantidad de d�as de un mes dado. El par�metro
     * debe corresponder a un mes v�lido.
     */
    public int cantDias(int unMes) 
    {
        // Implementar este m�todo, reemplazando la l�nea siguiente
        assert(unMes >= 1 && unMes <= 12):"mes invalido";
        int diaMes=0;
        if(unMes==1||unMes==3||unMes==5||unMes==7||unMes==8||unMes==10||unMes==12){
            return 31;
        }
        if(unMes == 2 && esBisiesto == true){
            return 29;
        }
        if(unMes == 2 && esBisiesto == false){
            return 28;
        }
        else{
            return 30;
        }
        
    }
    
    /**
     * Decide si un a�o dado es bisiesto o no. Un a�o es bisiesto
     * si es m�ltiplo de 4, salvo los m�ltiplos de 100 que no son 
     * m�ltiplos de 400.
     * El par�metro debe corresponder a un a�o v�lido.
     */
    private boolean esBisiesto(int unAnho) 
    {
        // Implementar este m�todo, reemplazando la l�nea siguiente
        if (unAnho %4 == 0||unAnho %100 == 0 && unAnho %400 == 0){
            esBisiesto = true;
            return true;
        }
        else{
            esBisiesto = false;
            return false;
            }
        }
}
