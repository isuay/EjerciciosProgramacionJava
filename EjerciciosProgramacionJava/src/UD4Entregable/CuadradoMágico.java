/*
 * Proyecto UD4-TareaEntregable - Archivo CuadradoMágico.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD4Entregable;

import java.util.Scanner;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 19:23:54
 */
public class CuadradoMágico {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //VARIABLES
        int sumaFila = 0, sumaColumna = 0, sumaDiagonalP = 0, sumaDiagonalS = 0, cont = 0;
        boolean cuadMagico = false;

        //PEDIMOS AL USUARIO EL TAMAÑO DE LA MATRIZ CUADRADA
        System.out.print("Dime el tamaño de la matriz: ");
        int N = in.nextInt();
        System.out.println();

        //COMPROBAMOS SI EL TAMAÑO DE LA MATRIZ ES MAYOR O IGUAL A UNO
        if (N >= 1) {
            //CREAMOS LA MATRIZ
            int[][] cuadrado = new int[N][N];

            //PEDIMOS AL USUARIO LOS VALORES DE LA MATRIZ
            for (int i = 0; i < cuadrado.length; i++) {
                for (int j = 0; j < cuadrado[i].length; j++) {
                    System.out.print("Número entero de la posición " + i + "," + j + ": ");
                    cuadrado[i][j] = in.nextInt();
                }
            }

            System.out.println();
            
            //SUMAMOS LAS FILAS, COLUMNAS Y DIAGONALES
            for (int i = 0; i < cuadrado.length; i++) {
                for (int j = 0; j < cuadrado[i].length; j++) {

                    //SUMAMOS EL RESULTADO DE LA FILA
                    sumaFila += cuadrado[i][j];

                    //SUMAMOS EL RESULTADO DE LA COLUMNA
                    sumaColumna += cuadrado[j][i];

                    //SUMAMOS EL RESULTADO DE LA PRIMERA DIAGONAL
                    if (i == j) {
                        sumaDiagonalP += cuadrado[i][j];
                    }
                    //SUMAMOS EL RESULTADO DE LA SEGUNDA DIAGONAL
                    if ((i + j) == cuadrado.length - 1) {
                        sumaDiagonalS += cuadrado[i][j];
                    }
                    //ESTE PRINT ES SIMPLEMENTE PARA QUE EL USUARIO PUEDA VER EL CUADRADO CON LOS VALORES QUE HA INTRODUCIDO
                    System.out.print(cuadrado[i][j] + "\t");
                }
                System.out.println();
                //COMPROBAMOS SI LOS RESULTADOS DE LAS FILAS Y COLUMNAS COINCIDEN
                if (sumaFila == sumaColumna) {

                    //SUMAMOS UNO AL CONTADOR
                    cont++;

                    //SI EL VALOR DEL CONTADOR ES IGUAL AL TAMAÑO DEL CUADRADO SABREMOS QUE 
                    //EL RESULTADO DE LA SUMA DE TODAS LAS FILAS Y COLUMNAS ES EL MISMO
                    if (cont == cuadrado.length) {
                        cuadMagico = true;
                    }
                    //RESETEAMOS EL RESULTADO DE LAS FILAS Y COLUMNAS PARA LA SIGUIENTE OPERACIÓN
                    sumaFila = 0;
                    sumaColumna = 0;
                } 
                //SI NO SON IGUALES LOS RESULTADOS, YA VEREMOS QUE NO ES UN CUADRADO MÁGICO
                else {
                    cuadMagico = false;
                }
            }
            //COMPROBAMOS SI A PARTE DE LA SUMA DE LAS FILAS Y COLUMNAS, TAMBIÉN ES IGUAL LA DE LAS DIAGONALES 
            if (cuadMagico == true && (sumaDiagonalP == sumaDiagonalS)) {
                System.out.println("\nÉs un cuadrado mágico :)");
            } 
            //SI NO, INDICAMOS QUE NO ES UN CUADRADO MÁGICO
            else {
                System.out.println("\nNo es un cuadrado mágico :(");
            }
        }
        //SI EL TAMAÑO DE LA MATRIZ ES MENOR A 1 LE PONEMOS ESTE MENSAJE
        else {
            System.out.println("El número ha de ser mayor o igual a 1");
        }
    }
}
