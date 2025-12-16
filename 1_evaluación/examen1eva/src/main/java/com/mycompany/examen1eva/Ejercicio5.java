
package com.mycompany.examen1eva;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        int numero;
        double contador;
        double total = 0;
        double media = 0;
        
        System.out.println("Dime numeros positivos que te voy haciendo la media. Negativo = acabar");
        numero = sc.nextInt();
        
        for (contador = 0; numero >= 0; contador++){
            total += numero;
            System.out.println("Dime numeros positivos que te voy haciendo la media. Negativo = acabar");
            numero = sc.nextInt();
        }
        media = total / contador;
        
        System.out.println(total + " | "+ contador + " | " + media);
        
    }
}
