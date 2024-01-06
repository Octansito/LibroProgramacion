public class Ejemplo02_02 {
    public static void main (String []args){
        /*Creamos dos niveles en el que el numero de manzanas irá incluido en el nivel 0 y
        el numero de peras en el nivel 1. Por lo tanto al clicar los 3 puntos al lado del debugger e introducir los datos
        irán directamente a las casillas 0 y 1*/
        int numManzanas=Integer.valueOf(args[0]);
        int numPeras=Integer.valueOf(args[1]);
        int numFrutas=numPeras+numManzanas;
        System.out.println("El numero total de frutas es "+numFrutas);
    }
}
