package UD6EjerPOO1.ProgramaArticulo;

public class Articulo {

    private String nombre;
    private double precio;
    private int IVA;
    private int cuantosQuedan;

    public Articulo(String n, double p, int i, int c) {
        if (n.equals("") && p != 0) {
            System.err.println("ERROR: Datos incorrectos");
        } else {
            nombre = n;
            precio = p;
            IVA = i;
            cuantosQuedan = c;
            imprimir();
        }

    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getIVA() {
        return IVA;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public void setPrecio(int p) {
        precio = p;
    }

    public void setIVA(int i) {
        IVA = i;
    }

    public void setCuantosQuedan(int c) {
        cuantosQuedan = c;
    }

    public double PVP() {
        double PVP = getPrecio() + ((getIVA() / 100.0) * getPrecio());
        return PVP;
    }

    public void imprimir() {
        System.out.println(getNombre() + " - Precio: " + getPrecio() + "€ - IVA: " + getIVA() + "% - PVP: " + PVP() + "€");
    }

}
