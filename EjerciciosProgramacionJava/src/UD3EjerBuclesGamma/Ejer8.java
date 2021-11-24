/*
8.Escribe un programa que muestre todas las fechas de un año en formato numérico. 
Es decir, empezará en 1/1 y acabará en 31/12. Recuerda que hay meses de 30 días, 
meses de 31 días y febrero tiene 28 días (supondremos que no hay años bisiestos).
 */
package UD3EjerBuclesGamma;

public class Ejer8 {

    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                for (int j = 1; j <= 31; j++) {
                    System.out.println(j + "/" + i);
                }
            } 
            else if (i == 4 || i == 6 || i == 9 || i == 11) {
                for (int j = 1; j <= 30; j++) {
                    System.out.println(j + "/" + i);
                }
            } 
            else if (i == 2) {
                for (int j = 1; j <= 28; j++) {
                    System.out.println(j + "/" + i);
                }
            }
        }
    }
}
