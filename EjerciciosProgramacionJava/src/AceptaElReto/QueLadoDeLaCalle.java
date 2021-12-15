package AceptaElReto;

import java.util.Scanner;

public class QueLadoDeLaCalle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a;

        while ((a = in.nextInt()) != 0) {
            if (a % 2 == 0) {
                System.out.println("DERECHA");
            } else {
                System.out.println("IZQUIERDA");
            }
        }
    }
}