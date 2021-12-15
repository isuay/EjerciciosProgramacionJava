package AceptaElReto;

import java.util.Scanner;

public class PerimetroDeUnRectangulo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        while (a >= 0 && b >= 0) {

            int p = 2 * (a + b);
            System.out.println(p);

            a = in.nextInt();
            b = in.nextInt();
        }
    }
}
