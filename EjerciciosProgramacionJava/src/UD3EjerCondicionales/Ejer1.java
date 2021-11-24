package UD3EjerCondicionales;

/*
1. Escribe un programa que pide la edad por teclado y muestre el mensaje de “Eres
mayor de edad” si lo somos.
 */

import java.util.Scanner;

public class Ejer1 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime tu edad:");
        int edad = in.nextInt();
        
        if (edad >= 18)
            System.out.println("Eres mayor de edad");

    }
}