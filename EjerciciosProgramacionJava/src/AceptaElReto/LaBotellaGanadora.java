package AceptaElReto;

import java.util.Scanner;

public class LaBotellaGanadora {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int num, suma = 0, cont = 1, p = 0;

            while ((num = in.nextInt()) != 0) {
                suma += num;
                if (suma >= a * 8) {
                    p = cont;
                    cont--;
                }
                cont++;
            }
            if (p > 0) {
                System.out.println(p);
            }
            if (suma < a * 8) {
                System.out.println("SIGAMOS RECICLANDO");
            }
        }
    }
}
