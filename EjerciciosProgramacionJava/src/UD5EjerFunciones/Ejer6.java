/* 6. Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de
cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:

double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA */

package UD5EjerFunciones;

import java.util.Scanner;

public class Ejer6 {

	public static double precioConIVA(double precio) {
		return precio * 1.21;
	}
	
	public static void main(String[] args) {

		double precio;

		Scanner in = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.print("Precio: ");
			precio = in.nextDouble();
			System.out.println("Precio: " + precioConIVA(precio) + "€");
		}
	}
}
