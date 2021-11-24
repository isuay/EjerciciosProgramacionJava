/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer1.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/* 1. Crea un programa que pida una cadena de texto y luego la muestre tanto en
mayúsculas como en minúsculas. */

package UD4EjerStrings;

import java.util.Scanner;

/**
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 16:46:16
 */
public class Ejer1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Dame una cadena de texto: ");
        String texto = in.nextLine();

        System.out.println(texto.toUpperCase());

        System.out.println(texto.toLowerCase());
    }
}
