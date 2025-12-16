
package com.mycompany.examen1eva;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        
        int temperatura;
        
        System.out.println("Indicame cual es la temperatura de tu zona");
        temperatura = sc.nextInt();
        
        if (temperatura < 0){
            System.out.println("Helada");
        } else if (temperatura <= 10){
            System.out.println("Fría");
        } else if (temperatura <= 15){
            System.out.println("Templada");
        } else {
            System.out.println("Calurosa");
        }
    }
}
