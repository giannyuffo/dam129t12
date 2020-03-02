package ejercicios;
import java.util.Scanner;
public class Ejercicio0502 {
    public static void main(String[] args)  { 
    Scanner teclado = new Scanner (System.in);
    
    int dni, modulo;
    System.out.println("Introduzca, únicamente, su número de DNI");
    dni = teclado.nextInt();
    modulo = dni%23;
    String caracter ="TRWAGMYFPDXBNJZSQVHLCKE";
    char letra = caracter.charAt(modulo);
    System.out.println("Su letra de DNI es: " +letra);
}//fin main
}//fin clase