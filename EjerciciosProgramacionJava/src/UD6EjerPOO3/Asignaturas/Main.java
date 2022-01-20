package UD6EjerPOO3.Asignaturas;

public class Main {
    
    public static void main(String[] args) {
        
        Asignatura[] asignaturas = new Asignatura[5];
        
        asignaturas[0] = new Asignatura("Matemáticas", 1025, 1);
        asignaturas[1] = new Asignatura("Inglés", 1030, 2);
        asignaturas[2] = new Asignatura("Física", 1028, 3);
        asignaturas[3] = new Asignatura("Química", 1029, 4);
        asignaturas[4] = new Asignatura("Música", 1021, 2);
        
        for (int i = 0; i < asignaturas.length; i++) {
            asignaturas[i].imprime();
        }
    }
}
