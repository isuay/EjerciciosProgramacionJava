package PracticaExamenAbastos;

public class Hora {
    
    private int hora, min;

    public Hora(int hora, int min) {
        this.hora = hora;
        this.min = min;
    }

    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMin(int min) {
        this.min = min;
    }
    
    public String toString(){
        
        String hora = Integer.toString(this.hora);
        String minuto = Integer.toString(this.min);
        
        return "Hora: " + hora + ":" + min;
    }
    
}
