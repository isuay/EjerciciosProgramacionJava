package UD7Entregable;

import java.util.*;

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

    public static double pedirDouble(String mensaje) {
        Scanner in = new Scanner(System.in);
        boolean bien = false;
        double n = 0;
        do {
            try {
                System.out.print(mensaje);
                n = in.nextDouble();
                bien = true;
            } catch (InputMismatchException e) {
                System.err.println("Valor introducido incorrecto");
                in.nextLine();
            }
        } while (bien == false);
        return n;
    }
    
    public static int pedirInt(String mensaje) {
        Scanner in = new Scanner(System.in);
        boolean bien = false;
        int n = 0;
        do {
            try {
                System.out.print(mensaje);
                n = in.nextInt();
                bien = true;
            } catch (InputMismatchException e) {
                System.err.println("Valor introducido incorrecto");
                in.nextLine();
                System.out.print("Número: ");
            }
        } while (bien == false);
        return n;
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
                    try {
                    banco.imprimirTodos();
                } catch (CuentaException e) {
                    System.err.println(e.getMessage());
                }

                break;

                case 2:
                    try {
                    banco.imprimirTodos();
                    num = pedirInt("Número de cuenta: ");
                    dinero = pedirDouble("Cantidad a ingresar: ");
                    banco.ingresarDinero(num, dinero);
                } catch (CuentaException e) {
                    System.err.println(e.getMessage());
                } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
                    System.err.println("No existe ese número de cuenta");
                    in.nextLine();
                }
                break;

                case 3:
                    try {
                    banco.imprimirTodos();
                    num = pedirInt("Número de cuenta: ");
                    dinero = pedirDouble("Cantidad a retirar: ");
                    banco.retirarDinero(num, dinero);
                } catch (CuentaException e) {
                    System.err.println(e.getMessage());
                } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
                    System.err.println("No existe ese número de cuenta");
                    in.nextLine();
                }
                break;

                case 4:
                    try {
                    banco.imprimirTodos();
                    num = pedirInt("Número de la cuenta de origen: ");
                    int num2 = pedirInt("Número de la cuenta de destino: ");
                    dinero = pedirDouble("Cantidad del traspaso: ");
                    banco.transferencia(num, num2, dinero);
                } catch (CuentaException e) {
                    System.err.println(e.getMessage());
                } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
                    System.err.println("No existe ese número de cuenta");
                    in.nextLine();
                }
                break;

                case 5:
                    try {
                    in.nextLine();
                    System.out.print("Nombre: ");
                    nombre = in.nextLine();
                    dinero = pedirDouble("Saldo: ");
                    Cuenta c = new Cuenta(nombre, dinero);
                    banco.agregarCuenta(c);
                } catch (CuentaException e) {
                    System.err.println(e.getMessage());
                }
                break;

                case 6:
                    try {
                    banco.imprimirTodos();
                    num = pedirInt("Número de la cuenta a eliminar: ");
                    banco.eliminarCuenta(num);
                } catch (CuentaException e) {
                    System.err.println(e.getMessage());
                } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
                    System.err.println("No existe ese número de cuenta");
                    in.nextLine();
                }
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
