/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer4.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

 /* 4. Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
“Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por
teclado y luego el programa mostrará la nota mínima, máxima y media de cada
alumno. */
package UD4EjerMatrices;

import java.util.Scanner;

/**
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 20:46:09
 */
public class Ejer4 {

    public static void main(String[] args) {

        int[][] matriz = new int[4][5];
        int suma = 0;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Alumno " + (i + 1));
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Nota asignatura " + (j + 1) + ": ");
                matriz[i][j] = in.nextInt();
                suma += matriz[i][j];
            }
        }

        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                }
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                }
            }
        }

        double media = (double) suma / (4*5); 

        System.out.println("");
        System.out.println("Nota mínima: " + minimo);
        System.out.println("Nota máxima: " + maximo);
        System.out.println("Nota media: " + media);
    }
}
