package UD2Ejer;

/*8.- Escribe un programa que visualice en pantalla cuánto le dará su banco después de
seis meses si pone 2000€ en una cuenta a plazo fijo al 2,75% anual. Recuerda que al
pagarte los intereses el banco le retendrá el 18% para hacienda. Escribe los mensajes
apropiados para entender todos los cálculos.*/

public class Ejer8
{
    public static void main(String[] args) {
        
        int a = 2000;
        double plazof = 0.0275;
        double precio = a * plazof / 2;
        double retención = precio * 0.18;
        double pf =  precio - retención;
        
        System.out.println("El precio bruto es: " + precio + "€" );
        System.out.println("Te retienen: " + retención + "€" );
        System.out.println("El precio final es: " + pf + "€" );
    }
}
