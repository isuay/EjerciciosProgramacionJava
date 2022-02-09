package UD6ArrayList;

import java.util.ArrayList;

public class Colores {

    public static void main(String[] args) {

        ArrayList<String> colores = new ArrayList();

        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Naranja");
        colores.add("Blanco");

        /*for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }*/
        System.out.println(colores);

        colores.add("Negro");
        colores.add("Cyan");

        colores.add(0, "Amarillo");
        colores.add(1, "Magenta");

        System.out.println(colores);

        colores.remove(2);
        colores.remove(2);

        System.out.println(colores);

    }
}
