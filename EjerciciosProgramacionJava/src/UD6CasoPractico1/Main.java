package UD6CasoPractico1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int opcion;
        String n, t, co;

        Agenda a1 = new Agenda();

        do {
            System.out.println("\nMENÚ AGENDA\n"
                    + "1. Ver contactos.\n"
                    + "2. Agregar contacto.\n"
                    + "3. Eliminar contacto.\n"
                    + "4. Buscar por nombre.\n"
                    + "5. Salir\n");
            
            opcion = in.nextInt();
            
            switch (opcion) {
                case 1:
                    a1.imprimirTodos();
                    break;
                case 2:
                    in.nextLine();
                    System.out.print("Nombre: ");
                    n = in.nextLine();
                    System.out.print("Telefono: ");
                    t = in.nextLine();
                    System.out.print("Correo: ");
                    co = in.nextLine();
                    Contacto c = new Contacto(n, t, co);
                    a1.agregarContacto(c);
                    break;
                case 3:
                    System.out.print("Posicion del contacto a eliminar: ");
                    int p = in.nextInt();
                    a1.eliminarContacto(p);
                    break;
                case 4:
                    in.nextLine();
                    System.out.print("Nombre del contacto a buscar: ");
                    n = in.nextLine();
                    System.out.println("");
                    a1.imprimirBuscar(a1.buscarContacto(n));
                    break;
            }
        } while (opcion != 5);
    }
}
