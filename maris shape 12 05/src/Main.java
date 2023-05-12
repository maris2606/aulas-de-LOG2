
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        Scanner scan = new Scanner(System.in);

        System.out.println("=== circulo: ===");
        Circulo circulo1 = new Circulo();

        System.out.println("digite o raio: ");
        circulo1.setRaio(scan.nextDouble());

            circulo1.imprimirArea();

        System.out.println("\n=== retangulo: ===");
        Retangulo retangulo1 = new Retangulo();

        System.out.println("digite a largura: ");
        retangulo1.setLargura(scan.nextDouble());
        System.out.println("digite a altura: ");
        retangulo1.setAltura(scan.nextDouble());

            retangulo1.imprimirArea();

        System.out.println("\n=== quadrado: ===");
        Quadrado quadrado1 = new Quadrado();

        System.out.println("digite o lado: ");
        quadrado1.setLargura(scan.nextDouble());

            quadrado1.imprimirArea();

        System.out.println("\n");
        quadrado1.metodoConcreto();
    }
}