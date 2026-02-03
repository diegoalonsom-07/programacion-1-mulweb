package com.diego.ut1_p2.ejerciciosmetodos;

import java.util.Arrays;
import java.util.Scanner;

public class ejerciciobidimensionales1 {
    static Scanner sc = null;
    static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = 4;
        int[][] ejercicio2;

        ejercicio2 = crearMatriz(n);

        imprimirMatriz(ejercicio2);

        imprimirMatrizAl(ejercicio2);

    }

    static int [][] crearMatriz(int n){
        int [][] ejercicio2 = new int [n][n];
        
        for (int fila=0; fila < ejercicio2.length; fila++){
            for (int columnas = 0; columnas < ejercicio2[fila].length; columnas++){
                System.out.println("Introduce el valor para la posicion " + fila + "," + columnas);
                ejercicio2[fila][columnas] = sc.nextInt();
            }
        }
        return ejercicio2;
    }

    static void imprimirMatriz(int[][] m) {
        for (int[] fila: m){
            System.out.println(Arrays.toString(fila));
        }
    }
    /*
    static void imprimirMatriz(int[][] m) {
        for (int[] fila : m) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
    */
    static void imprimirMatrizAl(int[][] m){
        for (int columnas=m.length-1; columnas >= 0; columnas--){
            System.out.print(m[columnas][columnas] + " ");
        }
    }
}
