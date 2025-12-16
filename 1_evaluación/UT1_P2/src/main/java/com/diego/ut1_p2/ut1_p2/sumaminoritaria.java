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
public class sumaminoritaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = sc.nextInt();
        int apoyo = numero;
        int total = numero;
        if (numero >1){
            while (apoyo != 0){
                apoyo--;
                total = apoyo + total;
            }
        } else {
            System.out.println("Tu numero es menor que uno");
        }
            
        System.out.println(total);

    }
}
