/*
 * Proyecto EjerciciosProgramacionJava - Archivo AppDeContactos.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5CasosPracticos;

import java.util.Scanner;

/**
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 25 nov. 2021 18:17:01
 */
public class AppDeContactos {

    public static void main(String[] args) {

        int opcion;

        do {
            opcion = menu();

            realizaOperacion(opcion);

            System.out.println("");

        } while (opcion != 8);
    }

    // Muestra el menú, pide al usuario valor rango 1-9 y devuelve la opción elegida.
    public static int menu() {

        System.out.println("1. Ver contactos.\n"
                + "2. Agregar contacto.\n"
                + "3. Eliminar contacto.\n"
                + "4. Buscar por nombre.\n"
                + "5. Buscar por teléfono.\n"
                + "6. Buscar por correo.\n"
                + "7. Búsqueda global.\n"
                + "8. Salir.");

        int opcion = (int) pedirIntEnRango(1, 8);

        return opcion;
    }

// Realiza la opción del menú indicada en 'int opcion' (1. Ver contactos, 2. Agregar contacto, etc.)
    public static void realizaOperacion(int opcion) {

        switch (opcion) {
            case 1:
                verContactos();
                break;
            case 2:
                añadirContacto();
                break;
            case 3:
                eliminarContacto();
                break;
            case 4:
                buscarNombre();
                break;
            case 5:
                buscarTelefono();
                break;
            case 6:
                buscarCorreo();
                break;
            case 7:
                buscarGlobal();
                break;
            case 8:
                break;
        }
    }

// Pide al usuario un valor int, una y otra vez hasta que responde con valor en rango, devuelve el valor
    public static int pedirIntEnRango(int min, int max) {

        Scanner in = new Scanner(System.in);
        int valor;

        do {
            System.out.print("Valor entre " + min + " y " + max + ": ");
            valor = in.nextInt();
            if (valor < min || valor > max) {
                System.out.println("\nERROR: número no válido.\n");
            }
        } while (valor < min || valor > max);

        return valor;
    }

    // Te muestra los contactos
    public static void verContactos() {

        comprobarContacto();

    }

// Añades un contacto
    public static void añadirContacto() {

        pedirDatos();

    }

// Eliminas un contacto
    public static void eliminarContacto() {

        pedirPosicion();
        actualizaContacto();

    }

// Buscar contacto por nombre
    public static void buscarNombre() {

        PedirString();
        buscarContacto(nombre[], N)
    }

// Buscar contacto por telefono
    public static void buscarTelefono() {

        PedirString();
        buscarContacto(tlf[], N);
    }

// Buscar contacto por correo
    public static void buscarCorreo() {

        PedirString();
        buscarContacto(mail[], N);
    }

// Buscar contacto en general
    public static void buscarGlobal() {

        PedirString();
        buscarContacto(nombre[], N);
        buscarContacto(tlf[], N);
        buscarContacto(mail[], N);
    }

// Comprueba si hay contactos y lo muestra
    public static void comprobarContacto() {

        if (contar > 0) {
            for (int i = 0; i < contar; i++) {
                System.out.println("Nombre: " + nombre[i]);
                System.out.println("Teléfono: " + tlf[i]);
                System.out.println("Mail: " + mail[i]);
                System.out.println("");
            }
        } else {
            System.out.println("No hay contactos\n");
        }
    }

// Comprueba si la lista esta llena
    public static void comprobarLlena() {

    }

// Pide los datos a añadir
    public static void pedirDatos() {

        Scanner in = new Scanner(System.in);
        in.nextLine();

        int contar;

        System.out.print("Nombre: ");
        nombre[contar] = in.nextLine();

        System.out.print("Teléfono: ");
        tlf[contar] = in.nextInt();
        in.nextLine();

        System.out.print("Mail: ");
        mail[contar] = in.nextLine();

        System.out.println("");
        contar++;

    }

// Almacena el contacto añadido
    public static void almacenContacto() {
        
        int contar++;
        
    }

// Comprueba si el contacto existe
    public static void comprobarExiste() {

    }

// Pedir posición del contacto
    public static void pedirPosicion() {

        Scanner in = new Scanner(System.in);

        System.out.print("¿Qué contacto desea eliminar? (Indique la posición)");
        int borrar = in.nextInt();
        System.out.println("");

    }

// Comprueba si la posición está vacia
    public static void comprobarPosicion() {

    }

// Comprueba si la posición existe
    public static void comprobarExistePosicion() {

    }

// Elimina el contacto y actualiza los vectores
    public static void actualizaContacto() {

        for (int i = borrar + 1; i < contar; i++) {
            nombre[i - 1] = nombre[i];
            tlf[i - 1] = tlf[i];
            mail[i - 1] = mail[i];
        }
        contar--;

    }

// Pedir nombre, telefono o mail
    public static void PedirString() {

        Scanner in = new Scanner(System.in);

        System.out.print("Escriba lo desea buscar? ");
        String texto = in.nextLine();

    }

// Buscar contacto
    public static int[] buscarContacto(String[] vector, String texto) {

        boolean buscar = false;

        for (int i = 0; i < contar; i++) {
            if (vector[i].indexOf(texto) >= 0) {
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

        return vector[];
    }

// Mostrar contacto
    public static void mostrarContacto() {

        int MAX = 100;
        String[] nombre = new String[MAX];
        String[] tlf = new String[MAX];
        String[] mail = new String[MAX];

        int contar;

        for (int i = 0; i < contar; i++) {
            System.out.println("Nombre: " + nombre[i]);
            System.out.println("Teléfono: " + tlf[i]);
            System.out.println("Mail: " + mail[i]);
            System.out.println("");
        }
    }

}
