public class Main {
    public static void main(String[] args) {
        Helicoptero helic1 = new Helicoptero();
        Carro honda = new Carro();
        Barco bote = new Barco();


        helic1.motor();
        helic1.mostrar_helicoptero();
        helic1.ligar();
        System.out.println("--------------------------");

        honda.motor();
        honda.mostrar_carro();
        System.out.println("--------------------------");
        honda.ligar();

        bote.motor();
        bote.mostrar_barco();
        bote.ligar();
        System.out.println("--------------------------");

    }
}