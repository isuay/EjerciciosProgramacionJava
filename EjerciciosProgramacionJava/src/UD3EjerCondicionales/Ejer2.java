package UD3EjerCondicionales;

/*
2. Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres
mayor de edad” o el mensaje de “Eres menor de edad”.
 */

import java.util.Scanner;

public class Ejer2 {
        
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime tu edad:");
        int edad = in.nextInt();
        
        if (edad >= 18)
            System.out.println("Eres mayor de edad");
        else
            System.out.println("Eres menor de edad");

    }
}