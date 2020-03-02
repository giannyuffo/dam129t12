package ejercicios;
import java.util.Scanner;
public class Ejercicio0701f {
    public static void main(String[] args)  { 
    Scanner teclado = new Scanner (System.in);
    int [] temperaturaMes = new int[12];
    int min=0,i, mes=0;
    for( i = 0;i<temperaturaMes.length; i++){
        if(i==0 || i==1 || i==2 || i==10 || i==11){
            temperaturaMes [i] = (int) (Math.random() * 20) -11;
        }
        else{
            temperaturaMes [i] = (int) (Math.random()*40) +10;
        }
    
    }
}//Fin main
}//Fin clase    