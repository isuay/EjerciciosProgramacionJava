/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer3.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

 /* 3. Crea un programa que pida diez números reales por teclado, los almacene en un
array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla. */

package UD4EjerVectores;

import java.util.Scanner;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 10 nov. 2021 21:29:01
 */
public class Ejer3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double[] num = new double[10];
        double max, min;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Número: ");
            num[i] = in.nextDouble();
        }

        max = num[0];
        min = num[0];
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            
            if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.println("Número máximo: " + max);
        System.out.println("Número mínimo: " + min);
    }
}
