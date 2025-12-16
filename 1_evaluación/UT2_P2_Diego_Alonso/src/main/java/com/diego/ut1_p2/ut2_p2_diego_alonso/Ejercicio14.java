/*
Nombre: Diego
Fecha: 12/11/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio14.java
Descripción: Adivina el numero
*/
package com.diego.ut1_p2.ut2_p2_diego_alonso;
import java.util.Scanner;


public class Ejercicio14 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        int contadorprimos = 0;
        int contador1;
        int contador2;
        int contador3 = 1;
        
        boolean primo = true;
        
        System.out.println("Dime un numero y te digo los primos que hay hasta el");
        numero= sc.nextInt();
        
        for (contador1 = 1; contador1 <= numero; contador1++) {
            primo = true;
            for (contador2 = 2; contador2 < contador1; contador2++) {
                if (contador1 % contador2 == 0) {
                    primo = false;
                    System.out.println("  " + contador1 + " | " + "no es primo");
                    System.out.println("---------------------------");
                    break;
                }
            }
            if (primo) {
                System.out.println("  " + contador1 + " | " + "es primo");
                System.out.println("---------------------------");
                contadorprimos++;
            }
        }
        System.out.println("Entre 1 y " + numero + ", hay " + contadorprimos + " números primos.");
    }
}
