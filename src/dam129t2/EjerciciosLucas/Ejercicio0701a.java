package ejercicios;
import java.util.Scanner;
public class Ejercicio0701a {
    public static void main(String[] args)  { 
    Scanner teclado = new Scanner (System.in);
    int [] temperaturaMes = new int[11];
  
    
    
    for(int i = 0;i<temperaturaMes.length; i++){
        if(i==0 || i==1 || i==2 || i==10 || i==11){
            temperaturaMes [i] = (int) (Math.random() * 20) -11;
        }
        else{
            temperaturaMes [i] = (int) (Math.random()*40) +10;
        }
        System.out.println(i);
    }
    
   
        
    
    
    
}}
