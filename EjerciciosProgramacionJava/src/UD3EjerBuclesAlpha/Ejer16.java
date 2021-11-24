package UD3EjerBuclesAlpha;

/*
16. Escribe un programa que pida 5 números al usuario y luego muestre por pantalla
cuántos eran positivos y cuántos negativos.
 */
import java.util.Scanner;

public class Ejer16 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double a;
        int contador = 1, pos = 0, neg = 0;

        System.out.println("Dime cinco precios");

        for (; contador <= 5; contador++) {
            System.out.print("Precio: ");
            a = in.nextDouble();
            if (a >= 0) {
                pos += 1;
            }
            if (a < 0) {
                neg += 1;
            }
        }

        System.out.println("Hay " + pos + " positivos, y " + neg + " negativos");
    }
}
