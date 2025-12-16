/*
Nombre: Diego
Fecha: 10/11/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio4.java
Descripción: Suma de números segun una condición
*/
package com.diego.ut1_p2.ut2_p2_diego_alonso;
import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumatotal = 0;
        int numero = 0;
        
        String numerotxt;
        
        int largura = 0;
        
        int aux = numero;
        int sumaCifras = 0;
        int contador = 0;
        
        String resultado = "los numeros que se pueden sumar que son: ";
        
        System.out.println("Inserte numeros que se la suma de sus digitos es su largura, se sumaran con el resto: ");
        numero = sc.nextInt();
        
        while(numero != 0){
            numerotxt = String.valueOf(numero);
            largura = numerotxt.length();
            aux = numero;
            while (aux > 0) {
                sumaCifras += aux % 10;
                aux /= 10;
            }
            if (largura == sumaCifras) {
                sumatotal += numero;
                if (contador == 0){
                    resultado += numero;
                    contador++;
                }else{
                    resultado +=  " + "+numero;
                }
            }
            System.out.println("Inserte el siguiente numero: ");
            numero = sc.nextInt();
            sumaCifras = 0;
        }
        System.out.println("-----------------------------------------------");
        System.out.println("El resultado de la suma de " + resultado + ". Es de " + sumatotal);
        
    }
}
