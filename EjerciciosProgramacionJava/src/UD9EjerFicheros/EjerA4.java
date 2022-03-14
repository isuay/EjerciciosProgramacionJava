package UD9EjerFicheros;

import java.io.*;

public class EjerA4 {

    public static void main(String[] args) {

        File misCosas = new File("/datos/usuarios/alumnos/a023850774g/UD9/Documentos/MisCosas");
        File alfabeto = new File("/datos/usuarios/alumnos/a023850774g/UD9/Documentos/Alfabeto");

        boolean mkdirMisCosas = misCosas.mkdir();
        boolean mkdirAlfabeto = alfabeto.mkdir();

        File fotos = new File("/datos/usuarios/alumnos/a023850774g/UD9/Documentos/Fotografias");
        File libros = new File("/datos/usuarios/alumnos/a023850774g/UD9/Documentos/Libros");

        fotos.renameTo(misCosas);
        libros.renameTo(misCosas);
        
        File mkdirLetras = alfabeto;
        File[] listaLetras = mkdirLetras.listFiles();
        
        /*for (int i = 65; i < 90; i++) {
            File f = listaLetras[i];
            //f.renameTo(i);
        }*/

    }

}
