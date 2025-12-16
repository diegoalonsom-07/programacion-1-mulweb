/*
    Nombre: Diego Alonso Martinez
    Fecha: 27/10/2025
    Grupo: MULWEB 1º
    Nombre del ficher: Ejercicio8
    Descripción: ecuación de segundo grado
*/
package com.diego.ut1_p2.ut2_p1_diego_alonso;
import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el valor de a");
        double a = sc.nextInt();
        
        System.out.println("Dime el valor de b");
        double b = sc.nextInt();
        
        System.out.println("Dime el valor de c");
        double c = sc.nextInt();
        
        double d = 4*a*c;
        
        double bb = b*b;
        
        double raiz = bb - d;
        
        double x1;
        double x2;
        
        x1 = ((-b + Math.sqrt(raiz)) / (2*a));
        x2 = ((-b - Math.sqrt(raiz)) / (2*a));
        
        if (raiz < 0.0) {
            System.out.println("La ecuación no tiene solución");
        }else{
            System.out.println("El resultado de la ecuación es " + x1 + " y " + x2);  
        }
    }  
}
