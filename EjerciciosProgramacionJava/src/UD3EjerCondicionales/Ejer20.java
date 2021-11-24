package UD3EjerCondicionales;

/*
20.Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en
calificación alfabética, escribiendo el resultado.
◦de 0 a <3 Muy Deficiente.
◦de 3 a <5 Insuficiente.
◦de 5 a <6 Bien.
◦de 6 a <9 Notable
◦de 9 a 10 Sobresaliente
 */

import java.util.Scanner;

public class Ejer20 {
    
    public static void main(String[] args) {

        int num;        
        
        Scanner in = new Scanner(System.in);
  
        System.out.println("Introduce una número entero del 0 al 10:");
        num = in.nextInt();
        
        if (num < 3){
            System.out.println("Muy Deficiente");
        }
        else if (num < 5){
            System.out.println("Insuficiente");
        }
        else if (num < 6){
            System.out.println("Bien");
        }
        else if (num < 9){
            System.out.println("Notable");
        }       
        else
            System.out.println("Sobresaliente");
    }
}
