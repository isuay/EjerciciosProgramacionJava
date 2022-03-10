package UD9EjerFicheros;

import java.io.*;
import java.util.*;

public class EjerA1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String miRuta = " ";

        do {
            try {
                System.out.print("\nDime la ruta: ");
                miRuta = in.nextLine();

                File ruta = new File(miRuta);

                muestraInfoRuta(ruta);

            } catch (FileNotFoundException e) {
                System.err.println(e.getMessage());
            }
        } while (!miRuta.equals(""));
    }

    public static void muestraInfoRuta(File ruta) throws FileNotFoundException {
        if (ruta.isFile()) {
            System.out.println("[A] " + ruta.getName());
        } else if (ruta.isDirectory()) {
            File[] lista = ruta.listFiles();
            for (int i = 0; i < lista.length; i++) {
                File f = lista[i];
                if (f.isDirectory()) {
                    System.out.println("[*] " + f.getName());
                }
            }
            for (int i = 0; i < lista.length; i++) {
                File f = lista[i];
                if (true) {
                    System.out.println("[A] " + f.getName());
                }
            }
        } else {
            throw new FileNotFoundException("No existe la ruta");
        }
    }

}
