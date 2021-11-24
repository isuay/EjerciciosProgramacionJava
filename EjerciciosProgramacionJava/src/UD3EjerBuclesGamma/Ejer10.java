/*
10. Escribe un programa que pida al usuario un número entero A y luego muestre por 
pantalla una pirámide de astericos de A alturas. Por ejemplo, para A = 5:
    *   
   ***  
  ***** 
 *******
*********
 */
package UD3EjerBuclesGamma;

import java.util.Scanner;

public class Ejer10 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int num;
        
        System.out.print("Dame un número entero: ");
        num = in.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
