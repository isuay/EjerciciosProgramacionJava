package UD3EjerBuclesAlpha;

/*
5. Escribe un programa que muestre los números enteros de A a B (valores que se le
piden al usuario) en orden inverso y en pasos de 2. Por ejemplo, si A=20 y B=-10,
entonces mostrará 20, 18, 16... hasta -10.
 */

import java.util.Scanner;

public class Ejer5 {
    
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Dime dos números");
        System.out.print("A: ");
        a = in.nextInt();
        
        System.out.print("B: ");
        b = in.nextInt();
        
        for (int i = a; i >= b; i-=2) {
            System.out.println(i);
        }
    }
}
