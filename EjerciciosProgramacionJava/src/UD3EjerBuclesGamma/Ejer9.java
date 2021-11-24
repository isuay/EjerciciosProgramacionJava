/*
9.Escribe un programa que pida al usuario un número entero X y luego muestre por 
pantalla un triángulo de asteriscos como en el ejemplo de abajo. Para X = 5:
    *
   **  
  *** 
 ****
*****
*/
package UD3EjerBuclesGamma;

import java.util.Scanner;

public class Ejer9 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int num;
        
        System.out.print("Dame un número entero: ");
        num = in.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
