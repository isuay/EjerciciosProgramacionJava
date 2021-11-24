package UD3EjerCondicionales;

/*
10.Escribe un programa que pida introducir dos números decimales y luego muestre el
valor de su suma, resta, producto y división. Se deberá evitar dividir por cero.
 */

import java.util.Scanner;

public class Ejer10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dame dos numeros decimales");

        System.out.println("1º: ");
        double a = in.nextDouble();

        System.out.println("2º: ");
        double b = in.nextDouble();

        double suma = a + b;
        double resta = a - b;
        double producto = a * b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);

        if (a == 0 || b == 0) {
            System.out.println("No se puede dividir");
        } 
        else {
            double division = a / b;
            System.out.println("División: " + division);
        }
    }
}