package UD6EjerPOO1.ProgramaPunto;

public class Main {

    public static void main(String[] args) {
        
        Punto p1 = new Punto(5,0);
        
        Punto p2 = new Punto(10,10);
        
        Punto p3 = new Punto(-3,7);
        
        Punto p4 = Punto.creaPuntoAleatorio();
        
        p1.imprime();
        p3.imprime();
        System.out.println("Distancia: " + p1.distancia(p3));
        System.out.println("(" + p4.getX() + "," + p4.getY() + ")");
    }
}
