package UD9EjerFicheros;

import java.io.*;
import java.util.*;

public class EjerA2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String miRuta = " ";

        do {
            try {
                System.out.print("\nDime la ruta: ");
                miRuta = in.nextLine();

                System.out.print("¿Quieres mostrar el tamaño de sus directorios y/o archivos? (true/false) ");
                boolean tamanyo = in.nextBoolean();
                in.nextLine();

                File ruta = new File(miRuta);

                muestraInfoRuta(ruta, tamanyo);

            } catch (FileNotFoundException e) {
                System.err.println(e.getMessage());
            }
        } while (!miRuta.equals(""));
    }

    public static void muestraInfoRuta(File ruta, boolean info) throws FileNotFoundException {
        if (ruta.isFile()) {
            if (info) {
                System.out.println("[A] " + ruta.getName() + "\tTamaño (bytes): " + ruta.length());
            } else {
                System.out.println("[A] " + ruta.getName());
            }
        } else if (ruta.isDirectory()) {
            File[] lista = ruta.listFiles();
            Arrays.sort(lista);
            for (int i = 0; i < lista.length; i++) {
                File f = lista[i];
                if (f.isDirectory()) {
                    if (info) {
                        System.out.println("[A] " + f.getName() + "\tTamaño (bytes): " + f.length());
                    } else {
                        System.out.println("[*] " + f.getName());
                    }
                }
            }
            for (int i = 0; i < lista.length; i++) {
                File f = lista[i];
                if (f.isFile()) {
                    if (info) {
                        System.out.println("[A] " + f.getName() + "\tTamaño (bytes): " + f.length());
                    } else {
                        System.out.println("[A] " + f.getName());
                    }
                }
            }
        } else {
            throw new FileNotFoundException("No existe la ruta");
        }

    }

}
