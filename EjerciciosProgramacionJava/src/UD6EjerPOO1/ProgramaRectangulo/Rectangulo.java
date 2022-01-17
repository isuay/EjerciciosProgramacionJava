package UD6EjerPOO1.ProgramaRectangulo;

public class Rectangulo {

    private int x1, y1, x2, y2;
    private final int min = 0, max = 100;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        if (x1 <= max && x1 >= min && x2 <= max && x2 >= min && y1 <= max && y1 >= min && y2 <= max && y2 >= min /*&& x2 > x1 && y2 > y1*/) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            imprimir();
        } else {
            System.err.println("\nERROR al instanciar este rectángulo");
        }

    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int gety2() {
        return y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public void setX1X2(int x1, int x2) {
        setX1(x1);
        setX2(x2);
    }

    public void setY1Y2(int y1, int y2) {
        setY1(y1);
        setY2(y2);
    }
    
    public void setAll(int x1, int y1, int x2, int y2) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }
    
    public int getPerimetro() {
        int perimetro = (Math.abs(x2 - x1) + Math.abs(y2 - y1)) * 2;
        return perimetro;
    }

    public int getArea() {
        int area = (Math.abs(x2 - x1) * Math.abs(y2 - y1));
        return area;
    }
    
    public void imprimir() {
        System.out.println("Coordenadas: " + "(" + getX1() + "," + getY1() + ")" + "(" + getX2() + "," + gety2() + ")");
        System.out.println("Perímetro: " + getPerimetro());
        System.out.println("Área: " + getArea());
    }
    
    public static Rectangulo creaRectanguloAleatorio() {
        Rectangulo r1 = new Rectangulo((int)(Math.random()*(100 - 0 + 1) + 0), (int)(Math.random()*(100 - 0 + 1) + 0), (int)(Math.random()*(100 - 0 + 1) + 0), (int)(Math.random()*(100 - 0 + 1) + 0));
        return r1;
    }
}
