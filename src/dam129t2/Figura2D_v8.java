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
public class Figura2D_v8 {
    private double width;
    private double high;
    private String name;    
    Figura2D_v8(){
        width=0;high=0;name=null;
    }
    Figura2D_v8(double m){
        width=m; high=m;
    }
    Figura2D_v8(double w, double h, String n){
        this.width =w; this.high=h;this.name=n;
    }
    
    
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHigh(double high) {
        this.high = high;
    }
    public double getWidth() {
        return width;
    }
    public double getHigh() {
        return high;
    }
    public void verDim(){
        System.out.printf("width = %.2f, high= %.2f",getWidth(),getHigh());
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
   