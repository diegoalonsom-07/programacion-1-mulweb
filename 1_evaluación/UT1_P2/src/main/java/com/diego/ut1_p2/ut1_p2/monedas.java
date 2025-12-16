
package com.diego.ut1_p2.ut1_p2;

import static java.lang.System.exit;
import java.util.Scanner;

public class monedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("|     ¿Cuantos dolares tienes?    |");
        System.out.println("-----------------------------------");
        double dolares = sc.nextDouble();
        
        System.out.println("----------------------------------------------------");
        System.out.println("|     Dime en que moneda lo quieres                |");
        System.out.println("|         1.-Yenes                                 |");
        System.out.println("|         2.-Euros                                 |");
        System.out.println("|         3.-Marcos                                |");
        System.out.println("|         4.-Todos                                 |");
        System.out.println("----------------------------------------------------");
        int moneda = sc.nextInt();
        
 

        switch (moneda) {
            case 1:
                double yen = dolares * 150.74;
                System.out.println("Tienes " + yen + " yenes");
                break;
            case 2:
                double euro = dolares * 0.86;
                System.out.println("Tienes " + euro + " euros");
                break;
            case 3:
                double marco = dolares * 1.68; 
                System.out.println("Tienes " + marco + " marcos");
                break;
            case 4:
                yen = dolares * 150.74;
                euro = dolares * 0.86;
                marco = dolares * 1.68; 
                System.out.println("Tienes " + yen + " yenes");
                System.out.println("Tienes " + euro + " euros");
                System.out.println("Tienes " + marco + " marcos");
            default:
                System.out.println("Se te sacará del programa");
                break;
        }
    }  
}
