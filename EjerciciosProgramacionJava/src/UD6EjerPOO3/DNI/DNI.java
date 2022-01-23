package UD6EjerPOO3.DNI;

public class DNI {

    // ATRIBUTOS
    private int dni;
    private static final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

    // CONSTRUCTOR
    public DNI(int dni) {
        this.dni = dni;
    }
    
    // GETTERS
    public int getDNI() {
        return this.dni;
    }

    public char getLetra() {
        return letras.charAt(dni % 23);
    }

    public String getNIF() {
        return ("" + dni + getLetra());
    }

    // SETTERS
    public void setDNI(int dni) {
        this.dni = dni;
    }

    // OTROS MÉTODOS
    public void imprime() {
        System.out.println(getNIF());
    }
    
    //Método DNI aleatorio
    public DNI newRandomDNI(){
        
        String a = "";
        
        for (int i = 0; i < 8; i++) {
            int num = (int)(Math.random()*(9 - 0 + 1) + 0);
            a += num + "";
        }
        dni = Integer.parseInt(a);
        
        DNI rand = new DNI(dni);
        return rand;
    }
}
