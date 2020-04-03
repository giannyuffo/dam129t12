package dam000t2;
import java.util.Scanner;
public class _plantillaMenu {
       static Scanner teclado;
    public static void main(String[] args) {
        teclado =new Scanner(System.in);
        boolean salir =false; char opcion;
        do {
           System.out.println("\n\n----TITULO DEL MENU-----");
            System.out.println("a)Opción 1\nb)Opción 2\nc)Opcion 3\nd)Salir");
           opcion = teclado.next().charAt(0); 
           switch (opcion) {
               case 'a': funcion1 ();  break;
               case 'b': funcion2 ();  break;
               case 'c': funcion3 ();  break;
               case 'd': salir = true; break;
               default: System.out.println("Opción invalida"); 
           }
        } while (!salir);
    } //fin main    
    static void funcion1 () {}
    
    static void funcion2 () {}
    
    static void funcion3 () {}
    
} //fin clase 