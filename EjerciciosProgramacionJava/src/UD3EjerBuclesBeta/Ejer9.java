/*
9.Escribe un programa que tire un dado de 6 caras 100 veces (no es necesario mostrar 
los valores) y luego muestre el nº y % de veces que ha salido cada número.
 */
package UD3EjerBuclesBeta;

import java.lang.Math;

public class Ejer9 {

    public static void main(String[] args) {
        
        int c1=0, c2=0, c3=0, c4=0, c5=0, c6=0;
        
        for (int i = 0; i <= 100; i++) {
            int dado = (int) (Math.random() * 6 + 1);
            
            if (dado == 1) {
                c1+=1;
            }
            else if(dado == 2){
                c2+=1;
            }
            else if(dado == 3){
                c3+=1;
            }
            else if(dado == 4){
                c4+=1;
            }
            else if(dado == 5){
                c5+=1;
            }
            else if(dado == 6){
                c6+=1;
            }
        }
        
        double p1 = (double)c1/100, 
               p2 = (double)c2/100, 
               p3 = (double)c3/100, 
               p4 = (double)c4/100, 
               p5 = (double)c5/100, 
               p6 = (double)c6/100;
        
        System.out.println("Número 1: " + c1 + " veces y " + p1 + "%"
                + "\nNúmero 2: " + c2 + " veces y " + p2 + "%"
                        + "\nNúmero 3: " + c3 + " veces y " + p3 + "%"
                                + "\nNúmero 4: " + c4 + " veces y " + p4 + "%"
                                        + "\nNúmero 5: " + c5 + " veces y " + p5 + "%"
                                                + "\nNúmero 6: " + c6 + " veces y " + p6 + "%");
    }
}