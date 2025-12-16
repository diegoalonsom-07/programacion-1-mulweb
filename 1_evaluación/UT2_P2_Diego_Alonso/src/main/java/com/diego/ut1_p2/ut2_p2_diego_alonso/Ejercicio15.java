/*
Nombre: Diego
Fecha: 14/11/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio15.java
Descripción: menu para hacer figuras
*/
package com.diego.ut1_p2.ut2_p2_diego_alonso;
import java.util.Scanner;


public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;           
        int lados;
        boolean relleno;       
        char caracter = '*';         
        int altura;
        int anchura;
        int i;
        int j;
        
        do {
            System.out.println("-----------------------------------");
            System.out.println("Selecciona una opción:");
            System.out.println("1) Dibujar figura de 3 lados.");
            System.out.println("2) Dibujar figura de 4 lados.");
            System.out.println("3) Salir.");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            
            if (opcion == 1 | opcion == 2){
                if (opcion == 1){
                    lados = 3;
                } else {
                    lados = 4;
                }
                
                System.out.println("-----------------------------------");
                System.out.println("Has elegido una figura de " + lados + " lados.");
                System.out.println("-----------------------------------");
                
                System.out.print("¿Deseas que tenga relleno? (true/false): ");
                relleno = sc.nextBoolean();
                System.out.println("-----------------------------------");
                
                if (relleno){
                    System.out.print("Introduce el carácter de relleno: ");
                    caracter = sc.next().charAt(0); //No existe un nextChar asi que se pone esto
                    System.out.println("-----------------------------------");
                }
                
                if (lados == 3){
                    System.out.print("Introduce la altura del triángulo: ");
                    altura = sc.nextInt();
                    
                    System.out.println("------------ TRIANGULO ------------");
                    
                    for (i = 1; i <= altura; i++) {           
                        for (j = 1; j <= i; j++) {           
                                System.out.print(caracter);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    
                } else {
                    System.out.print("Introduce la altura del cuadrado: ");
                    altura = sc.nextInt();
                    
                    System.out.println("-----------------------------------");
                    System.out.print("Introduce la anchura del cuadrado: ");
                    anchura = sc.nextInt();
                    
                    System.out.println("------------- CUADRADO ------------");
                    
                    for (i = 1; i <= altura; i++) {       
                        for (j = 1; j <= anchura; j++) {       
                                System.out.print(caracter);  
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
            } else if (opcion == 3){
                System.out.println("-----------------------------------");
                System.out.println("Chao pescao");
            } else {
                System.out.println("-----------------------------------");
                System.out.println("Opción no válida.");
            }
        caracter = '*';
        }while (opcion != 3);
    }
}

