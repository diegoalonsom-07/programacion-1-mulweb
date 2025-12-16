/*
Nombre: Diego
Fecha: 12/11/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio8.java
Descripción: Numero de un rango
*/
package com.diego.ut1_p2.ut2_p2_diego_alonso;
import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minimo;
        int maximo;
        int numero;

        
        System.out.println("Dime el mínimo numero de un rango");
        minimo = sc.nextInt();
        
        System.out.println("Dime el máximo numero de un rango");
        maximo = sc.nextInt();

        System.out.println("Dime un numero que este en ese rango");
        numero = sc.nextInt();
        
        while (numero < minimo || numero > maximo){
            System.out.println("Ese numero no esta dentro del rango. Dime otro que si que lo este");
            numero = sc.nextInt();
        }
        System.out.println("El numero elegido en el rango es el " + numero);
    }
}
