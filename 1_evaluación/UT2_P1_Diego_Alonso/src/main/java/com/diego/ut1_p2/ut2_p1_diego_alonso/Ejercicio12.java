/*
    Nombre: Diego Alonso Martinez
    Fecha: 27/10/2025
    Grupo: MULWEB 1º
    Nombre del ficher: Ejercicio12
    Descripción: Tu fecha existe
*/
package com.diego.ut1_p2.ut2_p1_diego_alonso;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        int mes, dias;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un mes");
        mes = sc.nextInt();

        System.out.println("Dime cuantos dias tiene ese mes (ferbrero sin ser bisiesto)");
        dias = sc.nextInt();
        
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if (dias == 31) {
                System.out.println("Has dicho la verdad");
            } else {
                System.out.println("Has dicho una mentira");
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ){
            if (dias == 30) {
                System.out.println("Has dicho la verdad");
            } else {
                System.out.println("Has dicho una mentira");
            }
        } else {
            if (dias == 28) {
                System.out.println("Has dicho la verdad");
            } else {
                System.out.println("Has dicho una mentira");
            }
        }
    }
}
