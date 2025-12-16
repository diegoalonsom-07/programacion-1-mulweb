/*
Nombre: Diego
Fecha: 07/10/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio6.java
Descripción: Media aritmética de dos notas;
*/
package com.diego.ut1_p2.ut1_p2;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual ha sido tu primera nota?");
        double primera = sc.nextDouble();
        System.out.println("Cual ha sido tu primera nota?");
        double segunda = sc.nextDouble();
        
        System.out.println("La media ha sido de un: " + ((primera + segunda) /2));
    }
}
