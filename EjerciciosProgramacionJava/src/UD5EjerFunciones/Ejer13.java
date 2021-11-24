/* 13.Realiza un programa que calcule el porcentaje de descuento que nos han hecho al
comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad con el descuento
aplicado. Se debe crear una función a la que le pasemos ambos valores y nos devuelva
el descuento. */

package UD5EjerFunciones;

import java.util.Scanner;

public class Ejer13 {

	public static double porcentaje(double a, double b ) {
		return (double)((a-b) / a) * 100;
	}
	
	public static void main(String[] args) {

		double psd, pcd;

		Scanner in = new Scanner(System.in);

		System.out.print("Dime el precio sin descuento: ");
		psd = in.nextDouble();
		
		System.out.print("Dime el precio con descuento: ");
		pcd = in.nextDouble();

		System.out.println("El porcentaje de descuento ha sido del " + porcentaje(psd, pcd) + "%");
				
	}
}
