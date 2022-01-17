package UD6EjerPOO1.ProgramaArticulo;

import java.util.Scanner;

public class Articulo {

    private String nombre;
    private double precio;
    private final int IVAg = 21, IVAr = 10, IVAsr = 4;
    private int cuantosQuedan, tipo;

    public Articulo(String n, double p, int i, int c) {
        if (n.equals("") && p != 0 && (i != 21 || i != 10 || i != 4)) {
            System.err.println("ERROR: Datos incorrectos");
        } else {
            nombre = n;
            precio = p;
            this.tipo = i;
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
        return this.tipo;
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
        this.tipo = i;
    }

    public void setCuantosQuedan(int c) {
        cuantosQuedan = c;
    }

    public double getPVP() {
        double PVP = 0;
        switch (tipo) {
            case 21:
                PVP = getPrecio() + ((IVAg / 100.0) * getPrecio());
                break;
            case 10:
                PVP = getPrecio() + ((IVAr / 100.0) * getPrecio());
                break;
            case 4:
                PVP = getPrecio() + ((IVAsr / 100.0) * getPrecio());
                break;
            default:
                System.err.println("ERROR: IVA incorrecto");
                break;
        }
        return PVP;
    }

    public double getPVPDescuento(int d) {
        double PVP = getPVP() - ((d / 100.0) * getPVP());
        return PVP;
    }

    public void imprimir() {
        Scanner in = new Scanner(System.in);
        System.out.println(getNombre() + " - Precio: " + getPrecio() + "€ - IVA: " + getIVA() + "% - PVP: " + getPVP() + "€");
        System.out.print("Descuento (porcentaje): ");
        System.out.println("Precio con descuento " + getPVPDescuento(in.nextInt()));
    }

    public boolean vender(int x) {
        if (cuantosQuedan < x) {
            return false;
        } else {
            cuantosQuedan -= x;
            return true;
        }
    }

    public boolean almacenar(int x) {
        cuantosQuedan += x;
        return true;
    }

}
