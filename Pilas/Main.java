
import java.util.*;

public class Main {
    static Stack<Character> pila = new Stack<Character>();
    static Stack<Character> postfijo = new Stack<Character>();
    public static void main(String[] args){
        System.out.println("Hola mundo");
        String cadena = "a+b*c";
        System.out.println(cadena);
        convertir(cadena);
        for(int i = 0; i < postfijo.size(); i++){
            System.out.println(postfijo.get(i));
        }
        
    }

    public static void convertir(String cadena){
        char caracter;
        for(int i = 0; i < cadena.length(); i++){
            caracter = cadena.charAt(i);
            if(caracter == '+' || caracter == '-' || caracter == '*' ||
             caracter == '/' || caracter == '^' || caracter == '(' || caracter == ')'){
                jerarquia(caracter);
             }
            else 
                postfijo.push(caracter);
        }
    }
    public static void jerarquia(char caracter){
    }
}
