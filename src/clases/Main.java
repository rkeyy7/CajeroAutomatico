package clases;

/**
 *
 * @author bryan
 */
public class Main {

    public static void main(String[] args) {
        Cajero mensajero = new Consulta();
        mensajero.setSaldo(10000);
        mensajero.operar();
    }
}
