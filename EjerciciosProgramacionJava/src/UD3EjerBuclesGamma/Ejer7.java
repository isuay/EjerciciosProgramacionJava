/*
7.Escribe un programa que muestre por pantalla todas los horas, minutos y segundos 
de un día desde 0:0:0 hasta 23:59:59.
 */
package UD3EjerBuclesGamma;

public class Ejer7 {

    public static void main(String[] args) {

        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 59; j++) {
                for (int k = 0; k <= 59; k++) {
                    System.out.println(i + ":" + j + ":" + k);
                }
            }
        }
    }
}
