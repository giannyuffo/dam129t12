/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam129t2;

import java.util.ArrayList;

/**
 *
 * @author uffog
 */
public class Rectangle_v8 extends Figura2D_v8 {
    private double width, high;
    private String name;
    
    Rectangle_v8(){}
    Rectangle_v8(double meas, String n){
        super(meas);
        name=n;
    }
    Rectangle_v8(double Wi, double Hi, String n){
        super(Wi, Hi, n);
        /*this.width=Wi; this.high=Hi;name=n;*/
    }
    
    public boolean isSquare(String n){
        String nameObject=n;
        if(nameObject == "cuadrado")
            return true;
        else
            return false;
    }
    public int isSquare(){
        ArrayList <String> figuras = new ArrayList <> ();

        int j=(int) (Math.random()*19), suma=0;
        
        for (int i = 0; i < j; i++) {
            if (i%2==0) {
               figuras.add(i,"cuadrado");
            }
            else{
               figuras.add(i,"rectangulo");
            }  

        }
        for (int i = 0; i < j; i++) {
            boolean contain=false;
            contain=figuras.contains("cuadrado");
            if(contain==true)
                suma++;
        }
        return suma;
    }
    
}
