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
public class Figura2D_v6 {
    private double width;
    private double high;
    
    Figura2D_v6(){
        width=0;high=0;
    }
    Figura2D_v6(double m){
        width=m; high=m;
    }
    Figura2D_v6(double w, double h){
        width =w; high=h;
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
}
   