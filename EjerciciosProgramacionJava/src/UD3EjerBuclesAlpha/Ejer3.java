package UD3EjerBuclesAlpha;

/*
3. Escribe un programa que muestre los números enteros de A a B (valores que se le
piden al usuario) en pasos de dos. Por ejemplo, si A=5 y B=21, entonces mostraría 5,
7, 9, 11... hasta 21.
 */

import java.util.Scanner;

public class Ejer3 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Dime dos números");
        System.out.print("A: ");
        a = in.nextInt();
        
        System.out.print("B: ");
        b = in.nextInt();
        
        for (int i = a; i <= b; i+=2) {
            System.out.println(i);
        }
    }
}
