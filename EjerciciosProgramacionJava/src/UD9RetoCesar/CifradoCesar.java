package UD9RetoCesar;

import java.io.*;
import java.util.*;

public class CifradoCesar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {

            System.out.print("Dime el archivo quieres descifrar: ");
            String archivo = in.nextLine();

            File carta = new File(archivo);

            Scanner lector = new Scanner(carta);

            System.out.print("Clave: ");
            int clave = in.nextInt();

            String linea = lector.nextLine();

            for (int i = 0; i < linea.length(); i++) {

                char c = linea.charAt(i);

                if (c >= 'A' && c <= 'Z') {

                    int letra = (int) c + clave;

                    if (letra > 'Z') {
                        int num = letra - 90;
                        letra = 64 + num;
                    }

                    c = (char) letra;
                }
                System.out.print(c);
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: El fichero no existe");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
