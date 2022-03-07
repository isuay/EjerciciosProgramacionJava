package universidadjose;

public class Pelicula extends Libro {

    // Atributos
    private String fecha;

    // Constructor
    public Pelicula(String autor, String titulo, String fecha) throws NoRepetidos{
            super(autor, titulo);
            this.fecha = fecha;
    }

    // Getters y Setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
