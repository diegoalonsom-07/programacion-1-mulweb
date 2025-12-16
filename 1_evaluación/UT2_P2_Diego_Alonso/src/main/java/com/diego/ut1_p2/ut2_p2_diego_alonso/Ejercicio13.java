/*
Nombre: Diego
Fecha: 12/11/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio13.java
Descripción: Adivina el numero
*/
package com.diego.ut1_p2.ut2_p2_diego_alonso;
import java.util.Scanner;


public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Estoy pensando un numero del 0 al 10. ADIVINALO!!!");
        int numero = (int) (Math.random() * 10) + 1;

        System.out.println("Dime un numero");
        int adivinar = sc.nextInt();

        while (numero != adivinar) {
            System.out.print("No lo has acertado pero te doy una pista: ");
            if (numero > adivinar) {
                System.out.println("Tu numero es mas pequeño que el mio");
            } else {
                System.out.println("Tu numero es mas grande que el mio");
            }
            System.out.println("Vuelve a intenralo, inserta un numero:");
            adivinar = sc.nextInt();

        }
        System.out.println("Lo has acertado");
    }
}
