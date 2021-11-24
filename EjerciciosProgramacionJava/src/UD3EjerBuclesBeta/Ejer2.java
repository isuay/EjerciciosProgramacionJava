/*
2.Escribe un programa que calcule y muestre la suma y el producto (multiplicación) de 
los 10 primeros números naturales.
 */
package UD3EjerBuclesBeta;

public class Ejer2 {
    
    public static void main(String[] args) {
        
        int suma = 0, mult = 1;
        
        for (int i = 1; i <= 10; i++) {
            suma += i;
            mult *= i;
            
        }
        
        System.out.println("Suma: " + suma);
        System.out.println("Mult: " + mult);
    }
}
