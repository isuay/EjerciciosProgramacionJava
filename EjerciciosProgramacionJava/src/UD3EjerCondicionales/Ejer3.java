package UD3EjerCondicionales;

/*
3. Escribe un programa que pida 2 números enteros y muestre el mayor.
 */

import java.util.Scanner;

public class Ejer3 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dame dos número enteros");    
        
        System.out.println("1º: ");
        int uno = in.nextInt();
                
        System.out.println("2º: ");
        int dos = in.nextInt();
        
        if (uno > dos)
            System.out.println(uno + " es mayor que " + dos);
        else
            System.out.println(dos + " es mayor que " + uno);
    }
}