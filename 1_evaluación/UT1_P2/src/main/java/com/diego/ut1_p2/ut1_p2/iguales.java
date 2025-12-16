
package com.diego.ut1_p2.ut1_p2;

import java.util.Scanner;


public class iguales {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero1 = sc.nextInt();
        
        System.out.println("Dime otro numero");
        int numero2 = sc.nextInt();  

        if (numero1 == numero2){
            System.out.println("Los numeros son iguales");
        } else if (numero1 > numero2) {
            System.out.println("El primero es mayor que el sugundo");
        } else {
            System.out.println("El segundo es mayor que el primero");
        }
        
    }  
}
