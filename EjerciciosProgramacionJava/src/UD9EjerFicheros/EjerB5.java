package UD9EjerFicheros;

import java.io.*;
import java.util.*;

public class EjerB5 {

    public static void main(String[] args) {

        // Definimos la ruta de la carpeta que vamos a crear
        File dir = new File("Documentos/Diccionario");

        // Si se puede crear
        if (dir.mkdir()) {
            try {

                // Definimos la ruta del lector
                File diccionario = new File("Documentos/diccionario.txt");
                Scanner dic = new Scanner(diccionario);

                // Creamos un ArrayList para guardar las palabras del diccionario
                ArrayList<String> palabras = new ArrayList();

                // Añadimos todas las palabras al ArrayList
                while (dic.hasNext()) {
                    palabras.add(dic.nextLine());
                }

                // Cerramos el lector
                dic.close();
                
                for (int i = 65; i <= 90; i++) {

                    // Definimos la ruta donde vamos a escribir
                    FileWriter escritor = new FileWriter(new File(dir.getParent() + "/" + dir.getName() + "/" + (char) i + ".txt"));

                    // Escribimos las palabras que empiezan por esa letra
                    for (int j = 0; j < palabras.size(); j++) {
                        if (palabras.get(i).toUpperCase().startsWith(Character.toString((char) i))) {
                            escritor.write(palabras.get(i) + "\n");
                        }
                    }
                    /*for (String palabra : palabras) {
                        if (palabra.toUpperCase().startsWith(Character.toString((char) i))) {
                            escritor.write(palabra + "\n");
                        }
                    }*/
                    // Cerramos el escritor
                    escritor.close();
                }

            } catch (FileNotFoundException e) {
                System.err.println("Error: El fichero no existe");
            } catch (IOException e) {
                System.err.println("Error: " + e);
            } catch (Exception e) {
                System.err.println("Error: " + e);
            }
        } else {
            // Si no se puede crear mostramos mensaje
            System.out.println("La carpeta " + dir.getName() + " no se ha podido crear");
        }

    }

}
