/*
Nombre: Diego
Fecha: 11/11/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio6.java
Descripción: Hacer operaciones con edades de alumnos
*/
package com.diego.ut1_p2.ut2_p2_diego_alonso;
import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        
        int total = 0;
        int contador = 0;
        int media = 0;
        int mayores = 0;
        
        System.out.println("Dime la edad de un alumno");
        edad = sc.nextInt();
        
        while (edad >= 0){
            total += edad;
            
            contador ++;
            
            media = edad /contador;
            
            if (edad >= 18){
                mayores++;
            }
            
            System.out.println("Dime la edad de otro alumno");
            edad = sc.nextInt();            
        }
        
        System.out.println("Se ha sumado la edad de " + contador + " alumnos.");
        System.out.println("La suma de la edad de todos los alumnos es de " + total + " años");
        System.out.println("La media de edad de todos los alumnos es de " + media + " años");
        System.out.println("------------------------------------------------------------");
        System.out.println("Hay " + mayores + " alumnos mayores de edad");
        
    }
}
