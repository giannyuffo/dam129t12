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
public class TrianColor_v8 extends Triangle_v8{
    private String color;
    
    TrianColor_v8(){}
    TrianColor_v8(double Wi, String c){
        super(Wi);
        color=c;
    }
    TrianColor_v8(double Wi, double Hi, String c,String s, String n){
        super(Wi,Hi,s,n);
        color=c;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String c) {
        this.color = c;
    }
}
