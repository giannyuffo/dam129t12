package ejercicios;
import java.util.Scanner;
public class Ejercicio0509 {
    public static void main(String[] args)  { 
   Scanner teclado = new Scanner (System.in);
   System.out.println("Introduce un nombre completo(con apellidos )");
   String nombreCompleto = teclado.nextLine();
   System.out.println("Introduca una edad ");
   int edad = teclado.nextInt();
   String resultado = String.format(" Hola, me llamo %s y tengo %d años",nombreCompleto,edad);
   System.out.print(resultado);
}//fin main
}//fin clase