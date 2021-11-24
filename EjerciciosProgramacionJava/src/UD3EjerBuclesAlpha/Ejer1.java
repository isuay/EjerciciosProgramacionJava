package UD3EjerBuclesAlpha;

/*
1. Escribe un programa que muestre los números enteros del 1 al 10. Luego modifícalo
para que muestre los números del 10 al 1. Por último, modifícalo para que muestre los
número del -999.999 al 999.999.
 */

public class Ejer1 {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i); 
        }
        
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        
        for (int i = -999999; i <= 999999; i++) {
            System.out.println(i);
        }
    }
}
