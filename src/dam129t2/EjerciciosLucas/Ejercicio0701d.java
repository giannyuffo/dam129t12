package ejercicios;
import java.util.Scanner;
public class Ejercicio0701d {
    public static void main(String[] args)  { 
    Scanner teclado = new Scanner (System.in);
    int [] temperaturaMes = new int[11];
    int max=0,i;
    for( i = 0;i<temperaturaMes.length; i++){
        if(i==0 || i==1 || i==2 || i==10 || i==11){
            temperaturaMes [i] = (int) (Math.random() * 20) -11;
        }
        else{
            temperaturaMes [i] = (int) (Math.random()*40) +10;
        }
        for(i = 0;i<temperaturaMes.length; i++){
            if(temperaturaMes[i]>max){
            max = temperaturaMes[i];
            }
            System.out.println(max);
        }
        
        
        
        
        
        
        
        
    }
    
}//fin main
}//fin clase