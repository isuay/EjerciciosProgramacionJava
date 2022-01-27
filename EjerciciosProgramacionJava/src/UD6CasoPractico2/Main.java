package UD6CasoPractico2;

import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("\nMENÚ BANCO\n"
                + "1 Ver cuentas.\n"
                + "2 Ingresar dinero.\n"
                + "3 Retirar dinero.\n"
                + "4 Transferencia.\n"
                + "5 Agregar cuenta.\n"
                + "6 Eliminar cuenta.\n"
                + "7 Buscar cuenta.\n"
                + "8 Mostrar morosos.\n"
                + "9 Salir.\n");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Banco banco = new Banco();
        int opcion;
        String nombre;
        double saldo;

        do {
            menu();
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }

        } while (opcion != 9);

    }
}
