/*
Nombre: Diego
Fecha: 08/10/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio12.java
Descripción: Redondeo de un numero;
*/
package com.diego.ut1_p2.ut1_p2;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        
        System.out.println("Dime un número con decimales, separados con un punto (.)");
        double numero = sc.nextDouble();

        long redondeado = Math.round(numero);

        System.out.println("Tu número redondeado es: " + redondeado);
    }
}
