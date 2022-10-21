import Arreglos.Arreglos;


public class App {
    public static void main(String[] args) throws Exception {
        Arreglos a = new Arreglos();
       
        a.insertarLetra('A');
        a.insertarLetra('a');
        a.insertarLetra('B');
        a.insertarLetra('C');
        a.insertarLetra('z');
        a.insertarLetra('Z');
        a.insertarLetra('b');
        a.insertarLetra('B');
        
        a.eliminarLetra('A');
        a.eliminarLetra('B');
        a.eliminarLetra('C');
        a.mostrarAbecedario();
        a.insertarLetra('?');
        a.insertarLetra('>');
        a.modificarLetra('b', 'C');

    }
}
