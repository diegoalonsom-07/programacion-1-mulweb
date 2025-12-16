/*
    Nombre: Diego Alonso Martinez
    Fecha: 27/10/2025
    Grupo: MULWEB 1º
    Nombre del ficher: Ejercicio9
    Descripción: cuantas cifras tiene tu número;
*/
package com.diego.ut1_p2.ut2_p1_diego_alonso;

import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número del 0 al 99.999");
        int numero = sc.nextInt();
        
        if (numero < 10){
            System.out.println("Tu número tiene una cifra");
        } else if (numero < 100){
            System.out.println("Tu número tiene dos cifra");
        } else if (numero < 1000){
            System.out.println("Tu número tiene tres cifra");
        } else if (numero < 10000){
            System.out.println("Tu número tiene cuatro cifra");
        } else if (numero < 100000){
            System.out.println("Tu número tiene cinco cifra");
        }
    } 
}
