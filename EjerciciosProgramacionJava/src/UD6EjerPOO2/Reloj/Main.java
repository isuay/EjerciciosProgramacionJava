package UD6EjerPOO2.Reloj;

public class Main {

    public static void main(String[] args) {

        Reloj a = new Reloj(14, 59, 59);
        
        a.imprimeHora();
        a.imprimeHora12();
        
        a.tick();
        
        a.imprimeHora();
        a.imprimeHora12();
    }

}
