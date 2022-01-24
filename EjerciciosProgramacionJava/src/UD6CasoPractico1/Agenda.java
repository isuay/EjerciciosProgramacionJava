package UD6CasoPractico1;

import java.util.Arrays;

public class Agenda {

    private Contacto[] contactos;
    private int cuantos;

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
        int[] vp = new int[100];
        int npos = 0;
        
        for (int i = 0; i < cuantos; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                vp[npos] = i;
                npos++;
            }
        }
        
        vp = Arrays.copyOf(vp, npos);
        
        return vp;
    }

    public void imprimirTodos() {
        for (int i = 0; i < cuantos; i++) {
            contactos[i].imprimir();
        }
    }

}
