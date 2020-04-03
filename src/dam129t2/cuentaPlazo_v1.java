/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam129t2;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author uffog
 */
public class cuentaPlazo_v1 extends CuentaCorriente_v1 {
public String IBAN;
    private float saldo;
    private int contadorIngresos;
    private LocalDate creacion;
    private boolean fecha;
    

cuentaPlazo_v1 () {
}
cuentaPlazo_v1 (String i, boolean c) {
    super(i); 
    saldo =0;
    contadorIngresos = 0;
} 
public float getSaldo (){return (saldo);}

public void ingresar (float importe) {
    float bonus=0;
    if (++contadorIngresos == 3) {
       contadorIngresos = 0; 
       bonus =0.7f;
    }    
    saldo += importe + bonus;
}
private void fechaCreacion(){
    creacion= LocalDate.now();
}

/*public boolean retirar (float importe) {
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
}*/

} // fin clase