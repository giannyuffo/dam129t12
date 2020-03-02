package ejercicios;
import java.util.Scanner;
public class Ejercicio0701b {
    public static void main(String[] args)  { 
    Scanner teclado = new Scanner (System.in);
    int [] temperaturaMes = new int[11];
    for(int i = 0;i<temperaturaMes.length; i++){
        switch(i){
            case 0: System.out.println("ENE"); break;
            case 1: System.out.println("FEB"); break;
            case 2: System.out.println("MAR"); break;
            case 3: System.out.println("ABR"); break;
            case 4: System.out.println("MAY"); break;
            case 5: System.out.println("JUN"); break;
            case 6: System.out.println("JUL"); break;
            case 7: System.out.println("AGO"); break;
            case 8: System.out.println("SEP"); break;
            case 9: System.out.println("OCT"); break;
            case 10: System.out.println("NOV"); break;
            case 11: System.out.println("DIC"); break;
        }
                
    }
}//fin main
}//fin clase
