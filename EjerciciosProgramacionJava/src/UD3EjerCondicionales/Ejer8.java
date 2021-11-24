package UD3EjerCondicionales;

/*
8. Escribe un programa que pida dos números (A y B) y muestre un mensaje por
pantalla indicando si A es mútiplo de B.
 */

import java.util.Scanner;

public class Ejer8 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dame dos numeros");
        
        System.out.println("1º: ");
        int a = in.nextInt();
        
        System.out.println("2º: ");
        int b = in.nextInt();
        
        if (a % b == 0)
            System.out.println(a + " sí es multiplo de " + b);
        else 
            System.out.println(a + " no es multiplo de " + b);
    }
}