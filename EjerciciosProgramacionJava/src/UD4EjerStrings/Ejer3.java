/*
 * Proyecto UD4-Ejer-Pr_ctica - Archivo Ejer3.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/* 3. Crea un programa que pida dos cadenas de texto y luego las muestre en orden
alfabético (sin diferenciar entre mayúsculas y minúsculas). */

package UD4EjerStrings;

import java.util.Scanner;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 16:57:39
 */
public class Ejer3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Cadena de texto 1: ");
        String s1 = in.nextLine();
        
        System.out.print("Cadena de texto 2: ");
        String s2 = in.nextLine();
        
        if (s1.compareToIgnoreCase(s2) < 0) {
            System.out.println(s1);
            System.out.println(s2);
        } else if (s1.compareToIgnoreCase(s2) > 0){
            System.out.println(s2);
            System.out.println(s1);
        } else{
            System.out.println("Son iguales");
        }
    }
}
