/* 3. Escribe un programa que pida dos números enteros por teclado y muestre por pantalla
cual es el mínimo. Implementa y utiliza la función:

int minimo(int a, int b) // Devuelve el menor entre a y b */

package UD5EjerFunciones;

import java.util.Scanner;

public class Ejer3 {

	public static int minimo(int a, int b) {

		return Math.min(a, b);
	}

	public static void main(String[] args) {

		int num1, num2;

		Scanner in = new Scanner(System.in);

		System.out.print("Dame número 1: ");
		num1 = in.nextInt();

		System.out.print("Dame número 2: ");
		num2 = in.nextInt();

		System.out.println("El menor es: " + minimo(num1, num2));

	}
}
