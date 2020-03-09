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
    *Copia las clases anteriores como una nueva versión de las mismas 
    * (añade sufijo _v3) y realiza los siguientes cambios:   
    * •Añade un constructor a la clase Triangulo al que se le pasan tres 
    * parámetros: estilo, alto yancho.  
    * •Se invocará al constructor por defecto de la clase base.  
    * •Modificar el  programa de  los  ejercicios  anteriores para  que  los  
    * triángulos  sean  creados mediante este nuevo constructor. 
 */
public class dam129t1103 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double w = 0,h = 0;
        String s = null;
        
        Triangle_v3 f3 = new Triangle_v3();
        
        System.out.println("What's the triangle's width and high?");
        f3.setWidth(teclado.nextDouble());
        f3.setHigh(teclado.nextDouble());
        
        f3.setStyle();

        System.out.printf("\n The triangle's area is %.2f cuadratic units.",f3.area());
        System.out.printf("\n This is an %s triangle",f3.getStyle());
}   
}