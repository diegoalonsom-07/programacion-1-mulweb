/*
Nombre: Diego
Fecha: 06/10/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio2.java
Descripción: Saludar a alguien en específico;
*/
package com.diego.ut1_p2.ut1_p2;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String nombre = sc.nextLine();
        
        System.out.println("Hola " + nombre + ". Encantado de conocerte.");
        
    }
}
