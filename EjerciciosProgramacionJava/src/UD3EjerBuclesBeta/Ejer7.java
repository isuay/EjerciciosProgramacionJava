/*
7.Escribe un programa que lea un número positivo N y calcule y visualice su factorial N!
Siendo el factorial: 0! = 1, 1! = 1, 2! = 2 * 1, 3! = 3 * 2* 1, N! = N * (N-1) * (N-2) *
 */
package UD3EjerBuclesBeta;

import java.util.Scanner;

public class Ejer7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num, fact = 1;

        System.out.print("Dime un número: ");
        num = in.nextInt();
        
        for (int i = num; i > 1; i--) {
            fact *= i;
        }
        
        System.out.println("El factorial es: " + fact);
    }
}
