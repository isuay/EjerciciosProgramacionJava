package universidadjose;

public class Libro {

    // Atributos
    private String autor, titulo;

    // Constructor
    public Libro(String autor, String titulo) throws NoRepetidos {
        if (titulo.equals(this.titulo)) {
            throw new NoRepetidos("ERROR: Ya existe");
        } else {
            this.autor = autor;
            this.titulo = titulo;
        }
    }

    // Getters y Setters
    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

}
