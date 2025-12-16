/*
    Nombre: Diego Alonso Martinez
    Fecha: 24/10/2025
    Grupo: MULWEB 1º
    Nombre del ficher: Ejercicio3
    Descripción: Mayor o menor
*/
package com.diego.ut1_p2.ut2_p1_diego_alonso;

import java.util.Scanner;


public class Ejercicio3 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero1 = sc.nextInt();
        
        System.out.println("Dime otro numero");
        int numero2 = sc.nextInt();  

        if (numero1 > numero2) {
            System.out.println("El primero es mayor que el sugundo");
        } else {
            System.out.println("El segundo es mayor que el primero");
        }
        
    }  
}
