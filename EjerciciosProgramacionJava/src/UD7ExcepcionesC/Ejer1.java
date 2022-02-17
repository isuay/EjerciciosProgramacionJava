package UD7ExcepcionesC;

import java.util.*;

public class Ejer1 {

    public static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("ERROR: el número debe ser mayor o igual a 0");
        }
        System.out.println("Número: " + p);
    }

    public static void imprimeNegativo(int n) throws Exception {
        if (n >= 0) {
            throw new Exception("ERROR: el número debe ser menor a 0");
        }
        System.out.println("Número: " + n);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int veces = 0;

        System.out.println("------------ Números positivos ------------");
        do {
            try {
                System.out.print("Dime un numero: ");
                int num = in.nextInt();
                imprimePositivo(num);
                veces++;
            } catch (InputMismatchException e) {
                System.err.println("Valor introducido incorrecto");
                in.nextLine();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        } while (veces < 5);
        
        veces = 0;
        System.out.println("------------ Números negativos ------------");
        do {
            try {
                System.out.print("Dime un numero: ");
                int num = in.nextInt();
                System.err.println("Valor introducido incorrecto");
                veces++;
            } catch (InputMismatchException e) {
                System.err.println("Valor introducido incorrecto");
                in.nextLine();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        } while (veces < 5);
    }
}
