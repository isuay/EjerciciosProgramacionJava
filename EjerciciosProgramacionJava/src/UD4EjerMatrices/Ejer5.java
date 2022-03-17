/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer5.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

 /* 5. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por
teclado la información de N personas distintas (valor también introducido por teclado).
Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta
información debe guardarse en una única matriz. Luego se mostrará por pantalla el
sueldo medio de cada género. */
package UD4EjerMatrices;

import java.util.Scanner;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 21:13:57
 */
public class Ejer5 {

    public static void main(String[] args) {

        double[][] matriz;
        int hombres = 0, mujeres = 0, sumah = 0, sumam = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Número de personas: ");
        int N = in.nextInt();

        /*matriz = new double[2][N];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.println("Hombre = 0 - Mujer = 1");
                int resp = in.nextInt();

                if (resp == 0) {
                    hombres++;
                    System.out.println("¿Que sueldo tiene?");
                    matriz[i][j] = in.nextDouble();
                    sumah += matriz[i][j];
                } else {
                    mujeres++;
                    System.out.println("¿Que sueldo tiene?");
                    matriz[i][j] = in.nextDouble();
                    sumam += matriz[i][j];
                }
            }
        }*/
        
        matriz = new double[N][2];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 1; j++) {
                
                System.out.println("Hombre = 0 - Mujer = 1");
                int resp = in.nextInt();
                
                if (resp == 0) {
                    hombres++;
                    System.out.println("¿Que sueldo tiene?");
                    matriz[i][j] = in.nextDouble();
                    sumah += matriz[i][j];
                } else {
                    mujeres++;
                    System.out.println("¿Que sueldo tiene?");
                    matriz[i][j] = in.nextDouble();
                    sumam += matriz[i][j];
                }
            }
        }
        
        System.out.println("Sueldo medio hombres: " + (sumah / hombres));
        System.out.println("Sueldo medio mujeres: " + (sumam / mujeres));
    }
}
