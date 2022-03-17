/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer4.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/* 4. Crea un programa que pida veinte números enteros por teclado, los almacene en un
array   y   luego   muestre   por   separado   la   suma   de   todos   los   valores   positivos   y
negativos. */

package UD4EjerVectores;

import java.util.Scanner;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 10 nov. 2021 21:36:20
 */
public class Ejer4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double[] num = new double[20];
        double pos = 0, neg = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Número: ");
            num[i] = in.nextDouble();
        }
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= 0) {
                pos += num[i];
            }
            else {
                neg += num[i];
            }
        }

        System.out.println("Suma positivos: " + pos);
        System.out.println("Suma negativos: " + neg);
    }
}
