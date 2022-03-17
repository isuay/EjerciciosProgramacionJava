/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer5.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

 /* 5. Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay
(cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe
diferenciar entre mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me
mima” dirá que hay:
◦Nº de A: 3
◦Nº de E: 1
◦Nº de I: 2
◦Nº de O: 0
◦Nº de U: 0 */
package UD4EjerStrings;

import java.util.Scanner;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 17:15:06
 */
public class Ejer5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int contA=0, contE=0, contI=0, contO=0, contU=0;

        System.out.print("Escribe una frase: ");
        String s1 = in.nextLine();
        
        String s = s1.toLowerCase();

        for (int cont = 0; cont < s.length(); cont++) {
            char i = s.charAt(cont);
            if (i == 'a') {
                contA += 1;
            }
            else if (i == 'e') {
                contE += 1;
            }
            else if (i == 'i') {
                contI+=1;
            }
            else if (i == 'o') {
                contO+=1;
            }
            else if (i == 'u') {
                contU+=1;
            }
        }
        
        System.out.println("A: " + contA + "\nE: " + contE + "\nI: " + contI + "\nO: " + contO + "\nU: " +contU);
    }
}
