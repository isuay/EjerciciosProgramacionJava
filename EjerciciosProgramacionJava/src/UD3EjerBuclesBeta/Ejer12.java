/*
12. Escribe un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador
intenta adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez 
hasta adivinarlo (el usuario deberá indicarle al ordenador si es mayor, menor o igual al
número que ha pensado).
 */
package UD3EjerBuclesBeta;

import java.util.Scanner;

public class Ejer12 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int num = 50, max = 100, min = 1;
        String resp;
        
        System.out.println("Piensa un número e intentaré adivinarlo");
        
        do {
            
            System.out.println("Número " + num + ", ¿tu número es mayor, menor o igual?");
            
            resp = in.next();
            
            if (resp.equals("mayor")) {
                min = num;
                num = (min + max) / 2;
            }
            else if (resp.equals("menor")){
                max = num;
                num = (max + min) / 2;
            }
            
        } while (!resp.equals("igual"));
        
        System.out.println("¡He acertado! Tu número es el " + num);
    }
}
