package UD3EjerCondicionales;

/*
24.Una farmacia desea un programa para ingresar el valor de compra y calcular lo
siguiente: si el pago se efectúa al “contado”, calcular un descuento del 5%; pero si el
pago es con “tarjeta” se incrementa un recargo del 3% al valor de compra. Calcular y
visualizar el descuento o recargo según sea el caso y el total a pagar de la compra.
 */

import java.util.Scanner;
        
public class Ejer24 {

    public static void main(String[] args) {

        double precio;
        char pago;

        Scanner in = new Scanner(System.in);

        System.out.print("Dime el precio de la compra: ");
        precio = in.nextDouble();
        
        System.out.print("¿Pago al contado o con tarjeta? c/t: ");
        pago = in.next().charAt(0);
        
        if (pago == 'c') {
            System.out.println("Descuento del 5%");
            precio = precio - (precio * 0.05);
        }
        else if (pago == 't') {
            System.out.println("Recargo del 3%");
            precio = precio + (precio * 0.03);
        }
        else
            System.out.println("Error, carácter no válido");
        
        System.out.println("El total a pagar se queda en: " + precio + "€");
    }
}
