package UD6CasoPractico2;

public class Banco {

    private Cuenta[] cuentas;
    private final int MAX = 100;
    private int cuantos, buscar = 0;

    public Banco() {
        cuentas = new Cuenta[MAX];
        cuantos = 0;
    }

    public void ingresarDinero(int posCuenta, double dinero) {
        cuentas[posCuenta].ingresarDinero(dinero);
    }

    public void retirarDinero(int posCuenta, double dinero) {
        cuentas[posCuenta].retirarDinero(dinero);
    }

    public void transferencia(int posCuenta1, int posCuenta2, double dinero) {
        if (cuentas[posCuenta1].retirarDinero(dinero)) {
            cuentas[posCuenta2].ingresarDinero(dinero);
        }
    }

    public void agregarCuenta(Cuenta c) {
        if (cuantos < 100) {
            cuentas[cuantos] = c;
            cuantos++;
        } else {
            System.err.println("Banco lleno");
        }
    }

    public void eliminarCuenta(int posCuenta) {
        if (posCuenta >= 0 && posCuenta < cuantos) {
            for (int i = posCuenta; i < (cuantos - 1); i++) {
                cuentas[i] = cuentas[i + 1];
            }
            cuantos--;
        } else {
            System.err.println("No hay contactos");
        }
    }

    public int[] buscarCuenta(String nombre) {
        int[] pos = new int[100];
        buscar = 0;

        for (int i = 0;
                i < cuantos;
                i++) {
            if (cuentas[i].getNombre().toUpperCase().indexOf(nombre.toUpperCase()) != -1) {
                pos[buscar] = i;
                buscar++;
            }
        }
        if (buscar
                == 0) {
            System.err.println("No hay cuentas con ese nombre");
        }
        return pos;
    }

    public String getCuenta(int posicion) {
        return cuentas[posicion - 1].getNombre() + " " + cuentas[posicion - 1].getsaldo();
    }

    public void imprimirBuscarCuenta(int[] pos) {
        for (int i = 0; i < buscar; i++) {
            System.out.println(getCuenta(pos[i] + 1));
        }
    }

    public void mostrarMorosos() {
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i].getsaldo() < 0) {
                System.out.print(i + ". ");
                cuentas[i].imprimir();
            } else {
                System.out.println("No hay cuentas en negativo");
            }
        }
    }

    public void imprimirTodos() {
        if (cuantos == 0) {
            System.err.println("No hay contactos");
        } else {
            for (int i = 0; i < cuentas.length; i++) {
                System.out.print(i + ". ");
                cuentas[i].imprimir();
            }
        }
    }

}
