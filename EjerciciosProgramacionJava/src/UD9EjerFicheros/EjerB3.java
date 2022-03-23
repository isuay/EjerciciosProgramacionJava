package UD9EjerFicheros;

import java.io.*;
import java.util.*;

public class EjerB3 {

    public static void main(String[] args) {

        // Scanner
        Scanner in = new Scanner(System.in);

        try {
            // Pedimos los archivos
            System.out.print("Nombre del archivo a leer: ");
            String origen = in.nextLine();
            System.out.print("Nombre del archivo a escribir: ");
            String destino = in.nextLine();

            // Guardamos la ruta de esos archivos
            File fOrigen = new File("Documentos/" + origen);
            File fDestino = new File("Documentos/" + destino);

            // Comprobamos que el archivo que vamos a leer exista
            if (!fOrigen.exists()) {
                throw new FileNotFoundException();
            }

            // Definimos la ruta del lector y del escritor
            Scanner lector = new Scanner(fOrigen);
            FileWriter escritor = new FileWriter(fDestino);

            // Creamos un ArrayList para guardar los nombres
            ArrayList<String> nombres = new ArrayList();

            // Añadimos todos los nombres al ArrayList
            while (lector.hasNext()) {
                nombres.add(lector.nextLine());
            }

            // Ordenamos los nombres por orden alfábetico
            Collections.sort(nombres);

            // Escribimos cada nombre en el archivo
            for (int i = 0; i < nombres.size(); i++) {
                escritor.write(nombres.get(i) + "\n");
            }
            /*for (String nom : nombres) {
                escritor.write(nom + "\n");
            }*/

            // Cerramos el lector y escritor
            lector.close();
            escritor.close();

            // Imprimos que el fichero se ha creado correctamente
            System.out.println("El fichero " + fDestino.getName() + " ha sido creado correctamente");

        } catch (FileNotFoundException e) {
            System.err.println("Error: El fichero no existe");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

    }

}
