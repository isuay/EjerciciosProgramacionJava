package UD6EjerPOO2.DNI;

public class DNI {

    //Variable de DNI
    private int dni;

    //Constructor
    public DNI(int d) {
        dni = d;
        imprimir();
    }

    //Setter de los números del DNI
    public void setDni(int d) {
        dni = d;
    }

    //Getter de los números del DNI
    public int getDni() {
        return dni;
    }

    //Método para calcular la letra del DNI
    public char getLetra() {
        int res = dni % 23;
        String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letra.charAt(res);
    }
    
    //Método para juntar los números y la letra del DNI
    public String getNIF() {
        String d = String.valueOf(dni);
        return d + getLetra();
    }
    
    //Método para imprimir el DNI
    public void imprimir() {
        System.out.println("DNI: " + getNIF());
    }
}
