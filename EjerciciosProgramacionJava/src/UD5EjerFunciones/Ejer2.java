/*2. Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor
de edad o no. Implementa y utiliza la función:

boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario */

package UD5EjerFunciones;

import java.util.Scanner;

public class Ejer2 {

	public static boolean esMayorEdad(int a) {
		if (a >= 18) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		int edad;

		Scanner in = new Scanner(System.in);

		System.out.print("Dime tu edad: ");
		edad = in.nextInt();

		if (esMayorEdad(edad) == true) {
			System.out.println("Eres mayor de edad");
		} 
		else {
			System.out.println("Eres menor de edad");
		}
	}
}
