package bichos;

public class animal {
     public String atribPublico;
     private int atribPrivate = 10;
     protected boolean atribProtegido;

     protected void morrer(){
          System.out.println("só nesse pacote ein");
          System.out.println("faliceu :(");
     }

     public void nascer(){
          System.out.println("nasceu :D");
     }

     private void correr(){
          System.out.println("só nessa classe");
          System.out.println("corre");
     }

     public int getAtribPrivate() {
          return atribPrivate;
     }

     public void setAtribPrivate(int atribPrivate) {
          this.atribPrivate = atribPrivate;
     }

     public void setAtribProtegido(boolean atribProtegido) { //tipo de entrada respectivo do atributo
          this.atribProtegido = atribProtegido;
     }
     public boolean getAtribProtegido(){
          return atribProtegido; //retorna, nao precisa arg
     }
}
