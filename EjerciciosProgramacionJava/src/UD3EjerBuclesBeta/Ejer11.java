/*
11. Escribe un programa que dada una cantidad de euros que el usuario introduce por 
teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para 
alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que 
indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el 
programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete 
de 5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el 
mínimo número de billetes posible
 */
package UD3EjerBuclesBeta;

import java.util.Scanner;

public class Ejer11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x, b500 = 0, b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0;

        System.out.print("Dime un número (múltiplo de 5): ");
        x = in.nextInt();

        while (x > 0) {
            if (x >= 500) {
                b500 += 1;
                x -= 500;
            } else if (x >= 200) {
                b200 += 1;
                x -= 200;
            } else if (x >= 100) {
                b100 += 1;
                x -= 100;
            } else if (x >= 50) {
                b50 += 1;
                x -= 50;
            } else if (x >= 20) {
                b20 += 1;
                x -= 20;
            } else if (x >= 10) {
                b10 += 1;
                x -= 10;
            } else if (x >= 5) {
                b5 += 1;
                x -= 5;
            }
        }

        System.out.println("Billetes necesarios: " + b500 + " de 500€, " + b200 + " de 200€, " + b100 + " de 100€, " + b50 + " de 50€, " + b20 + " de 20€, " + b10 + " de 10€, " + b5 + " de 5€");
    }
}
