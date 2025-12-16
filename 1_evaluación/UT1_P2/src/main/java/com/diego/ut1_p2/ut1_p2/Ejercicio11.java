/*
Nombre: Diego
Fecha: 07/10/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio11.java
Descripción: Calcular las medias del curso;
*/
package com.diego.ut1_p2.ut1_p2;
import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que nota has sacado en el primer trimestre?");
        int primer = sc.nextInt();
        
        System.out.println("Que nota has sacado en el segundo trimestre?");
        int segundo = sc.nextInt();
        
        System.out.println("Que nota has sacado en el tercero trimestre?");
        int tercero = sc.nextInt();
        
        double expediente = ((primer+segundo+tercero)/3.0);
        System.out.println("La nota en tu expediente es de un " + String.format("%1$,.2f", expediente));
        
        int boletin = (int) expediente;
        System.out.println("La nota en tu boletin es de un " + boletin);      
        
    } 
}
