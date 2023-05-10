import java.util.Scanner;
public class Carro implements Interface_motor{
    Scanner scan = new Scanner(System.in);
    private double CV;
    private int RPM;

    public double getCV() {
        return CV;
    }

    public void setCV(double CV) {
        this.CV = CV;
    }

    public int getRPM() {
        return RPM;
    }

    public void setRPM(int RPM) {
        this.RPM = RPM;
    }

    @Override
    public void motor(){
        System.out.println("carro:");
        System.out.println("Digite a quantia de cavalos do motor:");
        setCV(scan.nextDouble());

        System.out.println("Digite o RPM do motor:");
        setRPM(scan.nextInt());
    }
    public void ligar(){
        System.out.println("bi bi");

    }

    public void mostrar_carro(){
        System.out.println("      __________ ");
        System.out.println("    ._| ][  ][ |_.");
        System.out.println("    F__O______O__H");

    }
}
