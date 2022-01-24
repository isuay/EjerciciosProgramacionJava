package UD6CasoPractico1;

public class Contacto {

    private String nombre, telefono, correo;
    
    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public String getCorreo(){
        return this.correo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public void imprimir() {
        System.out.println(getNombre() + " " + getTelefono() + " " + getCorreo());
    }
}
