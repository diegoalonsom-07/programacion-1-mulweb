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
public class decirnumero2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int maximo = 0;
        int minimo = 2147483647;
        int numero2;
        int maxmax = 1;
        int maxmin = 1;

        while (true) {
            System.out.print("Introduce un numero positivo: ");
            numero = sc.nextInt();
            if (numero > 0) {
                break;
            } else {
                System.out.println("Has puesto un numero negativo.");
            }
        }
        while (numero != 0) {
            numero--;
            System.out.print("Introduce un numero entero positivo: ");
            numero2 = sc.nextInt();

            if (numero2 > maximo) {
                maximo = numero2;
                maxmax=0;
            } else if (numero2 < minimo) {
                minimo = numero2;
                maxmin=0;
            }
            if (maximo == numero2) {
                maxmax++;
            }
            if (minimo == numero2){
                maxmin++;
            }
        }
        System.out.println("El valor maximo introducido es: " + maximo);
        System.out.println("Las veces que ha salido es: " + maxmax);
        System.out.println("-----------------------------------------------------");
        System.out.println("El valor minimo introducido es: " + minimo);
        System.out.println("Las veces que ha salido es: " + maxmin);

    }
}
