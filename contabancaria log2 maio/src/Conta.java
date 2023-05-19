import java.util.Scanner;

public abstract class Conta {
    private double saldo = 0.0;
    private String dono;
    private int indice;

    public Conta(String dono, int indice) {
        this.dono = dono;
        this.indice = indice;
    }

    public static double inserirQuantia(){
            Scanner scan =  new Scanner(System.in);
            System.out.println("Digite a quantia para conta poupança: ");
            return scan.nextDouble();

    }

    public void sacar(double quantia) throws Exception{
        System.out.println("=== sacar ===");

        if (saldo>=0) {
            exibeSaldo();

            if (quantia > saldo) {
                throw new Exception("É impossível sacar valor maior que o saldo!");

            } else if (quantia == saldo) {
                System.out.println("Aviso - sua conta ficará sem saldo!");
                setSaldo(saldo - quantia);
                exibeSaldo();

            } else {
                setSaldo(saldo - quantia);
                exibeSaldo();
            }
        } else {
            throw new Exception("saldo negativo - impossível sacar");
        }
    }

    public void depositar(double quantia) throws Exception{
        System.out.println("=== depositar ===");

        if (quantia > 0) {
            setSaldo(saldo + quantia);
            exibeSaldo();
        } else {
            throw new Exception("impossível depositar valor menor ou igual a zero!");
        }
    }

    public void transferir(double quantia, Conta conta) throws Exception{
        System.out.println("=== transferir ===");

        if (quantia > 0) {
            conta.setSaldo(conta.saldo + quantia);
            exibeSaldo();
        } else {
            throw new Exception("impossível transferir valor menor ou igual a zero!");
        }

    }

    public static void quantasContas() throws Exception {
        Scanner scan = new Scanner(System.in);


        System.out.println("quantas contas quer adicionar?");
        int numcontas = scan.nextInt();

        for (int i = 0; i < numcontas; i++) {

            System.out.println("Que tipo de conta deseja criar?\n 1-conta corrente\n2-conta poupança\n3-conta investimento");
            int tipo = scan.nextInt();

            if (tipo>0 && tipo<=3){
                switch (tipo) {
                    case 1:
                        System.out.println("Digite o nome do dono da conta corrente: ");
                        scan.nextLine();
                        ContaCorrente.addContaCorrente(new ContaCorrente(scan.nextLine(), i));
                        break;

                    case 2:
                        System.out.println("Digite o nome do dono da conta poupança: ");
                        scan.nextLine();
                        ContaPoupanca.addContaPoupanca(new ContaPoupanca(scan.nextLine(), i));
                        break;

                    default:
                        System.out.println("Digite o nome do dono da conta investimento: ");
                        scan.nextLine();
                        ContaInvestimento.addContaInvestimento(new ContaInvestimento(scan.nextLine(), i));

                }
            } else {
                throw new Exception("operador inválido!!");
            }

        }
    }

    public static void operacoes (int op, int tipo) throws Exception {
        Scanner scan = new Scanner(System.in);
        int indice;

        if (op>0 && op<=4){
            switch (op) {
                case 1: //depositar
                    System.out.println("em qual conta quer operar?");
                    indice = scan.nextInt();

                    switch (tipo) {
                        case 1:
                            ContaCorrente.contaCorrenteList.get(indice).depositar(ContaCorrente.inserirQuantia());
                        case 2:

                            ContaPoupanca.contaPoupancaList.get(indice).depositar(ContaPoupanca.inserirQuantia());
                            break;

                        default:
                            ContaInvestimento.contaInvestimentoList.get(indice).depositar(ContaInvestimento.inserirQuantia());
                            break;
                    }

                case 2: //transferir
                    System.out.println("em qual conta quer operar?");
                    indice = scan.nextInt();

                    System.out.println("para qual conta quer tranferir?");
                    int indiceTrans = scan.nextInt();
                    switch (tipo) {
                        case 1:
                            ContaCorrente.contaCorrenteList.get(indice).transferir(ContaCorrente.inserirQuantia(),ContaCorrente.contaCorrenteList.get(indiceTrans));
                        case 2:
                            ContaPoupanca.contaPoupancaList.get(indice).transferir(ContaPoupanca.inserirQuantia(),ContaPoupanca.contaPoupancaList.get(indiceTrans));
                            break;

                        default:
                            ContaInvestimento.contaInvestimentoList.get(indice).transferir(ContaInvestimento.inserirQuantia(),ContaInvestimento.contaInvestimentoList.get(indiceTrans));
                            break;
                    }
                    break;

                case 3: //sacar
                    System.out.println("em qual conta quer operar?");
                    indice = scan.nextInt();

                    switch (tipo) {
                        case 1:
                            ContaCorrente.contaCorrenteList.get(indice).sacar(ContaCorrente.inserirQuantia());
                        case 2:
                            ContaPoupanca.contaPoupancaList.get(indice).sacar(ContaPoupanca.inserirQuantia());
                            break;
                        default:
                            ContaInvestimento.contaInvestimentoList.get(indice).sacar(ContaInvestimento.inserirQuantia());
                            break;
                    }
                    break;

                default: //ver "extrato"

                    System.out.println("Qual conta quer exibir?");
                    indice = scan.nextInt();

                    switch (tipo) {
                        case 1:
                            ContaCorrente.contaCorrenteList.get(indice).exibeSaldo();
                        case 2:
                            ContaPoupanca.contaPoupancaList.get(indice).exibeSaldo();
                            break;
                        default:
                            ContaInvestimento.contaInvestimentoList.get(indice).exibeSaldo();
                            break;
                    }
                    break;
            }
        } else {
            throw new Exception("operador inválido!!");
        }


    }

    public void exibeSaldo(){
        System.out.println("Sr.(a) "+ getDono()+ "o seu saldo atual é: " + getSaldo() + "\n");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
}
