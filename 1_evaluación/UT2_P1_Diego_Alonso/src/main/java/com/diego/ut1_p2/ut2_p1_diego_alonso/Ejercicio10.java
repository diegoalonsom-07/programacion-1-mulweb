/*
    Nombre: Diego Alonso Martinez
    Fecha: 27/10/2025
    Grupo: MULWEB 1º
    Nombre del ficher: Ejercicio10
    Descripción: Es un numero capicua?
*/
package com.diego.ut1_p2.ut2_p1_diego_alonso;
import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String[] args) {
        int numero, u , d, c, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero del 0 al 9.999");
        numero = sc.nextInt();
        u = numero % 10;
        d = (numero % 100)%10;
        c = (numero % 1000)%10;
        m = (numero % 1000)%10;
        
        if (numero < 9){
            System.out.println("Tu numero siempre es capicua");
            
        } else if (numero > 9 && numero < 99){
            if (u == d) {
                System.out.println("Tu numero es capicua");
            } else {
                System.out.println("Tu numero no es capicua");
            }
            
        } else if (numero > 99 && numero < 999){
            if (u == c) {
                System.out.println("Tu numero es capicua");
            } else {
                System.out.println("Tu numero no es capicua");
            }
            
        } else if (numero > 999 && numero < 9999){
            if (u == m && d==c) {
                System.out.println("Tu numero es capicua");
            } else {
                System.out.println("Tu numero no es capicua");
            }
        }
    } 
}
