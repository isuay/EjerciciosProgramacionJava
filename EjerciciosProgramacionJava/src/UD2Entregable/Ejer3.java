/*
3. En una tienda online tienen una oferta en la que al comprar 5 productos
se obtiene un descuento del 21%. Los precios están indicados sin IVA por
lo   que   tras   el   descuento   hay   que   aplicar   el   IVA   (21%).   Escribe   un
programa que pida al usuario el precio de 5 productos y luego muestre:
1. La suma total de los productos introducidos.
2. El valor en € del descuento a aplicar.
3. La suma total de los productos tras el descuento.
4. El valor en € del IVA a aplicar.
5. El precio total final tras aplicar el IVA.
 */
package UD2Entregable;

import java.util.Scanner;
        
public class Ejer3 {
        
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dame el precio de 5 productos:");
                
        System.out.println("1er producto:");
        double uno = in.nextDouble();
               
        System.out.println("2º producto:");
        double dos = in.nextDouble();

        System.out.println("3er producto:");
        double tres = in.nextDouble();

        System.out.println("4º producto:");
        double cuatro = in.nextDouble();

        System.out.println("5º producto:");
        double cinco = in.nextDouble();

        double sumap = uno + dos + tres + cuatro + cinco;
        double vdescuento = sumap * 0.21;
        double sumad = sumap - vdescuento;
        double IVA = 0.21;
        double valorIva = sumad * IVA;
        double total = sumad + valorIva;

        System.out.println("La suma total de los productos introducidos: " + sumap + "€");
        System.out.println("El valor en € del descuento a aplicar: " + vdescuento + "€");
        System.out.println("La suma total de los productos tras el descuento: " + sumad + "€");
        System.out.println("El valor en € del IVA a aplicar: " + valorIva + "€");
        System.out.println("El precio total final tras aplicar el IVA: " + total + "€");
    }
}