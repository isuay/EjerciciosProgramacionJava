/* 10.Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y
nos diga si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días.
Se debe crear una función donde le pasemos los datos y devuelva si es correcta o no. */

package UD5EjerFunciones;

import java.util.Scanner;

public class Ejer10 {
	
	public static boolean fechaCorrecta (int dia, int mes, int anyo){
		if ((dia <= 30 && dia > 0) && (mes <= 12 && mes > 0)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {

		int dia, mes, anyo;

		Scanner in = new Scanner(System.in);

		System.out.print("Dime un dia: ");
		dia = in.nextInt();
		
		System.out.print("Dime un mes: ");
		mes = in.nextInt();
		
		System.out.print("Dime un año: ");
		anyo = in.nextInt();
		
		if (fechaCorrecta(dia, mes, anyo) == true) {
			System.out.println("¡Fecha correcta! :)");
		}
		else {
			System.out.println("Fecha incorrecta :(");
		}
	}
}
