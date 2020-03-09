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
 * (añade sufijo _v5) y realiza los siguientes cambios:   
 * •Añade un constructor más a la clase Figura2D, a este se le pasa 
 * solo un parámetro que se le asigna tanto al alto como al ancho 
 * (figura igual alto que ancho).  •Hacer el constructor sin parámetros 
 * (ya no se crea por defecto) en este caso tanto alto como ancho igual a cero.  
 * •Añade  a  la  clase Triangulo también  un  constructor  sin  parámetros,  
 * que  invoque al constructor sin parámetros de la clase base 
 * (aunque se hace por defecto) y que ponga el estilo a null.  
 * •Añade otro constructor a la clase Triangulo, con un solo parámetro, 
 * para aquellos que tienen igual alto que ancho (en este caso el estilo 
 * será ‘igualBaseAltura’). •Haz  un  programa  similar  a  los  de  ejercicios  
 * anteriores  pero  que  use  las  nuevas características incorporadas 
 * en este ejercicio.
 */
public class dam129t1105 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double p,q,t = 0; String s = null;
        
        System.out.println("What's the triangle's measurement?");
        p=teclado.nextDouble();
        q=teclado.nextDouble();
        
        if(q!=p){
            Triangle_v5 f5 = new Triangle_v5(p,q,s);
            f5.setWidth(p);
            f5.setHigh(q);
            f5.setStyle();
            System.out.printf("\n The triangle's area is %.2f cuadratic units.",f5.area());
            System.out.printf("\n This is an %s triangle",f5.getStyle());
        }
        else{
            Triangle_v5 f6 = new Triangle_v5(t);
            f6.setWidth(p);
            System.out.printf("\n The triangle's area is %.2f cuadratic units.",f6.area());
            System.out.printf("\n This is an %s triangle",f6.getStyle());
        }
}   
}