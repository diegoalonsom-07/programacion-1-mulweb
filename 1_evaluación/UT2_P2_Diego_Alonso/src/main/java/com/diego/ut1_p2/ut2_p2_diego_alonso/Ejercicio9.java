/*
Nombre: Diego
Fecha: 12/11/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio9.java
Descripción: Multiplos del 7
*/
package com.diego.ut1_p2.ut2_p2_diego_alonso;



public class Ejercicio9 {
    public static void main(String[] args) {
        int contador;
        
        System.out.println("Los multiplos del 7 son: ");
        
        for (contador=0; contador<=100; contador++){
            if(contador%7 == 0){
                System.out.println(contador);
            }
        }
    }
}
