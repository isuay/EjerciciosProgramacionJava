package PracticaExamenAbastos;

public class Multimedia {

    private String titulo, autor;
    private int duracion;
    protected Formato formato;
    protected enum Formato{wav, mp3, midi, avi, mov, mpg, cdAudio, dvd};

    public Multimedia(String titulo, String autor, int duracion, Formato formato) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.formato = formato;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public Formato getFormato() {
        return formato;
    }

    public String toString(){
        String duracion = Integer.toString(this.duracion);
        return "Titulo: " + titulo + "\tAutor: " + autor + "\tFormato: " + formato + "\tDuracion: " + duracion + " min";
    }
    
    public boolean equals(Multimedia m){
        if (m.getAutor().equals(this.autor) && m.getTitulo().equals(this.titulo)) {
            return true;
        } else {
            return false;
        }
    }
    
}
