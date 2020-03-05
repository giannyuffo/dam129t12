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
public class Alumno {
    public String nombre;
    public String DNI;
    public int faltas;

    Alumno(){}
    Alumno(String n, String D){
        nombre=n; DNI=D;faltas=0;
    }
    public void setNombre(String n){nombre=n;}
    public void setDNI(String D){DNI=D;}
    public void setFaltas(){faltas=0;}
}
