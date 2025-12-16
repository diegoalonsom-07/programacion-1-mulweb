/*
Nombre: Diego
Fecha: 07/10/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio7.java
Descripción: Indicar si el usuario es mayor de edad;
*/
package com.diego.ut1_p2.ut1_p2;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto anios tienes?");
        int edad = sc.nextInt();
        String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";   
        
        System.out.println(mensaje);
    }   
}
