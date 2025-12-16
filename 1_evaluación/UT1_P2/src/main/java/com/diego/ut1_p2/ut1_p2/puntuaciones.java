/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.ut1_p2.ut1_p2;

import java.util.Scanner;

public class puntuaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        double numero = sc.nextInt();
        double puntuacion = numero;
        while (numero != 0) {
            puntuacion = numero + puntuacion;

            System.out.println("Introduce un número");
            numero = sc.nextInt();

        }
        if (puntuacion <= 3000 && puntuacion >= 2000) {
            puntuacion = puntuacion * 0.3;
        } else {
            puntuacion = puntuacion * 0.2;
        }
        System.out.println(puntuacion);

    }
}
