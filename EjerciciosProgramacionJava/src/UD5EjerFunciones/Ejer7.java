/* 7. Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su
área y su perímetro. Implementa y utiliza las funciones:

double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
double areaRectangulo(double ancho, double alto) // Devuelve el área */

package UD5EjerFunciones;

import java.util.Scanner;

public class Ejer7 {

	public static double perimetroRectangulo(double ancho, double alto) {
		return (ancho * 2) + (alto * 2);
	}

	public static double areaRectangulo(double ancho, double alto) {
		return ancho * alto;
	}

	public static void main(String[] args) {

		double alto, ancho;

		Scanner in = new Scanner(System.in);

		System.out.print("Dime el alto de un rectángulo: ");
		alto = in.nextDouble();
		
		System.out.print("Dime el ancho de un rectángulo: ");
		ancho = in.nextDouble();
		
		System.out.println("El perímetro es: " + perimetroRectangulo(ancho, alto));
		System.out.println("El área es: " + areaRectangulo(ancho, alto));
		
	}
}
