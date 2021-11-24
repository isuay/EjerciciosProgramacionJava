package UD3EjerBuclesAlpha;

/*
13. Escribe un programa que muestre los números pares entre A y B (valores que se le
piden al usuario).
*/

import java.util.Scanner;

public class Ejer13 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Dime dos números enteros");
        System.out.print("A: ");
        a = in.nextInt();
        
        System.out.print("B: ");
        b = in.nextInt();
        
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
