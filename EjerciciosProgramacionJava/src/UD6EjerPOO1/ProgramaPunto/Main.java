package UD6EjerPOO1.ProgramaPunto;

public class Main {

    public static void main(String[] args) {
        
        Punto p1 = new Punto(5,0);
        
        Punto p2 = new Punto(10,10);
        
        Punto p3 = new Punto(-3,7);
        
        System.out.println("Distancia: " + p1.distancia(p3));
    }
}
