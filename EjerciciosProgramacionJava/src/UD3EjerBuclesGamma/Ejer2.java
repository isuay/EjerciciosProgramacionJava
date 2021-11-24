/*
2.Escribe un programa que muestre por pantalla 9 líneas de texto con 10 números cada
una. La primera línea tendrá el 1 diez veces, la siguiente el 2 diez veces, la siguiente 
el 3 diez veces... hasta la última línea que tendrá el 9 diez veces.
1111111111
2222222222
3333333333
4444444444
5555555555
6666666666
7777777777
8888888888
9999999999
 */

package UD3EjerBuclesGamma;

public class Ejer2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i);
            }
            
            System.out.println(" ");
        }
    }
}
           