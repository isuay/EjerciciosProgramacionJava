/*
5.Haz una copia del programa del ejercicio anterior y modifícalo para mostrar al final la 
suma de todas las multiplicaciones de las tablas de multiplicar. Por ejemplo, para X=1 
la suma es 55, para X=2 la suma es 165 y para X=3 la suma es 330.
*/

package UD3EjerBuclesGamma;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
                
        Scanner in = new Scanner(System.in);
        
        int num, suma = 0;

        System.out.print("Dime un número: ");
        num = in.nextInt();
            
        for (int i = 1; i <= num; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 10; j++) {
                suma += (j*i);
                System.out.println(i + "*" + j + " = " + (j*i));
                }
            System.out.println("Suma: " + suma);
            System.out.println(" ");
        }
    }
}
