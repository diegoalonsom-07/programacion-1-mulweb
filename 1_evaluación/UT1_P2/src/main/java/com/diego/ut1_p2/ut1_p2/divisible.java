
package com.diego.ut1_p2.ut1_p2;
import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero1 = sc.nextInt();
        
        System.out.println("Dime otro numero");
        int numero2 = sc.nextInt();
        
        System.out.println("Ahora te dire si el primero es divisible entre el segundo");
        

        
        if (numero1 % numero2 == 0){
            System.out.println("El primero es divisible entre el sugundo");
        } else {
            System.out.println("El primero no es divisible entre el sugundo");
        }
        
    } 
}
