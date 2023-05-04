package heranca;
import bichos.animal; //precisa importar pacote
public class heranca {
    public static void main(String[] args) { //quando uma classe tem main é um programa

        animal[] animais = new animal[5];
        //vetor armazena 5 objetos do tipo animal

        for (int i = 0; i < animais.length; i++) {
            animais[i] = new animal();
            //método de construção de objeto - construtor padrão, não tem argumento
            System.out.printf("animal "+ (i+1)+ " ");
            animais[i].nascer(); //as funções além  das criadas são herdadas de classe object

            //não aparece protegido já que não está no mesmo pacote
            // nem o privado aparece já que é da classe
        }

        animais[3].atribPublico = "gato"; //só consegue acessar public
        System.out.println("\n\nanimal 3: " + animais[3].atribPublico);


        animais[3].setAtribPrivate(30);
        System.out.printf(String.valueOf(animais[3].getAtribPrivate()));

        animais[1].setAtribProtegido(true);
        System.out.printf("\n " + String.valueOf(animais[1].getAtribProtegido()));

        animais[3].setAtribPrivate(123);
        int aaaaa = animais[3].getAtribPrivate();
        System.out.printf("\n " + aaaaa);


        //existem formas mais rápidas de calcular mult  e div
        //shift (mudar o bit de lugar)
    }
}
