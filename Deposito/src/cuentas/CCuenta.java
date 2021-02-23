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
 * Constructor por defecto, sin parámetros
 */
    public CCuenta(){
    }
    
/**
 * Constructor con parámetros
 * @param nom: nombre del cliente de la cuenta
 * @param cue: numero de la cuenta bancaria
 * @param sal: saldo de la cuenta
 * @param tipo: tipo de interés aplicado
 */
    public CCuenta(String nom, String cue, double sal, double tipo){
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Método estado: devuelve el saldo disponible en ese momento
     * @return saldo disponible de la cuenta
     */
    public double estado(){
        return getSaldo();
    }

    /**
     * Método ingresar: ingresa la cantidad pasada por parámetro en el saldo
     * @param cantidad a ingresar
     * @throws Exception en caso de ocurrir algo inesperado, como ingresar
     * cantidades negativas, lanza una excepción
     */
    public void ingresar(double cantidad) throws Exception{
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método retirar: retira una cantidad pasada por parámetro de la cuenta 
     * y la descuenta del saldo
     * @param cantidad a retirar
     * @throws Exception. Se lanzará una excepción en caso de retirar una cantidad
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
	 * setNombre asigna el nombre del titular pasado por parámetro
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
	 * setCuenta asigna el número de cuenta pasado por parámetro
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
	 * setSaldo asigna un nuevo saldo pasado por parámetro
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * getTipoInteres nos devuelve el tipo de interés aplicado a la cuenta
	 * @return TipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * setTipoInteres asigna un tipo de interés a aplicar a la cuenta pasado por parámetro
	 * @param tipoInteres
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
      
}

