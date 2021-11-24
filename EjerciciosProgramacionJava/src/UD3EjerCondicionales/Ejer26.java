package UD3EjerCondicionales;

/*
26.Realizar un programa que simule un inicio de sesión solicitando el nombre de usuario
y la contraseña. Deberá mostrar por pantalla un mensaje en pantalla indicando si el
inicio de sesión es correcto o no. En caso de no serlo, se indicará si el usuario es
incorrecto o si la contraseña es incorrecta. El usuario del sistema es “alumno” y su
contraseña “123456”.
 */

import java.util.Scanner;

public class Ejer26 {

    public static void main(String[] args) {
        
        String usu, cont;

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce tu usuario: ");
        usu = in.next();
        
        System.out.print("Introduce la contraseña: ");
        cont = in.next();
        
        if (!usu.equals ("alumno")) {
            System.out.println("Usuario incorrecto");
        }
        else if (!cont.equals("1234")){
            System.out.println("Contraseña incorrecta");
        }
        else {
            System.out.println("Inicio de sesión correcto");
        }
    }
}
