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
         * Se cra un objeto cuenta1 al que se le pasan los par�metros al constructor
         * Se actualiza la variable saldoActual a trav�s del m�todo estado que devolvia el saldo
         * en ese momento y se imprime por pantalla
         */
        cuenta1 = new CCuenta("Antonio L�pez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        /**
         * se llama al m�todo refactorizado operativa_cuenta y se le pasa
         * el objeto cuenta1 y la cantidad de 0
         */
        operativa_cuenta(cuenta1, 0);
    }

    /**
     * M�todo operativa_cuenta que no devuelve nada y recibe como par�metros un
     * objeto de tipo CCuenta y una cantidad. Este m�todo realizar� la operaci�n de 
     * ingresar una cantidad, llamando al m�todo ingresar o, retirar una cantidad llamando
     * al m�todo retirar. Comprobar� que no ocurra nada inesperado a trav�s de bloques
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
