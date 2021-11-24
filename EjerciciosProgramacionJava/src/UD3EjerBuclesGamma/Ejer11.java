/*
11. Escribe un programa que pida al usuario un número X y dibuje con asteriscos un 
cuadrado de tamaño X. Por ejemplo, para X = 5 sería:
* * * * *
*       *
*       *
*       *
* * * * *
 */
package UD3EjerBuclesGamma;

import java.util.Scanner;

public class Ejer11 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int num;

        System.out.print("Dame un número entero: ");
        num = in.nextInt();

        for (int i = num-1; i != num; i++) {
            
            //Imprimo la primera fila
            for (int j = 0; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println("");
            
            //Imprimo las filas del medio
            for (int j = 2; j < num; j++) {
                System.out.print("*");
                for (int k = 2; k < num; k++) {
                    System.out.print("  ");
                }
                System.out.println("*");
            }
            
            //Imprimo la última fila
            for (int j = 0; j < num; j++) {
                System.out.print("* ");
            }
        }
    }
}
