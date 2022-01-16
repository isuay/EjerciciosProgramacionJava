package UD6EjerPOO2.CuentaCorriente;

public class CuentaCorriente {

    //Variables
    private int numCuenta;
    private double saldo;

    //Constructor
    public CuentaCorriente(int n, double s) {
        if (s < 0) {
            System.err.println("ERROR: no se permiten cuentas con saldo negativo");
        } else {
            numCuenta = n;
            saldo = s;
            imprimir();
        }
    }

    //Getters
    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    //Setters
    public void getNumCuenta(int n) {
        numCuenta = n;
    }

    public void setSaldo(double s) {
        if (s < 0) {
            System.err.println("ERROR: no se permiten números negativos");
        } else {
            saldo = s;
        }
    }

    //Ingresar cantidad
    public void ingresar(double c) {
        if (numCuenta == 0) {
            System.err.println("ERROR: no existe la cuenta");
        } else if (c < 0) {
            System.err.println("ERROR: número incorrecto");
        } else {
            setSaldo(saldo + c);
        }
    }

    //Retirar cantidad
    public boolean retirar(double c) {
        if (numCuenta == 0) {
            System.err.println("ERROR: no existe la cuenta");
            return false;
        } else if (saldo <= 0) {
            System.err.println("ERROR: no hay dinero en la cuenta");
            return false;
        } else if (c < 0) {
            System.err.println("ERROR: número incorrecto");
            return false;
        } else {
            setSaldo(saldo - c);
            return true;
        }
    }

    //Imprimir
    public void imprimir() {
        System.out.println("Nº cuenta: " + numCuenta + ", saldo: " + saldo + "€");
    }

}
