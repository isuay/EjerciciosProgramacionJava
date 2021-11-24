package UD3EjerBuclesAlpha;

/*
11. Escribe   un   programa   que   pida   precios   al   usuario   hasta   que   introduza   un   número
negativo, y muestre la suma total.
*/

import java.util.Scanner;

public class Ejer11 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double a, total = 0;
        
        System.out.println("Dime precios hasta introducir un negativo");
        System.out.print("Precio: ");
        a = in.nextDouble();
        
        while (a >= 0) {
            total += a;
            System.out.print("Precio: ");
            a = in.nextDouble();
        }
        
        System.out.println("Total: " + total);
    }
}
