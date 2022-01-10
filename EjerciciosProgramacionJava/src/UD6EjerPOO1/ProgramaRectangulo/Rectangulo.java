package UD6EjerPOO1.ProgramaRectangulo;

public class Rectangulo {

    public int x1, y1, x2, y2;

    public int perimetro() {
        int perimetro = (Math.abs(x2 - x1) + Math.abs(y2 - y1)) * 2;
        return perimetro;
    }

    public int area() {
        int area = (Math.abs(x2 - x1) * Math.abs(y2 - y1));
        return area;
    }
}
