package UD3EjerBuclesAlpha;

/*
10. Escribe un programa que pida 5 precios al usuario y muestre la suma total.
*/

import java.util.Scanner;

public class Ejer10 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double a, total;
        int contador = 1;
        
        System.out.println("Dime cinco precios");
        
        for (total = 0; contador <= 5; contador++) {
            System.out.print("Precio: ");
            a = in.nextDouble();
            total += a;
        }
        
        System.out.println("Total: " + total);
    }
}
