/*
    Nombre: Diego Alonso Martinez
    Fecha: 24/10/2025
    Grupo: MULWEB 1º
    Nombre del ficher: Ejercicio7
    Descripción: mayor a menor de 3
*/
package com.diego.ut1_p2.ut2_p1_diego_alonso;

import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
        int mayor, menor, medio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int n1 = sc.nextInt();
        
        System.out.println("Dime otro numero");
        int n2= sc.nextInt();
        
        System.out.println("Dime otro numero");
        int n3 = sc.nextInt();
        
        if ((n1>n2) && (n2>n3)){
            System.out.println(n1 + ", " + n2 + ", " + n3);
            mayor = n1;
            medio = n2;
            menor = n3;
        } else if (n2>n3 && n3>n1){
            System.out.println(n2 + ", " + n3 + ", " +n1);
            mayor = n2;
            medio = n3;
            menor = n1;
        } else if (n2>n1 && n1>n3){
            System.out.println(n2 + ", " + n1 + ", " +n3);
            mayor = n2;
            medio = n1;
            menor = n3;
        } else if ((n1>n2) && (n3>n2)){
            System.out.println(n1 + ", " + n3 + ", " +n2);
            mayor = n1;
            medio = n3;
            menor = n2;
        } else if ((n3>n2) && (n2>n1)){
            System.out.println(n3 + ", " + n2 + ", " +n1);
            mayor = n3;
            medio = n2;
            menor = n1;
        } else {
            System.out.println(n3 + ", " + n1 + ", " +n2);
            mayor = n3;
            medio = n1;
            menor = n2;
        }
    }  
}
