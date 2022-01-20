package UD6EjerPOO3.CuentaCorriente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner
        Scanner in = new Scanner(System.in);

        //Creamos el vector
        CuentaCorriente[] cuentas = new CuentaCorriente[5];

        //Rellenamos el vector
        cuentas[0] = new CuentaCorriente(1234, 1360);
        cuentas[1] = new CuentaCorriente(5678, 859);
        cuentas[2] = new CuentaCorriente(9123, 2640);
        cuentas[3] = new CuentaCorriente(4567, 50);
        cuentas[4] = new CuentaCorriente(8912, 5003);

        //Variable de opcion del menú
        int opcion;

        //Mostramos el menú y hacemos las operaciones según la opción elegida
        do {
            System.out.println("\n1. Ver cuentas\n"
                    + "2. Ingresar\n"
                    + "3. Retirar\n"
                    + "4. Transferencia\n"
                    + "5. Salir");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < cuentas.length; i++) {
                        cuentas[i].imprime();
                    }
                    break;
                case 2:
                    System.out.print("Elige una cuenta: ");
                    int c = in.nextInt();
                    System.out.print("Dime una cantidad: ");
                    double cant = in.nextDouble();
                    //Ponemos el -1 porque los vectores empiezan con 0, y así el usuario 
                    //puede elegir del 1 al 5 en vez del 0 al 4 que puede ser más lioso
                    cuentas[c - 1].ingresar(cant);
                    break;
                case 3:
                    System.out.print("Elige una cuenta: ");
                    c = in.nextInt();
                    System.out.print("Dime una cantidad: ");
                    cant = in.nextDouble();
                    cuentas[c - 1].retirar(cant);
                    break;
                case 4:
                    System.out.print("Elige la cuenta de origen: ");
                    int co = in.nextInt();
                    System.out.print("Elige la cuenta de destino: ");
                    int cd = in.nextInt();
                    System.out.print("Dime una cantidad: ");
                    cant = in.nextDouble();
                    cuentas[co - 1].retirar(cant);
                    cuentas[cd - 1].ingresar(cant);
                    cuentas[co - 1].imprime();
                    cuentas[cd - 1].imprime();
                    break;
            }
        //No salimos hasta que el usuario no ponga un 5
        } while (opcion != 5);
    }
}
