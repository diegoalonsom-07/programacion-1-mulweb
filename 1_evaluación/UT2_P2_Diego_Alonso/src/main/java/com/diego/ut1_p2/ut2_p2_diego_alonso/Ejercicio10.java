/*
Nombre: Diego
Fecha: 12/11/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio10.java
Descripción: Producto de los 10000 primeros números impares
*/
package com.diego.ut1_p2.ut2_p2_diego_alonso;



public class Ejercicio10 {
    public static void main(String[] args) {
        double contador;
        double resultado = 1;
        
        System.out.println("El producto de los 10000 primeros números impares es:");
        
        for (contador=0; contador<=10000; contador++){
            if(contador%2 == 1){
                resultado *= contador;
            }
        }
        System.out.println(resultado);
    }
}
