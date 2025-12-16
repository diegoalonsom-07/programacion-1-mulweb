/*
    Nombre: Diego Alonso Martinez
    Fecha: 27/10/2025
    Grupo: MULWEB 1º
    Nombre del ficher: Ejercicio13
    Descripción: Hora mas un segundo
*/
package com.diego.ut1_p2.ut2_p1_diego_alonso;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora: ");
        int hora = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int minuto = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int segundo = sc.nextInt();

        segundo++;

        if (segundo == 60) {
            segundo = 0;
            minuto++;
        }

        if (minuto == 60) {
            minuto = 0;
            hora++;
        }

        if (hora == 24) {
            hora = 0;
        }

        System.out.println("Hora actual + 1 segundo: ["+ hora + ":"+ minuto + ":" + segundo + "]");
    }
}
