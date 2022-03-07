package PracticaExamenAbastos;

public class Pelicula extends Multimedia {

    private String actrizp, actorp;

    public Pelicula(String titulo, String autor, int duracion, Formato formato, String actrizp, String actorp) {
        super(titulo, autor, duracion, formato);
        this.actrizp = actrizp;
        this.actorp = actorp;
    }

    public String getActrizp() {
        return actrizp;
    }

    public String getActorp() {
        return actorp;
    }
    
    public String toString(){
        return super.toString() + "\tActriz principal: " + actrizp + "\tActor principal: " + actorp;
    }
    
}
