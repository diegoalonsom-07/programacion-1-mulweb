/*
Nombre: Diego
Fecha: 12/11/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio11.java
Descripción: Tablas de multiplicar
*/
package com.diego.ut1_p2.ut2_p2_diego_alonso;
import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int resultado;

        while (true) {
            System.out.print("Introduce un numero del 1 al 10: ");
            numero = sc.nextInt();
            if (numero >= 1 && numero <= 10) {
                break;
            } else {
                System.out.println("Has puesto un numero que no toca");
            }
        }
        
        for (int i = 0; i <= 10; i++) {
            resultado = i * numero;
            System.out.println(numero + " * " + i + " = " + resultado);
        }

    }
}
