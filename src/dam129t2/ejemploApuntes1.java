package dam129t11;

/*
Ctrl + Space                 completar
Alt + Insert                 varias opciones
Ctrl + R                     refactorizar
fcom + Tab                   comentarios
fori + Tab                      for
sout + Tab o soutv + Tab   ...pintln...
iff + Tab                       if
sw + Tab                      switch
*/
import java.util.Scanner;
public class ejemploApuntes1 {

    public static void main(String[] args)  {
        
       Scanner teclado = new Scanner(System.in);
       AlumnoESO alum1 = new AlumnoESO ("Juan Pérez", "3536565N", 981900900);
       AlumnoCiclos alum2 = new AlumnoCiclos("Ana Lopez", "777777K", "Abanca", "ana@gmail.com");
       
       alum1.nuevaFalta(3);
       alum1.nuevaFalta(20);
       alum1.nuevaFalta(12);
       alum2.nuevaFalta(7);
       alum2.nuevaFalta(20);
       alum2.nuevaFalta(33);
    }
} //fin clase