package UD6EjerPOO1.ProgramaPunto;

public class Punto {

    private int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    public void desplaza(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int distancia(Punto p) {
        return (int) Math.sqrt(Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2));
    }

    public void imprime() {
        System.out.println("(" + getX() + "," + getY() + ")");
    }

    public static Punto creaPuntoAleatorio() {
        int x = (int)(Math.random()*(100-(-100))+(-100));
        int y = (int)(Math.random()*(100-(-100))+(-100));
        Punto p1 = new Punto(x,y);
        return p1;
    }
}
