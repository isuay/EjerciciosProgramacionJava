package UD6EjerPOO2.Reloj;

public class Reloj {

    private int hora, minuto, segundo;

    //Constructores
    public Reloj() {
        hora = 00;
        minuto = 00;
        segundo = 00;
    }

    public Reloj(int h, int m, int s) {
        if (h > 24 || h < 0 || m > 59 || m < 0 || s > 59 || s < 0) {
            System.err.println("ERROR: parámetros incorrectos");
        } else {
            hora = h;
            minuto = m;
            segundo = s;
        }
    }

    //Getters
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    //Setters
    public void setHora(int h) {
        if (hora > 24 || hora < 0) {
            System.err.println("ERROR; hora no válida");
        } else {
            hora = h;
        }
    }

    public void setMinuto(int m) {
        if (minuto > 59 || minuto < 0) {
            System.err.println("ERROR: minuto no válido");
        } else {
            minuto = m;
        }
    }

    public void setSegundo(int s) {
        if (segundo > 59 || minuto < 0) {
            System.err.println("ERROR: segundo no válido");
        } else {
            segundo = s;
        }
    }

    //Método para establecer hora, min, seg
    public void setReloj(int t, int m, int s) {
        setHora(t);
        setMinuto(m);
        setSegundo(s);
    }

    //Método que devuelve hora en formato 24h
    public String dimeHora() {
        return String.valueOf(hora) + ":" + String.valueOf(minuto) + ":" + String.valueOf(segundo);
    }

    //Método que devuelve hora en formato 12h
    public String dimeHora12() {
        if (hora > 12) {
            int t = hora - 12;
            return String.valueOf(t) + "pm:" + String.valueOf(minuto) + ":" + String.valueOf(segundo);
        } else {
            return String.valueOf(hora) + "am:" + String.valueOf(minuto) + ":" + String.valueOf(segundo);
        }
    }

    //Método que imprime hora en formato 24h
    public void imprimeHora() {
        System.out.println(dimeHora());
    }

    //Método que imprime hora en formato 12h
    public void imprimeHora12() {
        System.out.println(dimeHora12());
    }

    //Método que suma 1 segundo
    public void tick() {
        if (segundo == 59 && minuto == 59) {
            setSegundo(00);
            setMinuto(00);
            setHora(hora + 1);
        } else if (segundo == 59) {
            setSegundo(0);
            setMinuto(minuto + 1);
        } else {
            setSegundo(segundo + 1);
        }
    }

}
