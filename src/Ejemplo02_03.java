public class Ejemplo02_03 {
    public static void main (String [] args){
        int numClientes=Integer.valueOf(args [0]);
        int numEmpleados=Integer.valueOf(args [1]);
        int numSillas=Integer.valueOf(args [2]);
        int numMesas=Integer.valueOf(args [3]);
        int numContratos=Integer.valueOf(args [4]);
        int numReclamaciones=Integer.valueOf(args [5]);
        //Se guarda el resultado del cálculo del método suma en una variable//
        /*En el primer caso se llama al método suma y se suman los valores de numClientes+numEmpleados
        * En el segundo caso se llama al método suma y se suman los valores de numMesas y numSillas
        * En el tercer caso se llama al método suma y se suman los valores de numReclamaciones y numContratos*/
        int numPersonas=suma(numClientes, numEmpleados);
        int numMuebles=suma(numMesas,numSillas);
        int numExpedientes=suma(numReclamaciones,numContratos);
        int numPersonasMas5=sumaMas5(numClientes, numEmpleados);
        int numMueblesmas5=sumaMas5(numMesas,numSillas);
        int numExpedientesmas5=sumaMas5(numReclamaciones,numContratos);

        System.out.println("Tenemos "+numPersonas+" personas, "+numMuebles+" meubles y "+numExpedientes+" expedientes.");
        System.out.println("Tenemos "+numPersonasMas5+" personas, "+numMueblesmas5+" meubles y "+numExpedientesmas5+" expedientes.");
    }
        //Para llamar al método, tiene que estar fuera del main//
        private static int suma(int a, int b){
            return a+b;

        }
        private static int sumaMas5(int a, int b){
        int c=5;
        return a+b+c;
        }



}