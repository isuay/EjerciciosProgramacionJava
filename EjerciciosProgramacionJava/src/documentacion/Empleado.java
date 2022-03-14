/*
 Ejercicio de Documentación
 * Empleados - Versión sin documentar
 */
package documentacion;

/**
 * Clase que tiene información de un empleado.
 * @author Iris Suay
 * @version 14-03-2022
 */
public class Empleado {

    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    //Metodos publicos
    /**
     * Suma una cantidad al salario de las personas que tengan más de 40 años.
     * @param sueldoPlus Cantidad de dinero que se suma.
     * @return Devuelve true si se ha podido aumentar el salario o false en caso contrario.
     */
    public boolean plus(double sueldoPlus) {
        boolean aumento = false;
        if (edad > 40 && compruebaNombre()) {
            salario += sueldoPlus;
            aumento = true;
        }
        return aumento;
    }

    //Metodos privados
    /**
     * Comprueba que el nombre no esté vacío.
     * @return Devuelve false si el nombre está vacío o true en caso contrario.
     */
    private boolean compruebaNombre() {
        if (nombre.equals("")) {
            return false;
        }
        return true;
    }

    //Constructores
    /**
     * Constructor por defecto.
     */
    public Empleado() {
        this("", "", 0, 0);
    }

    /**
     * Constructor con parámetros.
     * @param nombre Nombre del empleado.
     * @param apellido Apellido del empleado.
     * @param edad La edad que tiene el empleado.
     * @param salario El salario que gana el empleado.
     */
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
}
