package UD7Entregable;

public class Cuenta {

    private String nombre;
    private double saldo;

    public Cuenta(String nombre, double saldo) throws CuentaException {
        if (saldo >= 0) {
            setNombre(nombre);
            this.saldo = saldo;
        } else {
            throw new CuentaException("ERROR: no se permite saldo negativo");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getsaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ingresarDinero(double dinero) throws CuentaException {
        if (dinero >= 0) {
            saldo += dinero;
        } else {
            throw new CuentaException("ERROR: no se permiten números negativos");
        }
    }

    public boolean retirarDinero(double dinero) throws CuentaException {
        if ((saldo - dinero) >= -100 && dinero >= 0) {
            saldo -= dinero;
            return true;
        } else {
            throw new CuentaException("ERROR: cantidad no permitida");
        }
    }

    public void imprimir() {
        System.out.println(nombre + "   Saldo: " + saldo + "€");
    }

}
