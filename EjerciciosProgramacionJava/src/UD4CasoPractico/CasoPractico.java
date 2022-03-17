/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo CasoPractico.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD4CasoPractico;

import java.util.Scanner;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 11 nov. 2021 20:08:58
 */
public class CasoPractico {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int MAX = 100;
        String[] nombre = new String[MAX];
        int[] tlf = new int[MAX];
        String[] mail = new String[MAX];

        int opcion, contar = 0;
        boolean salir = false;

        do {
            System.out.println("MENÚ");
            System.out.println("1. Ver contactos");
            System.out.println("2. Agregar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Buscar contacto");
            System.out.println("5. Salir");

            System.out.print("Elige una opción: ");
            opcion = in.nextInt();

            System.out.println("");

            switch (opcion) {
                case 1:
                    for (int i = 0; i < contar; i++) {
                        System.out.println("Nombre: " + nombre[i]);
                        System.out.println("Teléfono: " + tlf[i]);
                        System.out.println("Mail: " + mail[i]);
                        System.out.println("");
                    }
                    break;

                case 2:
                    in.nextLine();

                    System.out.print("Nombre: ");
                    nombre[contar] = in.nextLine();

                    System.out.print("Teléfono: ");
                    tlf[contar] = in.nextInt();
                    in.nextLine();

                    System.out.print("Mail: ");
                    mail[contar] = in.nextLine();

                    System.out.println("");
                    contar++;
                    break;

                case 3:
                    System.out.print("¿Qué contacto desea eliminar? ");
                    int borrar = in.nextInt();
                    System.out.println("");

                    for (int i = borrar + 1; i < contar; i++) {
                        nombre[i - 1] = nombre[i];
                        tlf[i - 1] = tlf[i];
                        mail[i - 1] = mail[i];
                    }
                    contar--;
                    break;

                case 4:
                    boolean buscar = false;
                    
                    in.nextLine();
                    System.out.print("¿Qué nombre desea buscar? ");
                    String N = in.nextLine();

                    System.out.println("");

                    for (int i = 0; i < contar; i++) {
                        if (nombre[i].indexOf(N) >= 0) {
                            System.out.println("Nombre: " + nombre[i]);
                            System.out.println("Teléfono: " + tlf[i]);
                            System.out.println("Mail: " + mail[i]);
                            System.out.println("");
                            buscar = true;
                        }
                    }
                    if (buscar == false) {
                        System.out.println("No se han encontrado contactos");
                        System.out.println("");
                    }
                    break;

                case 5:
                    salir = true;
                    break;
            }
        } while (!salir);
    }
}
