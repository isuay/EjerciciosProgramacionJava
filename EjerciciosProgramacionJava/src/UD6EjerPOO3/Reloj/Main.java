package UD6EjerPOO3.Reloj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner
        Scanner in = new Scanner(System.in);

        Reloj[] relojes = new Reloj[5];

        relojes[0] = new Reloj(23, 0, 56);
        relojes[1] = new Reloj(16, 20, 39);
        relojes[2] = new Reloj(3, 37, 12);
        relojes[3] = new Reloj(9, 48, 02);
        relojes[4] = new Reloj(12, 58, 47);

        System.out.println("1 tick en cada reloj\n");

        for (int i = 0; i < relojes.length; i++) {
            relojes[i].imprimeHora();
            relojes[i].tick();
            relojes[i].imprimeHora();
            System.out.println("-----------");
        }

        System.out.println("\n60 ticks en cada reloj\n");

        for (int i = 0; i < relojes.length; i++) {
            relojes[i].imprimeHora();
            for (int j = 0; j < 60; j++) {
                relojes[i].tick();
            }
            relojes[i].imprimeHora();
            System.out.println("-----------");
        }

        System.out.println("\nPasar 1 hora\n");

        for (int i = 0; i < relojes.length; i++) {
            for (int j = 0; j < 3600; j++) {
                relojes[i].tick();
            }
            relojes[i].imprimeHora();
            System.out.println("-----------");
        }

        System.out.println("Pasar x segundos");

        System.out.print("Segundos: ");
        int s = in.nextInt();
        for (int i = 0; i < relojes.length; i++) {
            relojes[i].tick(s);
            relojes[i].imprimeHora();
            System.out.println("-----------");
        }
    }
}
