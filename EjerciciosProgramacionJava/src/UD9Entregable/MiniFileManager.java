package UD9Entregable;

import java.io.*;
import java.util.Arrays;

/**
 * Clase que contiene el método de cada opción de la terminal.
 *
 * @author Iris Suay
 * @version 14-03-2022
 */
public class MiniFileManager {

    private String ruta;
    private File inicio = new File("");
    private File auxiliar;

    /*public File getCurrentPath() {
        
    }*/
    /**
     * Indica la ruta en la que estás
     *
     * @return Devuelve la ruta en la que estás actualmente
     */
    public String getPDW() {
        return inicio.getAbsolutePath();
    }

    /**
     * Cambia el directorio actual al que le indiques
     *
     * @param dir Directorio al cual quieres cambiar
     * @return Devuelve true si se ha podido cambiar o false en caso contrario
     */
    public boolean changeDir(String dir) {

        if (dir.equals("..")) {

            String rutaAbsoluta = inicio.getAbsolutePath();
            ruta = rutaAbsoluta.substring(0, rutaAbsoluta.lastIndexOf("/"));
            inicio = new File(ruta);
            return true;
        } else if (dir.startsWith("/")) {

            auxiliar = new File(dir);

            if (auxiliar.exists()) {
                inicio = new File(dir);
                return true;
            } else {
                System.err.println("No existe la ruta indicada");
                return false;
            }
        } else if (!dir.startsWith("/")) {

            ruta = inicio.getAbsolutePath() + "/" + dir;
            auxiliar = new File(ruta);

            if (auxiliar.exists()) {
                inicio = new File(ruta);
                return true;
            } else {
                System.err.println("No existe la ruta indicada");
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Imprime todos los directorios y/o archivos de la carpeta actual
     *
     * @param info Valor que indica si queremos mostrar el tamaño y fecha de
     * modificación de los directorios y/o archivos
     */
    public void printList(boolean info) {

        File[] lista = inicio.listFiles();
        Arrays.sort(lista);

        if (info) {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].isDirectory()) {
                    System.out.println("[*] " + lista[i].getName() + "\tTamaño: " + lista[i].length() + "\tÚltima fecha de modificación: " + lista[i].lastModified());
                } else {
                    System.out.println("[A] " + lista[i].getName() + "\tTamaño: " + lista[i].length() + "\tÚltima fecha de modificación: " + lista[i].lastModified());
                }
            }
        } else {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].isDirectory()) {
                    System.out.println("[*] " + lista[i].getName());
                } else {
                    System.out.println("[A] " + lista[i].getName());
                }
            }
        }
    }

    public boolean mkdir(String dir) {
        ruta = inicio.getAbsolutePath() + "/" + dir;
        if (dir.startsWith("/")) {
            ruta = dir;
            String rutaAbsoluta = inicio.getAbsolutePath();
            String r = rutaAbsoluta.substring(0, ruta.lastIndexOf("/"));
            auxiliar = new File(r);
            if (auxiliar.exists()) {
                inicio = new File(ruta);
                return inicio.mkdir();
            } else {
                System.err.println("No existe la ruta indicada");
                return inicio.mkdir();
            }
        } else {
            inicio = new File(ruta);
            return inicio.mkdir();
        }
    }

    /*public boolean removeFile() {

    }
    
    public void help(){
    
    }*/
}
