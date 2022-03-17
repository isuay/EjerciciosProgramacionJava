/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer7.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/* 7. Crea un programa que pida dos valores enteros P y Q, luego cree un array que
contenga todos los valores desde P hasta Q, y lo muestre por pantalla. */

package UD4EjerVectores;

import java.util.Scanner;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 11 nov. 2021 19:33:11
 */
public class Ejer7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Dame un valor P: ");
        int P = in.nextInt();
        
        System.out.print("Dame un valor Q: ");
        int Q = in.nextInt();
        
        int[] num = new int[Q-P+1];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = P;
            System.out.print(num[i] + " ");
            P += 1;
        }
    }
}
