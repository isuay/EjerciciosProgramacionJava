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
     * Indica la ruta en la que estás.
     *
     * @return Devuelve la ruta en la que estás actualmente.
     */
    public String getPDW() {
        return inicio.getAbsolutePath();
    }

    /**
     * Cambia el directorio actual al dir.
     *
     * @param dir Ruta o directorio al cual quieres cambiar.
     * @return Devuelve true si se ha podido cambiar o false en caso contrario.
     */
    public boolean changeDir(String dir) {
        if (dir.equals("..")) {
            ruta = inicio.getParent();
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
     * Imprime todos los directorios y/o archivos de la carpeta actual.
     *
     * @param info Valor que indica si queremos mostrar el tamaño y fecha de
     * modificación de los directorios y/o archivos.
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

    /**
     * Crea el directorio dir.
     *
     * @param dir Directorio que quieres crear.
     * @return Devuelve true si se ha podido crear o false en caso contrario.
     */
    public boolean mkdir(String dir) {
        ruta = inicio.getAbsolutePath() + "/" + dir;
        if (dir.startsWith("/")) {
            //ruta = dir;
            //String rutaAbsoluta = inicio.getAbsolutePath();
            //String r = rutaAbsoluta.substring(0, ruta.lastIndexOf("/"));
            //auxiliar = new File(r);
            auxiliar = new File(dir);
            String r = auxiliar.getParent();
            ruta = auxiliar.getName();
            auxiliar = new File(r);
            if (auxiliar.exists()) {
                inicio = new File(dir);
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

    /**
     * Elimina un archivo o directorio.
     *
     * @param nombre Nombre del archivo o directorio.
     * @return Devuelve true si se ha podido eliminar o false en caso contrario
     */
    public boolean removeFile(String nombre) {
        ruta = inicio.getAbsolutePath() + "/" + nombre;
        if (nombre.startsWith("/")) {
            ruta = nombre;
            System.out.println(ruta);
            String r = ruta.substring(ruta.length(), ruta.lastIndexOf("/"));
            System.out.println(r);
            /*auxiliar = new File(r);
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
        }*/
        }
        return true;
        /*public void help(){
    
    }*/
    }
}
