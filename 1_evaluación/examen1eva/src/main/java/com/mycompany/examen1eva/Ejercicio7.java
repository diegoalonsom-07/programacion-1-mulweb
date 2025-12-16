
package com.mycompany.examen1eva;
import java.util.Scanner;


/**
 *
 * @author diego
 */
public class Ejercicio7 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        int a;
        int b;
        int multiplo;
        int contador;
        
        System.out.println("Dime el mínimo de un rango");
        a = sc.nextInt();
        
        System.out.println("Dime el maximo de un rango");
        b = sc.nextInt();
        
        System.out.println("Dime un multiplo");
        System.out.println("-----------------------");
        multiplo = sc.nextInt();
        
        for (contador = a; contador <= b; contador++){
            if (contador % multiplo == 0){
                System.out.println( contador + " | Multiplo de " + multiplo);
                System.out.println("-----------------------");
            } else {
                System.out.println( contador + " | No es multiplo de " + multiplo);
                System.out.println("-----------------------");
            }
        }
    }
}
