package ejercicios;
import java.util.Scanner;
public class Ejercicio0506 {
   public static void main(String[] args)  { 
   Scanner teclado = new Scanner (System.in);
   
   System.out.println("Introduzca el correo electrónico");
   String correo = teclado.nextLine();
   
   int var = correo.indexOf("@");
   String dominio = correo.substring(var+1);
   System.out.println("El dominio es: "+dominio);
   
   
}//fin main
}//fin clse