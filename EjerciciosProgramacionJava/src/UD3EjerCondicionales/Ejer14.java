package UD3EjerCondicionales;

/*
14.Escribe un programa que pida cuantas mujeres y hombres hay en un aula y muestre
el  porcentaje   de   mujeres   y   hombres   que   hay.   También   mostrará   un   mensaje
indicando si hay más mujeres, o más hombres o si hay los mismos.
 */

import java.util.Scanner;

public class Ejer14 {
    
        public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
                
        System.out.println("Dime cuantas mujeres y hombres hay");
        System.out.println("Mujeres:");
        int m = in.nextInt();
        
        System.out.println("Hombres:");
        int h = in.nextInt();
        
        int suma = m + h;
        double pm = (double)m / suma * 100;
        double ph = (double)h / suma * 100;
        
        if (m > h)
            System.out.println("Hay más mujeres que hombres.");
        else if (h > m)
            System.out.println("Hay más hombres que mujeres.");
        else
            System.out.println("Hay la misma cantidad de mujeres que de hombres.");
        
        System.out.println("Porcentaje de mujeres: " + pm + "%");
        System.out.println("Porcentaje de hombres: " + ph + "%");
    }
}
