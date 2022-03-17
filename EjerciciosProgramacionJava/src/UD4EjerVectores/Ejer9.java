/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer9.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/* 9. Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
valores enteros aleatorios entre 1 y 10. Luego pedirá un valor N y mostrará en qué
posiciones del array aparece N. */

package UD4EjerVectores;

import java.util.Scanner;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 11 nov. 2021 19:52:11
 */
public class Ejer9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] num = new int[100];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(1 + Math.random() * 10);
        }
        
        System.out.print("Dame un número: ");
        int N = in.nextInt();
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] == N) {
                System.out.println("Posición: " + i);
            }
        }
    }
}
