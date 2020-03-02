package dam129t11;
import java.util.Scanner;
/**
 * @author uffog
 */
public class dam129t2000 {
    public static void main(String[] args)  {
        Bicho bi = new Bicho();         
        BichoDormilon  bd = new BichoDormilon();       
        
        System.out.println("bi -> hambre: " + bi.hambre);                 
        System.out.println("bd -> hambre: " + bd.hambre);                 
        System.out.println("bd -> sueño: " + bd.sueño);               
        System.out.println("bd -> peso: " + bd.peso);      

         bi.come();          
         bd.come();          
         System.out.println("bi -> hambre: " + bi.hambre);              
         System.out.println("bd -> hambre: " + bd.hambre);     
         bd.aDormir();                                                 
         System.out.println("bd -> hambre: " + bd.hambre);                    
         System.out.println("bd -> sueño: " + bd.sueño);
         
         
         BichoDormilon bd2 = new BichoDormilon (5); 
         
         bd2.come(); 
            
         System.out.println("bd2 -> hambre: " + bd2.hambre);      
         
         System.out.println("-----------------");
         
        BichoDormilon bd3 = new BichoDormilon (5); 
        bd3.come(); 
        System.out.println("bd3 -> hambre: " + bd3.hambre);      
        System.out.println("bd3 -> sueño: " + bd3.sueño);

    }
}
