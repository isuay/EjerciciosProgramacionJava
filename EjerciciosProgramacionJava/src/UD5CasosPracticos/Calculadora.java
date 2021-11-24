/*
 * Proyecto EjerciciosProgramacionJava - Archivo Calculadora.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5CasosPracticos;

import java.util.Scanner;

/**
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 24 nov. 2021 17:41:36
 */
public class Calculadora {

    public static void main(String[] args) {

        int opcion;

        do {
            opcion = menu();

            realizaOperacion(opcion);

            System.out.println("");

        } while (opcion != 9);
    }

    //Muestra el menú, pide al usuario valor rango 1-9 y devuelve la opción elegida.
    public static int menu() {

        System.out.println("1. Suma (A + B)\n"
                + "2. Resta (A - B)\n"
                + "3. Multiplicación (A * B)\n"
                + "4. División (A / B)\n"
                + "5. Área de un rectángulo (Base x Altura)\n"
                + "6. Área de un triángulo equilátero (Base x Altura / 2)\n"
                + "7. Área de un círculo (Pi x R²)\n"
                + "8. Seno, Coseno y Tangente (de X)\n"
                + "9. Salir.");

        int opcion = (int)pedirIntEnRango(1, 9);

        return opcion;
    }

// Realiza la operación del menú indicada en 'int opcion' (1 sumar, 2 restar, etc.)
    public static void realizaOperacion(int opcion) {

        switch (opcion) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                mult();
                break;
            case 4:
                div();
                break;
            case 5:
                areaRectangulo();
                break;
            case 6:
                areaTriangulo();
                break;
            case 7:
                areaCirculo();
                break;
            case 8:
                calculaSinCosTan();
                break;
            case 9:
                break;
        }
    }

// Pide al usuario un valor int, una y otra vez hasta que responde con valor en rango, devuelve el valor
    public static double pedirIntEnRango(double min, double max) {

        Scanner in = new Scanner(System.in);
        double valor;

        do {
            System.out.print("Valor entre " + min + " y " + max + ": ");
            valor = in.nextDouble();
            if (valor < min || valor > max) {
                System.out.println("\nERROR: número no válido.\n");
            }
        } while (valor < min || valor > max);

        return valor;
    }

// Pide A y B, calcula la suma y la muestra
    public static void suma() {

        Scanner in = new Scanner(System.in);

        System.out.print("Valor a: ");
        double a = in.nextDouble();

        System.out.print("Valor b: ");
        double b = in.nextDouble();

        double total = a + b;

        System.out.println("\nTotal: " + total);
    }

// Pide A y B, calcula la resta y la muestra
    public static void resta() {

        Scanner in = new Scanner(System.in);

        System.out.print("Valor a: ");
        double a = in.nextDouble();

        System.out.print("Valor b: ");
        double b = in.nextDouble();

        double total = a - b;

        System.out.println("\nTotal: " + total);
    }

// Pide A y B, calcula la mult y la muestra
    public static void mult() {

        Scanner in = new Scanner(System.in);

        System.out.print("Valor a: ");
        double a = in.nextDouble();

        System.out.print("Valor b: ");
        double b = in.nextDouble();

        double total = a * b;

        System.out.println("\nTotal: " + total);
    }

// Pide A y B, calcula la div y la muestra
    public static void div() {

        Scanner in = new Scanner(System.in);

        System.out.print("Valor a: ");
        double a = in.nextDouble();

        System.out.print("Valor b: ");
        double b = in.nextDouble();

        if (b != 0) {
            double total = a / b;
            System.out.println("\nTotal: " + total);
        } else {
            System.out.println("\nNo se puede dividir entre 0");
        }

    }

// Pide Base y Altura en rango 0-1Millon, calcula area rectangulo y lo muestra
    public static void areaRectangulo() {

        Scanner in = new Scanner(System.in);

        System.out.print("Base del rectangulo --> ");
        double a = pedirIntEnRango(0, 1000000);

        System.out.print("Altura del rectangulo --> ");
        double b = pedirIntEnRango(0, 1000000);

        double total = (a * b) * 1.0;

        System.out.println("\nTotal: " + total);
    }

// Pide Base y Altura en rango 0-1Millon, calcula area triangulo y lo muestra
    public static void areaTriangulo() {

        Scanner in = new Scanner(System.in);

        System.out.print("Base del triangulo --> ");
        double a = pedirIntEnRango(0, 1000000);

        System.out.print("Altura del triangulo --> ");
        double b = pedirIntEnRango(0, 1000000);

        double total = a * b / 2.0;

        System.out.println("\nTotal: " + total);
    }

// Pide Radio en rango 0-1Millon, calcula area ciculo y lo muestra
    public static void areaCirculo() {

        Scanner in = new Scanner(System.in);

        System.out.print("Radio del circulo --> ");
        double a = pedirIntEnRango(0, 1000000);

        double total = Math.PI * Math.pow(a, 2);

        System.out.println("\nTotal: " + total);
    }

// Pide X en rango -360 a 360, calcula y muestra Sin, Cos y Tan de X
    public static void calculaSinCosTan() {

        Scanner in = new Scanner(System.in);

        double a = pedirIntEnRango(-360, 360);

        double sen = Math.sin(a);
        double cos = Math.cos(a);
        double tan = Math.tan(a);

        System.out.println("\nSeno: " + sen);
        System.out.println("Coseno: " + cos);
        System.out.println("Tangente: " + tan);

    }
}
