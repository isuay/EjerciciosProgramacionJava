/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer3.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/* 3. Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por
teclado) e introduzca en ella NxM valores (también introducidos por teclado). Luego
deberá recorrer la matriz y al final mostrar por pantalla cuántos valores son mayores
que cero, cuántos son menores que cero y cuántos son igual a cero. */

package UD4EjerMatrices;

import java.util.Scanner;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 20:33:25
 */
public class Ejer3 {
    
    public static void main(String[] args) {
        
        int [][] matriz;
        int mas = 0, menos = 0, igual = 0;
        
        Scanner in = new Scanner (System.in);
        
        System.out.print("Dame número N: ");
        int N = in.nextInt();
        
        System.out.print("Dame número M: ");
        int M = in.nextInt();
        
        matriz = new int[N][M];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Valor " + i + "," + j + ": ");
                int resp = in.nextInt();
                matriz [i][j] = resp;
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    menos++;
                }
                else if (matriz[i][j] == 0) {
                    igual++;
                }
                else {
                    mas++;
                }
            }
        }
        System.out.println("Mayores que 0: " + mas);
        System.out.println("Iguales que 0: " + igual);
        System.out.println("Menores que 0: " + menos);
    }
}
