package UD7ExcepcionesA;

import java.util.*;

public class Ejer11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = (int) (Math.random() * (100 - 1) + 1);
        int[] vector = new int[t];
        int num = 0;

        for (int i = 0; i < vector.length; i++) {
            int n = (int) (Math.random() * (10 - 1) + 1);
            vector[i] = n;
        }

        do {
            try {
                System.out.print("Dime una posición del vector: ");
                num = in.nextInt();
                System.out.println("Número: " + vector[num]);
            } catch (InputMismatchException e1) {
                System.out.println("Valor introducido incorrecto");
                in.nextLine();
            } catch (IndexOutOfBoundsException e2) {
                System.out.println("Valor fuera de rango");
                in.nextLine();
            }
        } while (num >= 0);
    }
}
