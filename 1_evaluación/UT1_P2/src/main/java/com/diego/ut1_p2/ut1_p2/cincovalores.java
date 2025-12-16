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
public class cincovalores {
        public static void main(String[] args) {
        int numero;
        int apoyo = 1;
        Scanner sc = new Scanner(System.in);
        for (int u = 0; u != 5; u++){
            System.out.println("Dime un numero");
            numero = sc.nextInt();
            apoyo = apoyo * numero;
        }
        System.out.println("El resultado es " + apoyo);
    } 
}
