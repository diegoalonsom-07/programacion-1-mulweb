/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.diego.ut3_p1.ejerciciosarrays;
import java.util.Scanner;

public class EjerciciosArrays {
    static Scanner sc = null;
    public static void main(String[] args) {
        menu();
    }

    static void menu() {

        sc = new Scanner(System.in);

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|           MENU DE EJERCICIOS DE STRINGS -  (NAVIDAD)            |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("|                                                                 |");
        System.out.println("|   1.- Ejercicio 1                                               |");
        System.out.println("|   2.- Ejercicio 2                                               |");
        System.out.println("|   3.- Ejercicio 3                                               |");
        System.out.println("|   0.- Salir                                                     |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("|                                                                 |");
        System.out.println("|                        ELIGE UNA OPCION                         |");
        System.out.println("|_________________________________________________________________|");

        String opcion = sc.nextLine();
        
        switch (opcion) {
            /*
                case "1":
                    int [] num;
                    num = new int[8]; 
                    for ()
                    ejercicio1();
                    menu();
                    break;
            */
            case "2":
                int [] num2;
                num2 = new int[8];
                for (int i = 0; i < num2.length; i++) {
                    System.out.println("Introduce un numero: ");
                    num2[i] = sc.nextInt();
                }
                ejercico2(num2);
                menu();
                break;
            case "3":
                    ejercicio3();
                    menu();
                    break;
            case "0":
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion no valida");
                menu();
                break;
        }
    }
    static void ejercicio1(){

    }
    static boolean ejercico2(int[] num2){
        for (int i = 0; i < num2.length - 1; i++) {
            if(num2[i] >= num2[i + 1]){
                System.out.println("El array no esta ordenado");
                return false;
            }
        }
        System.out.println("El array esta ordenado");
        return true;
    }

    static void ejercicio3(){
	String [] frase = new String[5];
	String larga = "";

	for (int i = 0; i < frase.length; i++) {
		System.out.println("Introduce una palabra: ");
		frase[i] = sc.nextLine();
	}

	for (int i = 0; i < frase.length - 1; i++) {
		if (frase[i].length() > frase[i + 1].length()) {
			larga = frase[i];
		}
	}
    System.out.println("La frase mas larga es: " + larga);
}
}
