public class Desenho {
    // Ex: de Sobrecarga de Metodos: 

    // metodo sem parametro
    public void mostrar(){
    for(int i=0; i<10; i++){
        System.out.println("X");
    }
    }

    // metodo com 1 parametro
  public void mostrar( char simb){
    for(int i=0; i<10; i++){
        System.out.println(simb);
    }
    }
    // metodo com 2 parametros
      public void mostrar( char simb, int n){
    for(int i=0; i<n; i++){
        System.out.println( simb );
    }
    }

}
