package UD8EjerHerenciaB;

public class Alumno extends Persona{

    private int grupo;
    private int notaMedia;

    public Alumno(String n, String a, String f, int grupo, int notaMedia) {
        super(n, a, f);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public int getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(int notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    public String getNombre(){
        return "Alumno: " + super.getNombre();
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Grupo: " + grupo + " - Nota media: " + notaMedia);
    }
}
