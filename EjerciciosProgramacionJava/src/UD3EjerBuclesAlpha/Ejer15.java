package UD3EjerBuclesAlpha;

/*
15. Escribe un programa que pida 5 números al usuario y luego muestre por pantalla si
alguno era negativo y si alguno era mayor que 99.
*/

import java.util.Scanner;

public class Ejer15 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double a;
        int contador = 1;
        boolean neg = false, mayor = false;
        
        System.out.println("Dime cinco precios");
        
        for (; contador <= 5; contador++) {
            System.out.print("Precio: ");
            a = in.nextDouble();
            if (a < 0) {
                neg = true;
            }
            if (a > 99){
                mayor = true;
            }
        }
        
        if (neg == true) {
            System.out.println("Hay algún negativo" );
        }
        else
            System.out.println("No hay ningún negativo" );
        
        if (mayor == true) {
            System.out.println("Hay alguno mayor de 99" );
        }
        else
            System.out.println("No hay ninguno mayor de 99" );
    }
}
