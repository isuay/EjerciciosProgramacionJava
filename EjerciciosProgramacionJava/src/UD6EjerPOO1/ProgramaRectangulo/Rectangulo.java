package UD6EjerPOO1.ProgramaRectangulo;

public class Rectangulo {

    private int x1, y1, x2, y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        if (x2 > x1 && y2 > y1) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR al instanciar el rectángulo");
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

    public int perimetro() {
        int perimetro = (Math.abs(x2 - x1) + Math.abs(y2 - y1)) * 2;
        return perimetro;
    }

    public int area() {
        int area = (Math.abs(x2 - x1) * Math.abs(y2 - y1));
        return area;
    }
    
    public void imprimir() {
        System.out.println("Coordenadas: " + "(" + getX1() + "," + getY1() + ")" + "(" + getX2() + "," + gety2() + ")");
    }
}
