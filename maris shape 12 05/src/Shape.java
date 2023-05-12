import java.text.DecimalFormat;
public abstract class Shape {
    DecimalFormat df = new DecimalFormat("###.##");

    public void metodoConcreto(){

        System.out.println("Eu sou concreto mesmo estando em uma classe abstrata");

        return; // como deveria retornar void pode colocar sem valor 0
        // int i = 0;  linha inalcançável porque o método é parado antes
    }

    public boolean metodoConcreto2(boolean b){

        if (b==true) // desvio condicional - sintaticamente válida mas meio esquisita
            return false;//compara algo com o true, mas o que? - se aquele true == true??

        // return;  deve sempre retoranr quando indicado
        // int i = 0;  linha inalcançável porque o método é parado antes

        return true; // tem que ter um retorno obrigatoriamente...
        // por causa do desvio condicional, pode ficar faltando.
    }

    public double getArea() {
        return 0;
    }

    public void imprimirArea(){
        System.out.println("a area do formato é  " + df.format(getArea()));

    }
    /*   return false | true <-- só tem 1 barrinha, é um operador     */
}
