package UD6EjerPOO1.ProgramaArticulo;

public class Main {

    public static void main(String[] args) {
        
        Articulo a1 = new Articulo();
        
        a1.nombre = "camiseta";
        a1.precio = 19.95;
        a1.IVA = 21;
        a1.cuantosQuedan = 5;
        
        double PVP = a1.precio + ((a1.IVA/100.0) * a1.precio);
        
        System.out.println(a1.nombre + " - Precio: " + a1.precio + "€ - IVA: " + a1.IVA + "% - PVP: " + PVP  + "€");
    }
}
