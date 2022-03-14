/*
 * Ejercicio de Documentación
 * Circulos - Versión sin documentar
 */
package documentacion;

/**
 * Clase que representa un círculo.
 * 
 * @author Iris Suay
 * @version 14-03-2022
 */
public class Circulo {

    private double centroX;
    private double centroY;
    private double radio;

    /**
     * Constructor de la clase.
     * @param x Coordenada x del centro del círculo.
     * @param y Coordenada y del centro del círculo.
     * @param r Radio del círculo.
     */
    public Circulo(double x, double y, double r) {
        centroX = x;
        centroY = y;
        radio = r;
    }

    /**
     * Getter de la coordenada X.
     * @return Devuelve la coordenada X del centro del círculo.
     */
    public double getCentroX() {
        return centroX;
    }

    /**
     * Calcula el perímetro del círculo.
     * @return Devuelve el perímetro del círculo.
     */
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    /**
     * Desplaza el círculo a otro lugar.
     * @param despX Valor con el que se desplaza en el eje X.
     * @param despY Valor con el que se desplaza en el eje Y.
     */
    public void mueve(double despX, double despY) {
        centroX = centroX + despX;
        centroY = centroY + despY;
    }
}
