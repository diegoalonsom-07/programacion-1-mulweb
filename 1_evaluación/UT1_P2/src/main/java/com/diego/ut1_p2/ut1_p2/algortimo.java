/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.ut1_p2.ut1_p2;
import java.util.Scanner;


public class algortimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una base");
        int base = sc.nextInt();
        System.out.println("Introduce un exponente");
        int exponente = sc.nextInt();
        int suma = 1;
        int base2 = base;
        while (suma != exponente){
            if (base < 0 || exponente < 0){
                System.out.print("Has introducido algun número negativo. Insertalos bien");
                        System.out.println("Introduce una base");
                        base = sc.nextInt();
                        System.out.println("Introduce un exponente");
                        exponente = sc.nextInt();
            } else {
                base2 = base2 * base;
                suma ++;
            }
        }
        System.out.println(base2);

    }
}
