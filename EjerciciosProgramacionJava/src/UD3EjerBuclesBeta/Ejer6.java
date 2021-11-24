/*
6.Escribe un programa que calcule y muestre el valor de A elevado a B (valores que 
introduce el usuario) sin hacer uso de la clase Math. Es decir, mediante un bucle que 
paso a paso multiplica A tantas veces como B
 */
package UD3EjerBuclesBeta;

import java.util.Scanner;

public class Ejer6 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b, cont = 1, i;

        System.out.println("Dime dos números: ");
        a = in.nextInt();
        b = in.nextInt();
        
        for (i = a; cont < b; cont++) {
            i = i * a;
        }
        
        System.out.println("Total: " + i);
    }
}
