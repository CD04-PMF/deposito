package cuentas;

/**
 * Clase principal Deposito
 * @author pedromartinez
 */
public class Main {

    /**
     * Método principal Deposito
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        
        
        operativa_cuenta(cuenta1);
    }

    /**
     * Método que realiza operaciones en la cuenta pasada por parámetro
     * @param cuentas Recibe un objecto tipo CCuenta
    */    
    private static void operativa_cuenta(CCuenta cuentas) {
        
        double saldoActual;
        saldoActual = cuentas.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuentas.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuentas.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
