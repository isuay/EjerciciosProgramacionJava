/*
4.Escribe un programa que pida al usuario un número entero X y muestre todas las 
tablas de multiplicar desde 1 hasta X.
Tabla del 1:
1 x 1 = 1
1 x 2 = 2
...
1 x 10 = 10
Tabla del 2:
2 x 1 = 2
2 x 2 = 4
...
2 x 10 = 20
Tabla del 3:
etc.
*/

package UD3EjerBuclesGamma;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int num;

        System.out.print("Dime un número: ");
        num = in.nextInt();
            
        for (int i = 1; i <= num; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + " = " + (j*i));
                }
            System.out.println(" ");
        }
    }
}
