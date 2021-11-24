package UD3EjerCondicionales;

/*
22.Escribe un programa que pida el precio de 3 artículos (sin IVA) y el % de IVA a
aplicar. Luego mostrará por pantalla el precio total (sin IVA), el valor del IVA y el
precio con IVA. Téngase en cuenta que si el total (sin IVA) es superior a 50€ se
aplicará un descuento del 5% (en tal caso, mostrarlo también por pantalla).
 */

import java.util.Scanner;

public class Ejer22 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
                
        System.out.println("Dame tres precios sin IVA:");
        System.out.println("Precio uno:");
        double a = in.nextDouble();
        
        System.out.println("Precio dos:");
        double b = in.nextDouble();
        
        System.out.println("Precio tres:");
        double c = in.nextDouble();
        
        System.out.println("Ahora dame el % del IVA a aplicar:");
        double IVA = in.nextDouble();
        
        double suma = a + b + c;
        double pf;
        double vIVA = IVA / 100;
        double IVAf;

        if (suma > 50){
            double des = suma - (suma * 0.05);
            IVAf = vIVA * des;
            pf = des + IVAf;
            System.out.println("Por ser el resultado mayor a 50€, le aplicamos un descuento del 5%");
            System.out.println("El precio total sin IVA se le quedaría en: " + des + "€");
        }
        else {
            IVAf = vIVA * suma;
            pf = suma + IVAf;
            System.out.println("El precio sin IVA es: " + suma + "€");
        }
        
        System.out.println("El valor de IVA que se le aplica es: " + IVAf + "%");
        System.out.println("El precio final con IVA se le queda en: " + pf + "€");
    }
}
