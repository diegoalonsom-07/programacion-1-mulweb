package com.diego.ut1_p2.ut1_p2;

import java.util.Scanner;


public class pares {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero y te digo si es par");
        int numero = sc.nextInt();
        
        int divi = (numero%2);
        
        if (divi == 1){
            System.out.println("Tu número es impar");
        } else {
            System.out.println("Tu número es par");
        }
        
    } 
}
