package UD3EjerCondicionales;

/*
9. Escribe un programa que pida dos números (A y B) y muestre un mensaje por
pantalla indicando si alguno de ellos es múltiplo del otro.
 */

import java.util.Scanner;

public class Ejer9 {
    
        public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dame dos numeros");
        
        System.out.println("1º: ");
        int a = in.nextInt();
        
        System.out.println("2º: ");
        int b = in.nextInt();
        
        if (a % b == 0)
            System.out.println(a + " es multiplo de " + b);
        else if (b % a == 0)
            System.out.println(b + " es multiplo de " + a);
        else
            System.out.println("No son múliples ningúno");
    }
}