/* 

    Nombre: Diego Alonso Martinez

    Fecha: 03/10/2025

    Grupo: MULWEB 1º

    Nombre del fichero: ejercicio17.java 

    Descripción: Es una pequeña calculadora que suma dos nuemeros

*/ 
package tarea01.diego;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class ejercicio17 {

    public static void main(String[] arg) {

        int num1, num2, sumandos;

        num1 = num2 = 0;

        sumandos = num1 + num2;

        System.out.println("La suma de " + num1 + " + " + num2 + " es el número " + sumandos);

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduzca un número: ");

        num1 = leer.nextInt();

        System.out.print("Introduzca otro número: ");

        num2 = leer.nextInt();

        sumandos = num1 + num2;

        System.out.println("La suma es: " + sumandos);

    }

}
