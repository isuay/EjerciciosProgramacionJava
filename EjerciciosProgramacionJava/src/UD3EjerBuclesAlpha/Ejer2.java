package UD3EjerBuclesAlpha;

/*
2. Escribe un programa que muestre los números enteros de A a B (valores que se le
piden al usuario).
 */

import java.util.Scanner;

public class Ejer2 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Dime dos números");
        System.out.print("A: ");
        a = in.nextInt();
        
        System.out.print("B: ");
        b = in.nextInt();
        
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
