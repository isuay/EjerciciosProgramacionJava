/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer5.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/* 5. Crea un programa que pida veinte números reales por teclado, los almacene en un
array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de
valores. */

package UD4EjerVectores;

import java.util.Scanner;

/**
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 10 nov. 2021 21:41:38
 */
public class Ejer5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double[] num = new double[4];
        double suma = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Número: ");
            num[i] = in.nextDouble();
        }
        
        for (int i = 0; i < num.length; i++) {
            suma += num[i];
        }
        
        double media = suma / num.length;

        System.out.println("Media: " + media);
    }
}
