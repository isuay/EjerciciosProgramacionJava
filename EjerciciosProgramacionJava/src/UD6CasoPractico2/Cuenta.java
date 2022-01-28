package UD6CasoPractico2;

public class Cuenta {

    private String nombre;
    private double saldo;
    
    public Cuenta(String nombre, double saldo){
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getsaldo(){
        return saldo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void ingresarDinero(double dinero){
        if (dinero >= 0) {
            saldo += dinero;
        } else {
            System.err.println("ERROR: no se permiten números negativos");
        }
    }
    
    public boolean retirarDinero(double dinero){
        if ((saldo - dinero) >= -100) {
            saldo -= dinero;
            return true;
        } else {
            System.err.println("ERROR: cantidad no permitida");
            return false;
        }
    }
    
    public void imprimir(){
        System.out.println(nombre + "   Saldo: " + saldo + "€");
    }
    
}
