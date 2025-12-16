
package com.mycompany.examen1eva;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        
        System.out.print("Dime un dia de la semana con el numero que le corresponda: ");
        opcion = sc.nextInt();
        
        switch (opcion){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("El dia escogido es laborable");
                break;
                
            case 6:
            case 7:
                System.out.println("El dia escogido es festivo");
                break;
                
            default:
                System.out.println("Numero no valido");
                break;            
        }
    }
}
