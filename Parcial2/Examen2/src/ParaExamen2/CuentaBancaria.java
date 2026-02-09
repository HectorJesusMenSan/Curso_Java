package ParaExamen2;

// Clase para manejar cuentas bancarias bsicas
public class CuentaBancaria implements Imprimible {

    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

   
    public void retirar(double cantidad) throws FondoInsuficienteException, RetiroAnticipadoException {
        if (cantidad > saldo) {
            throw new FondoInsuficienteException("Fondos insuficientes.");
        }
        saldo -= cantidad;
    }

    @Override
    public void imprimir() {
        System.out.println("\n--- Cuenta Bancaria ---");
        System.out.println("Número: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }

    // getters y setters
    public String getNumeroCuenta() {
        return numeroCuenta; }
    public double getSaldo() { 
        return saldo; }
    public void setNumeroCuenta(String numeroCuenta) { 
        this.numeroCuenta = numeroCuenta; }
    public void setSaldo(double saldo) {
        this.saldo = saldo; }
}
