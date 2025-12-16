/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.ut1_p2.ut1_p2;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class tablamult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Introduce un numero del 1 al 10: ");
            numero = sc.nextInt();
            if (numero >= 1 && numero <= 10) {
                break;
            } else {
                System.out.println("Has puesto un numero que no toca");
            }
        }
        for (int i = 0; i <= 10; i++) {
            int resultado = i * numero;
            System.out.println(numero + " * " + i + " = " + resultado);
        }

    }
}
