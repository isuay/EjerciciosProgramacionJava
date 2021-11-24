package UD3EjerBuclesAlpha;

/*
14. Escribe un programa que pida 5 números al usuario y luego muestre por pantalla si
alguno era múltiplo de 10.
*/

import java.util.Scanner;

public class Ejer14 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double a;
        int contador = 1;
        boolean mult = false;
        
        System.out.println("Dime cinco precios");
        
        for (; contador <= 5; contador++) {
            System.out.print("Precio: ");
            a = in.nextDouble();
            if (a % 10 == 0) {
                mult = true;
            }
        }
        
        if ( mult == true) {
            System.out.println("Hay algún múltiplo de diez" );
        }
        else
            System.out.println("No hay ningún múltiplo de diez" );
    }
}
