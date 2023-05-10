public class Testainterf {
    public static void main(String[] args) {
        IBatucador unidosDoIFSP = new Escoladesamba(); //com a interface
        IBatucador pagodeDaAfronta = new Grupodepagode();
        IBatucador torcidaUnidosDaInformatica = new Bateriadetime();
        //aqui foi o Object mas na vdd é String

        Grupodepagode gp = new Grupodepagode(); //essa forma é similar a de cima, mas
        //tem a noção de inclusão de tipo
        //nesse caso eles são do mesmo tipo, mas construidos de forma diferente
        //com a classe que implementa batucador

        unidosDoIFSP.batucar();
        pagodeDaAfronta.batucar();
        torcidaUnidosDaInformatica.batucar();
        gp.batucar();
    }
}
