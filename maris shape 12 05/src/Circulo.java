public class Circulo extends Shape{

    private double raio;
    private final double PI = 3.1415;


    public void setRaio (double raio)throws Exception {
        if (raio<0){
            throw new Exception("raio inválido, não pode ser negativo");
        }else {
          this.raio = raio;
        }
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double getArea() {

        return PI * (raio*raio);
    }
}
