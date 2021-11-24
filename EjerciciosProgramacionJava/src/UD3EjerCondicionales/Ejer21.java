package UD3EjerCondicionales;

/*
21.Escribe un programa que calcule el índice de masa corporal de un paciente. IMC =
peso (kg) / altura² (m). Luego, mostrará el diagnóstico según la siguiente tabla.
 */

import java.util.Scanner;
import java.lang.Math;

public class Ejer21 {
    
    public static void main(String[] args) {

        double kg;
        double m;
        
        Scanner in = new Scanner(System.in);
  
        System.out.println("Dime tu masa (kg):");
        kg = in.nextDouble();
        
        System.out.println("Dime tu altura (m):");
        m = in.nextDouble();
        
        double IMC = kg / (Math.pow(m, 2));
        
        if (IMC < 16){
            System.out.println("Criterio de ingreso en hospital");
        }
        else if (IMC < 17){
            System.out.println("Infrapeso");
        }
        else if (IMC < 18){
            System.out.println("Bajo peso");
        }
        else if (IMC < 25){
            System.out.println("Peso normal (saludable)");
        }
        else if (IMC < 30){
            System.out.println("Sobrepeso (obesidad de grado I)");
        }
        else if (IMC < 35){
            System.out.println("Sobrepeso crónico (obesidad de grado II)");
        }
        else if (IMC < 40){
            System.out.println("Obesidad premórbida (obesidad de grado III)");
        }
        else {
            System.out.println("Obesidad mórbida (obesidad de grado IV)");
        }
    }
}
