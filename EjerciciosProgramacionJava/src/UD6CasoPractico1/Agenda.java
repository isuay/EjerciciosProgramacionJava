package UD6CasoPractico1;

import java.util.Arrays;

public class Agenda {

    private Contacto[] contactos;
    private int cuantos;
    private int[] pos = new int[100];
    private int buscar = 0;

    public Agenda() {
        contactos = new Contacto[100];
        cuantos = 0;
    }

    public void agregarContacto(Contacto c) {
        if (cuantos < 100) {
            contactos[cuantos] = c;
            cuantos++;
        } else {
            System.err.println("Agenda de contactos llena");
        }
    }

    public void eliminarContacto(int posicion) {
        if (posicion >= 0 && posicion < cuantos) {
            for (int i = posicion; i < (cuantos - 1); i++) {
                contactos[i] = contactos[i + 1];
            }
            cuantos--;
        } else {
            System.err.println("No hay contactos");
        }
    }

    public int[] buscarContacto(String nombre) {

        buscar = 0;

        for (int i = 0; i < cuantos; i++) {
            if (contactos[i].getNombre().toUpperCase().indexOf(nombre.toUpperCase()) != -1) {
                pos[buscar] = i;
                buscar++;
            }
        }
        if (buscar == 0) {
            System.err.println("No hay contactos con ese nombre");
        }
        return pos;
    }

    public String getContacto(int posicion) {
        return contactos[posicion - 1].getNombre() + " " + contactos[posicion - 1].getTelefono() + " " + contactos[posicion - 1].getCorreo();
    }

    public void imprimirBuscar(int[] pos) {
        for (int i = 0; i < buscar; i++) {
            System.out.println(getContacto(pos[i] + 1));
        }
    }

    public void imprimirTodos() {
        if (cuantos == 0) {
            System.err.println("No hay contactos");
        } else {
            for (int i = 0; i < cuantos; i++) {
                System.out.print(i + ". ");
                contactos[i].imprimir();
            }
        }
    }

}
