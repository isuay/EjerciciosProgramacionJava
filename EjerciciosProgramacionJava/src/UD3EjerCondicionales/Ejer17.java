package UD3EjerCondicionales;

/*
17.Escribe un programa que pida un precio sin IVA y el % de IVA a aplicar. Luego
mostrará el precio con IVA. Si alguno de los valores introducidos es cero o negativo
avisará al usuario mediante un mensaje de error.
 */

import java.util.Scanner;

public class Ejer17 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
                
        System.out.println("Dame un precio sin IVA:");
        double ps = in.nextDouble();
        
        System.out.println("Ahora dame el % del IVA a aplicar:");
        double IVA = in.nextDouble();

        if (ps == 0 || IVA == 0){
            System.out.println("ERROR, has introducido un 0");
        }
        else {     
            double pf = ps + (IVA / 100 * ps);
            System.out.println("El precio fihnal es: " + pf);
        }
    }
}
