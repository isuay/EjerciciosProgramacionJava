package universidadjose;

import java.util.*;

public class Main {

    public static void menu() {
        System.out.println("MENÚ\n"
                + "1. Ver libros\n"
                + "2. Ver peliculas\n"
                + "3. Añadir libro\n"
                + "4. Eliminar libro\n"
                + "5. Añadir pelicula\n"
                + "6. Eliminar pelicula\n"
                + "7. Buscar libro por autor\n"
                + "8. Buscar pelicula por titulo\n"
                + "9. Salir");
    }

    public static void main(String[] args) {

        ArrayList<Libro> loslibros = new ArrayList();
        ArrayList<Pelicula> laspeliculas = new ArrayList();
        Biblioteca b1 = new Biblioteca(loslibros, laspeliculas);

        Scanner in = new Scanner(System.in);

        int opcion = 0;
        String titulo, autor;

        do {
            System.out.println("Dime una opción: ");
            menu();
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    b1.imprimirLibros();
                    break;
                    
                case 2:
                    b1.imprimirPeliculas();
                    break;
                    
                case 3:
                    in.nextLine();
                    System.out.print("Dime el autor: ");
                    autor = in.nextLine();
                    System.out.print("Dime el titulo: ");
                    titulo = in.nextLine();
                    try {
                        Libro l = new Libro(autor, titulo);
                        b1.nuevoLibro(l);
                    } catch (NoRepetidos e) {
                        System.err.println(e.getMessage());
                        in.nextLine();
                    }
                    break;
                    
                case 4:
                    try {
                    b1.imprimirLibros();
                    System.out.print("Dime la posición del libro a borrar: ");
                    int pos = in.nextInt();
                    b1.borrarLibro(pos);
                } catch (IndexOutOfBoundsException e) {
                    System.err.println(e.getMessage());
                    in.nextLine();
                }
                break;
                
                case 5:
                    in.nextLine();
                    System.out.print("Dime el director: ");
                    autor = in.nextLine();
                    System.out.print("Dime el titulo: ");
                    titulo = in.nextLine();
                    System.out.print("Dime la fecha de estreno: ");
                    String fecha = in.nextLine();
                    try {
                        Pelicula p = new Pelicula(autor, titulo, fecha);
                        b1.nuevaPelicula(p);
                    } catch (NoRepetidos e) {
                        System.err.println(e.getMessage());
                        in.nextLine();
                    }
                    break;
                    
                case 6:
                    try {
                    b1.imprimirPeliculas();
                    System.out.print("Dime la posición de la pelicula a borrar: ");
                    int pos = in.nextInt();
                    b1.borrarPelicula(pos);
                } catch (IndexOutOfBoundsException e) {
                    System.err.println(e.getMessage());
                    in.nextLine();
                }
                break;
                
                case 7:
                    in.nextLine();
                    System.out.print("Dime el nombre del autor del libro: ");
                    autor = in.nextLine();
                    System.out.println(b1.getLibrosDe(autor));
                    break;
                    
                case 8:
                    in.nextLine();
                    System.out.print("Dime el nombre del titulo de la pelicula: ");
                    titulo = in.nextLine();
                    System.out.println(b1.getPeliculasDe(titulo));
                    break;
            }
        } while (opcion != 9);
    }
}
