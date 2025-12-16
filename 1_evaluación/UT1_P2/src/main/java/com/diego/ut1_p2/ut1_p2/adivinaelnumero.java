package com.diego.ut1_p2.ut1_p2;

import java.util.Scanner;

public class adivinaelnumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Estoy pensando un numero del 0 al 10. ADIVINALO!!!");
        int numero = (int) Math.random();
        numero = numero * 10;

        System.out.println("Dime un numero");
        int adivinar = sc.nextInt();

        while (numero != adivinar) {
            System.out.print("No lo has acertado pero te doy una pista: ");
            if (numero > adivinar) {
                System.out.println("Tu numero es mas pequeño que el mio");
            } else {
                System.out.println("Tu numero es mas grande que el mio");
            }
            System.out.println("Vuelve a intenralo, inserta un numero:");
            adivinar = sc.nextInt();

        }
        System.out.println("Lo has acertado");
    }
}
