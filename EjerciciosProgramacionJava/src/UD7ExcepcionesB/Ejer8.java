package UD7ExcepcionesB;

public class Ejer8 {

    public static int devuelveEntero(int num){
        try {
            if (num % 2 == 0) {
                throw new Exception("Lanzando excepcion");
            }
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            System.out.println(devuelveEntero(i));
        }
        
    }
}