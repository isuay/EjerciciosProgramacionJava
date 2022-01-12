package UD6EjerPOO1.ProgramaPersona;

public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String n, String a, String d, int e) {
        nombre = n;
        apellidos = a;
        dni = d;
        edad = e;
        imprime();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esMayorEdad(int e) {
        if (e >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esJubilado(int e) {
        if (e >= 65) {
            return true;
        } else {
            return false;
        }
    }
    
    public int diferenciaEdad(Persona p) {
        int dif = 0;
        
        if (this.edad > p.edad) {
            dif = this.edad - p.edad;
        } else {
            dif = p.edad - this.edad;
        }
        return dif;
    }

    public void imprime() {
        System.out.print(getNombre() + " " + getApellidos() + " con DNI " + getDni() + " ");
        if (esMayorEdad(edad) == true) {
            System.out.print("es mayor de edad");
        } else {
            System.out.print("no es mayor de edad");
        }
        if (esJubilado(edad) == true) {
            System.out.println(" y está jubilado");
        } else {
            System.out.println(" y no está jubilado");
        }
    }
}
