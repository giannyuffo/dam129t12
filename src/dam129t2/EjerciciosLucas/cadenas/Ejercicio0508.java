package ejercicios;
import java.util.Scanner;
public class Ejercicio0508 {
   public static void main(String[] args)  { 
   Scanner teclado = new Scanner (System.in);
   System.out.println("Introduzca una cadena: ");
   String cadena = teclado.nextLine();
   
   System.out.println("Introduzca el número de la posición a reemplazar");
   int posicion = teclado.nextInt();
   
   teclado.nextLine();
   
   System.out.println("Introduzca el caracter por el cual reemplazar");
   String carac = teclado.nextLine();
   
   char X = carac.charAt(0);
   cadena = cadena.replace(cadena.charAt(posicion), X);
   
   
   System.out.print("La nueva cadena sería: "+cadena);
   
}//fin main
}//fin clase
//int indexOf(ch,indx)