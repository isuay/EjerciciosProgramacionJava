/*
 * Proyecto UD4-TareaEntregable - Archivo UD4TareaEntregable.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD4Entregable;

import java.util.Scanner;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 15:14:14
 */
public class CuentasBancarias {

    public static void main(String[] args) {

        //CREAMOS SCANNER
        Scanner in = new Scanner(System.in);

        //VARIABLES
        int MAX = 100;
        String[] nombre = new String[MAX];
        double[] saldo = new double[MAX];

        int opcion, contar = 0;
        double dinero;
        boolean salir = false;

        //CREAMOS EL MENÚ
        do {
            System.out.println("MENÚ");
            System.out.println("1. Ver cuentas");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Agregar cuenta");
            System.out.println("5. Eliminar cuenta");
            System.out.println("6. Buscar cuenta");
            System.out.println("7. Mostrar morosos");
            System.out.println("8. Salir");

            System.out.print("Elige una opción: ");
            opcion = in.nextInt();

            System.out.println("");

            //OPERACIONES SEGÚN OPCIÓN DEL MENÚ
            switch (opcion) {
                
                //1. MOSTRAMOS EL MENÚ
                case 1:
                    if (contar > 0) {
                        for (int i = 0; i < contar; i++) {
                            System.out.println(i + ". Nombre: " + nombre[i] + "     Saldo: " + saldo[i] + " €\n");
                        }
                    } else {
                        System.out.println("No hay cuentas\n");
                    }
                    break;

                //2. SELECCIONA LA CUENTA Y AÑADE DINERO A ESA CUENTA
                case 2:
                    System.out.println("¿En que número de cuenta desea ingresar el dinero?");
                    opcion = in.nextInt();

                    System.out.println("¿Cuánto dinero desea ingresar?");
                    dinero = in.nextDouble();
                    
                    System.out.println("");

                    for (int i = 0; i < contar; i++) {
                        if (i == opcion) {
                            saldo[i] += dinero;
                        }
                    }
                    break;
                    
                //3. SELECCIONA LA CUENTA Y RETIRA DINERO DE ESA CUENTA
                case 3:
                    System.out.println("¿En que número de cuenta desea retirar el dinero?");
                    opcion = in.nextInt();

                    System.out.println("¿Cuánto dinero desea retirar?");
                    dinero = in.nextDouble();
                    
                    System.out.println("");

                    for (int i = 0; i < contar; i++) {
                        if (i == opcion) {
                            saldo[i] -= dinero;
                        }
                    }
                    break;

                //4. AÑADIR UNA CUENTA
                case 4:

                    if (contar < MAX) {
                        in.nextLine();

                        System.out.print("Nombre: ");
                        nombre[contar] = in.nextLine();

                        System.out.print("Saldo: ");
                        saldo[contar] = in.nextDouble();
                        in.nextLine();

                        System.out.println("");
                        contar++;
                    } else {
                        System.out.println("ERROR: Cuenta bancaria llena\n");
                    }

                    break;

                //5. ELIGE LA CUENTA A ELIMINAR
                case 5:
                    System.out.print("¿Qué número de cuenta desea eliminar? ");
                    opcion = in.nextInt();
                    System.out.println("");

                    for (int i = opcion + 1; i < contar; i++) {
                        nombre[i - 1] = nombre[i];
                        saldo[i - 1] = saldo[i];
                    }
                    contar--;
                    break;

                //6. BUSCAMOS UNA CUENTA POR EL NOMBRE
                case 6:
                    boolean buscar = false;

                    in.nextLine();
                    System.out.print("¿Qué nombre de cuenta desea buscar? ");
                    String N = in.nextLine();

                    System.out.println("");

                    for (int i = 0; i < contar; i++) {
                        if (nombre[i].indexOf(N) >= 0) {
                            System.out.println(i + ". Nombre: " + nombre[i] + "     Saldo: " + saldo[i] + " €\n");
                            buscar = true;
                        }
                    }
                    if (buscar == false) {
                        System.out.println("No se ha encontrado la cuenta");
                        System.out.println("");
                    }
                    break;

                //7. MOSTRAMOS LAS CUENTAS QUE TENGAN SALDO NEGATIVO
                case 7:
                    for (int i = 0; i < contar; i++) {
                        if (saldo[i] < 0) {
                            System.out.println(i + ". Nombre: " + nombre[i] + "     Saldo: " + saldo[i] + " €\n");
                        }
                    }
                    break;

                //SALIMOS DEL MENÚ
                case 8:
                    salir = true;
                    break;
            }

        } while (!salir);
    }
}
