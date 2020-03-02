package ejercicios;
import java.util.Scanner;
public class Ejercicio0507 {
    public static void main(String[] args)  { 
   Scanner teclado = new Scanner (System.in);
   System.out.println("Introduce una cadena");
   String cadena1 = teclado.nextLine();
   String cadena2 = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
   String cadena3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   for(int i=0;i<cadena1.length();i++){
       char caracter = cadena1.charAt(i);
       
       if(Character.isUpperCase(caracter) ==true && Character.toString(caracter)!=" " && Character.isDigit(caracter)==false ){
           System.out.print(cadena3.charAt(cadena2.indexOf(caracter)));
       }
   else{
           System.out.print(caracter);
           }
   }
   
}//fin main
}//fin clase