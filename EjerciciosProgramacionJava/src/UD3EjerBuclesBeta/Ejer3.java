/*
3.Escribe un programa que lea una secuencia de números hasta que se introduzca un 
0, y luego muestre cuantos eran positivos y cuantos negativo
 */
package UD3EjerBuclesBeta;

import java.util.Scanner;

public class Ejer3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num, pos = 0, neg = 0;

        System.out.print("Dime un número: ");
        num = in.nextInt();

        while (num != 0) {
            System.out.print("Dime otro número: ");
            num = in.nextInt();
            if (num >= 0) {
                pos += 1;
            } else if (num < 0) {
                neg += 1;
            }
        }

        System.out.println("Positivos: " + pos + "  Negativos: " + neg);
    }
}
