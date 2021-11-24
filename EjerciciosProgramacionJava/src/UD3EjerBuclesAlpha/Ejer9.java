package UD3EjerBuclesAlpha;

/*
9. Escribe un programa que muestre por pantalla la multiplicación de todos los números
desde A hasta B (valores que se le piden al usuario).
 */

import java.util.Scanner;

public class Ejer9 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int a, b, total = 1;
        
        System.out.println("Dime dos números");
        System.out.print("A: ");
        a = in.nextInt();
        
        System.out.print("B: ");
        b = in.nextInt();
        
        for (int i = a; i <= b; i++) {
            total *= i;
        }
        
        System.out.println("Total: " + total);
        
    }
}
