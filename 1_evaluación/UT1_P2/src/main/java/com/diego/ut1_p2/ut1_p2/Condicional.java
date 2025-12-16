
package com.diego.ut1_p2.ut1_p2;
import java.util.Scanner;


public class Condicional {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Esta lloviendo afuera? (true o false)");
        boolean llueve = sc.nextBoolean();
        
        System.out.println("Has finalizado las tareas? (true o false)");
        boolean tareas = sc.nextBoolean();
        
        System.out.println("Necesitas ir a la biblioteca? (true o false)");
        boolean biblioteca = sc.nextBoolean();
        
        if (!llueve && tareas){
            System.out.println("Puedes salir a la calle");
        } else if (biblioteca){
            System.out.println("Puedes salir a la calle");
        } else {
            System.out.println("No puedes salir a la calle");
        }
        
    }
}
