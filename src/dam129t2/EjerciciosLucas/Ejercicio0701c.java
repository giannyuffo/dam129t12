package ejercicios;
import java.util.Scanner;
public class Ejercicio0701c {
    public static void main(String[] args)  { 
    Scanner teclado = new Scanner (System.in);
    int [] temperaturaMes = new int[11];
    float media;
    int i;
    for( i = 0;i<temperaturaMes.length; i++){
        if(i==0 || i==1 || i==2 || i==10 || i==11){
            temperaturaMes [i] = (int) (Math.random() * 20) -11;
        }
        else{
            temperaturaMes [i] = (int) (Math.random()*40) +10;
        }
        
    }
    int suma = 0;
    for(int j = 0;j<temperaturaMes.length; j++){
        suma = suma+temperaturaMes[j];
    }
     media = suma/12;
     System.out.printf("La temperatura media es %+.1f",media);
    
}//fin main
}//fin clase
