/* 11.Realiza un programa que escriba la tabla de multiplicar de un número introducido por
teclado. Para ello implementa una función que reciba como parámetro un número entero
y muestre por pantalla la tabla de multiplicar de dicho número. */

package UD5EjerFunciones;

import java.util.Scanner;

public class Ejer11 {
	
	public static void tabla(int n) {
		
		int res;
		
		for (int i = 1; i <= 10; i++) {
			 System.out.println(n + "*" + i + " = " + n*i);
		}
		
	}

	public static void main(String[] args) {

		int num;

		Scanner in = new Scanner(System.in);

		System.out.print("Dime un número entero: ");
		num = in.nextInt();
		
		System.out.println("");
		System.out.println("TABLA DEL " + num);
		tabla(num);
		
	}
}
