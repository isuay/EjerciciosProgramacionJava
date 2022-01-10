package UD6EjerPOO1.ProgramaPersona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Persona iris = new Persona(in.nextLine(),in.nextLine(),in.nextLine(),in.nextInt());
/*
        System.out.print("Nombre: ");
        iris.nombre = ;
        System.out.print("Apellidos: ");
        iris.apellidos = in.nextLine();
        System.out.print("DNI: ");
        iris.dni = in.nextLine();
        System.out.print("Edad: ");
        iris.edad = in.nextInt();
*/
        System.out.print(iris.nombre + " " + iris.apellidos + " con DNI " + iris.dni + " ");

        if (iris.edad >= 18) {
            System.out.println("es mayor de edad");
        } else {
            System.out.println("no es mayor de edad");
        }
 /*       
        Persona jose = new Persona();

        in.nextLine();
        System.out.print("Nombre: ");
        jose.nombre = in.nextLine();
        System.out.print("Apellidos: ");
        jose.apellidos = in.nextLine();
        System.out.print("DNI: ");
        jose.dni = in.nextLine();
        System.out.print("Edad: ");
        jose.edad = in.nextInt();

        System.out.print(jose.nombre + " " + jose.apellidos + " con DNI " + jose.dni + " ");

        if (jose.edad >= 18) {
            System.out.println("es mayor de edad");
        } else {
            System.out.println("no es mayor de edad");
        }*/
    }
}
