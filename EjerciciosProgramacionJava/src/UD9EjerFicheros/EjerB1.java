package UD9EjerFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjerB1 {

    public static void main(String[] args) {

        // Variables
        int num, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        try {
            // Definimos el archivo que se va a leer
            File f = new File("Documentos/numeros.txt");
            Scanner lector = new Scanner(f);

            // Leemos todo el archivo
            while (lector.hasNext()) {
                num = lector.nextInt();

                // Si el número es mayor que el anterior se guarda
                if (num > max) {
                    max = num;
                }

                // Si el número es menor que el anterior se guarda
                if (num < min) {
                    min = num;
                }
            }
            
            // Cerramos el lector
            lector.close();

            // Imprimimos los números máximo y mínimo
            System.out.println("El valor máximo es: " + max);
            System.out.println("El valor mínimo es: " + min);

        } catch (FileNotFoundException e) {
            System.err.println("Error: El fichero no existe");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

    }

}
