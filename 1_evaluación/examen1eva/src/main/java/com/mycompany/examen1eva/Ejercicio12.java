
package com.mycompany.examen1eva;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        
        int h;
        int contador1;
        int contador2;
        char par;
        char impar;
        
        System.out.println("Dime la altura del triangulo rectangulo");
        h = sc.nextInt();
        
        System.out.println("Dime un simbolo para las lineas pares");
        par = sc.next().charAt(0);
        
        System.out.println("Dime un simbolo para las lineas impares");
        impar = sc.next().charAt(0);
        System.out.println();
        
        for(contador1 = 1; contador1 <= h; contador1++){
            for (contador2 = 1; contador2 <= contador1; contador2 ++){
                if (contador1 % 2 == 0){
                   System.out.print(par);
                } else {
                    System.out.print(impar);
                }
            }
            System.out.println();
        }
        
        
        
    }
}
