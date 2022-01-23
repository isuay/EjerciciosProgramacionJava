package UD6EjerPOO3.DNI;

public class Main {

    public static void main(String[] args) {

        DNI[] dniRand = new DNI[10000];

        //Cuando el DNI empieza con 0, no se muestra el 0 en el imprime 
        //y se muentran solo los otros números, por lo que algunos DNI
        //pueden tener 7 o 6 números en vez de 8
        for (int i = 0; i < dniRand.length; i++) {
            dniRand[i] = new DNI(0);
            dniRand[i].newRandomDNI();
            dniRand[i].imprime();
        }

        int cont = 0;
        
        for (int i = 0; i < dniRand.length; i++) {
            if (dniRand[i].getLetra() == 'A' || dniRand[i].getLetra() == 'E' || dniRand[i].getLetra() == 'I' || dniRand[i].getLetra() == 'O' || dniRand[i].getLetra() == 'U') {
                cont++;
            }
        }
        
        System.out.println("DNI que contiene vocal: " + cont);
    }
}
