import java.util.*;

public class Exdeinterface {
    public static void main(String[] args) {
        //List é a interface que a classe Arraylist e LinkedList implementa
        List frutas = new ArrayList(); //empurra
        List animais = new LinkedList(); //não empurra

        /*dependendo do uso, a lista pode ser diferente
        inserção e remoção ou busca
        inserção no meio empurra muito/remoção tem q mover pra nn ficar espaço
        uma lista ligada não faz isso então

        uma operação constante se sabe onde está - gasta menos passos para chegar a algo, linear se tem n passos - percorre tudo
        se for constante, ele cria um referencial que referencia o proximo elemento, se fosse numa array teria que mover todos para não perdeer o elo*\

        quem implementa a interface é quem diz como ela faz as funções
         */
                 /*este código é polimorfismo de inclusão pois faz a inclusão:
                todas as classes são object, logo string é um object
                por todos eles serem derivados de object, podemos inclí-los na lista
                basta ser object
                 */

        frutas.add("Leticia");
        frutas.add(new Random()); //não deu nome da instância - Objeto anônimo - emcapsulamento - o que imposta é o comportamento e não como é feito
        /* Random aleatorio = new Random();  frutas.add(aleatorio);
         */

        animais.add(new Scanner(System.in).nextLine()); //resultado do método
        animais.add(new Scanner(System.in)); //Objeto
        //o comportamento é o mesmo das duas listas
        //cria a classe scanner e tem que colocar pra ele buscar/ler no teclado:
        //Scanner(System.in) é objeto de leitura, quando coloca .nextLine() ele realiza o método de ler do teclado

        for (int i=0; i<frutas.size(); i++) { //.size é de lista, equivalente a lenght - só que lenght é para String
            System.out.println((i+1) + " a posição tem "+ frutas.get(i));
        }

        for (int i=0; i<frutas.size(); i++) {
            System.out.println((i+1) + " a posição tem "+ animais.get(i));
        }


        for(int i = 1; i<frutas.size(); i++){
            Object elemento = frutas.get(i); //só guardou os valores num object
            System.out.println((i+1) + " a posição tem "+ frutas.get(i));
        }

        //iterator é um iterador de listas - interface de iteração (precorrer) de listas e coleções

        for (Iterator iterator = animais.iterator(); iterator.hasNext();) { //faça um laço até que hasNext seja falso (não ter falso)
            System.out.println(iterator.next());
        }
    }
}
