/*
13. Escribe un programa que pida un número entero al usuario (int) y luego muestre la 
suma de sus cifras. Por ejemplo, dado el número 35 su suma es 8, dado el número 
719 su suma es 17, y dado el 1002 su suma es 3.
 */

package UD3EjerBuclesBeta;

import java.util.Scanner;
 
public class Ejer13 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int num, total=0;
        
        System.out.print("Escribe un número entero: ");
        num = in.nextInt();
        
        while (num > 0) {           
            int num1 = num % 10;
            total += num1;
            num /= 10;
        }
        
        System.out.println("El total es: " + total);
    }
}
