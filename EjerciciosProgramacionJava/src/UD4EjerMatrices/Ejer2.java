/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer2.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/* 2. Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas
de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por
pantalla. */

package UD4EjerMatrices;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 19:47:47
 */
public class Ejer2 {

    public static void main(String[] args) {
        
        int [][] matriz = new int [10][10];
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("TABLA DEL " + (i+1) + ": ");
            for (int j = 0; j < matriz[i].length; j++) {
                matriz [i][j] = (i+1) * (j+1);
                System.out.println((i+1) + "*" + (j+1) + " = " + matriz[i][j]);
            }
        }
        
    }
}
