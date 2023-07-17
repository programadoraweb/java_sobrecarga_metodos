public class App {

    
    /*  Em uma Classe de Java, podemos criar metodos com o mesmo nome, 
    caso eles tenham parametros diferentes. Ex:  
    void soma(){}
    void soma(int a ){}
    float soma (double a, double b){}
    float soma(int a, float b){}
    
    Podemos ter um conjunto de metodos com o mesmo nome que realizam o mesmo tipo de operacao sobre ARGUMENTOS DIFERENTES. 
    
    */
    public static void main(String[] args) throws Exception {
        
        Desenho d1 = new Desenho(); // instanciar um objeto

        // chamar os metodos: 
        d1.mostrar();
        d1.mostrar('!');
        d1.mostrar('@', 5);
       /*  NOTA: Java le como string " ! " e como char ' ! ' */
    }
}
