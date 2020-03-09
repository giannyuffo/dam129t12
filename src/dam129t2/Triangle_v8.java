/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam129t2;
import java.util.Scanner;

/**
 *
 * @author uffog
 */
public class Triangle_v8 extends Figura2D_v8{
   Scanner teclado = new Scanner(System.in);
   String style; double area, meas;
   
   Triangle_v8(){
       super();
       style=null;
   }
   Triangle_v8(double m){
       super(m);
       style="Same Width and High";
   }
   Triangle_v8(double Wi, double Hi, String s, String n){
       super (Wi, Hi,n);
       style=s;
   }
   
   
   
    public void setStyle(String s){
       this.style=s;
    }
    public String getStyle() {
      
        char[] caracteres = style.toCharArray();
        caracteres[0] = Character.toUpperCase(caracteres[0]);
        
        String firtsLetter = style.substring(0, 1).toUpperCase();
        String restoDeLaCadena = style.substring(1);
        String capital = firtsLetter + restoDeLaCadena;
       
       return capital;
       }
    public double area() {
        return this.area = (super.getWidth() * super.getHigh())/2;
    }
}
