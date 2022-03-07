package PracticaExamenAbastos;

public class Main {

    public static void main(String[] args) {
        
        Fecha f1 = new Fecha(7, 3, 2022);
        Hora h1 = new Hora(18, 10);
        
        Examen e1 = new Examen("Programacion", "S07", f1, h1);
        
        System.out.println("Examen: " + e1.getNombre() + "\tAula: " + e1.getAula() +
                "\tFecha: " + e1.getFecha() + "\t" + e1.getHora());
        
        Fecha f2 = new Fecha(8, 3, 2022);
        Hora h2 = new Hora(19, 05);
        
        e1.setFecha(f2);
        e1.setHora(h2);
        
        System.out.println("Examen: " + e1.getNombre() + "\tAula: " + e1.getAula() +
                "\tFecha: " + e1.getFecha()+ "\t" + e1.getHora());
        
    }
    
}
