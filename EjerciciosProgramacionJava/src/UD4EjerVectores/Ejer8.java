/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer8.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/* 8. Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y
1.0, utilizando Math.random(), y luego le pida al usuario un valor real R. Por último,
mostrará cuántos valores del array son igual o superiores a R. */

package UD4EjerVectores;

import java.util.Scanner;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 11 nov. 2021 19:40:52
 */
public class Ejer8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double[] num = new double[100];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = Math.random();
        }
        
        System.out.print("Dame un valor real: ");
        double R = in.nextDouble();
        
        System.out.print("Valores mayores o iguales a " + R + ": ");
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= R) {
                System.out.print(num[i] + " / ");
            }
        }
    }
}
