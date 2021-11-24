package UD3EjerCondicionales;

/*
19.Escribe un programa que pida un número entero x y un carácter c. Según el carácter
introducido se mostrará por pantalla:
◦Si c es ‘s’ => Sin(x)
◦Si c es ‘c’ => Cos(x)
◦Si c es ‘t’ => Tan(x)
◦En cualquier otro caso => “Error: carácter introducido incorrecto”.
 */

import java.util.Scanner;
import java.lang.Math;

public class Ejer19 {
    
    public static void main(String[] args) {

        int num;
        char letra;
        
        Scanner in = new Scanner(System.in);
  
        System.out.println("Introduce una número entero:");
        num = in.nextInt();
        
        System.out.println("Introduce una letra:");
        letra = in.next().charAt(0);
        
        if (letra == 's'){
            double sin = Math.sin(num);
            System.out.println("El seno de " + num + " es: " + sin);
        }
        else if (letra == 'c'){
            double cos = Math.cos(num);
            System.out.println("El coseno de " + num + " es: " + cos);
        }
        else if (letra == 't') {
            double tan = Math.tan(num);
            System.out.println("La tangente de " + num + " es: " + tan);
        }
        else {
            System.out.println("Error: carácter introducido incorrecto");
        }
    }
}
