package com.diego.ut1_p2.ut1_p2;
import java.util.Scanner;

public class decirnumero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int maximo = 0;
        boolean negativo = false; 
        

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce el número " + i + ": ");
            numero = sc.nextInt();
            

            
            if (numero < 0) {
                negativo = true;
            }
            
            if (numero > maximo) {
                maximo = numero;
            }
        }
        
        if (negativo) {
            System.out.println("Alguno de los números introducidos ha sido negativo.");
        } else {
            System.out.println("Ningún número introducido ha sido negativo.");
        }
        
        System.out.println("El valor máximo introducido es: " + maximo);
        
    }
}
