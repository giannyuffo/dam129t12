package ejercicios;
import java.util.Scanner;
public class Ejercicio0504 {
    public static void main(String[] args)  { 
    Scanner teclado = new Scanner (System.in);
    
    String password = "abcdefghij";
    int num = (int) ((Math.random()*5)+5);
    
    for(int i=0;i<num;i++){
        int num2 = (int) (Math.random()*9);
        char var = password.charAt(num2);
        System.out.print(var);
    }
    
        
    
    
    
}//fin mainn
}//fin clase