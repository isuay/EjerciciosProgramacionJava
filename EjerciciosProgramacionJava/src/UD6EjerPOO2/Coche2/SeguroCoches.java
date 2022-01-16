package UD6EjerPOO2.Coche2;

public enum SeguroCoches {
    
    TERCEROS("terceros"), TODO_RIESGO("todo riesgo");
    
    private String seguro;
    
    private SeguroCoches(String s){
        seguro = s;
    }
    public String getSeguro() {
        return seguro;
    }
}
