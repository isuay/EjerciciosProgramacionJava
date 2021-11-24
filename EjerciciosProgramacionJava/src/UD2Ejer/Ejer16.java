/*
16.- Escribe un programa que solicite al usuario una cantidad en segundos y la
convierta a días, horas, minutos y segundos.
 */
       
package UD2Ejer;

import java.util.Scanner;

public class Ejer16 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dime una cantidad de segundos");
        
        int s = in.nextInt();          
        int m = s / 60;
        int h = s / 3600;
        int d = s / 86400;   
        
        int seg = s % 60;
        int min = m % 60;
        int horas = h % 24;
        
        System.out.println("Dias: " + d + ", horas: " + horas + ", minutos: " + min + ", segundos: " + seg);
    }
}