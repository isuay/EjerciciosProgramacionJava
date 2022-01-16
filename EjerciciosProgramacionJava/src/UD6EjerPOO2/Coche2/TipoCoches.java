package UD6EjerPOO2.Coche2;

public enum TipoCoches {

    MINI("mini"), UTILITARIO("utilitario"), FAMILIAR("familiar"), DEPORTIVO("deportivo");
    
    private String tipo;
    
    private TipoCoches(String t){
        tipo = t;
    }
    public String getTipo() {
        return tipo;
    }
    
}
