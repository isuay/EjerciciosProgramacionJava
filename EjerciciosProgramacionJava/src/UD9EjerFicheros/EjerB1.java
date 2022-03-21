package UD9EjerFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjerB1 {

    public static void main(String[] args) {

        int num, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        try {
            File f = new File("Documentos/numeros.txt");
            Scanner lector = new Scanner(f);

            while (lector.hasNext()) {
                num = lector.nextInt();

                if (num > max) {
                    max = num;
                }

                if (num < min) {
                    min = num;
                }
            }
            
            lector.close();

            System.out.println("El valor máximo es: " + max);
            System.out.println("El valor mínimo es: " + min);

        } catch (FileNotFoundException e) {
            System.err.println("Error: El fichero no existe");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

    }

}
