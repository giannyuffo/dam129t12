package dam129t11;

/*
Ctrl + Space                 completar
Alt + Insert                 varias opciones
Ctrl + R                     refactorizar
fcom + Tab                   comentarios
fori + Tab                      for
sout + Tab o soutv + Tab   ...pintln...
iff + Tab                       if
sw + Tab                      switch
*/
import java.util.Scanner;
class Alumno{
    public String nombre;
    public String DNI;
    public int faltas;
    
    Alumno(){};
    Alumno(String n, String D){
        nombre=n; DNI=D; faltas=0;
    }
    public void setNombre(String n){
    nombre=n;
    }
    public void setDNI(String D){
    DNI=D;
    }
    public void setFaltas(){
        faltas=0;
    }
}

class AlumnoESO extends Alumno{
    public int telefono;
    
    AlumnoESO (String nom, String Dn, int tel){
        super(nom, Dn);
        telefono=tel;
    }
    public void setTelefono(int t){
        telefono=t;
    }
    public void nuevaFalta(int sesiones){
        faltas +=sesiones;
        System.out.println("falta registrada. LLamar a "+ telefono);
        if(faltas>30)
            System.out.println("Llamar a asuntos sociales");
    }
}

class AlumnoCiclos extends Alumno{
    public String Empresa;
    public String email;
    
    AlumnoCiclos (String no, String Dn, String E, String e){
        super (no, Dn);
        Empresa=E;
        email=e;
    }
    public void setEmpresa(String E){
       Empresa=E;
    }
    public void setEmail(String e){
        email=e;
    }
    
    public void nuevaFalta(int sesiones){
        faltas+=sesiones;
        System.out.println("Falta registrada. Notificar a"+ email);
        if(faltas>50)
            System.out.println("Alumno dado de baja");
    }
}