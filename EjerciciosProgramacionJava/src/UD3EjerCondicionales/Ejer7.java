package UD3EjerCondicionales;

/*
7. Escribe un programa que lea tres números enteros y nos diga cuál es el mayor.
 */

import java.util.Scanner;

public class Ejer7 {
    
        public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dame tres numeros enteros");
        
        System.out.println("1º: ");
        int uno = in.nextInt();
        
        System.out.println("2º: ");
        int dos = in.nextInt();
        
        System.out.println("3º: ");
        int tres = in.nextInt();
        
        if (uno >= dos && uno >= tres)
            System.out.println("El mayor es: " + uno);
        else if (dos >= uno && dos >= tres)
            System.out.println("El mayor es: " + dos);
        else
            System.out.println("El mayor es: " + tres);
    }
}