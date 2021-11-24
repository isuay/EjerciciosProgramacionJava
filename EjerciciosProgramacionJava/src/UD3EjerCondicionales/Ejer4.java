package UD3EjerCondicionales;

/*
4. Escribe un programa que pida un número y me dice si es positivo o negativo.
Consideraremos el cero como positivo.
 */

import java.util.Scanner;

public class Ejer4 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime un número: ");
        int num = in.nextInt();
        
        if (num >= 0)
            System.out.println(num + " es positivo");
        else
            System.out.println(num + " es negativo");
    }
}