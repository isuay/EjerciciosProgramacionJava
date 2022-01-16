package UD6EjerPOO2.Asignatura;

public class Asignatura {

    private String nombre;
    private int codigo, curso;
    
    public Asignatura(String n, int cd, int cs) {
        nombre = n;
        codigo = cd;
        curso = cs;
        imprimir();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public int getCurso() {
        return curso;
    }
    
    public void setNombre(String n) {
        nombre = n;
    }
    
    public void setCodigo(int cd) {
        codigo = cd;
    }
    
    public void setCurso(int cs) {
        curso = cs;
    }
    
    public void imprimir() {
        System.out.println("Nombre: " + nombre + ", código: " + codigo + ", curso: " + curso);
    }
    
}
