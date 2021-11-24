package UD3EjerCondicionales;

/*
30.Escribe un programa que pida al usuario el número de horas trabajadas y a cuánto se
paga la hora en tarifa normal, y luego muestre por pantalla el salario bruto, los
impuestos y el salario neto. Ten en cuenta lo siguiente:
◦Las primeras 35 horas se pagan a tarifa normal.
◦Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
◦Las tasas de impuestos son:
▪Los primeros 500 euros son libres de impuestos.
▪Los siguientes 400 tienen un 25% de impuestos.
▪Los restantes un 45% de impuestos.
 */

import java.util.Scanner;

public class Ejer30 {
    
    public static void main(String[] args) {

        int horas;
        double tarifa, bruto, impuestos = 0, neto;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Horas trabajadas: ");
        horas = in.nextInt();
        
        System.out.print("Tarifa normal: ");
        tarifa = in.nextInt();
        
        if (horas > 35){
            bruto = (tarifa * 35) + ((horas - 35) * tarifa * 1.5);
        }
        else {
            bruto = horas * tarifa;
        }
        
        if (bruto > 900){
            impuestos = (400 * 0.25) + (bruto - 900) * 0.45;
        }
        else if (bruto > 500){
            impuestos = (bruto - 500) * 0.25;
        }
        
        neto = bruto - impuestos;
        
        System.out.println("Salario bruto: " + bruto);
        System.out.println("Impuestos: " + impuestos);
        System.out.println("Salario neto: " + neto);
    }
}
