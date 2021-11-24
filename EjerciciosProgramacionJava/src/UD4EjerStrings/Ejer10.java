/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer10.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/* 10.Crea un programa que pida una cadena de texto y luego muestre sus palabras una a
una en líneas separadas. Por ejemplo, dada la cadena de texto “Hola, ¿qué tal
estás?” mostrará por pantalla:
Hola,
¿qué
tal
estás? */

package UD4EjerStrings;

import java.util.Scanner;

/**
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 20:01:54
 */

/* S1.replaceAll(" ", "\n") */

public class Ejer10 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String F = in.nextLine();
        
        for (int cont= 0; cont < F.length(); cont++) {
            char i = F.charAt(cont);
            System.out.print(i);
            if (i == ' ') {
                System.out.println("");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
