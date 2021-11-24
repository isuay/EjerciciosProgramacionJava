/* 8. Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N,
el productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las
funciones:

int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n */

package UD5EjerFunciones;

import java.util.Scanner;

public class Ejer8 {

	public static int suma1aN(int n) {

		int suma = 0;

		for (int i = 1; i <= n; i++) {
			suma += i;
		}
		return suma;
	}

	public static int producto1aN(int n) {
		
		int mult = 1;

		for (int i = 1; i <= n; i++) {
			mult *= i;
		}
		return mult;
	}

	public static double intermedio1aN(int n) {
		return (double)(n+1) / 2;
	}

	public static void main(String[] args) {

		int N;

		Scanner in = new Scanner(System.in);

		System.out.print("Dime un valor entero: ");
		N = in.nextInt();

		System.out.println("Sumatorio: " + suma1aN(N));
		System.out.println("Productorio: " + producto1aN(N));
		System.out.println("Valor intermedio: " + intermedio1aN(N));
	}
}
