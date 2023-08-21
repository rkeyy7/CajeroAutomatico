package clases;

/**
 *
 * @author bryan
 */
public class Retiro extends Cajero {

    @Override
    public void transacciones() {
        System.out.print("CUANTO DESEA RETIRAR?: ");
        retirar();

        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);

            System.out.println("-------------------------");
            System.out.println("RETIRASTE: " + retiro);
            System.out.println("SALDO ACTUAL: " + getSaldo());

        } else {
            System.out.println("-------------------------");
            System.out.println("ERROR: SALDO INSUFICIENTE");
        }
    }
}
