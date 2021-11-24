/*
6.Escribe un programa que muestre por pantalla todas las horas y minutos de un día 
desde 0:0 hasta 23:59. Es decir: 0:0, 0:1, 0:2... 0:58, 0:59, 1:0, 1:1, 1:2... hasta 23:59.
 */
package UD3EjerBuclesGamma;

public class Ejer6 {

    public static void main(String[] args) {

        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 59; j++) {
                System.out.println(i + ":" + j);
            }
        }
    }
}
