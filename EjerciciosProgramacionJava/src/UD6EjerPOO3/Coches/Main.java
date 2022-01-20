package UD6EjerPOO3.Coches;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner
        Scanner in = new Scanner(System.in);

        //Vector de coches
        Coches[] coche = new Coches[3];

        //Contadores
        int contPintura = 0, contFabric = 0, contTerceros = 0, contTodoRiesgo = 0;

        for (int i = 0; i < coche.length; i++) {
            System.out.print("Modelo: ");
            String modelo = in.nextLine();
            System.out.print("Color: ");
            String color = in.nextLine();
            System.out.print("Tiene la pintura metralizada(true/false): ");
            boolean pintura = in.nextBoolean();
            in.nextLine();
            System.out.print("Matricula: ");
            String matricula = in.nextLine();
            System.out.print("Año fabricación: ");
            int fabricacion = in.nextInt();
            in.nextLine();
            System.out.print("Tipo de coche: ");
            String tipo = in.nextLine();
            System.out.print("Modalida de seguro: ");
            String seguro = in.nextLine();

            Coches.tipoCoche t = Coches.tipoCoche.valueOf(tipo.toUpperCase());
            Coches.modalidadSeguro s = Coches.modalidadSeguro.valueOf(seguro.toUpperCase());

            if (pintura == true) {
                contPintura++;
            }
            if (fabricacion < 2000) {
                contFabric++;
            }
            if (seguro.equalsIgnoreCase("TERCEROS")) {
                contTerceros++;
            } else {
                contTodoRiesgo++;
            }

            coche[i] = new Coches(modelo, color, pintura, matricula, fabricacion, t, s);
            coche[i].imprime();
        }

        System.out.println("Coches con pintura metalizada: " + contPintura + "\n"
                + "Coches fabricados antes del 2000: " + contFabric + "\n"
                + "Coches con seguro a terceros: " + contTerceros + "\n"
                + "Coches con seguro a todo riesgo: " + contTodoRiesgo);
    }
}
