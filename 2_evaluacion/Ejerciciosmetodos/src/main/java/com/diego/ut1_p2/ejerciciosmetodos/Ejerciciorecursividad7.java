/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.ut1_p2.ejerciciosmetodos;

import java.util.Scanner;

public class Ejerciciorecursividad7 {

    public static void main(String[] args) {
        System.out.print("\b=" + suma(4));
    }

    static int suma(int n) {
        if (n == 1) {
            System.out.print("1+");
            return n;
        } else {
            int aux=suma(n-1);
            System.out.print(n + "+");
            return n + aux;
        }
    }
}
