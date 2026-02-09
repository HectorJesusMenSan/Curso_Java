package ParaExamen2;

// Cuenta de ahorros con reglas para retiros
// Solo permite retirar si está permitido segu- las condiciones
public class CuentaAhorros extends CuentaBancaria {

    private boolean retiroPermitido; // indica si se puede retirar
    private double tasaInteres;     // interes aplicado
    private int mesesAntiguedad;    // tiempo que lleva activa

    // Constructor con todos los datos necesarios
    public CuentaAhorros(String numeroCuenta, double saldo, boolean retiroPermitido,
                         double tasaInteres, int mesesAntiguedad) {
        super(numeroCuenta, saldo);
        this.retiroPermitido = retiroPermitido;
        this.tasaInteres = tasaInteres;
        this.mesesAntiguedad = mesesAntiguedad;
    }

    // Retiro controlado: solo se permite si retiroPermitido es true
    @Override
    public void retirar(double cantidad) throws FondoInsuficienteException, RetiroAnticipadoException {
        if (!retiroPermitido) {
            throw new RetiroAnticipadoException("No puedes retirar por ahora.");
        }
        super.retirar(cantidad); // usa el retiro normal de la clase base
    }
}