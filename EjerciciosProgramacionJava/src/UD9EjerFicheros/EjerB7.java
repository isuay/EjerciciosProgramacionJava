package UD9EjerFicheros;

import java.io.*;
import java.util.*;

public class EjerB7 {

    public static void main(String[] args) {

        try {

            // Definimos la ruta del lector
            File ruta = new File("Documentos/Libros/lazarillo.txt");
            Scanner lector = new Scanner(ruta);

            // Variables
            int numLineas = 0, numPalabras = 0, numCaract = 0;

            while (lector.hasNext()) {

                // Guardamos la línea del archivo y sumamos 1 al contador
                String linea = lector.nextLine();
                numLineas++;

                // Guardamos la palabras en un vector y sumamos la cantidad al contador
                String[] palabras = linea.split(" ");
                numPalabras += palabras.length;

                // Recorremos el vector de palabras
                for (int i = 0; i < palabras.length; i++) {

                    // Guardamos los caracteres de la palabra en un vector y sumamos la cantidad al contador
                    char[] letras = palabras[i].toCharArray();
                    numCaract += letras.length;
                }
            }

            // Cerramos el lector
            lector.close();
            
            // Imprimimos los resultados
            System.out.println("Libro: " + ruta.getName() + 
                    "\nNº líneas: " + numLineas + 
                    "\nNº palabras: " + numPalabras + 
                    "\nNº caracteres: " + numCaract);

        } catch (FileNotFoundException e) {
            System.out.println("Error: El fichero no existe");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
