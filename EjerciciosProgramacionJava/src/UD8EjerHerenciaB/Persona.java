package UD8EjerHerenciaB;

public class Persona {

    private String nombre;
    private String apellidos;
    private String fechaNacim;

    public Persona(String n, String a, String f) {
        nombre = n;
        apellidos = a;
        fechaNacim = f;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacim() {
        return fechaNacim;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacim(String fechaNacim) {
        this.fechaNacim = fechaNacim;
    }
    
    public void mostrar(){
        System.out.println("Nombre: " + nombre + " - Apellidos: " + apellidos + " - Fecha de nacimiento: " + fechaNacim);
    }
}
