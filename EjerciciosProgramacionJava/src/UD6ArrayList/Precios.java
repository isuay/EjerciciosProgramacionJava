package UD6ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Precios {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Double> precios = new ArrayList();

        double precio;

        do {
            System.out.print("Dime un precio: ");
            precio = in.nextDouble();

            if (precio >= 0) {
                precios.add(precio);
            }

        } while (precio >= 0);

        System.out.println(precios);

        ArrayList<Double> preciosBaratos = new ArrayList();
        ArrayList<Double> preciosCaros = new ArrayList();

        for (int i = 0; i < precios.size(); i++) {
            if (precios.get(i) < 100) {
                preciosBaratos.add(precios.get(i));
            } else {
                preciosCaros.add(precios.get(i));
            }
        }
        
        precios.clear();

        System.out.println("Precios original " + precios);
        System.out.println("Precios baratos " + preciosBaratos);
        System.out.println("Precios caros" + preciosCaros);

    }

}
