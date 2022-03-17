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

    /**
     * Muestra cual es la carpeta actual.
     *
     * @return Devuelve la ruta en la que estás actualmente.
     */
    public String getPDW() {
        return inicio.getAbsolutePath();
    }

    /**
     * Cambia el directorio actual a 'dir'.
     *
     * @param dir Ruta o directorio al cual quieres cambiar.
     * @return Devuelve true si se ha podido cambiar o false en caso contrario.
     */
    public boolean changeDir(String dir) {
        String rutaAbsoluta = inicio.getAbsolutePath();
        if (dir.equals("..")) {
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
     * Imprime todos los directorios y/o archivos de la carpeta actual.
     *
     * @param info Indica si queremos mostrar el tamaño y fecha de modificación
     * de los directorios y/o archivos.
     */
    public void printList(boolean info) {

        if (inicio.isFile()) {
            if (info) {
                System.out.println("[A] " + inicio.getName() + "\tTamaño (bytes): " + inicio.length() + "\tÚltima fecha de modificación: " + inicio.lastModified());
            } else {
                System.out.println("[A] " + inicio.getName());
            }
        } else {
            inicio = new File(getPDW());
            File[] lista = inicio.listFiles();
            Arrays.sort(lista);
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].isDirectory()) {
                    if (info) {
                        System.out.println("[A] " + lista[i].getName() + "\tTamaño (bytes): " + lista[i].length() + "\tÚltima fecha de modificación: " + lista[i].lastModified());
                    } else {
                        System.out.println("[*] " + lista[i].getName());
                    }
                }
            }
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].isFile()) {
                    if (info) {
                        System.out.println("[A] " + lista[i].getName() + "\tTamaño (bytes): " + lista[i].length() + "\tÚltima fecha de modificación: " + lista[i].lastModified());
                    } else {
                        System.out.println("[A] " + lista[i].getName());
                    }
                }
            }
        }
    }

    /**
     * Crea el directorio 'dir'.
     *
     * @param dir Directorio que quieres crear.
     * @return Devuelve true si se ha podido crear o false en caso contrario.
     */
    public boolean mkdir(String dir) {
        ruta = inicio.getAbsolutePath() + "/" + dir;
        if (dir.startsWith("/")) {
            auxiliar = new File(dir);
            String r = auxiliar.getParent();
            ruta = auxiliar.getName();
            auxiliar = new File(r);
            if (auxiliar.exists()) {
                auxiliar = new File(dir);
                return auxiliar.mkdir();
            } else {
                System.err.println("No existe la ruta indicada");
                return auxiliar.mkdir();
            }
        } else {
            auxiliar = new File(ruta);
            return auxiliar.mkdir();
        }
    }

    /**
     * Elimina un archivo o directorio.
     *
     * @param dir Nombre del archivo o directorio.
     * @return Devuelve true si se ha podido eliminar o false en caso contrario
     */
    public boolean removeFile(String dir) {
        ruta = inicio.getAbsolutePath() + "/" + dir;
        if (dir.startsWith("/")) {
            auxiliar = new File(dir);
            String r = auxiliar.getParent();
            ruta = auxiliar.getName();
            auxiliar = new File(r);
            if (auxiliar.exists()) {
                auxiliar = new File(dir);
                if (auxiliar.isDirectory()) {
                    File[] lista = auxiliar.listFiles();
                    for (int i = 0; i < lista.length; i++) {
                        if (lista[i].isFile()) {
                            lista[i].delete();
                        } else {
                            System.err.println("No se puede borrar la subcarpeta");
                        }
                    }
                }
            } else {
                System.err.println("No existe la ruta indicada");
            }
            return auxiliar.delete();
        } else {
            auxiliar = new File(ruta);
            if (auxiliar.isDirectory()) {
                File[] lista = auxiliar.listFiles();
                for (int i = 0; i < lista.length; i++) {
                    if (lista[i].isFile()) {
                        lista[i].delete();
                    } else {
                        System.err.println("No se puede borrar la subcarpeta");
                    }
                }
            }
            return auxiliar.delete();
        }
    }

    /**
     * Mueve o renombra 'origen' a 'destino'.
     *
     * @param origen Carpeta o archivo que quieres mover o renombrar.
     * @param destino Ruta o nombre al que quieres mover o renombrarlo.
     * @return Devuelve true si se ha podidio mover o renombrar o false en caso
     * contrario.
     */
    public boolean mvFile(String origen, String destino) {

        auxiliar = new File(origen);
        File auxiliar2 = new File(destino);

        if (origen.startsWith("/") && destino.startsWith("/")) {
            return auxiliar.renameTo(auxiliar2);
        } else if (origen.startsWith("/") && !destino.startsWith("/")) {
            auxiliar2 = new File(getPDW() + "/" + destino);
            return auxiliar.renameTo(auxiliar2);
        } else if (!origen.startsWith("/") && destino.startsWith("/")) {
            auxiliar = new File(getPDW() + "/" + origen);
            return auxiliar.renameTo(auxiliar2);
        } else {
            auxiliar = new File(getPDW() + "/" + origen);
            auxiliar2 = new File(getPDW() + "/" + destino);
            return auxiliar.renameTo(auxiliar2);
        }
    }

    /**
     * Muestra al usuario una breve ayuda con los comandos disponibles.
     */
    public void help() {
        System.out.println("pwd​: Muestra cual es la carpeta actual.\n"
                + "cd <DIR>​: Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior.\n"
                + "ls​: Muestra la lista de directorios y archivos de la carpeta actual (primero directorios, luego archivos, ambos ordenados alfabéticamente).\n"
                + "ll​: Como ls pero muestra también el tamaño y la fecha de última modificación.\n"
                + "mkdir <DIR>​: Crea el directorio ‘DIR’ en la carpeta actual.\n"
                + "rm <FILE>​: Borra ‘FILE’. Si es una carpeta, borrará primero sus archivos y luego la carpeta. Si tiene subcarpetas, las dejará intactas y mostrará un aviso al usuario.\n"
                + "mv <FILE1> <FILE2>​: Mueve o renombra ‘FILE1’ a ‘FILE2’.\n"
                + "help​: Muestra una breve ayuda con los comandos disponibles.\n"
                + "exit​: Termina el programa.");
    }
}
