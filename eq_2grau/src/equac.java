import java.util.Scanner;
import java.lang.Math;

public class equac {

    Scanner scan = new Scanner (System.in);
    private double a;
    private double b;
    private double c;

    public double getA(){
        return this.a;
    }

    public double getB(){
        return this.b;
    }

    public double getC(){
        return this.c;
    }

    public void setA(double a) throws Exception{
        if (a==0) {
        throw new Exception ("argumento inválido, coeficiente é 0.");
        }
        this.a = a;
    }

    public void setB(double b){
        this.b = b;
    }

    public void setC(double c){
        this.c = c;
    }

    private double calcularDelta(){
        return (b * b) - 4 * a * c;
    }

    public double[] calcularRaizes() throws Exception {

        double delta = this.calcularDelta();
        double []raizes = new double[2];

        if (calcularDelta()==0){
            System.out.println("uma única raiz real.");
            raizes[0] = (-b + (Math.sqrt(delta)/(2*a)));
            raizes[1] = raizes[0];
            return raizes;

        } else if (calcularDelta()<0){
            throw new Exception("não existe a raiz real.");

        } else {
            System.out.println("duas raízes reais");

            raizes[0] = ((-b + Math.sqrt(delta))/(2*a));
            raizes[1] = ((-b - Math.sqrt(delta))/(2*a));

            return raizes;
    }
}
}
