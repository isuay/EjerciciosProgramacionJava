package UD3EjerBuclesAlpha;

/*
8. Escribe un programa que muestre por pantalla la multiplicación de todos los números
desde 1 hasta 10.
 */

public class Ejer8 {
    
    public static void main(String[] args) {
        
        int total = 1;
        
        for (int i = 1; i <= 10; i++) {
            total *= i;
        }
        
        System.out.println("Total: " + total);
    }
}
