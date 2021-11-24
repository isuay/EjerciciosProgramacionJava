/*
2. Escribe   un   programa   que   defina   un   enumerado  para   los   niveles   de
batería   de  un   teléfono   móvil  (vacía,   baja,   media,   alta  y  completa)   y
muestre por pantalla, utilizando dicho enumerado, que la batería del móvil
está completa.
 */
package UD2Entregable;

public class Ejer2 {
    
    public enum Bateria{vacia, baja, media, alta, completa}
    
    public static void main(String[] args) {
        
        Bateria movil = Bateria.completa;
        
        System.out.println("La batería está: " + movil);

    }
    
}