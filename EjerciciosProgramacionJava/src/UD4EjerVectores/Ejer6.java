/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 6. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
N, escriba M en todas sus posiciones y lo muestre por pantalla. */

package UD4EjerVectores;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 11 nov. 2021 12:58:43
 */
public class Ejer6 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Dame una longitud para el vector: ");
        int N = in.nextInt();
        
        System.out.print("Dame un valor para rellenar el vector: ");
        int M = in.nextInt();
        
        int[] num = new int[N];
            
        Arrays.fill(num, M);
        
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
