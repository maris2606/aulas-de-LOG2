import java.util.Scanner;

public abstract class Conta {
    private double saldo = 0.0;
    private String dono;

    public Conta(String dono) {
        this.dono = dono;
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

    public void exibeSaldo(){
        System.out.println("Sr.(a) "+ getDono()+ "o seu saldo atual é: " + getSaldo() + "\n");
    }
}
