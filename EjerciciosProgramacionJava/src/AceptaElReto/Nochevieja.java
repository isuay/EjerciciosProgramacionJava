package AceptaElReto;

import java.util.Scanner;

public class Nochevieja {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String a = in.next();
        String[] t = a.split(":");

        String hora = t[0];
        String min = t[1];

        int h = Integer.parseInt(hora);
        int m = Integer.parseInt(min);

        while (h != 0 || m != 0) {
            int x = 0, z = 0;
            if (h == 0) {
                x = (23 - h) * 60;
            } else if (h < 23 || m == 0) {
                x = (23 - h) * 60;
            } else if (h < 23) {
                x = (24 - h) * 60;
            } else if (h == 23 && m == 0) {
                x = (24 - h) * 60;
            }
            if (m != 0) {
                z = 60 - m;
            }
            int res = x + z;
            System.out.println(res);

            a = in.next();
            t = a.split(":");

            hora = t[0];
            min = t[1];

            h = Integer.parseInt(hora);
            m = Integer.parseInt(min);
        }
    }
}
