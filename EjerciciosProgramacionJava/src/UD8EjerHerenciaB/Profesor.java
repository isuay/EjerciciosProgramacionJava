package UD8EjerHerenciaB;

public class Profesor extends Persona {

    private double salario;
    private String especialidad;

    public Profesor( String n, String a, String f, double salario, String especialidad) {
        super(n, a, f);
        this.salario = salario;
        this.especialidad = especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String specialidad) {
        this.especialidad = specialidad;
    }
    
    public String getNombre(){
        return "Profesor: " + super.getNombre();
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Salario: " + salario + " - Especialidad: " + especialidad);
    }
}
