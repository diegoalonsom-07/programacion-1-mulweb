
package com.mycompany.examen1eva;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        
        int total = 0;
        int numero;
        
        System.out.println("Dime numeros que te los voy sumando | -1 cancelar");
        numero = sc.nextInt();
        
        while(numero != -1){
            total += numero;
            System.out.println("Dime numeros que te los voy sumando | -1 cancelar");
        numero = sc.nextInt();
        }
        System.out.println(total);
      
    }
}
