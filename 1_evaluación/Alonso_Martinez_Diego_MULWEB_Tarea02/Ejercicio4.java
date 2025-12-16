/*
Nombre: Diego
Fecha: 07/10/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio4.java
Descripción: La edad que tenga alguien el año que viene;
*/
package com.diego.ut1_p2.ut1_p2;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu edad?");
        int edad = sc.nextInt();
        
        System.out.println("El anio que viene tendras " + (edad + 1));
    }
}
