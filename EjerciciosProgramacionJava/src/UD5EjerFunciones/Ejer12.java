/* 12.Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El
programa debe tener una función que reciba como parámetro una cantidad en kilómetros
y nos la devuelva en millas. */

package UD5EjerFunciones;

import java.util.Scanner;

public class Ejer12 {

	public static double km_a_millas(double km) {
		return km / 1.60934; 
	}

	public static void main(String[] args) {

		double km;

		Scanner in = new Scanner(System.in);

		System.out.print("Dime un valor en km: ");
		km = in.nextDouble();

		System.out.println(km + " kilómetros = " + km_a_millas(km) + " millas");
		
	}
}
