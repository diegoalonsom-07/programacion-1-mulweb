/*
Nombre: Diego
Fecha: 07/10/2025
Grupo: 1º MULWEB
Nombre del fichero: Ejercicio9.java
Descripción: Indicar al usuario si se puede salir;
*/
package com.diego.ut1_p2.ut1_p2;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Esta lloviendo afuera? (true o false)");
        boolean llueve = sc.nextBoolean();
        
        System.out.println("Has finalizado las tareas? (true o false)");
        boolean tareas = sc.nextBoolean();
        
        System.out.println("Necesitas ir a la biblioteca? (true o false)");
        boolean biblioteca = sc.nextBoolean();
        
        boolean salir = (!llueve && tareas) || biblioteca;
        
        String accion = (salir)? "Puedes salir" : "No puedes salir";
        
        System.out.println(accion);
    }    
}
