/*
Nombre: Diego
Fecha: 07/11/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio2.java
Descripción: suma de numeros hasta que meta un 0 o menos
*/
package com.diego.ut1_p2.ut2_p2_diego_alonso;
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime numeros que te los voy sumando, si sale 0 o menos te dare la solución");
        int numero = sc.nextInt();
        int suma = 0;
        String resultado = "los numeros que se pueden sumar que son: ";
        resultado+=numero;
        suma=numero;
        
        while (numero > 0){
           

            System.out.println("Dime numeros que te los voy sumando, si sale 0 o menos te dare la solución");
            numero = sc.nextInt();
             
            if(numero!=0){
            suma = suma+numero;
            resultado +=  " + "+numero;
            }
            
        }
        System.out.println("El resultado de la suma de " + resultado + ". Es de " + suma);

    }  
}
