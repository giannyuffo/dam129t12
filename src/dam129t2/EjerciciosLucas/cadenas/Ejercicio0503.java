package ejercicios;
import java.util.Scanner;
public class Ejercicio0503 {
    public static void main(String[] args)  { 
    Scanner teclado = new Scanner (System.in);
    
    int contador=0;
    System.out.println("Introduzca una cadena: ");
    String cad = teclado.nextLine();
    System.out.println("Introduzca el caracter: ");
    String carac = teclado.nextLine();
    
    char caracter = carac.charAt(0);
    
    for(int i=0; i<cad.length(); i++){
        
        if(cad.charAt(i)==caracter){
            contador++;
        }
        
    }
    System.out.println("El caracter se encontró: "+contador+" veces");    
}//fin main
}//fin clase