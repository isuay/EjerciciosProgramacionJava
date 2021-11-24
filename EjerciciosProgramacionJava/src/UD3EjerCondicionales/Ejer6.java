package UD3EjerCondicionales;

/*
6. Escribe un programa que pida 2 números enteros y muestre el mayor. Si son iguales,
deberá mostrar el mensaje “Son iguales”.
 */

import java.util.Scanner;

public class Ejer6 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dame dos numeros enteros");
        
        System.out.println("1º: ");
        int uno = in.nextInt();
        
        System.out.println("2º: ");
        int dos = in.nextInt();

        if (uno > dos)
            System.out.println("El mayor es: " + uno);
        else if (dos > uno)
            System.out.println("El mayor es: " + dos);
        else
            System.out.println("Son iguales");
    }
}