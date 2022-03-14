package UD9Entregable;

import java.util.Scanner;

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
                    break;
                case "mv":
                    break;
                case "help":
                    break;
                case "exit":
                    exit = true;
                    break;
            }
        } while (!exit);

    }
}
