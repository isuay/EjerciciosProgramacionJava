/*
3.Escribe un programa que muestre por pantalla 9 líneas de texto de modo que en la 
línea N aparezca N veces el número N.
1
22
333
4444
55555
666666
7777777
88888888
999999999
 */
package UD3EjerBuclesGamma;

public class Ejer3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println(" ");
        }
    }
}
