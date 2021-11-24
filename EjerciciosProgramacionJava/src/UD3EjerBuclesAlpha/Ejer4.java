package UD3EjerBuclesAlpha;

/*
4. Escribe un programa que muestre los números enteros de A a B (valores que se le
piden   al   usuario)   en   orden   inverso.   Es   decir,   debe   empezar   por   B   (el   mayor)   y
terminar por A (el menor).
 */

import java.util.Scanner;

public class Ejer4 {
    
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Dime dos números");
        System.out.print("A: ");
        a = in.nextInt();
        
        System.out.print("B: ");
        b = in.nextInt();
        
        for (int i = b; i >= a; i--) {
            System.out.println(i);
        }
    }
}
