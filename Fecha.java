import java.util.List;
import java.util.ArrayList;
/**
 * Fecha: clase cuyos objetos representan fechas calendarias, para el 
 * calendario gregoriano. Esta clase implementa una variedad de 
 * funcionalidades sobre fechas, como comparaciones, cómputos de días,
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
    
    // año de la fecha
    private int anho;
    
    // comprueba si el año es bisiesto
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
     * crear como parámetro. La fecha no puede ser previa
     * al 15/10/1582. Debe tenerse en cuenta la creación de
     * fechas válidas, en relación a número de días en los
     * meses, años bisiestos, etc.
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
        assert nuevoAnho >= 1582:"introduzca un año mayor o igual a 1582";
        
        
        dia=nuevoDia;
        anho=nuevoAnho;
        }
    
    /**
     * Retorna el dia de la fecha
     */
    public int obtenerDia() {
        // Implementar este método, reemplazando la línea siguiente
        return dia;
    }
    
    /**
     * Retorna el mes de la fecha
     */
    public int obtenerMes() {
        // Implementar este método, reemplazando la línea siguiente
        return mes;
    }
    
    /**
     * Retorna el año de la fecha
     */
    public int obtenerAnho() {
        // Implementar este método, reemplazando la línea siguiente
        return anho;
    }
    
    /**
     * Cambia el día de la fecha. El nuevo día debe ser válido
     * para el mes y año actuales.
     */
    public void cambiarDia(int nuevoDia) {
        //Implementar este método
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
     * Cambia el mes de la fecha. El nuevo mes debe ser válido
     * para el día y año actuales.
     */
    public void cambiarMes(int nuevoMes) {
        //Implementar este método
        assert nuevoMes >= 1 && nuevoMes <=12:"introduzca un mes correcto";
        mes=nuevoMes;
    }
    
    /**
     * Cambia el año de la fecha. El nuevo año debe ser válido
     * para el día y mes aactuales.
     */
    public void cambiarAnho(int nuevoAnho) {
        //Implementar este método
        assert nuevoAnho >= 1582:"introduzca un año mayor o igual a 1582";
        anho=nuevoAnho;
    }
    
    /**
     * Chequea si la fecha es igual a otra fecha dada
     */
    public boolean equals(Fecha otraFecha) {
        // Implementar este método, reemplazando la línea siguiente
        return true;
    }
    
    /**
     * Chequea si la fecha es anterior a otra fecha dada
     */
    public boolean esAnterior(Fecha otraFecha) {
        // Implementar este método, reemplazando la línea siguiente
        return true;
    }
    
    /**
     * Computa distancia en días entre dos fechas.
     * El parámetro otraFecha debe corresponder a una fecha igual o 
     * posterior a la fecha del objeto.
     */
    public int cantidad(Fecha otraFecha) {
        // Implementar este método, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Computa la cantidad de días de un mes dado. El parámetro
     * debe corresponder a un mes válido.
     */
    private int cantDias(int unMes) 
    {
        // Implementar este método, reemplazando la línea siguiente
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
     * Decide si un año dado es bisiesto o no. Un año es bisiesto
     * si es múltiplo de 4, salvo los múltiplos de 100 que no son 
     * múltiplos de 400.
     * El parámetro debe corresponder a un año válido.
     */
    private boolean esBisiesto(int unAnho) 
    {
        // Implementar este método, reemplazando la línea siguiente
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
