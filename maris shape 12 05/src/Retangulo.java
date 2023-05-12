public class Retangulo extends Shape{

    protected double largura;
    protected double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override // @ alguma coisa == anotação/anotation  -> significa que ele
    // foi sobreposto de Shape - polimorfismo de inclusão
    public double getArea() {
        return largura * altura;
    }
}
