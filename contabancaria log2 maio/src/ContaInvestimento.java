import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaInvestimento extends Conta{
    private double rendimento;

    static List<ContaInvestimento> contaInvestimentoList = new ArrayList<>();

    Scanner scan =  new Scanner(System.in);



    public ContaInvestimento(String dono, int indice) throws Exception{
        super(dono, indice);
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

    public static void addContaInvestimento(ContaInvestimento conta){
        contaInvestimentoList.add(conta);
    }
}
