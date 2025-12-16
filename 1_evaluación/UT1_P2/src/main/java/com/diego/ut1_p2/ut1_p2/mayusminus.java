/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.ut1_p2.ut1_p2;
import java.util.Scanner;

public class mayusminus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un carácter: ");
        String texto = sc.nextLine();
        
        char caracter = texto.charAt(0);
        
        if (caracter >= 'a' && caracter <= 'z') {
            caracter = (char) (caracter - 32);
        } else if (caracter >= 'A' && caracter <= 'Z') {
            caracter = (char) (caracter + 32);
        }
        
        System.out.println("Resultado: " + caracter);
    }
}
