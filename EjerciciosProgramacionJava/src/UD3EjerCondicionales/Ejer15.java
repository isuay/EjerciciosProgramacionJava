package UD3EjerCondicionales;

/*
15.Escribe programa  que pida  las 3 notas (números enteros) de un alumno y luego
muestre su  nota final, calculada como la nota media expresada como un entero y
redondeada al valor entero más próximo. Téngase en cuenta también que si alguna
de las 3 notas es inferior a 5 la nota final debe ser como máximo un 4.
 */

import java.util.Scanner;
import java.lang.Math;

public class Ejer15 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
                
        System.out.println("Dame tres notas en numeros enteros");
        System.out.println("Nota 1:");
        int n1 = in.nextInt();
        
        System.out.println("Nota 2:");
        int n2 = in.nextInt();
        
        System.out.println("Nota 3:");
        int n3 = in.nextInt();
        
        double nf = (n1 + n2 + n3) / 3.0 ;
        double media = Math.round(nf);
         
        if ((n1 < 5 || n2 < 5 || n3 < 5) && nf > 4){
            media = 4;
        }
       
            System.out.println("La nota final es: " + media);
        
    }
}
