/*12.- Escribe un programa para calcular el área y el volumen de un cilindro (busca las
fórmulas en Internet). Supón para el ejemplo que el cilindro tiene un diámetro de
15,5cm y una altura de 42,4cm. Utiliza constantes o métodos de la clase Math siempre
que sea posible.*/

package UD2Ejer;

import java.lang.Math;
        
public class Ejer12 {
    
    public static void main(String[] args) {
        
        double h = 42.4;
        double diametro = 15.5;
        double r = diametro / 2;
        double volumen = Math.PI * Math.pow(r, 2) * h;
        double area = 2 * Math.PI * r * (h + r);
        
        System.out.println("El diámetro es: " + diametro);
        System.out.println("El área es: " + area);
   

    }
    
}
