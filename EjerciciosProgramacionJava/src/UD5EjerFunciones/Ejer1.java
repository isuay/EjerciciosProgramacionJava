package UD5EjerFunciones;

import java.util.Scanner;

/* 1. Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
resultado de multiplicarlos. Implementa y utiliza la función:

double multiplica(double a, double b) // Devuelve la multiplicación de dos números
 */
public class Ejer1 {

	public static double multiplica(double a, double b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		
		double num1, num2;
		
		Scanner in = new Scanner(System.in);

		System.out.print("Dame número 1: ");
		num1 = in.nextDouble();
		
		System.out.print("Dame número 2: ");
		num2 = in.nextDouble();
		
		System.out.println("Resultado: " + multiplica(num1, num2));
		
	}
}
