/*
4.Escribe un programa que lea una secuencia de notas (valores enteros de 0 a 10) 
hasta que el usuario introduzca un -1, y luego muestre la suma total, la media y si 
alguna nota fué un 10.
 */
package UD3EjerBuclesBeta;

import java.util.Scanner;

public class Ejer4 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nota, suma = 0, cont = 0;
        double media;
        boolean diez = false;

        System.out.print("Dime notas del 0 al 10 enteras: ");
        nota = in.nextInt();

        while (nota != -1) {
            suma += nota;
            cont += 1;
            if (nota == 10) {
                diez = true;
            }
            System.out.print("Dime otra nota: ");
            nota = in.nextInt();
        }
        
        media = (double)suma / cont;
        
        System.out.println("Suma total: " + suma);
        System.out.println("Media: " + media);
        
        if (diez == true) {
            System.out.println("Hay algún 10");
        }
        else
            System.out.println("No hay ningún diez");
    }
}
