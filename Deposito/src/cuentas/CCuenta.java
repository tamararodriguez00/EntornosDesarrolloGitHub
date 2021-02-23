package cuentas;
/**
 * 
 * @author Tamara
 *
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
/**
 * Constructor por defecto, sin par�metros
 */
    public CCuenta(){
    }
    
/**
 * Constructor con par�metros
 * @param nom: nombre del cliente de la cuenta
 * @param cue: numero de la cuenta bancaria
 * @param sal: saldo de la cuenta
 * @param tipo: tipo de inter�s aplicado
 */
    public CCuenta(String nom, String cue, double sal, double tipo){
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * M�todo estado: devuelve el saldo disponible en ese momento
     * @return saldo disponible de la cuenta
     */
    public double estado(){
        return getSaldo();
    }

    /**
     * M�todo ingresar: ingresa la cantidad pasada por par�metro en el saldo
     * @param cantidad a ingresar
     * @throws Exception en caso de ocurrir algo inesperado, como ingresar
     * cantidades negativas, lanza una excepci�n
     */
    public void ingresar(double cantidad) throws Exception{
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * M�todo retirar: retira una cantidad pasada por par�metro de la cuenta 
     * y la descuenta del saldo
     * @param cantidad a retirar
     * @throws Exception. Se lanzar� una excepci�n en caso de retirar una cantidad
     * negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception{
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * getNombre devuelve el nombre del titular de la cuenta
     * @return nombre
     */
	public String getNombre() {
		return nombre;
	}

	/**
	 * setNombre asigna el nombre del titular pasado por par�metro
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * getCuenta devuelve el numero de cuenta
	 * @return cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * setCuenta asigna el n�mero de cuenta pasado por par�metro
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * getSaldo nos devuelve el valor de saldo
	 * @return saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * setSaldo asigna un nuevo saldo pasado por par�metro
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * getTipoInteres nos devuelve el tipo de inter�s aplicado a la cuenta
	 * @return TipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * setTipoInteres asigna un tipo de inter�s a aplicar a la cuenta pasado por par�metro
	 * @param tipoInteres
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
      
}

