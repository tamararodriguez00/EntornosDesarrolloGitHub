package cuentas;
/**
 * 
 * @author Tamara
 *
 */
public class Main {

    public static void main(String[] args) {
    	/**
    	 * se declara un objeto de la clae CCuenta llamado cuenta1
    	 * se declara una variable de tipo double, saldoAcutal
    	 */
        CCuenta cuenta1; 
        double saldoActual;

        /**
         * Se cra un objeto cuenta1 al que se le pasan los parámetros al constructor
         * Se actualiza la variable saldoActual a través del método estado que devolvia el saldo
         * en ese momento y se imprime por pantalla
         */
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        /**
         * se llama al método refactorizado operativa_cuenta y se le pasa
         * el objeto cuenta1 y la cantidad de 0
         */
        operativa_cuenta(cuenta1, 0);
    }

    /**
     * Método operativa_cuenta que no devuelve nada y recibe como parámetros un
     * objeto de tipo CCuenta y una cantidad. Este método realizará la operación de 
     * ingresar una cantidad, llamando al método ingresar o, retirar una cantidad llamando
     * al método retirar. Comprobará que no ocurra nada inesperado a través de bloques
     * try-catch
     * @param cuenta1
     * @param cantidad
     */
	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
