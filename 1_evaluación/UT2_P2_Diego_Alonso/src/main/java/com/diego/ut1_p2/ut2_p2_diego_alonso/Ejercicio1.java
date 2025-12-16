/*
Nombre: Diego
Fecha: 07/11/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio1.java
Descripción: Hacer cuadrados de l tamaño que quiera el usuario
 */
package com.diego.ut1_p2.ut2_p2_diego_alonso;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la cantidad de numeros que quiere tener tu cuadrado");
        int numero = sc.nextInt();
        int marcador1;
        int marcador2;
        int marcador3;
        
        for (marcador1 =2; marcador1 <= numero; marcador1++){
            for (marcador3 = 1; marcador3 <= marcador1; marcador3++){
                for(marcador2 = 1; marcador2 <= marcador1; marcador2++){
                    System.out.print(marcador1);
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }

    }
}