/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer1.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/* 1. Crea un programa que pida diez números reales por teclado, los almacene en un
array, y luego muestre todos sus valores. */

package UD4EjerVectores;

import java.util.Scanner;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 20:31:37
 */
public class Ejer1 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double[] num = new double [10];
        
        for (int i = 0; i < num.length; i++) {
            System.out.print("Dame el valor " + i + ": ");
            num[i] = in.nextDouble();
        }
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Número: " + num[i]);
        }
    }
}
