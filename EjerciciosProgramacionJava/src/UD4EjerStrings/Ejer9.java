/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer9.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/* 9. Crea un programa que pida al usuario introducir una cadena de texto con dos
palabras y luego muestre por pantalla las dos palabras en líneas distintas. Por
ejemplo, dada la cadena de texto “Hola Lionel” mostrará por pantalla:
hola
Lionel */

package UD4EjerStrings;

import java.util.Scanner;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 19:44:48
 */
public class Ejer9 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Escribe una frase con dos palabras: ");
        String F = in.nextLine();
        
        for (int cont= 0; cont < F.length(); cont++) {
            char i = F.charAt(cont);
            System.out.print(i);
            if (i == ' ') {
                System.out.println("");
            }
        }
    }
}
