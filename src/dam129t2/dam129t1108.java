package dam129t2;

import java.util.ArrayList;
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
 * (añade sufijo _v8) y realiza los siguientes cambios:   
 * •Añadir a la clase Figura2D_v8 un atributo privado llamado nombre 
 * de tipo String. •Añadir  el getter/setter  de  ese  campo  y  
 * modificar  los  constructores  de  dicha  clase  para incorporar  
 * como  parámetro el  nombre  de  la  figura  (en  el  constructor  
 * por  defecto  se  le asignará valor null).  •Modificar la clase 
 * hija y nieta para incluir el nombre en constructores.  
 * •Crear una nueva clase hija de Figuras2D_v8 llamada Rectangulo_v8 
 * con constructor con tres parámetros (alto, ancho, nombre), constructor 
 * con un dos parámetros (alto igual a ancho y nombre) y un método que 
 * devuelve boolean llamado esCuadrado(). •Hacer un programa que cree un 
 * ArrayList con 4 rectángulos, algunos cuadrados y otros no, y 
 * cuente cuantos hay cuadrados. 
 */
public class dam129t1108 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double p,q,t = 0; String s = null,c=null, n=null;
        System.out.println("a, b o c");
        char a;
        a=teclado.next().charAt(0);
        switch (a) {
            case 'a':{
                System.out.println("What's the triangle's measurement?");
                p=teclado.nextDouble();
                q=teclado.nextDouble();
                TrianColor_v8 f8 = new TrianColor_v8(p,q,s,c,n);
                f8.setWidth(p);
                f8.setHigh(q);
                System.out.println("What's the type of this triangle?");
                f8.setStyle(teclado.nextLine());
                System.out.println("What's the color of your triangle?");
                f8.setColor(teclado.nextLine());
                System.out.println("How will you name it?");
                f8.setName(teclado.nextLine());

                System.out.printf("\n The triangle's area is %.2f cuadratic units.",f8.area());
                System.out.printf("\n This is an %s triangle painted with the color %s.\n",f8.getStyle(), f8.getColor());
            }break;
            case 'b': {
                System.out.println("What's the triangle's measurement?");
                p=teclado.nextDouble();
                q=teclado.nextDouble();
                TrianColor_v8 f7 = new TrianColor_v8(t, c);
                f7.setWidth(p);
                System.out.println("What's the color of your triangle?");
                f7.setColor(teclado.nextLine());            
                System.out.printf("\n The triangle's area is %.2f cuadratic units.",f7.area());
                System.out.printf("\n This is an %s triangle painted with the color %s.\n",f7.getStyle(), f7.getColor());
            } break;
            case 'c':{
                        
                Rectangle_v8 r8 = new Rectangle_v8();
                
                System.out.println(r8.isSquare());
            }break;
            default:
                System.out.println("Opción no válida.");
        }
}   
}