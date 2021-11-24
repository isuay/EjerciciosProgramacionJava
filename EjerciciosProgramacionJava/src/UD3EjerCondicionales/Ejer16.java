package UD3EjerCondicionales;

/*
16.Escribe un programa en el que el usuario intenta adivinar el valor que saldrá al “tirar”
un dado de 6 caras. Se le pedirá el valor al usuario, y luego se mostrará un número
aleatorio entre 1 y 6. Por ultimo, se mostrará un mensaje indicando si el usuario
acertó o no.
 */

import java.util.Scanner;
import java.lang.Math;

public class Ejer16 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int ale = (int)(1 + Math.random() * 6);
                
        System.out.println("Adivina un número del 1 al 6:");
        int num = in.nextInt();
        
        if (num == ale)
            System.out.println("Enhorabuena, has acertado!");
        else
            System.out.println("Ese no era el número correcto, era el " + ale);
    }
}
