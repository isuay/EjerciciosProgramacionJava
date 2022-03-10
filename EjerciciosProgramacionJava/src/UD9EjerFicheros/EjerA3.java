package UD9EjerFicheros;

import java.io.*;

public class EjerA3 {

    public static void main(String[] args) {

        File origenDoc = new File("/datos/usuarios/alumnos/a023850774g/UD9/Documentos");
        File destinoDoc = new File("/datos/usuarios/alumnos/a023850774g/UD9/DOCS");

        File origenFot = new File("/datos/usuarios/alumnos/a023850774g/UD9/Documentos/Fotografias");
        File destinoFot = new File("/datos/usuarios/alumnos/a023850774g/UD9/Documentos/FOTOS");

        File origenLib = new File("/datos/usuarios/alumnos/a023850774g/UD9/Documentos/Libros");
        File destinoLib = new File("/datos/usuarios/alumnos/a023850774g/UD9/Documentos/LECTURAS");

        File[] listaFotos = origenFot.listFiles();
        File[] listaLibros = origenLib.listFiles();

        for (int i = 0; i < listaFotos.length; i++) {
            File f = listaFotos[i];
            String nombre = f.getName();
            String nombreFinal = nombre.substring(0, nombre.lastIndexOf('.'));
            File file = new File(nombreFinal);
            f.renameTo(file);
        }

        for (int i = 0; i < listaLibros.length; i++) {
            File f = listaLibros[i];
            String nombre = f.getName();
            String nombreFinal = nombre.substring(0, nombre.lastIndexOf('.'));
            File file = new File(nombreFinal);
            f.renameTo(file);
        }

        /*boolean res = origenFot.renameTo(destinoFot);
        System.out.println("Se ha renombrado la carpeta? " + res);
        res = origenLib.renameTo(destinoLib);
        System.out.println("Se ha renombrado la carpeta? " + res);
        res = origenDoc.renameTo(destinoDoc);
        System.out.println("Se ha renombrado la carpeta? " + res);*/

    }

}
