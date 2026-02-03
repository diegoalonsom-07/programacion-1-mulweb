package com.diego.ut1_p2.ejerciciosmetodos;

import java.util.Arrays;
import java.util.Scanner;

public class ejerciciosbidimencionales4 {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int [][] array;
        int maximo;
        int maximo1;
        int minimo;


        System.out.println("Dime el valor máximo que puede tomar.");
        maximo = sc.nextInt();
        System.out.println("Dime el valor máximo que puede tomar.");
        minimo = sc.nextInt();

        array = crearArray(maximo, minimo);

        System.out.println("Dime el valor máximo que puede tomar.");
        maximo1 = sc.nextInt();

        array = rellenarlo(array, maximo1);

        for (int[] fila: array){
            System.out.println(Arrays.toString(fila));
        }

    }

    static int [][] crearArray(int maximo, int minimo){
        int [][] array;
        int filas = (int) (Math.random() * (maximo - minimo) + minimo);
        array = new int [filas][];

        for (int contador1 = 0; contador1 < array.length; contador1++){
            array [contador1] = new int [(int) (Math.random() * (maximo - minimo) + minimo)];
        }
        
        return array;
    }


    static int [][] rellenarlo(int [][] array, int maximo){
        for (int contador1 = 0; contador1 < array.length; contador1++){
            for(int contador2 = 0; contador2 < array[contador1].length; contador2++){
                array[contador1][contador2] = (int) (Math.random() * maximo + 1);
            }
        }

        return array;
    }
}
