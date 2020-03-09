package dam129t2;

/**
 *
 * @author uffog
 */
public class AlumnoCiclos extends Alumno{
    public String Empresa;
    public String email;
    
    AlumnoCiclos (String no, String Dn, String E, String e){
        super (no, Dn);
        Empresa=E; email=e;
    }
    
    public void setEmpresa(String E){Empresa=E;}
    public void setEmail(String e){email=e;}
    public void nuevafalta(int sesiones){
        faltas+=sesiones;
        System.out.println("Falta registrada. Notificar a"+email);
        if(faltas>50)
                System.out.println("Alumno dado de baja");
    }
}

