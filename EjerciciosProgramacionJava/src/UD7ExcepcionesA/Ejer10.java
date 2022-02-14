package UD7ExcepcionesA;

import java.util.*;

public class Ejer10 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double[] vector = new double[5];
        
        for (int i = 0; i < vector.length; i++) {
            try {
                System.out.print("Dame un valor: ");
                vector[i] = in.nextDouble();
            } catch (InputMismatchException e1) {
                System.out.println("Valor introducido incorrecto");
                in.nextLine();
            }
        }
    }
}
