package UD9EjerFicheros;

import java.io.*;
import java.util.*;

public class EjerB4 {

    public static void main(String[] args) {

        // Scanner
        Scanner in = new Scanner(System.in);

        try {
            // Pedimos el número de nombres a generar
            System.out.print("¿Cúantos nombres quieres generar? ");
            int num = in.nextInt();

            in.nextLine();

            // Preguntamos donde lo queremos guardar
            System.out.print("¿En que archivo quieres guardarlos? ");
            String archivo = in.nextLine();

            // Definimos la ruta de los nombres y apellidos
            File nombres = new File("Documentos/usa_nombres.txt");
            File apellidos = new File("Documentos/usa_apellidos.txt");

            // Definimos la ruta del lector y del escritor
            Scanner lectorN = new Scanner(nombres);
            Scanner lectorA = new Scanner(apellidos);

            FileWriter escritor = new FileWriter(archivo);

            // Creamos los ArrayList para guardar los nombres y apellidos
            ArrayList<String> ArrayNomb = new ArrayList();
            ArrayList<String> ArrayApell = new ArrayList();

            // Añadimos a los ArrayList todos los nombres y apellidos
            while (lectorN.hasNext()) {
                ArrayNomb.add(lectorN.nextLine());
            }

            while (lectorA.hasNext()) {
                ArrayApell.add(lectorA.nextLine());
            }

            // Escribimos la cantidad de nombres y apellidos aleatorios que nos ha pedido el usuario
            for (int i = 0; i < num; i++) {
                int randN = (int) (Math.random() * (ArrayNomb.size() - 0 + 1) + 0);
                int randA = (int) (Math.random() * (ArrayApell.size() - 0 + 1) + 0);

                escritor.write(ArrayNomb.get(randN) + " " + ArrayApell.get(randA) + "\n");
            }

            // Cerramos los lectores y escritor
            lectorN.close();
            lectorA.close();
            escritor.close();

        } catch (FileNotFoundException e) {
            System.err.println("Error: El fichero no existe");
        } catch (IOException e) {
            System.err.println("Error: " + e);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

    }

}
