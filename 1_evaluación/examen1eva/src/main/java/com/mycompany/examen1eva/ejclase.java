/*
    Un centro de investigación de la flora urbana necesita una aplicación que 
    muestre cuál es el árbol más alto. Para ello se introducirá por teclado 
    la altura (en centímetros) de cada árbol (terminando cuando se utilice -1 como 
    altura). Los árboles se identifican mediante etiquetas con números únicos 
    correlativos, comenzando en 0. Se pide diseñar una aplicación que resuelva 
    el problema planteado.
 */
package com.mycompany.examen1eva;
import java.util.Scanner;


public class ejclase {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        double altura;
        double max = 0;
        int contador;
        String resultado = "";
        
        System.out.println("Dime la altura de tus arboles | -1 sales");
        altura = sc.nextInt();
        
        for (contador = 0; altura != -1; contador++){
            if (altura > max){
                max = altura;
                resultado = "El numero máximo es: " + contador + " | " + max + "cm";
            }
            System.out.println("Dime la altura de tus arboles | -1 sales");
            altura = sc.nextInt();
        }
        System.out.println(resultado);
    }
}
