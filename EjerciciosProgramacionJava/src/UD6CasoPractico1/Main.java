package UD6CasoPractico1;

public class Main {

    public static void main(String[] args) {

        Agenda a1 = new Agenda();

        Contacto c1 = new Contacto("Jose", "123456789", "jose@gmail.com");
        Contacto c2 = new Contacto("Ruben", "123456789", "jose@gmail.com");
        Contacto c3 = new Contacto("Maria jose", "123456789", "jose@gmail.com");
        Contacto c4 = new Contacto("Iris", "123456789", "jose@gmail.com");
        Contacto c5 = new Contacto("Lucas", "123456789", "jose@gmail.com");
        
        a1.agregarContacto(c1);
        a1.agregarContacto(c2);
        a1.agregarContacto(c3);
        a1.agregarContacto(c4);
        a1.agregarContacto(c5);
        
        a1.imprimirTodos();
        
        a1.eliminarContacto(3);
        System.out.println("");
        
        a1.imprimirTodos();
        
        a1.buscarContacto("jose");
        
    }
}
