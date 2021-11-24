/*
1. Escribe un programa que pida al usuario la nota final de 3 evaluaciones
(números enteros) y muestre por pantalla la nota media (con decimales).
 */
package UD2Entregable;

import java.util.Scanner;

public class Ejer1 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime tres notas finales:");
        System.out.println("1a nota:");
        int primera = in.nextInt();          

        System.out.println("2a nota:");
        int segunda = in.nextInt();          

        System.out.println("3a nota:");
        int tercera = in.nextInt();          

        double media = (primera + segunda + tercera) / 3.0;
        
        System.out.println("La nota media es: " + media);

    }
}