import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaCorrente extends Conta{
    //basicamente ele faz tudo que uma conta normal faz né

    public ContaCorrente(String dono, int indice) {
        super(dono,indice);

    }

    static List<ContaCorrente> contaCorrenteList = new ArrayList<>();

    public static void addContaCorrente(ContaCorrente conta){
        contaCorrenteList.add(conta);
    }


}
