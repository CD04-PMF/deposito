package cuentas;

/**
 * Esta clase contiene los datos de cada cuenta
 * @author pedromartinez
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Método contructor por defecto
     */
    public CCuenta()
    {
    }

    /**
     * Método constructor parametrizado
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo en cuenta
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     *
     * @return Saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para ingresar cantidad en cuenta
     * @param cantidad Cantidad a ingresar
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar cantidad de cuenta
     * @param cantidad Cantidad a retirar
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
        /**
     * @return Nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Nombre del titular to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta Número de cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return Saldo en cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo Saldo en cuenta to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return Tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés Tipo de interés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    
    
}
