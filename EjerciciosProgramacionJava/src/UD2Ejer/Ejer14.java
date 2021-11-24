/*
14.- Escribe un programa que defina un enumerado para los días de la semana. En el
programa   define   una   variable   del   enumerado   y   asígnale   el   valor   del   día   que
corresponda al martes. A continuación, escribe por pantalla dicha variable y escribe el
valor del enumerado correspondiente al domingo.
 */
package UD2Ejer;
    
public class Ejer14 {
        
    public enum DiaSemana{lunes, martes, miercoles, jueves, viernes, sabado, domingo}

    public static void main(String[] args) {
        
        DiaSemana hoy = DiaSemana.martes;
        DiaSemana d = DiaSemana.domingo;

        System.out.println("Hoy es " + hoy);
        System.out.println(d.ordinal());
    }
}