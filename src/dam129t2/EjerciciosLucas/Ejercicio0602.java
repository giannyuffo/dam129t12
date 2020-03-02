package ejercicios;
import java.util.Scanner;
public class Ejercicio0602 {
    public static void main(String[] args)  { 
    Scanner teclado = new Scanner (System.in);
    boolean recargaOK;
    
    MovilPrepago m1= new MovilPrepago(633633633, 0.2f, 0.23f, 0.15f, 15f);
    System.out.println("Para salir pulse 0.");
    System.out.println("Pulse 1 para recargar, pulse 2 para llamar, pulse 3 para navegar, pulse 4 para consultar saldo");
    boolean x= m1.recargar(0);
    int operacionMovil= teclado.nextInt(); float saldo;
    
    int importe=0, durLlamada=0, cantMegas=0;
    
    
    do{
        switch (operacionMovil) {
            case 1: if(operacionMovil==1){
                    System.out.println("Introduzca la cantidad que quiere recargar: ");
                    importe=teclado.nextInt();
                    }
                
                    recargaOK= m1.recargar(importe);
                 
                    if(recargaOK==true){
                        System.out.println("Se ha recargado con éxito; su saldo actual es: " +m1.consultarSaldo());
                    }
                    else {
                        System.out.println("No se pudo realizar la recarga, su saldo es "+m1.consultarSaldo());
                    }
            break;
            case 2: if(operacionMovil==2){
                        System.out.println("Introduzca la duración de la llamada: ");
                        durLlamada=teclado.nextInt();
                    }
                     m1.efectuarLlamada(durLlamada); 
                     break;
            case 3: if(operacionMovil==3){
                        System.out.println("Introduzca cuántos megas desea navegar: ");
                        cantMegas=teclado.nextInt();
                    }
                    m1.navegar(cantMegas); 
                    break;
            case 4: saldo= m1.consultarSaldo();
                    System.out.println("Su saldo es de: "+saldo+" euros.");
                    break;
        }
         System.out.println("Pulse 1 para recargar, pulse 2 para llamar, pulse 3 para navegar, pulse 4 para consultar saldo");
         System.out.println("Para salir pulse 0.");
         operacionMovil= teclado.nextInt();
    }
    while (operacionMovil!=0);

    
    
    
    
}}
