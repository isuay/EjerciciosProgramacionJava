package UD9Entregable;

import java.util.Scanner;

/**
 * Clase que interactúa con el usuario y utiliza los métodos de la clase MiniFileManager.
 *
 * @author iris
 * @version 17-03-2022
 */
public class MiniTerminal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean exit = false;
        String[] opcion;
        MiniFileManager terminal = new MiniFileManager();

        do {
            System.out.print("user@equipo: ");
            String res = in.nextLine();

            opcion = res.split(" ");

            switch (opcion[0]) {
                case "pwd":
                    System.out.println(terminal.getPDW());
                    break;
                case "cd":
                    try {
                    terminal.changeDir(opcion[1]);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                break;
                case "ls":
                    terminal.printList(false);
                    break;
                case "ll":
                    terminal.printList(true);
                    break;
                case "mkdir":
                    terminal.mkdir(opcion[1]);
                    break;
                case "rm":
                    terminal.removeFile(opcion[1]);
                    break;
                case "mv":
                    if (!terminal.mvFile(opcion[1], opcion[2])) {
                        System.err.println("No existe la ruta o carpeta especificada");
                    }
                    break;
                case "help":
                    terminal.help();
                    break;
                case "exit":
                    exit = true;
                    break;
            }
        } while (!exit);

    }
}
