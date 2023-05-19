import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception{
        Scanner scan =  new Scanner(System.in);

        Conta.quantasContas();

        System.out.println("Qual operação deseja fazer?\n 1-depositar\n2-transferir\n3-sacar\n4- exibir extrato");
        int op = scan.nextInt();
        scan.nextLine();

        System.out.println("Em qual tipo de conta quer operar?\n 1-conta corrente\n2-conta poupança\n3-conta investimento");
        int tipo = scan.nextInt();
        scan.nextLine();

        System.out.println("Quantas operações quer fazer?");
        int qtsOp = scan.nextInt();
        scan.nextLine();

        for(int i=0; i<qtsOp; i++){
            Conta.operacoes(op, tipo);
        }

    }

}