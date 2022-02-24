package UD8EjerHerenciaB;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Persona> persona = new ArrayList();
        
        Profesor p1 = new Profesor("Pepe", "Gómez", "20-05-1980", 1500, "Matemáticas");
        Profesor p2 = new Profesor("Marcos", "López", "15-08-1975", 1600, "E.F.");
        Profesor p3 = new Profesor("Fernanda", "Cervera", "18-11-1982", 1580, "Inglés");
        Profesor p4 = new Profesor("Gloria", "Acuña", "03-02-1967", 1460, "Química");
        Profesor p5 = new Profesor("Adelina", "Rodrigues", "28-10-1960", 1700, "Música");
        
        Alumno a1 = new Alumno("Maria", "Vives", "08-10-2002", 4, 7);
        Alumno a2 = new Alumno("Pedro", "Tejera", "23-06-2004", 2, 5);
        Alumno a3 = new Alumno("Claudia", "Escudero", "12-01-2002", 4, 9);
        Alumno a4 = new Alumno("Ramón", "Garca", "15-12-2003", 3, 8);
        Alumno a5 = new Alumno("Cesar", "Oviedo", "17-04-2004", 2, 6);
        
        persona.add(p1);
        persona.add(p2);
        persona.add(p3);
        persona.add(p4);
        persona.add(p5);
        persona.add(a1);
        persona.add(a2);
        persona.add(a3);
        persona.add(a4);
        persona.add(a5);
        
        for (int i = 0; i < persona.size(); i++) {
            persona.get(i).mostrar();
            System.out.println("");
        }
        
        
    }
}
