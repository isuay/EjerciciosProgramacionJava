package UD9EjerFicheros;

import java.io.*;
import java.util.*;

public class EjerB6 {

    public static void main(String[] args) {

        // Scanner
        Scanner in = new Scanner(System.in);

        try {

            // Definimos la ruta del lector
            File doc = new File("Documentos/pi-million.txt");
            Scanner lector = new Scanner(doc);

            // Preguntamos un número
            System.out.print("Dime un número: ");
            String num = in.nextLine();

            // Guardamos los decimales del número PI
            String decimales = (lector.nextLine()).substring(2);

            // Cerramos el lector
            lector.close();

            // Variable de si se ha encontrado el número
            boolean encontrado = false;

            // Comprobamos si se encuentra el número en los decimales del número PI del archivo
            for (int i = 0; i < decimales.length() - num.length(); i++) {
                if (num.equals(decimales.substring(i, i + num.length()))) {
                    encontrado = true;
                    break;
                }
            }
            
            // Imprimimos si se ha encontrado o no
            if (encontrado) {
                System.out.println("El número " + num + " ha sido encontrado");
            } else {
                System.out.println("El número " + num + " no ha sido encontrado");
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("Error: El fichero no existe");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

    }
}
