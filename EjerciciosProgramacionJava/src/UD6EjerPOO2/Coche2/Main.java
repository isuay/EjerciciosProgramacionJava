package UD6EjerPOO2.Coche2;

public class Main {

    public static void main(String[] args) {

        Coche a = new Coche("BMW X4", "negro", "1234ABC", false, 2014, TipoCoches.DEPORTIVO, SeguroCoches.TODO_RIESGO);
        Coche b = new Coche("Mercedes CLS", "azul", "5678DEF", true, 2004, TipoCoches.UTILITARIO, SeguroCoches.TODO_RIESGO);
        Coche c = new Coche("Mini", "rojo", "9123GHI", false, 2021, TipoCoches.MINI, SeguroCoches.TERCEROS);
        
    }
}
