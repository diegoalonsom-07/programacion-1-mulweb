
package com.mycompany.examen1eva;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        
        int numero;
        int pares = 0;
        int impares = 0;
        
        System.out.println("Dime numeros enteros positivos y te digo si son pares o impares, al final te haré un recuento");
        numero = sc.nextInt();
        
        while (numero != -1){
            if(numero % 2 == 0){
                System.out.println("------------------------");
                System.out.println(numero + " | es par");
                pares++;
            } else {
                System.out.println("------------------------");
                System.out.println(numero + " | es impar");
                impares++;
            }
            System.out.println("Dime otro numero");
            numero = sc.nextInt();
        }
        System.out.println("--------------------------------------------------");
        System.out.println("La cantidad de numeros pares es de: " + pares);
        System.out.println("La cantidad de numeros impares es de: " + impares);
    }
}
