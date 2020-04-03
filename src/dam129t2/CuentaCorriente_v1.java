package dam129t2;
public class CuentaCorriente_v1 {
    public String IBAN;
    private float saldo;
    private int contadorIngresos;
    private static float porcentajeComision;
    private static float minimoComision;
    

CuentaCorriente_v1 (String i) {
    IBAN = i; 
    saldo =0;
    contadorIngresos = 0;
}    
public static void setComision (float pc, float mc) {
    porcentajeComision = pc;
    minimoComision = mc;
}
public static float getPorcentajeComision () {return porcentajeComision;}
public static float getMinimoCosmision ()    {return minimoComision;}
public float        getSaldo ()              {return (saldo);}

public void ingresar (float importe) {
    float bonus=0;
    if (++contadorIngresos == 3) {
       contadorIngresos = 0; 
       bonus =0.7f;
    }    
    saldo += importe + bonus;
}

public boolean retirar (float importe) {
    float comision;
    if (porcentajeComision * importe < minimoComision) 
        comision = minimoComision;
    else 
        comision = porcentajeComision * importe;
    if (importe + comision <= saldo) {
       saldo -= importe+comision;  //resta (importe+comision)
       contadorIngresos = 0;
       return true;
    }
    else return false; 
}

} // fin clase