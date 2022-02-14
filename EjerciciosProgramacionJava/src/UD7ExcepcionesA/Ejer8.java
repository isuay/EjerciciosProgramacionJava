package UD7ExcepcionesA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer8 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        boolean correcto = false;
        int valor = 0;
        
        do {
            try {
                System.out.print("Dame un valor: ");
                valor = in.nextInt();
                correcto = true;
            } catch (InputMismatchException e) {
                System.err.println("Valor introducido incorrecto");
                in.nextLine();
            }
        } while (!correcto);
        System.out.println("Valor introducido: " + valor);
    }
}
