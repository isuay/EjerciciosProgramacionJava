package UD9EjerFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjerB2 {

    public static void main(String[] args) {

        String linea, nombre, apellido;
        int nota;
        
        try {
            File f = new File("Documentos/alumnos_notas.txt");
            Scanner lector = new Scanner(f);

            while (lector.hasNext()) {
                
                int cont = 0;
                double media = 0;
                
                linea = lector.nextLine();
                
                String[] l = linea.split(" ");
                
                nombre = l[0];
                apellido = l[1];
                
                for (int i = 2; i < l.length; i++) {
                    nota = Integer.parseInt(l[i]);
                    media += nota;
                    cont++;
                }
                
                System.out.println(nombre + " " + apellido + "\nNota media: " + (media/cont) + "\n");
            }
            
            lector.close();
            
        } catch (FileNotFoundException e) {
            System.err.println("Error: El fichero no existe");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

    }
}
