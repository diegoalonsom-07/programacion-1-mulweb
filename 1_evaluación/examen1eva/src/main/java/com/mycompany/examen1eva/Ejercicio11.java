
package com.mycompany.examen1eva;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        
        int limiteSuperior = 100;
        int contador;
        int suma3 = 0;
        int suma5 = 0;
        int sumaamnbos = 0;
        
        for (contador = 1; contador <= limiteSuperior; contador++){
            if (contador % 3 == 0 && contador % 5 != 0){
                suma3++;
            } else if(contador % 5 == 0 && contador % 3 != 0){
                suma5++;
            } else if(contador % 5 == 0 && contador % 3 == 0){
                sumaamnbos++;
            }
        }
        System.out.println("3 | " + suma3 + " \t 5 | " + suma5 + " \t 3 y 5 | " + sumaamnbos);
    }
}
