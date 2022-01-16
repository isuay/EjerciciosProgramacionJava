package UD6EjerPOO2.Coche2;

public class Coche {

    private String modelo, color, matricula;
    private boolean metalizado;
    private int año;
    private int opcion;
    
    private TipoCoches tipo;
    private SeguroCoches seguro;
    
    public Coche(String m, String c, String ma, boolean me, int a, TipoCoches t, SeguroCoches s) {
        modelo = m;
        color = c;
        matricula = ma;
        metalizado = me;
        año = a;
        tipo = t;
        seguro = s;
        imprimir();
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getMatricula() {
        return matricula;
    }

    public boolean getMetalizado() {
        return metalizado;
    }

    public int getAño() {
        return año;
    }
    
    public void tipo(int opcion) {
        this.opcion = opcion;
    }

    public int getTipo() {
        return opcion;
    }

    public void setModelo(String m) {
        modelo = m;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setMatricula(String m) {
        matricula = m;
    }

    public void setMetalizado(boolean m) {
        metalizado = m;
    }

    public void setAño(int a) {
        año = a;
    }

    public void imprimir() {
        System.out.println("Modelo: " + modelo + ", Color: " + color + ", Matrícula:" + matricula + ", Metalizado: " + metalizado + ", Año de fabricación: " + año + ", Tipo de coche: " + tipo.getTipo() + ", Seguro del coche: " + seguro.getSeguro());
    }
}
