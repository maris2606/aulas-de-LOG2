import java.util.Scanner;
public class Barco implements Interface_motor{
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
        System.out.println("barco:");
        System.out.println("Digite a quantia de cavalos do motor:");
        setCV(scan.nextDouble());

        System.out.println("Digite o RPM do motor:");
        setRPM(scan.nextInt());
    }
    public void ligar(){
        System.out.println("foon");

    }
    public void mostrar_barco(){
        System.out.println("         []  ");
        System.out.println("         | L ");
        System.out.println("         |  L ");
        System.out.println("         |  /");
        System.out.println("         | /");
        System.out.println("    _____|_______ ");
        System.out.println("    '\'___________/D+ ");
        System.out.println(" ~~~~~~~~~~~~~~~~~~");

    }
}
