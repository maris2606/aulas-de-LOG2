import java.util.Scanner;

public class ContaPoupanca extends Conta{
    private double rendimento;

    Scanner scan =  new Scanner(System.in);


    public ContaPoupanca(String dono)  throws Exception{
        super(dono);
        System.out.println("coloque o rendimento: ");
        setRendimento(scan.nextDouble());
    }

    public void render () throws Exception{
        System.out.println("=== rendendo ===");
        super.depositar(getSaldo() + (getSaldo() * getRendimento()));
        //diz-se que na conta poupança o importante não é tanto o rendimento
    }

    public double getRendimento() {
            return rendimento;
    }

    public void setRendimento(double rendimento) throws Exception{
        if (rendimento<0.09 && rendimento>0) {
            this.rendimento = rendimento;
        } else {
            throw new Exception("Rendimento não pode ser tão alto!");
        }
    }
}
