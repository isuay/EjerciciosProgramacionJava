package UD3EjerCondicionales;

/*
18.Escribe un programa que pida al usuario introducir una letra y luego muestre un
mensaje indicando si es mayúscula o minúscula.
 */

import java.util.Scanner;

public class Ejer18 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
  
        System.out.println("Introduce una letra:");
        Character a = in.next().charAt(0);
        
        if (Character.isUpperCase(a)){
            System.out.println("Letra mayúscula");
        }
        else{
            System.out.println("Letra minúscula");
        }
    }
}
