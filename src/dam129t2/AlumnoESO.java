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
public class AlumnoESO extends Alumno{
    public int telefono;
    
    AlumnoESO (String nom, String Dn, int tel){
        super (nom, Dn);
        telefono=tel;
    }
    
    public void setTelefono (int t){telefono=t;}
    public void nuevaFalta(int sesiones){
        faltas += sesiones;
        System.out.println("falta registrada. LLamar a "+telefono);
        if(faltas>30)
                System.out.println("Llamar a asuntos sociales");
    }
}
