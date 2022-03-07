package universidadjose;

import java.util.ArrayList;

public class Biblioteca {

    // Atributos
    private ArrayList<Libro> loslibros = new ArrayList();
    private ArrayList<Pelicula> laspeliculas = new ArrayList();

    // Constructor
    public Biblioteca(ArrayList<Libro> loslibros, ArrayList<Pelicula> laspeliculas) {
        this.loslibros = loslibros;
        this.laspeliculas = laspeliculas;
    }
    
    // Añadir un libro
    public void nuevoLibro(Libro l) {
        loslibros.add(l);
    }

    // Eliminar un libro
    public void borrarLibro(int l) {
        loslibros.remove(l);
    }

    // Devolver los libros de un autor
    public ArrayList<String> getLibrosDe(String autor) {
        ArrayList<String> lista = new ArrayList();
        for (int i = 0; i < loslibros.size(); i++) {
            if (loslibros.get(i).getAutor().toUpperCase().indexOf(autor.toUpperCase()) != -1) {
                lista.add(loslibros.get(i).getTitulo());
            }
        }
        return lista;
    }

    // Añadir una pelicula
    public void nuevaPelicula(Pelicula p) {
        laspeliculas.add(p);
    }

    // Eliminar una pelicula
    public void borrarPelicula(int p) {
        laspeliculas.remove(p);
    }
    
    // Devolver las peliculas de un titulo
    public ArrayList<String> getPeliculasDe(String titulo) {
        ArrayList<String> lista = new ArrayList();
        for (int i = 0; i < laspeliculas.size(); i++) {
            if (laspeliculas.get(i).getTitulo().toUpperCase().indexOf(titulo.toUpperCase()) != -1) {
                lista.add(laspeliculas.get(i).getTitulo());
            }
        }
        return lista;
    }
    
    public void imprimirLibros(){
        System.out.println("La biblioteca contiene los siguientes libros: ");
        for (int i = 0; i < loslibros.size(); i++) {
            System.out.println(i + ".\tAutor: " + loslibros.get(i).getAutor() + "\tTítulo: " + loslibros.get(i).getTitulo());
        }
        System.out.println("");
    }
    
    public void imprimirPeliculas(){
        System.out.println("La biblioteca contiene las siguientes peliculas: ");
        for (int i = 0; i < laspeliculas.size(); i++) {
            System.out.println(i + ".\tTitulo: " + laspeliculas.get(i).getTitulo()+ "\tAutor: " + laspeliculas.get(i).getAutor() + "\tFecha: " + laspeliculas.get(i).getFecha());
        }
        System.out.println("");
    }

}
