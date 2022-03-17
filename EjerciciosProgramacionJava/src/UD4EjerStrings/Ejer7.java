/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer7.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

 /* 7. Crea un programa que pida al usuario introducir una frase F, una palabra P1 y otra
palabra P2. Luego, mostrará F sustituyendo todas las ocurrencias de P1 por P2. */

package UD4EjerStrings;

import java.util.Scanner;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 19:14:53
 */
public class Ejer7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String F = in.nextLine();

        System.out.print("Escribe una palabra: ");
        String P1 = in.next();

        System.out.print("Escribe otra palabra: ");
        String P2 = in.next();
        
        System.out.println("La frase es: " + F.replace(P1, P2));
    }
}
