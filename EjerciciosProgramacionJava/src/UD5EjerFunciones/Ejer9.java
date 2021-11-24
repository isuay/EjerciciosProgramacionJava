/* 9. Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el
más elevado. Impleméntalo creando únicamente una función a la que le pasemos dos
valores (no tres) y nos devuelva el máximo de los dos valores. */

package UD5EjerFunciones;

import java.util.Scanner;

public class Ejer9 {

	public static int valorMaximo (int a, int b){
		
		return Math.max(a, b);
	}
	
	public static void main(String[] args) {

		int num1, num2, num3;

		Scanner in = new Scanner(System.in);

		System.out.print("Valor entero 1: ");
		num1 = in.nextInt();
		
		System.out.print("Valor entero 2: ");
		num2 = in.nextInt();
		
		System.out.print("Valor entero 3: ");
		num3 = in.nextInt();
		
		if (valorMaximo(num1, num2) > num3) {
			System.out.println("Valor entero máximo: " + valorMaximo(num1, num2));
		}
		else {
			System.out.println("Valor entero máximo: " + num3);
		}
		
	}
}
