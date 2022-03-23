package UD9EjerFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjerB2 {

    public static void main(String[] args) {

        // Variables
        String linea, nombre, apellido;
        int nota;
        
        try {
            // Definimos el archivo que se va a leer
            File f = new File("Documentos/alumnos_notas.txt");
            Scanner lector = new Scanner(f);

            // Leemos todo el archivo
            while (lector.hasNext()) {
                
                // Variables
                int cont = 0;
                double media = 0;
                
                // Guardamos la línea que se ha leído en la variable
                linea = lector.nextLine();
                
                // Guardamos cada palabra de la línea en el vector
                String[] l = linea.split(" ");
                
                // Guardamos el nombre y apellido en las variables
                nombre = l[0];
                apellido = l[1];
                
                // Calculamos la suma de las notas de la persona
                for (int i = 2; i < l.length; i++) {
                    nota = Integer.parseInt(l[i]);
                    media += nota;
                    cont++;
                }
                
                // Imprimos el nombre y su media
                System.out.println(nombre + " " + apellido + "\nNota media: " + (media/cont) + "\n");
            }
            
            // Cerramos el lector
            lector.close();
            
        } catch (FileNotFoundException e) {
            System.err.println("Error: El fichero no existe");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

    }
}
