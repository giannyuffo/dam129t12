/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam129t2;

/**
 *
 * @author uffog
 */
public class TrianColor_v6 extends Triangle_v6{
    private String color;
    
    TrianColor_v6(){}
    TrianColor_v6(double Wi, String c){
        super(Wi);
    }
    TrianColor_v6(double Wi, double Hi, String s, String c){
        super(Wi,Hi,s);
        color=c;
    }
    public String getColor() {
        return color;
    }
    public void setColor() {
        System.out.println("What's the color of your triangle?");
        this.color = teclado.nextLine();
    }
}
