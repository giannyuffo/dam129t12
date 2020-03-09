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
 * Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v2) 
 * y realiza los siguientes cambios:   
 * •Ahora los atributos ancho y alto serán privados. 
 * •Añade los métodos getter y setter para ambos atributos.   
 * •Modifica la clase Triangulo obligados por los cambios en su clase padre.  
 * •Haz una copia del programa anterior, sobre las nuevas clases creadas, y comprueba 
 * que el programa creado en el ejercicio anterior sigue funcionando. 
 */
public class dam129t1102 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double w = 0,h = 0;
        String s = null;
        
        Triangle_v2 f2 = new Triangle_v2(w,h,s);        
        
        System.out.println("What's the triangle's width and high?");
        f2.setWidth(teclado.nextDouble());
        f2.setHigh(teclado.nextDouble());
        
        f2.setStyle();

        System.out.printf("\n The triangle's area is %.2f cuadratic units.",f2.area());
        System.out.printf("\n This is an %s triangle",f2.getStyle());
}   
}