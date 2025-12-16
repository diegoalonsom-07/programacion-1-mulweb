/*
    Nombre: Diego Alonso Martinez
    Fecha: 28/10/2025
    Grupo: MULWEB 1º
    Nombre del ficher: Ejercicio15
    Descripción: dia de la semana
 */
package com.diego.ut1_p2.ut2_p1_diego_alonso;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero que haga referencia a un día de la semana");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Hoy es lunes");
                break;
            case 2:
                System.out.println("Hoy es martes");
                break;
            case 3:
                System.out.println("Hoy es miercoles");
                break;
            case 4:
                System.out.println("Hoy es jueves");
                break;
            case 5:
                System.out.println("Hoy es viernes");
                break;
            case 6:
                System.out.println("Hoy es sabado");
                break;
            case 7:
                System.out.println("Hoy es domingo");
                break;
            default:
                System.out.println("Ese numero no hace referencia a ningun día");
                break;
        }
    }
}
