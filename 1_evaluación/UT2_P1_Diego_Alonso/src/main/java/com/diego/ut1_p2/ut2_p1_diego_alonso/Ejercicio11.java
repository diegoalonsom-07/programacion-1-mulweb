/*
    Nombre: Diego Alonso Martinez
    Fecha: 27/10/2025
    Grupo: MULWEB 1º
    Nombre del ficher: Ejercicio11
    Descripción: Decir cual ha sido tu "nota"
*/
package com.diego.ut1_p2.ut2_p1_diego_alonso;

import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nota");
        nota = sc.nextInt();

        
        if (nota < 4){
            System.out.println("Insuficiente");
            
        } else if (nota == 5){
            System.out.println("Suficiente");
            
        } else if (nota == 6){
            System.out.println("Bien");
            
        } else if (nota == 7 || nota == 8){
            System.out.println("Notable");
        } else if (nota == 9 || nota == 10){
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota no valida");
        }
    } 
}
