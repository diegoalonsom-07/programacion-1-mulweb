/*
Nombre: Diego
Fecha: 11/11/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio7.java
Descripción: Contar
*/
package com.diego.ut1_p2.ut2_p2_diego_alonso;
import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador;
        
        System.out.print("Dime un nuero que te cuento hasta el ");
        numero = sc.nextInt();
        
        for (contador = 1; contador <= numero; contador++){
            System.out.println(contador);
        }
    }
}
