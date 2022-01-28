package UD6CasoPractico2;

import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("\nMENÚ BANCO\n"
                + "1. Ver cuentas.\n"
                + "2. Ingresar dinero.\n"
                + "3. Retirar dinero.\n"
                + "4. Transferencia.\n"
                + "5. Agregar cuenta.\n"
                + "6. Eliminar cuenta.\n"
                + "7. Buscar cuenta.\n"
                + "8. Mostrar morosos.\n"
                + "9. Salir.\n");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Banco banco = new Banco();
        int opcion, num;
        String nombre;
        double dinero;

        do {
            menu();
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    banco.imprimirTodos();
                    break;
                case 2:
                    banco.imprimirTodos();
                    System.out.print("Número de cuenta: ");
                    num = in.nextInt();
                    System.out.print("Cantidad a ingresar: ");
                    dinero = in.nextDouble();
                    banco.ingresarDinero(num, dinero);
                    break;
                case 3:
                    banco.imprimirTodos();
                    System.out.print("Número de cuenta: ");
                    num = in.nextInt();
                    System.out.print("Cantidad a retirar: ");
                    dinero = in.nextDouble();
                    banco.retirarDinero(num, dinero);
                    break;
                case 4:
                    banco.imprimirTodos();
                    System.out.print("Número de la cuenta de origen: ");
                    num = in.nextInt();
                    System.out.print("Número de la cuenta de destino: ");
                    int num2 = in.nextInt();
                    System.out.print("Cantidad del traspaso: ");
                    dinero = in.nextDouble();
                    banco.transferencia(num, num2, dinero);
                    break;
                case 5:
                    in.nextLine();
                    System.out.print("Nombre: ");
                    nombre = in.nextLine();
                    System.out.print("Saldo: ");
                    dinero = in.nextDouble();
                    Cuenta c = new Cuenta(nombre, dinero);
                    banco.agregarCuenta(c);
                    break;
                case 6:
                    banco.imprimirTodos();
                    System.out.print("Número de la cuenta a eliminar: ");
                    num = in.nextInt();
                    banco.eliminarCuenta(num);
                    break;
                case 7:
                    in.nextLine();
                    System.out.print("Nombre de la cuenta a buscar: ");
                    nombre = in.nextLine();
                    banco.imprimirBuscarCuenta(banco.buscarCuenta(nombre));
                    break;
                case 8:
                    banco.mostrarMorosos();
                    break;
            }
        } while (opcion != 9);

    }
}
