package UD3EjerCondicionales;

/*
23.Escribe un programa que calcule la cuota anual que se debe abonar en el gimnasio.
La cuota general es de 200 €. Tendrán un 50% de descuento las personas mayores
de 65 años; un 25% de descuento los menores de 18 años si los padres no son
socios y un 35% si los padres son socios. Deberás pedir al usuario la información
necesaria.
 */

import java.util.Scanner;

public class Ejer23 {
    
     public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        boolean socios = false;
        double cuota = 200.0;
                
        System.out.println("Dime tu edad");
        int edad = in.nextInt();
        
        if (edad < 18) {
            System.out.println("¿Tus padres son socios? s/n");
            char so = in.next().charAt(0);
            if (so == 's')
                socios = true;
            }
        
        if (edad > 65) {
            System.out.println("Aplicamos descuento del 50%");
            cuota = cuota - (cuota * 0.50);
        }
        else if (edad < 18 && socios == false) {
            System.out.println("Aplicamos descuento del 25%");
            cuota = cuota - (cuota * 0.25);
        }
        else if (edad < 18 && socios == true) {
            System.out.println("Aplicamos descuento del 35%");
            cuota = cuota - (cuota * 0.35);
        }
        else
             System.out.println("Sin descuento");
        
         System.out.println("La cuota se te queda en " + cuota + "€");
     }
}
