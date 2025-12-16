/*
    Nombre: Diego Alonso Martinez
    Fecha: 24/10/2025
    Grupo: MULWEB 1º
    Nombre del ficher: Ejercicio5
    Descripción: Casi 0
*/

package com.diego.ut1_p2.ut2_p1_diego_alonso;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero que puede tener decimales");
        double numero = sc.nextDouble();
         

        if ((numero < 0.99) && (numero > -0.99) && (numero !=0)) {
            System.out.println("Es un número casi 0");
        } else {
            System.out.println("No es un número casi 0");
        }
    }  
}
