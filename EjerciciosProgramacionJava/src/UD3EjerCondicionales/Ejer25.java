package UD3EjerCondicionales;

/*
25.Realiza   un  programa  para   determinar   cuánto   se   debe   pagar   por   una   llamada
internacional según la siguiente política de cobro:
◦El cobro depende del tiempo de la llamada y se tarifa por tramos.
◦Los primeros cinco minutos cuestan 1 euro.
◦Los siguientes tres minutos cuestan 80 céntimos.
◦Los siguientes dos minutos cuestan 70 céntimos.
◦Los siguientes minutos cuestan 50 céntimos cada uno.
 */

import java.util.Scanner;
        
public class Ejer25 {

    public static void main(String[] args) {

        double tiempo, precio;

        Scanner in = new Scanner(System.in);

        System.out.print("¿Cuántos minutos ha durado la llamada? ");
        tiempo = in.nextDouble();

        if (tiempo >= 5){
            precio = 1.0;
        }
        else if (tiempo <= 8){
            precio = 1.80;
        }
        else if (tiempo <=10){
            precio = 2.50;
        }
        else {
            precio = 2.50 + (0.50 * Math.ceil(tiempo - 10.0));
        }
        
        System.out.println("El total a pagar es: " + precio + "€");
    }
}  
