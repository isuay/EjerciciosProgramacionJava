/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer1.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/* 1. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del
1 al 25 y luego muestre la matriz por pantalla. */

package UD4EjerMatrices;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 19:33:24
 */
public class Ejer1 {

    public static void main(String[] args) {
        
        int [][] matriz = new int [5][5];
        int suma = 1;
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                matriz [i][j] = suma;
                suma++;
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
