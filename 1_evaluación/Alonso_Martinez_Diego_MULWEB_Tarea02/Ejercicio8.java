/*
Nombre: Diego
Fecha: 07/10/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio8.java
Descripción: Indicar si el numero es par o impar;
*/
package com.diego.ut1_p2.ut1_p2;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero = sc.nextInt();
        
        String mensaje = (numero % 2 == 0) ? "El numero es par" : "El numero es impar";     
        
        System.out.println(mensaje);
    }
}