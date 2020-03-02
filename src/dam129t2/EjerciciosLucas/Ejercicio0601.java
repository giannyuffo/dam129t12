package ejercicios;
import java.util.Scanner;
public class Ejercicio0601 {
    public static void main(String[] args)  { 
    Scanner teclado = new Scanner (System.in);
    
    MovilPrepago m1 = new MovilPrepago(633633633, 0.015f, 0.03f, 0.002f, 20f);
    System.out.println("Introduzca la duración, en segundos, de su llamada");
    m1.efectuarLlamada(500);
    m1.navegar(300);
    System.out.println("Recargue el móvil. ");
    m1.recargar(7);
    m1.recargar(5);
    System.out.println("Su saldo actual es de: " + m1.consultarSaldo());
}
}
