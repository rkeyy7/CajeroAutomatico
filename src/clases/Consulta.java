package clases;

/**
 *
 * @author bryan
 */
public class Consulta extends Cajero {

    @Override
    public void transacciones() {
        System.out.println("-------------------------");
        System.out.println("SALDO ACTUAL: " + getSaldo());
    }
}
