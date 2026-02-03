package com.diego.ut1_p2.ejerciciosmetodos;

import java.util.Arrays;
import java.util.Scanner;

public class ejerciciobidimensionales2 {
    static Scanner sc = null;
    static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = 3;
        int[][] primerArray;
        int[][] segundoArray;
        boolean iguales = false;

        primerArray = crearMatriz1(n);
        segundoArray = crearMatriz2(n);

        iguales = comprobar(primerArray, segundoArray);

        if(iguales == false){
            System.out.println("Los arrays no se pueden comparar ya que tienen longitudes distintas");
        } else {
            resultadoArray(primerArray, segundoArray, n);
        }
        
    }

    static int [][] crearMatriz1(int n){
        int [][] ejercicio2 = new int [1][2];
        
        for (int fila=0; fila < ejercicio2.length; fila++){
            for (int columnas = 0; columnas < ejercicio2[fila].length; columnas++){
                System.out.println("Introduce el valor para la posicion " + fila + "," + columnas);
                ejercicio2[fila][columnas] = sc.nextInt();
            }
        }
        return ejercicio2;
    }

    static int [][] crearMatriz2(int n){
        int [][] ejercicio2 = new int [3][4];
        
        for (int fila=0; fila < ejercicio2.length; fila++){
            for (int columnas = 0; columnas < ejercicio2[fila].length; columnas++){
                System.out.println("Introduce el valor para la posicion " + fila + "," + columnas);
                ejercicio2[fila][columnas] = sc.nextInt();
            }
        }
        return ejercicio2;
    }

    static boolean comprobar(int [][] primerArray, int [][] segundoArray){
        if(primerArray.length != segundoArray.length){
            return false;
        }
        for (int fila=0; fila < primerArray.length; fila++){
            for (int columnas = 0; columnas < primerArray[fila].length; columnas++){
                if(primerArray[fila].length != segundoArray[fila].length){
                    return false;
                }
            }
        }
        return true;
    }

    static void resultadoArray(int [][] primerArray, int [][] segundoArray, int n){
        int [][] resultadoArray = new int[n][n];

        for (int fila=0; fila < resultadoArray.length; fila++){
            for (int columnas = 0; columnas < resultadoArray[fila].length; columnas++){
                if(primerArray[fila][columnas] > segundoArray[fila][columnas]){
                    resultadoArray[fila][columnas] = primerArray[fila][columnas];
                } else {
                    resultadoArray[fila][columnas] = segundoArray[fila][columnas];
                }
            }
        }
        for (int[] fila: resultadoArray){
            System.out.println(Arrays.toString(fila));
        }
    }
}
