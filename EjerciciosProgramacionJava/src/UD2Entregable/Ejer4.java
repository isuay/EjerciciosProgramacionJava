/*
4. Utilizando la clase Math, escribe un programa que pida al usuario dos
números decimales (A y B) y muestre:
1. A redondeado al entero más próximo.
2. B redondeado al entero más próximo.
3. El mayor de ambos (su valor).
4. El menor de ambos (su valor).
 */
package UD2Entregable;

import java.util.Scanner;
import java.lang.Math;

public class Ejer4 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Dame dos números decimales");
        System.out.println("Nº1: ");
        double a = in.nextDouble();
        
        System.out.println("Nº2: ");
        double b = in.nextDouble();
        
        double redA = Math.round(a);
        double redB = Math.round(b);
        double mayor = Math.max(a, b);
        double menor = Math.min(a, b);
        
        System.out.println("A redondeado al entero más próximo: " + redA);
        System.out.println("B redondeado al entero más próximo: " + redB);
        System.out.println("El mayor de ambos (su valor): " + mayor);
        System.out.println("El menor de ambos (su valor): " + menor);
        
    }

}