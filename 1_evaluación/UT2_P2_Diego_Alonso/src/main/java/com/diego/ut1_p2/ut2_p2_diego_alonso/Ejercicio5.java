/*
Nombre: Diego
Fecha: 11/11/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio5.java
Descripción: par, impar, positivo y cuadrado; 
*/
package com.diego.ut1_p2.ut2_p2_diego_alonso;
import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.println("Dime un numero y te diré si es par o impar, si es positivo y su cuadrado");
        numero = sc.nextInt();
        int cuadrado;
        
        while (numero != 0){
            if (numero % 2 == 0){
                System.out.println(numero + " es par.");
            }else{
                System.out.println(numero + " es impar.");
            }
            
            if (numero > 0){
                System.out.println(numero + " es positivo.");
            }else {
                System.out.println(numero + " es negativo.");
            }
            cuadrado = numero*numero;
            System.out.println("El cuadrado de " + numero + " es " + cuadrado);
            System.out.println("--------------------------------------------");
            System.out.println("Inserte otro número (con el 0 sales)");
            numero = sc.nextInt();
        }
    }
}
