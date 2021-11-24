/* 4. Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
positivo, negativo o cero. Implementa y utiliza la función:

int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo */

package UD5EjerFunciones;

import java.util.Scanner;

public class Ejer4 {
	
	public static int dimeSigno(int a) {
		if (a < 0) {
			return -1;
		}
		else if (a == 0) {
			return 0;
		}
		else {
			return 1;
		}
	}

	public static void main(String[] args) {

		int num;

		Scanner in = new Scanner(System.in);

		System.out.print("Dame un número entero: ");
		num = in.nextInt();

		System.out.println(dimeSigno(num));
	}
}
