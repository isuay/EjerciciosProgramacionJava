package UD3EjerCondicionales;

/*
11.Realiza un programa que pida el día de la semana (del 1 al 7) y muestre por pantalla
el día correspondiente (Lunes, martes...). Si introducimos otro número mostrará un
mensaje de error.
 */

import java.util.Scanner;

public class Ejer11 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num;
                
        System.out.println("Dime un día de la semana (del 1 al 7):");
        num = in.nextInt();

        String dia;
        
        switch (num){
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "ERROR";
                break;
        }
        
        System.out.println("El día de la semana es: " + dia);
    }
}