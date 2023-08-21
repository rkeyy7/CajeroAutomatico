package clases;

/**
 *
 * @author bryan
 */
public class Deposito extends Cajero {

    @Override
    public void transacciones() {
        System.out.println("-------------------------");
        System.out.print("CUANTO DESEA DEPOSITAR?: ");
        depositar();

        transacciones = getSaldo();
        setSaldo(transacciones + deposito);

        System.out.println("DEPOSITASTE: " + deposito);
        System.out.println("SALDO ACTUAL: " + getSaldo());
    }

}
