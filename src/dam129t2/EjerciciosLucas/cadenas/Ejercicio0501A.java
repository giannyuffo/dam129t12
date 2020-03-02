package ejercicios;
import java.util.Scanner;
public class Ejercicio0501A {
    public static void main(String[] args)  { 
    Scanner teclado = new Scanner (System.in);
  //Character.isDigit()
   System.out.println("APARTADO A");
   String miCadena="esto es 1 cadena a convertir";
   System.out.println(miCadena.toUpperCase());
   System.out.println(miCadena.toLowerCase());
   System.out.println("APARTADO B");
   String miCadena2="e4to es 1 ca6ena a 5onvert9r";
   for(int i=0; i<miCadena2.length();i++) {
       char letra= miCadena2.charAt(i);
        if(Character.isDigit(letra)==true){
            System.out.println("Es un número " + letra);
        }
        else{
            System.out.println("No es un número " + letra);
        }
   }
   System.out.println();
   System.out.println("APARTADO C");
   System.out.print("Introduce un texto: ");
   String cadena = teclado.nextLine();
   boolean palindromo = true; int i=0;
   while(i<cadena.length()/2 && palindromo){
       if(cadena.charAt(i)!=cadena.charAt(cadena.length()-1-i))
                            palindromo=false;
       else i++;
   }
   if (palindromo){
       System.out.println("Es palíndromo"); 
   }
   else {
       System.out.println("No es palíndromo");
   }
   System.out.println("");
   System.out.println("APARTADO D");
   int b = Integer.parseInt("-200");
   System.out.println(b);
   System.out.println("");
   System.out.println("APARTADO E");
   
   
   
  
   
   
   
   
   
   
   
   
    
}}
