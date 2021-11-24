/*
17.- Escribe un programa que solicite al usuario el tamaño del lado de un triángulo
equilátero y calcule su perímetro y su área.
 */
package UD2Ejer;

import java.lang.Math;
import java.util.Scanner;

public class Ejer17 {
    
       public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime el tamaño del lado del triángulo:");
        
        double l = in.nextDouble();
        
        double area = (l * l) / 2;
        double perimetro = l + l + l;
        
        System.out.println("El área es: " + area + ", y el perímetro es: " + perimetro);
    } 
    
}
