/*
8.Escribe un programa que muestre los N primeros números de la secuencia de 
fibonacci. N es un valor que introduce el usuario. Recuerda que la secuencia de 
fibonacci comienza por 1, 1, y a continuación cada valor es la suma de los dos valores
anteriores: 1, 1, 2, 3, 5, 8, 13... El valor N lo introduce el usua
 */
package UD3EjerBuclesBeta;

import java.util.Scanner;

public class Ejer8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num, a = 0, b = 1, suma = 1;

        System.out.print("Dime un número: ");
        num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(suma);
            suma = a + b;
            a = b;
            b = suma;
        }
    }
}
