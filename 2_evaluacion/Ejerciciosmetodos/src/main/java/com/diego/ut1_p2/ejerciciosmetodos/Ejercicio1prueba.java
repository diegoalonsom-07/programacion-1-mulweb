package com.diego.ut1_p2.ejerciciosmetodos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1prueba {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int [][] array;
        boolean magico1 = false;
        boolean magico2 = false;


        array = new int [4][4];


        array = rellenarlo(array);

        for (int[] fila: array){
            System.out.println(Arrays.toString(fila));
        }

        magico1=sumaFil(array);

        magico2=sumaCol(array);

        if (magico1 == false && magico2 == false){
            System.out.println("Tu array no es mágico");
        } else {
            System.out.println("Tu array es mágico");
        }
    }

    static int [][] rellenarlo(int [][] array){
        for (int contador1 = 0; contador1 < array.length; contador1++){
            for(int contador2 = 0; contador2 < array[contador1].length; contador2++){
                System.out.println("Introduce el valor para la posicion " + contador1 + "," + contador2);
                array[contador1][contador2] = sc.nextInt();
            }
        }

        return array;
    }

    static boolean sumaFil (int [][] array){
        int aux = 0;
        int suma = 0;
        for (int contador1 = 0; contador1 < array.length; contador1++){    
            aux = suma;
            suma = 0;   
            for (int contador2 = 0; contador2 < array[contador1].length; contador2++){
                suma += array[contador1][contador2];
            }
            if (suma != aux && contador1==1){
                return false;
            }
        }
        return true;
    }

    static boolean sumaCol (int [][] array){
        int aux = 0;
        int suma = 0;
        for (int contador1 = 0; contador1 < array.length; contador1++){
            aux = suma;
            suma = 0;
            for (int contador2 = 0; contador2 < array[contador1].length; contador2++){
                suma += array[contador2][contador1];
            }
            if (suma != aux && contador1==1){
                return false;
            }
        }
        return true;
    }
}

