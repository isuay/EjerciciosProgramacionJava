/*
5. Escribe   un   programa   que   muestre   por   pantalla   un   número   entero
aleatorio entre 1 y 10.
 */
package UD2Entregable;

import java.lang.Math;

public class Ejer5 {
    
    public static void main(String[] args) {
        
        int num = (int)(1 + Math.random() * 10);
        
        System.out.println("Número entre 1 y 10: " + num);
    }
}