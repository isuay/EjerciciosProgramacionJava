package UD3EjerCondicionales;

/*
29.Escribe un programa que pida una hora expresada en horas, minutos y segundos.
Luego mostrará la hora, minutos y segundos que serán transcurrido un segundo.
 */

import java.util.Scanner;

public class Ejer29 {
    
       public static void main(String[] args) {

        int h, m, s;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime una hora, minutos y segundo");

        System.out.print("Hora: ");
        h = in.nextInt();

        System.out.print("Minuto: ");
        m = in.nextInt();
        
        System.out.print("Segundo: ");
        s = in.nextInt();
        
        if (s == 59 && m == 59) {
            m = 0;
            s = 0;
            h = h + 1;
        }
        else if (s == 59){
            s = 0;
            m = m + 1;
        }
        else {
            s = s + 1;
        }
        
        System.out.println("Al pasar un segundo el tiempo se queda en: " + h + ":" + m + ":" + s);
    }
}
