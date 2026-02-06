package com.diego.ut1_p2.ejerciciosmetodos;

import java.util.Arrays;
import java.util.Scanner;

public class ejerciciosbidimensionales6 {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int [][] arrayOr;
        int [][] arrayIn;
        int maximo;
        int alto;
        int ancho;


        System.out.println("Dime cuato quiere medir de alto");
        alto = sc.nextInt();

        System.out.println("Dime cuato quiere medir de ancho");
        ancho = sc.nextInt();

        arrayOr = new int [alto][ancho];
        arrayIn = new int [ancho][alto];

        System.out.println("Dime el valor máximo que puede tomar.");
        maximo = sc.nextInt();

        arrayOr = rellenarlo(arrayOr, maximo);

        arrayIn = invertir(arrayOr, arrayIn);

        for (int[] fila: arrayOr){
            System.out.println(Arrays.toString(fila));
        }

        for (int[] fila: arrayIn){
            System.out.println(Arrays.toString(fila));
        }
    }

    static int [][] rellenarlo(int [][] arrayOr, int maximo){
        for (int contador1 = 0; contador1 < arrayOr.length; contador1++){
            for(int contador2 = 0; contador2 < arrayOr[contador1].length; contador2++){
                arrayOr[contador1][contador2] = (int) (Math.random() * maximo + 1);
            }
        }

        return arrayOr;
    }

    static int [][] invertir(int [][] arrayOr, int [][] arrayIn){
        
        for (int contador1 = 0; contador1 < arrayOr.length; contador1++){
            for(int contador2 = 0; contador2 < arrayOr[contador1].length; contador2++){
                arrayIn[contador2][contador1] = arrayOr[contador1][contador2];
            }
        }

        return arrayIn;
    }
}
