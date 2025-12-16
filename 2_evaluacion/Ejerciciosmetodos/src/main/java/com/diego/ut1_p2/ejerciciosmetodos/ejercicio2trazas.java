/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.ut1_p2.ejerciciosmetodos;

/**
 *
 * @author Vespertino
 */
public class ejercicio2trazas {

    public class Ejemplo {

        static int procesol(int a) {
            int x = 0;
            for (int i = 0; i <= a; i += 2) {
                x += proceso2(i, i + 1);
            }
            return x;
        }

        static int proceso2(int a, int b) {
            int y = 1;
            for (int j = 0; j < a + b; j++) {
                y++;
            }
            return y;
        }

        public static void main(String[]args) {
            int x = procesol(4);
            System.out.println(x);
        }
    }
}
