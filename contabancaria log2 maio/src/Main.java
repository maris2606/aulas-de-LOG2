import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scan =  new Scanner(System.in);

        //conta corrente
        System.out.println("Digite o nome do dono da conta corrente 1: ");
        ContaCorrente contaCorrente1 =  new ContaCorrente(scan.nextLine());

        System.out.println("Digite o nome do dono da conta corrente 2: ");
        ContaCorrente contaCorrente2 =  new ContaCorrente(scan.nextLine());

        contaCorrente1.depositar(inserirQuantia());
        contaCorrente1.transferir( inserirQuantia(), contaCorrente2);

        contaCorrente2.exibeSaldo();
        contaCorrente2.sacar( inserirQuantia());
        contaCorrente2.depositar( inserirQuantia());

        //conta Poupança
        System.out.println("Digite o nome do dono da conta poupança: ");
        ContaPoupanca contaPoupanca = new ContaPoupanca(scan.nextLine());

        contaPoupanca.depositar(1002.03);
        contaPoupanca.render();
        contaPoupanca.exibeSaldo();


        //conta Investimento
        System.out.println("Digite o nome do dono da conta invesimento: ");
        ContaInvestimento contaInvestimento = new ContaInvestimento(scan.nextLine());

        contaInvestimento.depositar(30900.25);
        contaInvestimento.render();
        contaInvestimento.sacar(1243.70);

    }
    public static double inserirQuantia(){
        Scanner scan =  new Scanner(System.in);

        System.out.println("Digite a quantia: ");
        return scan.nextDouble();

    }

}