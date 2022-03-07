package PracticaExamen2;

import java.util.Scanner;

public class Ejer3 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Password[] contraseñas;
        int res, longitud;
        boolean[] pswdFuerte;
        
        System.out.print("Dime el tamaño del array: ");
        res = in.nextInt();
        contraseñas = new Password[res];
        pswdFuerte = new boolean[res];
        
        System.out.print("Dime la longitud de las contraseñas: ");
        longitud = in.nextInt();
        
        for (int i = 0; i < contraseñas.length; i++) {
            contraseñas[i] = new Password(longitud);
            pswdFuerte[i] = contraseñas[i].esFuerte();
            System.out.println("Contraseña" + i + ": s" + contraseñas[i].getContraseña() + "\t Es fuerte: " + pswdFuerte[i]);
            
        }
    }
}
