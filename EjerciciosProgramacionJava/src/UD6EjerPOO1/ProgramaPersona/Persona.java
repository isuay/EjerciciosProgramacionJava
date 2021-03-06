package UD6EjerPOO1.ProgramaPersona;

public class Persona {

    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private static final int mayoriaEdad = 18;

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
        if (e >= mayoriaEdad) {
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

    static boolean validarDNI(String dni) {
        String num = dni.substring(0, (dni.length() - 1));
        int numeros;
        if (dni.length() == 9) {
            try {
                numeros = Integer.parseInt(num);
                return true;
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }
    }

}
