import java.util.Scanner;

public class ContaInvestimento extends Conta{
    private double rendimento;

    Scanner scan =  new Scanner(System.in);

    public ContaInvestimento(String dono) throws Exception{
        super(dono);
        setRendimento(scan.nextDouble());
    }

    public void render () throws Exception{
        System.out.println("=== rendendo ===");

        super.depositar(getSaldo() + (getSaldo() * getRendimento()));
        //aqui o rendimento é maior
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) throws Exception{
        if (rendimento<0.4 && rendimento>0) {
            this.rendimento = rendimento;
        } else {
            throw new Exception("Rendimento não pode ser tão alto!");
        }
    }
}
