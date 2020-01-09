package cuentas;
public class CCuenta {

	/**@param Atributos encapsulados
	 * @since 09/01/2020
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }
    	
    /**@param Metodo donde se pasan por parametros el nombre, la cuenta, el saldo y el tipo y se actualizan con el 
     * valor correspondiente
     * @since 09/01/2020
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /**@param Metodo utilizado para recuperar el estado
     * @return Devuelve un dato de tipo double
     * @since 09/01/2020
     */
    public double estado()
    {
        return getSaldo();
    }
    /**@param Metodo para ingresar donde se pasa por parametro una cantidad
     * y esta se suma a la cantidad existente pasada por parametro. 
     * @throws Lanza una excepcion si la cantidad es menor a 0
     * @since 09/01/2020
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**@param Metodo para retirar donde se pasa por parametro una cantidad, restandola a la cantidad existente 
     * valor correspondiente
     * @throws Lanza unas excepciones si la cantidad es menor a 0 o el estado es menor a la cantidad
     * pasada por parametro
     * @since 09/01/2020
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    

    /**@param Metodo getter para recuperar el nombre
     * @since 09/01/2020
     */
	private String getNombre() {
		return nombre;
	}

	/**@param Metodo setter para modificar el nombre
	 * @since 09/01/2020
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**@param Metodo getter para recuperar la cuenta
	 * @since 09/01/2020
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**@param Metodo setter para modificar el nombre
	 * @since 09/01/2020
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**@param Metodo getter para recuperar el saldo
	 * @since 09/01/2020
	 */
	private double getSaldo() {
		return saldo;
	}

	/**@param Metodo setter para modificar el saldo
	 * @since 09/01/2020
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**@param Metodo getter para recuperar el tipoInteres
	 * @since 09/01/2020
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**@param Metodo setter para modificar el tipoInteres
	 * @since 09/01/2020
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
    
}
