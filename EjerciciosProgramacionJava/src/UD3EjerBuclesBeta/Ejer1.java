/*
1.Escribe un programa que muestre la tabla de multiplicar del número que indique el 
usuario.
 */
package UD3EjerBuclesBeta;

import java.util.Scanner;

public class Ejer1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, mult = 1, total = 0;

        System.out.print("Dime un número: ");
        a = in.nextInt();

        for (int i = a; mult <= 10; mult++) {
            total = a * mult;
            System.out.println(a + "*" + mult + " = " + total);
        }
    }
}
