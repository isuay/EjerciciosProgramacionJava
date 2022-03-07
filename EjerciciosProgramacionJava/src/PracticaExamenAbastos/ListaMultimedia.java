package PracticaExamenAbastos;

public class ListaMultimedia {

    private Multimedia[] lista;
    private int almacenados, cont = 0;

    public ListaMultimedia(int almacenados) {
        this.almacenados = almacenados;
        this.lista = new Multimedia[almacenados];
    }

    public int size() {
        int cont = 0;
        for (int i = 0; i < lista.length; i++) {
            cont++;
        }
        return cont;
    }

    public boolean add(Multimedia m) {
        if (cont < almacenados) {
            lista[cont] = m;
            cont++;
            return true;
        } else {
            return false;
        }
    }

    public Multimedia get(int pos) {
        return lista[pos];
    }
}
