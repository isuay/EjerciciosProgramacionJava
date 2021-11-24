/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer4.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/* 4. Crea   un   programa   que   pida   por  teclado   tres  cadenas  de   texto:  nombre   y  dos
apellidos. Luego mostrará un código de usuario (en mayúsculas) formado por la
concatenación de las tres primeras letras de cada uno de ellos. Por ejemplo si se
introduce “Lionel”, “Tarazón” y “Alcocer” mostrará “LIOTARALC”. */

package UD4EjerStrings;

import java.util.Scanner;

/**
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 17:08:52
 */
public class Ejer4 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nombre: ");
        String s1 = in.nextLine();
        
        System.out.print("Apellido 1: ");
        String s2 = in.nextLine();
        
        System.out.print("Apellido 2: ");
        String s3 = in.nextLine();
        
        String usuario = s1.substring(0,3) + s2.substring(0,3) + s3.substring(0,3);
        
        System.out.println(usuario.toUpperCase());
    }
}
