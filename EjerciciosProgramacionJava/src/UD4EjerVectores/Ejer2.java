/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer2.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

 /* 2. Crea un programa que pida diez números reales por teclado, los almacene en un
array, y luego muestre la suma de todos los valores. */

package UD4EjerVectores;

import java.util.Scanner;

/**
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 10 nov. 2021 21:18:48
 */
public class Ejer2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        double[] num = new double[10];
        double suma = 0;
        
        for (int i = 0; i < num.length; i++) {
            System.out.print("Número: ");
            num[i] = in.nextDouble();
        }
        
        for (int i = 0; i < num.length; i++) {
            suma += num[i];
        }
       
        System.out.println("Total: " + suma);
    }
}
