package UD3EjerCondicionales;

/*
28.Escribe un programa que solicite tres valores enteros con el día, mes y año de una
fecha e indique si es una fecha válida. Ten en cuenta que hay meses con 30 días,
otros con 31 y que febrero tiene 28 días (supondremos que no hay años bisiestos).
 */

import java.util.Scanner;

public class Ejer28 {
    
    public static void main(String[] args) {

        int dia, mes, anyo;
        boolean validez = true;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime un día, mes y año");

        System.out.print("Día: ");
        dia = in.nextInt();
        
        System.out.print("Mes: ");
        mes = in.nextInt();
        
        System.out.print("Año: ");
        anyo = in.nextInt();
        
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (dia < 1 || dia > 31){
                    System.out.println("Día incorrecto");
                    validez = false;
                }
                break;
            case 4: case 6: case 9: case 11:
                if (dia < 1 || dia > 30) {
                    System.out.println("Día incorrecto");
                    validez = false;
                }
                break;
            case 2:
                if (dia < 1 || dia > 28){
                    System.out.println("Día incorrecto");
                    validez = false;
                }
                break;
            case 0:
                validez = false;
                break;
        }
        
        if (mes <1 || mes > 12){
            System.out.println("Mes incorrecto");
        }
        
        if (validez == true){
            System.out.println("Fecha correcta");            
        }
    }
}
