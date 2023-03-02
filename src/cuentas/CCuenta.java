package cuentas;

/**
 * Clase CCuenta que emula una cuenta bancaria
 * @author Manuel Páez
 * @version 1.0
 */
public class CCuenta {

	/**
	 * Atributos de la clase CCuenta
	 * 
	 */
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    /**
     * Constructor por defecto de la clase CCuenta
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor de la clase CCuenta
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Método que retorna el saldo de la cuenta
     * @return saldo
     */
    public double estado()
    {
        return saldo;
    }
    
    /**
     * Método para ingresar dinero en la cuenta
     * @param cantidad
     * @throws Exception si el importe a ingresar es negativo
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * Método para retirar dinero
     * @param cantidad
     * @throws Exception si el importe a retirar es negativo o no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     * Getter de nombre
     * @return nombre
     */
    public String getNombre() {
		return nombre;
	}
    
    /**
     * Setter de nombre
     * @param nombre
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Getter del número de cuenta
	 * @return cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}
	
	/**
	 * Modifica el número de cuenta
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * Getter de saldo
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Modifica el saldo de la cuenta
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Getter del tipo de interés
	 * @return tipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}
	
	/**
	 * Modifica el tipo de interés
	 * @param tipoInteres
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
