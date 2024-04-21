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
    
    // comprueba si el a�o es bisiesto
    private boolean esBisiesto;
    
    private int diaMes;
    
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
        if (nuevoAnho == 1582){
        assert nuevoMes >= 10:"introduzca un mes mayor o igual a 10";
        if (nuevoMes == 10){
        assert nuevoDia >= 15:"introduzca un dia mayor o igual a 15";
        }
        }
        anho=nuevoAnho;
        
        if (nuevoAnho % 4 == 0 || nuevoAnho % 100 == 0 && nuevoAnho % 400 == 0){
            esBisiesto = true;
        }
        else{
            esBisiesto = false;
        }
        assert nuevoMes >= 1 && nuevoMes <=12:"introduzca un mes correcto";
        mes=nuevoMes;
        if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
        assert nuevoDia >= 1 && nuevoDia <=31:"introduzca un dia valido";
        }
        if(mes == 2 && esBisiesto == true){
        assert nuevoDia >= 1 && nuevoDia <=29:"introduzca un dia valido";
        }
        if(mes == 2 && esBisiesto == false){
        assert nuevoDia >= 1 && nuevoDia <=28:"introduzca un dia valido";
        }
        if(mes==4||mes==6||mes==9||mes==11){
        assert nuevoDia >= 1 && nuevoDia <=30:"introduzca un dia valido";
        }
        assert nuevoAnho >= 1582:"introduzca un a�o mayor o igual a 1582";
        
        
        dia=nuevoDia;
        anho=nuevoAnho;
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
        if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
        assert nuevoDia >= 1 && nuevoDia <=31:"introduzca un dia valido";
        }
        if(mes == 2 && esBisiesto == true){
        assert nuevoDia >= 1 && nuevoDia <=29:"introduzca un dia valido";
        }
        if(mes == 2 && esBisiesto == false){
        assert nuevoDia >= 1 && nuevoDia <=28:"introduzca un dia valido";
        }
        else{
        assert nuevoDia >= 1 && nuevoDia <=30:"introduzca un dia valido";
        }
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
    private int cantDias(int unMes) 
    {
        // Implementar este m�todo, reemplazando la l�nea siguiente
        assert(unMes >= 1 && unMes <= 12):"mes invalido";
        unMes=mes;
        if(unMes==1||unMes==3||unMes==5||unMes==7||unMes==8||unMes==10||unMes==12){
            diaMes = 31;
            return 31;
        }
        if(unMes == 2 && esBisiesto == true){
            diaMes = 29;
            return 29;
        }
        if(unMes == 2 && esBisiesto == false){
            diaMes = 28;
            return 28;
        }
        else{
            diaMes = 30;
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
        unAnho=anho;
        if (unAnho % 4 == 0 || unAnho % 100 == 0 && unAnho % 400 == 0){
            esBisiesto = true;
            return true;
        }
        else{
            esBisiesto = false;
            return false;
        }
        }
}
