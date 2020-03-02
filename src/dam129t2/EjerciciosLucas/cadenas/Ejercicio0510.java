package ejercicios;
import java.util.Scanner;
public class Ejercicio0510 {
    public static void main(String[] args)  { 
   Scanner teclado = new Scanner (System.in);
   
   String cadena, cadFinal="";
   
   /*System.out.println("Introdue una cadena");
   String cadena1 = teclado.nextLine();*/
   for(int i=0;i<=10;i++){
       System.out.println("Introduce una cadena");
       cadena = teclado.nextLine();
       char caracter = cadena.charAt(0);
       String carac = Character.toString(caracter);
       cadFinal = cadFinal.concat(carac);
   }
   System.out.println(cadFinal);
   
   
}//fin main
}//fin clase
