
package com.mycompany.examen1eva;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        int altura;
        char caracter;
        int contador;
        int contador1;
        
        System.out.println("Dime la altura de tu triangulo rectángulo");
        altura = sc.nextInt();
        
        System.out.println("Dime el caracter de relleno");
        caracter = sc.next().charAt(0);
        
        System.out.println("------------------------------------------");
        
        for (contador = 1; contador <= altura; contador++){
            for (contador1 = 1; contador1 <= contador; contador1++){
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
