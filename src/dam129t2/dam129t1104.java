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
 * Copia las clases anteriores como una nueva versión de las mismas 
 * (añade sufijo _v4) y realiza los siguientes cambios:   
 * •Añade un constructor a la clase Figura2D al que se le pasan dos 
 * parámetros: alto y ancho. ¿Funciona ahora el constructor de Triangulo 
 * (creado en el ejercicio anterior)? ¿Por qué? 
 * •Reescribe el constructor de Triangulo creado en el ejercicio anterior 
 * para que haga uso del nuevo constructor de la clase base.  
 * •Comprueba que el programa creado en el ejercicio anterior sigue funcionando. 
 * •Haz una copia del programa anterior, sobre las nuevas clases creadas, 
 * y comprueba que sigue funcionando. 
 */
public class dam129t1104 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double w = 0,h = 0;
        
        Triangle_v4 f4 = new Triangle_v4(w,h);
        
        System.out.println("What's the triangle's width and high?");
        f4.setWidth(teclado.nextDouble());
        f4.setHigh(teclado.nextDouble());
        
        //f4.setStyle();

        System.out.printf("\n The triangle's area is %.2f cuadratic units.",f4.area());
       // System.out.printf("\n This is an %s triangle",f4.getStyle());
}   
}