/*
Nombre: Diego
Fecha: 12/11/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio12.java
Descripción: 5 calificaciones y decir si hay algún suspenso.
*/
package com.diego.ut1_p2.ut2_p2_diego_alonso;
import java.util.Scanner;


public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean suspenso = false;
        int contador;
        int cantsus = 0;
        double nota;

        for (contador = 1; contador <= 5; contador++) {
            System.out.println("Introduce la nota del alumno " + contador + ": ");
            nota = sc.nextDouble();
            
            while (nota > 10 || nota < 0){
                System.out.println("Nota no valida. Vuelve a insertar otra.");
                nota = sc.nextDouble();
            }
            
            if (nota < 5) {
                suspenso = true;
                cantsus++;
            }
        }

        if (suspenso) {
            System.out.println("Si, hay " + cantsus + " suspenso/s.");
        } else {
            System.out.println("No hay suspensos.");
        }
    }
}
