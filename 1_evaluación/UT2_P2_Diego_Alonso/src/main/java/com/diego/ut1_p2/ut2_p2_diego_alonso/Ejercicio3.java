/*
Nombre: Diego
Fecha: 07/11/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio3.java
Descripción: Poner del revés los numeros
*/
package com.diego.ut1_p2.ut2_p2_diego_alonso;
import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int numero1 = sc.nextInt();
        
        int numero2 = numero1; 
        int numero3 = 0;

        while (numero1 > 0) {
            int cifra = numero1 % 10;
            numero3 = numero3 * 10 + cifra;
            numero1 = numero1 / 10;
        }

        System.out.println("El número original es: " + numero2);
        System.out.println("El número invertido es: " + numero3);
        

    }  
}
