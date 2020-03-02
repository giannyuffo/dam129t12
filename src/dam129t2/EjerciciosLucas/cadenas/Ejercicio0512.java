package ejercicios;
import java.util.Scanner;
public class Ejercicio0512 {
    public static void main(String[] args)  { 
   Scanner teclado = new Scanner (System.in);
   String cadena = "";
   boolean repetido;
   while(cadena.length()!=6){
       System.out.print("Introduce una cadena de 6 dígitos: ");
       cadena = teclado.nextLine();
       if(cadena.length()==6){
           for(int i=0;i<cadena.length();i++){
               char caracter = cadena.charAt(i);
               if(!Character.isDigit(caracter)){
                   System.out.println("Solo puede contener dígitos");
                   break;
               }
               else{
                   for(int j=0;j<i;j++){
                       char caracter2 = cadena.charAt(j);
                       if(caracter==caracter2){
                           System.out.println("Se encontró algún repetido");
                           break;
                       }
                   }
                   
               }
           }
       }
   }
}//fin main
}//fin clase