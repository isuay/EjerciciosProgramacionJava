/* 5. Escribe un programa que pida un valor entero en millas y muestre su equivalente en
kilómetros. Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la
función:

double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros */

package UD5EjerFunciones;

import java.util.Scanner;

public class Ejer5 {

	public static double millas_a_kilometros(int millas) {
		return millas * 1.60934; 
	}
	
	public static void main(String[] args) {
		
		int num;

		Scanner in = new Scanner(System.in);

		System.out.print("Dame un número entero (millas): ");
		num = in.nextInt();

		System.out.println(num + " millas son: " + millas_a_kilometros(num) + " kilometros");
		
	}
}
