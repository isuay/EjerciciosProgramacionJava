/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer2.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/* 2. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
iguales o no, además de si son iguales sin diferenciar entre mayúsculas y minúsculas. */

package UD4EjerStrings;

import java.util.Scanner;

/**
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 16:49:24
 */
public class Ejer2 {
    
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        
        System.out.print("Cadena de texto 1: ");
        String s1 = in.nextLine();
        
        System.out.print("Cadena de texto 1: ");
        String s2 = in.nextLine();
        
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Son iguales");
        }
        else
            System.out.println("No son iguales");
    }
}
