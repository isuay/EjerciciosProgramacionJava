/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer11.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/* 11. Crea un programa que lea una frase por teclado e indique si la frase es un palíndromo
o   no   (ignorando   espacios   y   sin   diferenciar   entre   mayúsculas   y   minúsculas).
Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni
acentos, etc.).  NOTA: Un palíndromo es un texto que se lee igual de izquierda a
derecha que de derecha a izquierda. Por ejemplo:
◦Amigo no gima
◦Dabale arroz a la zorra el abad
◦Amo la pacífica paloma
◦A man a plan a canal Panama */

package UD4EjerStrings;

import java.util.Scanner;

/**
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 20:05:58
 */
public class Ejer11 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String F = in.nextLine();
        
        F = F.toLowerCase().replace(" ", "");
        int inicio = 0, fin = F.length()-1;
        boolean error = false;
        
        while ((inicio < fin) && (!error)) {            
            if (F.charAt(inicio) == F.charAt(fin)) {
                inicio++;
                fin--;
            }
            else {
                error = true;
            }
        }
        
        if (!error) {
            System.out.println("La frase es un palíndromo");
        }
        else{
            System.out.println("La frase no es un palíndromo");
        }
    }
}
