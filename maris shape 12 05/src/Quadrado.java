public class Quadrado extends Retangulo{


    @Override
    public double getArea(){
        altura=largura;


        if (largura == altura)
            return super.getArea(); //super é da classe pai desse aqui -  no caso: retangulo
        else
            System.out.println("não é quadrado");

        return 0;
    }
}
