package UD6ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> notas = new ArrayList();

        int nota, aprobado = 0, suspendido = 0;
        double notaMedia = 0.0;
        boolean cero = false;
        boolean diez = false;

        do {
            System.out.print("Dime una nota: ");
            nota = in.nextInt();

            if (nota >= 0 && nota <= 10) {
                notas.add(nota);
                notaMedia += nota;
                
                if (nota < 5) {
                    suspendido++;
                } else {
                    aprobado++;
                }

                if (nota == 0) {
                    cero = true;
                } else if (nota == 10) {
                    diez = true;
                }
            }
        } while (nota != -1);

        notaMedia /= notas.size();

        System.out.println(notas);
        System.out.println("Aprobados: " + aprobado + "\n"
                + "Suspendidos: " + suspendido + "\n"
                + "Hay algun cero: " + cero + "\n"
                + "Hay algun diez: " + diez + "\n"
                + "Nota media: " + notaMedia);
    }

}
