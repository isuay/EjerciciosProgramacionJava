package UD9RetoCesar;

import java.io.*;
import java.util.*;

public class CifradoCesarPro {

    public static void main(String[] args) {

        // Scanner 
        Scanner in = new Scanner(System.in);

        try {

            // Pedimos el archivo a descifrar
            System.out.print("Dime el archivo quieres descifrar: ");
            String archivo = in.nextLine();

            // Definimos la ruta del lector
            File carta = new File(archivo);
            Scanner lector = new Scanner(carta);

            String linea = "";

            // Guardamos las líneas del archivo
            while (lector.hasNext()) {
                linea += lector.nextLine() + "\n";
            }

            // Cerramos el lector
            lector.close();

            // Pasamos las líneas a un array de char
            char[] arrayLinea = linea.toCharArray();

            // Variables
            char caracter, masRepetida = ' ';
            int contador = 0, max = Integer.MIN_VALUE, num, clave = 0;
            boolean salir = false;

            // Averiguamos el caracter que más se repite
            for (int i = 0; i < arrayLinea.length; i++) {
                caracter = Character.toUpperCase(arrayLinea[i]);
                for (int j = 0; j < arrayLinea.length; j++) {
                    if (Character.toUpperCase(arrayLinea[j]) == caracter && arrayLinea[j] != ' ') {
                        contador++;
                    }
                }
                if (contador > max) {
                    max = contador;
                    masRepetida = Character.toUpperCase(arrayLinea[i]); // Pasamos el caracter a mayúscula
                }
                contador = 0;
            }

            do {
                // Preguntamos si cambiamos por 'A' o por 'E'
                System.out.print("Elige una letra (A/E): ");
                String l = in.next();

                // Pasamos respuesta a char
                char letra = l.toUpperCase().charAt(0);

                // Averiguamos la clave
                if ((letra == 'A' || letra == 'E') && masRepetida > letra) {
                    if (letra == 'A') {
                        clave = 90 - (int) masRepetida + 1;
                    } else {
                        clave = 90 - (int) masRepetida + 5;
                    }
                } else if ((letra == 'A' || letra == 'E') && masRepetida < letra) {
                    clave = (int) letra - (int) masRepetida;
                }

                // Desciframos el archivo con la clave indicada
                for (int i = 0; i < linea.length(); i++) {

                    char c = linea.charAt(i);

                    if (c >= 'A' && c <= 'Z') {

                        int let = (int) c + clave;

                        if (let > 'Z') {
                            num = let - 90;
                            let = 64 + num;
                        }

                        c = (char) let;
                    } else if (c >= 'a' && c <= 'z') {
                        int let = (int) c + clave;

                        if (let > 'z') {
                            num = let - 122;
                            let = 96 + num;
                        }

                        c = (char) let;
                    }
                    System.out.print(c);
                }

                // Preguntamos si se ha descifrado correctamente
                in.nextLine();
                System.out.print("\n¿El texto ha sido descifrado correctamente? (S/N)");
                String res = in.nextLine();

                if (res.equalsIgnoreCase("S")) {
                    salir = true;
                }

            } while (!salir);

        } catch (FileNotFoundException e) {
            System.err.println("Error: El fichero no existe");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
