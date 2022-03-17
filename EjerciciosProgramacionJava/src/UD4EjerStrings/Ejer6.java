/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer6.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

 /* 6. Crea un programa que pida al usuario introducir una  frase F  y una palabra P, y
muestre por pantalla:
◦Si F contiene P.
◦Si F empieza por P.
◦Si F termina por P. */

package UD4EjerStrings;

import java.util.Scanner;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 19:05:20
 */
public class Ejer6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String F = in.nextLine();
        
        System.out.print("Escribe una palabra: ");
        String P = in.next();
        
        if (F.endsWith(P)== true) {
            System.out.println("La frase termina con '" + P + "'");
        }
        else if (F.indexOf(P) > 0) {
            System.out.println("La frase contiene '" + P + "'");
        }
        
        else if (F.startsWith(P)== true) {
            System.out.println("La frase empieza con '" + P + "'");
        }
        else {
            System.out.println("La frase no contiene la palabra " + P);
        }
    }
}
