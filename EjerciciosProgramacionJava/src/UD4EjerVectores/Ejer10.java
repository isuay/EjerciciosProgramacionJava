/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer10.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/* 10. Crea un programa para realizar cálculos relacionados con la altura (en metros) de
personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas
por teclado. Luego mostrará la altura media, máxima y mínima así como cuántas
personas miden por encima y por debajo de la media. */

package UD4EjerVectores;

import java.util.Scanner;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 11 nov. 2021 19:53:51
 */
public class Ejer10 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double total = 0;

        System.out.print("Dame un valor N: ");
        int N = in.nextInt();
        
        double[] num = new double[N];
        
        for (int i = 0; i < num.length; i++) {
            System.out.print("Dime la altura " + i + " (en metros): ");
            double altura = in.nextDouble();
            num[i] = altura;
            total += num[i];
        }
        
        double max = num[0];
        double min = num[0];
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        
        double media = total / num.length;
        
        System.out.println("Altura media: " + media);
        System.out.println("Altura máxima: " + max);
        System.out.println("Altura mínima: " + min);
        
    }
}
