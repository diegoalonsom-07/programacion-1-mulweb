/*
Nombre: Diego
Fecha: 07/10/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio5.java
Descripción: La edad que tiene un usuario;
*/
package com.diego.ut1_p2.ut1_p2;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("En que anio has nacido");
        int nacimiento = sc.nextInt();
        System.out.println("En que anio estamos");
        int presente = sc.nextInt();
        
        System.out.println("Tienes " + (presente - nacimiento) + " anios");
    }
}
