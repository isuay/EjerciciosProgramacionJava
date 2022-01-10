package UD6EjerPOO1.ProgramaRectangulo;

public class Main {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo();
        r1.x1 = 0;
        r1.y1 = 0;
        r1.x2 = 5;
        r1.y2 = 5;

        Rectangulo r2 = new Rectangulo();
        r2.x1 = 7;
        r2.y1 = 9;
        r2.x2 = 2;
        r2.y2 = 3;

        System.out.println("Coordenadas r1: " + "(" + r1.x1 + "," + r1.y1 + ")" + "(" + r1.x2 + "," + r1.y2 + ")");
        System.out.println("Coordenadas r2: " + "(" + r2.x1 + "," + r2.y1 + ")" + "(" + r2.x2 + "," + r2.y2 + ")");

        System.out.println("Perímetro r1: " + r1.perimetro());
        System.out.println("Perímetro r2: " + r2.perimetro());

        System.out.println("Área r1: " + r1.area());
        System.out.println("Área r2: " + r2.area());

    }
}
