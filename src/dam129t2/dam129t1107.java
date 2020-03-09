package dam129t2;

import java.util.Scanner;
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
 * (añade sufijo _v6) y realiza los siguientes cambios:   
 * • Crea una nueva clase TrianColor_v6, hija de la clase Triángulo_v6 
 * que incluye un nuevo atributo privado de tipo String llamado color. 
 * •Esta nueva clase tiene un constructor de 4 parámetros (alto, ancho, 
 * estilo, color), además del getter y setter de color.  
 * •Haz un nuevo programa que cree un triángulo de color y llame a 
 * métodos definidos en sus clases base.
 */
public class dam129t1107 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double p,q,t = 0; String s=null;
        
        System.out.println("What's the triangle's measurement?");
        p=teclado.nextDouble();
        q=teclado.nextDouble();
        System.out.println("Now, it's the style time.");
        Triangle_v7 f7 = new Triangle_v7 (p,q,s);
          /*  f7.setWidth(p);
            f7.setHigh(q);
            //f7.setColor();*/
            f7.setStyle();
            System.out.printf("\n The triangle's area is %.2f cuadratic units.",f7.area());
            //System.out.printf("\n This is an %s triangle.\n",f7.getStyle() /*,f7.getColor()*/);
            Triangle_v7 f8 = new Triangle_v7(f7);
            //f8.setColor();
            System.out.printf("\n The triangle's area is %.2f cuadratic units.",f8.area());
           // System.out.printf("\n This is an %s triangle.\n",f8.getStyle()/*, f8.getColor()*/);
        
}   
}