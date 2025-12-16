/*
Nombre: Diego
Fecha: 07/10/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio10.java
Descripción: Calcular los beneficios anuales;
*/
package com.diego.ut1_p2.ut1_p2;
import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos kilos de manzanas has vendido");
        int manzanas = sc.nextInt();
        
        System.out.println("Cuantos kilos de peras has vendido");
        int peras = sc.nextInt();
        
        double ganmanzanas = manzanas * 2.35;
        double ganperas = peras * 1.95;
        
        System.out.println("En peras has ganado: " + ganperas + " euros");
        System.out.println("En manzanas has ganado: " + ganmanzanas + " euros");
        System.out.println("En total has ganado: " + (ganperas+ganmanzanas) + " euros");
    } 
}
