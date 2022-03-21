package UD9EjerFicheros;

import java.io.*;
import java.util.*;

public class EjerB3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Nombre del archivo a leer: ");
            String origen = in.nextLine();
            System.out.print("Nombre del archivo a escribir: ");
            String destino = in.nextLine();

            File fOrigen = new File("Documentos/" + origen);
            File fDestino = new File("Documentos/" + destino);

            if (!fOrigen.exists()) {
                throw new FileNotFoundException();
            }

            Scanner reader = new Scanner(fOrigen);
            FileWriter writer = new FileWriter(fDestino);

            ArrayList<String> nombres = new ArrayList();
            while (reader.hasNext()) {
                nombres.add(reader.nextLine());
            }

            Collections.sort(nombres);
            for (String nom : nombres) {
                writer.write(nom + "\n");
            }
            
            reader.close();
            writer.close();
            
            System.out.println("El fichero " + fDestino.getName() + " ha sido creado correctamente");

        } catch (FileNotFoundException e) {
            System.err.println("Error: El fichero no existe");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

    }

}
