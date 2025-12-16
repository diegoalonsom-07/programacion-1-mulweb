/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.ut1_p2.ejerciciosmetodos;

import java.util.Scanner;

public class Ejerciciorecursividad6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;

        System.out.println("Dime una palabra y te digo si esta ordenada alfabéticamente");
        palabra = sc.nextLine();

        palabra = palabra.toLowerCase();

        alfabeticamente(palabra);

    }

    static boolean alfabeticamente(String palabra) {
        int largura = palabra.length();
        if (palabra.charAt(0) > palabra.charAt(1)) {
            return false;
        } else {
            if (palabra.charAt(0) > palabra.charAt(1) && largura == 2) {
                return true;
            } else {
                return alfabeticamente(palabra.substring(1, largura));
            }
        }

    }
}
