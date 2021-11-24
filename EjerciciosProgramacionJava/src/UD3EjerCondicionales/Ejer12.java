package UD3EjerCondicionales;

/*
12.Realiza un programa que pida un número entero entre uno y doce e imprima el
número de días que tiene el mes correspondiente.
 */

import java.util.Scanner;

public class Ejer12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int mes;
                
        System.out.println("Dime un número entero (entre 1 y 12):");
        mes = in.nextInt();

        int dias;
        
        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
                break;
            default:
                dias = 0;
                break;
        }
        
        System.out.println("Este mes tiene " + dias + " días");
    }
}