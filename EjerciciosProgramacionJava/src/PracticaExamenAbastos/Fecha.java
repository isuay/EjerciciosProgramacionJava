package PracticaExamenAbastos;

import java.util.ArrayList;

public class Fecha {

    private int dia, mes, anyo;

    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public ArrayList getAll(){
        
        ArrayList<Integer> fecha = new ArrayList();
        fecha.add(dia);
        fecha.add(mes);
        fecha.add(anyo);
        
        return fecha;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
    public String toString(){
        
        String dia = Integer.toString(this.dia);
        String mes = Integer.toString(this.mes);
        String anyo = Integer.toString(this.anyo);
        
        return "dia: " + dia + " mes: " + mes + " año: " + anyo;
    }
    
}
