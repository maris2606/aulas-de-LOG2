import java.util.Scanner;
import java.lang.Math;

public class main {
    public static void main(String[] args) throws Exception{
        double a,b,c;
        equac equac = new equac();
        Scanner scan =new Scanner(System.in);

        System.out.println(" escreva a incógnita e os coeficientes da função: ");
        System.out.printf(" a:");
        a = scan.nextFloat();
        equac.setA(a);

        System.out.printf(" b:");
        b = scan.nextFloat();
        equac.setB(b);

        System.out.printf(" c:");
        c = scan.nextFloat();
        equac.setC(c);

        System.out.printf( "a equação digitada foi: " + a + "x² ");

        if (b>0){
            System.out.println( "+"+ b + "x");
        } else {
            System.out.println(  b + "x");
        }

        if (c>0){
            System.out.println( "+"+ c + "x");
        } else {
            System.out.println( c + "x");
        }

        try {
            double[] raizes = equac.calcularRaizes();
            System.out.println("raiz 1: " + raizes[0]);
            System.out.println("raiz 2: " + raizes[1]);

        }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
    }
}
