package UD2Ejer;


public class Ejer10
{
    public static void main(String[] args) {
        
        int a = 2;
        int b = 4;
        int primero = -a + 5 % b - a * a;
        int segundo = 5 + 3 % 7 * b * a - b % a;
        int tercero = (a + 1) * (b + 1) - b / a;

        System.out.println("a) " + primero);
        System.out.println("b) " + segundo);
        System.out.println("c) " + tercero);

    }
}