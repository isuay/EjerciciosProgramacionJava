/*
10.Escribe un programa que pregunte un número X al usuario y diga si es primo o no.
 */
package UD3EjerBuclesBeta;

import java.util.Scanner;

public class Ejer10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x, contador = 0;

        System.out.print("Dime un número: ");
        x = in.nextInt();

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                contador++;
            }
        }

        if (contador <= 2) {
            System.out.println("El numero es primo");
        } 
        else {
            System.out.println("El número no es primo");
        }
    }
}
