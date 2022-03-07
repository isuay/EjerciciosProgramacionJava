package PracticaExamen2;

public class Password {

    // Atributos
    private int longitud;
    private String contraseña;

    private final static int longDef = 8;

    // Constructores
    public Password() {
        this(longDef);
    }

    public Password(int longitud) {
        this.longitud = longitud;
        contraseña = generarPassword();

    }

    // Getters y Setters
    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public static int getLongDef() {
        return longDef;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean esFuerte() {

        int mayuscula = 0, minuscula = 0, numero = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            if (contraseña.charAt(i) >= 65 && contraseña.charAt(i) <= 90) {
                mayuscula++;
            } else if (contraseña.charAt(i) >= 97 && contraseña.charAt(i) <= 122) {
                minuscula++;
            } else {
                numero++;
            }
        }

        if (mayuscula > 2 && minuscula > 1 && numero > 5) {
            return true;
        } else {
            return false;
        }
    }

    public String generarPassword() {
        String password = "";
        for (int i = 0; i < longitud; i++) {
            //Generamos un numero aleatorio, segun este elige si añadir una minuscula, mayuscula o numero
            int eleccion = ((int) Math.floor(Math.random() * 3 + 1));

            if (eleccion == 1) {
                char minusculas = (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
                password += minusculas;
            } else {
                if (eleccion == 2) {
                    char mayusculas = (char) ((int) Math.floor(Math.random() * (91 - 65) + 65));
                    password += mayusculas;
                } else {
                    char numeros = (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
                    password += numeros;
                }
            }
        }
        return password;
    }

}
