public class Bateriadetime implements IBatucador, Runnable{

    @Override //sobreposição
    public void batucar() {
        System.out.println("papapappapappapapappapappaap");
    } //cada um faz o batucar do jeito que quer
    //tem que fazer a assinatura

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet");
    } //pode implementar mais de uma interface ok
}
