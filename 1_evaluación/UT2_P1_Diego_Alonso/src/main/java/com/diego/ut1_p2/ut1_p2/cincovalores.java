
package com.diego.ut1_p2.ut1_p2;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class cincovalores {
    public static void main(String[] args) {
        int numero;
        int apoyo;
        for (int u = 0; u == 5; u++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime un numero");
            numero = sc.nextInt();
            apoyo = numero;
            apoyo = apoyo * numero;
            System.out.println(apoyo);
        }
    } 
} 

