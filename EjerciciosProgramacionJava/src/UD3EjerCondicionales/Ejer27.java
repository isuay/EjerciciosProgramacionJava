package UD3EjerCondicionales;

/*
27.Escribe un programa que calcule la edad de una persona solicitando la fecha actual y
la fecha de su nacimiento.
 */

import java.util.Scanner;

public class Ejer27 {
    
    public static void main(String[] args) {

        int dia, mes, año;
        int diaA, mesA, añoA;
        int edad;
        
        Scanner in = new Scanner(System.in);

        System.out.println("Dime tu fecha de nacimiento");
        System.out.print("Día: ");
        dia = in.nextInt();
        System.out.print("Mes: ");
        mes = in.nextInt();
        System.out.print("Año: ");
        año = in.nextInt();
        
        System.out.println("Dime la fecha actual");
        System.out.print("Día: ");
        diaA = in.nextInt();
        System.out.print("Mes: ");
        mesA = in.nextInt();
        System.out.print("Año: ");
        añoA = in.nextInt();
        
        edad = añoA - año - 1;
        
        if ((mesA > mes) || (mesA == mes && diaA >= dia)){
            edad++;
        }
        
        System.out.println("Edad: " + edad + " años");
    }
}
