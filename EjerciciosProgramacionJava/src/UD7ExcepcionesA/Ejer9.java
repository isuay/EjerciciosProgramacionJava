package UD7ExcepcionesA;

import java.util.*;

public class Ejer9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Dame un valor A:");
            int a = in.nextInt();
            System.out.println("Dame un valor B:");
            int b = in.nextInt();
            int res = a/b;
            System.out.println("Resultado: " + res);
        } catch (InputMismatchException e1) {
            System.out.println("Valor introducido incorrecto");
        } catch (ArithmeticException e2) {
            System.out.println("ERROR: Division por cero");
        }
    }
}
