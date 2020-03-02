package ejercicios;
import java.util.Scanner;
public class Ejercicio0701e {
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
        System.out.println(temperaturaMes[i]);
        if(temperaturaMes[i]<min){
            min = temperaturaMes[i];
            mes = i;
        }
    
    }
    
    switch(mes){
        case 0: System.out.println("Enero fue el mes más frío. Temp min: ");break;
        case 1: System.out.println("Febrero fue el mes más frío.");break;
        case 2: System.out.println("Marzo fue el mes más frío.");break;
        case 3: System.out.println("Abril fue el mes más frío.");break;
        case 4: System.out.println("Mayo fue el mes más frío.");break;
        case 5: System.out.println("Junio fue el mes más frío.");break;
        case 6: System.out.println("Julio fue el mes más frío.");break;
        case 7: System.out.println("Agosto fue el mes más frío.");break;
        case 8: System.out.println("Septiembre fue el mes más frío.");break;
        case 9: System.out.println("Octubre fue el mes más frío.");break;
        case 10: System.out.println("Noviembre fue el mes más frío.");break;
        case 11: System.out.println("Diciembre fue el mes más frío.");break;
    }
    
    
}//Fin main
}//Fin clase