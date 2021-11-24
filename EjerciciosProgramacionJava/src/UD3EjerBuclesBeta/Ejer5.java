/*
5.Escribe un programa que sume independientemente los pares y los impares de los 
números comprendidos entre A y B (valores que introduce el usuario), y luego 
muestre por pantalla ambas sumas
 */
package UD3EjerBuclesBeta;

import java.util.Scanner;

public class Ejer5 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b, sumap = 0, sumai = 0;

        System.out.println("Dime dos números: ");
        a = in.nextInt();
        b = in.nextInt();
        
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sumap += i;
            }
            else {
                sumai += i;
            }
        }
        
        System.out.println("Suma pares: " + sumap);
        System.out.println("Suma impares: " + sumai);
    }
}
