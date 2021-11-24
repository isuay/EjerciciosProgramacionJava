/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer8.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

 /* 8. Crea un programa que pida al usuario introducir una  frase F  y una palabra P, y
muestre por pantalla cuántas veces aparece P en F. */
package UD4EjerStrings;

import java.util.Scanner;

/**
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 19:29:13
 */
public class Ejer8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String F = in.nextLine();

        System.out.print("Escribe una palabra: ");
        String P = in.next();

        int i = F.indexOf(P), cont = 0;

        while (i != -1) {
            i = F.indexOf(P, i + 1);
            cont++;
        }

        System.out.println("La palabra '" + P + "' aparece " + cont + " veces.");
    }
}
