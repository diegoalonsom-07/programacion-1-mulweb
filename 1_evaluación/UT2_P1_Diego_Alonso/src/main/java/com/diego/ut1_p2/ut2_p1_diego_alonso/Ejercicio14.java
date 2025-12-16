/*
    Nombre: Diego Alonso Martinez
    Fecha: 28/10/2025
    Grupo: MULWEB 1º
    Nombre del ficher: Ejercicio14
    Descripción: Fecha mas un dia
 */
package com.diego.ut1_p2.ut2_p1_diego_alonso;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un dia: ");
        int dia = sc.nextInt();
        System.out.println("Introduce un mes: ");
        int mes = sc.nextInt();
        System.out.println("Introduce un ano: ");
        int año = sc.nextInt();

        dia++;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia >= 31) {
                dia = 1;
                mes++;
            }
            if (mes == 13) {
                mes = 1;
                año++;
            }
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia >= 30) {
                dia = 1;
                mes++;
            }
        }
        if (dia == 28){
            if (dia >= 28) {
                dia = 1;
                mes++;
            }
        }
        System.out.println("Fecha actual + 1 dia: [" + dia + "/" + mes + "/" + año + "]");
    }
}
