package UD3EjerBuclesAlpha;

public class Fibonacci {
    
    public static void main(String[] args) {
        
        int a = 1, b = 1, cont = 3, suma;
        
        System.out.println(a);
        System.out.println(b);
        
        for (a = 1; cont <= 10; cont++) {
            suma = a + b;
            System.out.println(suma);
            b = a;
            a = suma;
        }
    }
}
