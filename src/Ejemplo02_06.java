public class Ejemplo02_06 {
    public static void main (String [] args){
        int x=3;
        int y=7;
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        System.out.println("x==y? " +(x==y));
        System.out.println("x!=y? " +(x!=y));
        //Creas dos objetos String distintos (a y b) con el mismo valor//
        String a=new String ("hola");
        String b=new String ("hola");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        /*El resultado imprimirá que si son distintos debido a que compara si son
        el mismo objeto (a==b??) no si tienen el mismo valor (hola==hola?)*/
        System.out.println("a==b? " +(a==b));
        System.out.println("a!=b? " +(a!=b));



    }
}
