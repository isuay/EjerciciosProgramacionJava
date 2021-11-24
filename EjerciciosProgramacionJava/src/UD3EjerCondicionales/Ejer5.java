package UD3EjerCondicionales;

/*
5. Escribe un programa que lee dos números y los visualiza en orden ascendente.
 */

import java.util.Scanner;

public class Ejer5 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dame dos numeros");
        
        System.out.println("1º: ");
        int uno = in.nextInt();
        
        System.out.println("2º: ");
        int dos = in.nextInt();

        
        if (uno > dos)
            System.out.println(dos + ", " + uno);
        else
            System.out.println(uno + ", " + dos);
    }
}