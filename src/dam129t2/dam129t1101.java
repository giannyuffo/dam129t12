package dam129t2;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author uffog
 * 
 * Ctrl + Space                 completar
   Alt + Insert                 varias opciones
   Ctrl + R                     refactorizar
   fcom + Tab                   comentarios
   fori + Tab                      for
   sout + Tab o soutv + Tab   ...pintln...
   iff + Tab                       if
   sw + Tab                      switch
 * 
 * 
 * Realiza las siguientes operaciones: 
 * •Crea una clase llamada Figura2D con atributos numéricos con decimales y públicos: 
 * ancho y alto y un método verDim que muestre por consola el alto y el ancho en una 
 * sola línea, con dos decimales. 
 * •Define una clase llamada Triángulo que es hija de 
 * Figura2D y añádele una cadena llamada estilo (vale: isósceles, rectángulo, equilátero, 
 * etc.), un método llamado área que devuelva la superficie del triángulo y un último 
 * método llamadoverEstilo que muestre por consola el valor del atributo estilo.  
 * •Finalmente hacer un programa que cree un triángulo, asigne valores a sus atributos
 * y use los métodos para ver sus dimensiones, estilo y área.
 */
public class dam129t1101 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Triangle f1 = new Triangle();
        
        System.out.println("What's the triangle's width and high?");
        f1.setWidth(teclado.nextDouble());
        f1.setHigh(teclado.nextDouble());
        
        f1.setStyle();

        System.out.printf("\n The triangle's area is %.2f cuadratic units.",f1.area());
        System.out.printf("\n This is an %s triangle",f1.getStyle());
}   
}
