package clases;

import java.util.Scanner;

public abstract class Cajero {

    protected int transacciones, retiro, deposito;
    private static int saldo;

    Scanner entrada = new Scanner(System.in);

    public void operar() {
        int opcion = 0;

        do {
            System.out.println("-------------------------");
            System.out.println("SELECCIONE UNA OPCION:");
            System.out.println("1. CONSULTAR SALDO");
            System.out.println("2. RETIRAR SALDO");
            System.out.println("3. DEPOSITAR SALDO");
            System.out.println("4. SALIR");
            System.out.println("-------------------------");
            System.out.print("INGRESE UNA OPCION: ");
            opcion = entrada.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                switch (opcion) {
                    case 1 -> {
                        Cajero mensajero = new Consulta();
                        mensajero.transacciones();
                    }
                    case 2 -> {
                        Cajero mensajero = new Retiro();
                        mensajero.transacciones();
                    }
                    case 3 -> {
                        Cajero mensajero = new Deposito();
                        mensajero.transacciones();
                    }
                    case 4 -> {
                        System.out.println("VUELVA PRONTO");
                        System.exit(0);
                    }
                    default -> {
                    }
                }
            } else {
                System.out.println("-------------------------");
                System.out.println("ERROR: NO EXISTE EL MENU");
            }
        } while (true);
    }

    protected void retirar() {
        retiro = entrada.nextInt();
    }

    protected void depositar() {
        deposito = entrada.nextInt();
    }

    public abstract void transacciones();

    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        Cajero.saldo = saldo;
    }
}
