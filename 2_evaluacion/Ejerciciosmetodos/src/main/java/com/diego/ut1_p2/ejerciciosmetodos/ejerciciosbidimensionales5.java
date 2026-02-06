package com.diego.ut1_p2.ejerciciosmetodos;

import java.util.Arrays;
import java.util.Scanner;

public class ejerciciosbidimensionales5 {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int [][] array;
        int maximo;

        int tamaño;
        System.out.println("Dime cuato quiere medir tu array, sera un cuadrado");
        tamaño = sc.nextInt();

        array = new int [tamaño][tamaño];

        System.out.println("Dime el valor máximo que puede tomar.");
        maximo = sc.nextInt();

        array = rellenarlo(array, maximo);

        for (int[] fila: array){
            System.out.println(Arrays.toString(fila));
        }

        maxfil(array);

        maxcol(array);
    }

    static int [][] rellenarlo(int [][] array, int maximo){
        for (int contador1 = 0; contador1 < array.length; contador1++){
            for(int contador2 = 0; contador2 < array[contador1].length; contador2++){
                array[contador1][contador2] = (int) (Math.random() * maximo + 1);
            }
        }

        return array;
    }

    static void maxfil (int [][] array){
        int max = 0;
        for (int contador1 = 0; contador1 < array.length; contador1++){
            for (int contador2 = 0; contador2 < array[contador1].length; contador2++){
                if (array[contador1][contador2] > max){
                    max = array[contador1][contador2];
                }
            }
            System.out.println("El mayor valor de la " + contador1 + "º fila es: "+ max);
            max = 0;
        }
    }

    static void maxcol (int [][] array){
        int max = 0;
        for (int contador1 = 0; contador1 < array.length; contador1++){
            for (int contador2 = 0; contador2 < array[contador1].length; contador2++){
                if (array[contador2][contador1] > max){
                    max = array[contador2][contador1];
                }
            }
            System.out.println("El mayor valor de la " + contador1 + "º columna es: "+ max);
            max = 0;
        }
    }
}
