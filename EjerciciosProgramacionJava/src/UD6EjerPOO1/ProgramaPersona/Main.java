package UD6EjerPOO1.ProgramaPersona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Nombre: ");
        String n = in.nextLine();
        
        System.out.print("Apellidos: ");
        String a = in.nextLine();
        
        System.out.print("DNI: ");
        String d = in.nextLine();
        
        System.out.print("Edad: ");
        int e = in.nextInt();

        Persona iris = new Persona(n, a, d, e);
        
        iris.esMayorEdad(iris.getEdad());
        
        in.nextLine();
        
        System.out.print("Nombre: ");
        n = in.nextLine();
        
        System.out.print("Apellidos: ");
        a = in.nextLine();
        
        System.out.print("DNI: ");
        d = in.nextLine();
        
        System.out.print("Edad: ");
        e = in.nextInt();

        Persona jose = new Persona(n, a, d, e);
        
        jose.esMayorEdad(jose.getEdad());
        
        System.out.println("Diferencia de edad: " + iris.diferenciaEdad(jose));
    }
}
