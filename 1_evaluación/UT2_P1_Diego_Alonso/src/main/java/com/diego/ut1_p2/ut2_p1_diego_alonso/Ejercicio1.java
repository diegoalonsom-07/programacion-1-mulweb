/*
    Nombre: Diego Alonso Martinez
    Fecha: 24/10/2025
    Grupo: MULWEB 1º
    Nombre del ficher: Ejercicio1
    Descripción: Par o impar
*/

package com.diego.ut1_p2.ut2_p1_diego_alonso;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero y te digo si es par");
        int numero = sc.nextInt();
        
        int divi = (numero%2);
        
        if (divi == 1){
            System.out.println("Tu número es impar");
        } else {
            System.out.println("Tu número es par");
        }
    }
}
