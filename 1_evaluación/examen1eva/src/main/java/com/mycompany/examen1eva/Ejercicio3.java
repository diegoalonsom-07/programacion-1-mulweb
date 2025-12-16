
package com.mycompany.examen1eva;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    
    double altura;
    double radio;
    double area;
    int opcion;
    
    System.out.println("1) area del cuadrado");
    System.out.println("2) area de un círculo");
    opcion = sc.nextInt();
    
    switch(opcion){
        case 1:
            System.out.println("Dime los cm de un lado");
            altura = sc.nextDouble();
            
            area = altura * altura;
            System.out.println("El area de tu cuadrado es de " + area);
            break;
        case 2:
            System.out.println("Dime los cm del radio");
            radio = sc.nextDouble();
            
            area = Math.PI * (radio * radio);
            System.out.println("El area de tu cuadrado es de " + area);
            break;
        default:
            System.out.println("Opción incorrecta");
            break;
    }
    } 
}
