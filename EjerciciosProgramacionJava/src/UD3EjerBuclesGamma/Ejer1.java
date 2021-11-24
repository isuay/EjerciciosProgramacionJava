/*
1.Escribe un programa que muestre por pantalla 9 líneas de texto con 10 números cada
una. En cada línea se mostrarán los números del 0 al 9.
0123456789
0123456789
0123456789
0123456789
0123456789
0123456789
0123456789
0123456789
0123456789
0123456789
 */

package UD3EjerBuclesGamma;

public class Ejer1 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
