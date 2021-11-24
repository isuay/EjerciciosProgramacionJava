package UD3EjerBuclesAlpha;

/*
6. Escribe un programa que muestre por pantalla la suma de todos los números desde 1
hasta 10.
 */

import java.util.Scanner;

public class Ejer6 {
    
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
     
        int total = 0;
    
        for (int i = 1; i <= 10; i++) {
            total+= i;
        }
        
        System.out.println("Total: " + total);
    }
}
