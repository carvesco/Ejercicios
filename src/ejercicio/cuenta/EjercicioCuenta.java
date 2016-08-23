
package ejercicio.cuenta;


public class EjercicioCuenta {

    
    public static void main(String[] args) {
        Cuenta magdalena=new Cuenta(1012,"Magdalena S",0,1234);
        //Consignando a la cuenta
        magdalena.consignar(100000);
        Cuenta joselito=new Cuenta(1013,"Joselito P",500000,9876);
        //Cambiando la clave
        joselito.cambiarClave(5876);
        //consulta su saldo
        double saldo =joselito.cosultarsaldo();
        System.out.println(saldo);
        
       
      
    }
    
}
