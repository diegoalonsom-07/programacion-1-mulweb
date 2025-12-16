package com.mycompany.examen1eva;

import java.util.Scanner;


public class Pruebas{
    public static void main (String[]args){
            Scanner sc = new Scanner(System.in);

            int multiplicacion;
/*
            saludo(sc);

            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println();

            cubo(sc);

            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println();

            multiplicacion = multiplique(sc);

            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println();

            tablas(sc, multiplicacion);

            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println();
            
            parimpar(sc);

            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println();
    */        
            menu(sc);

            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println();
    }

    static void saludo(Scanner sc){
            String nombre;

            System.out.println("Dime tu nombre");
            nombre = sc.nextLine();

            System.out.println("Buenos días " + nombre);
    }

    static int cubo(Scanner sc){
            int cubo;

            System.out.println("Dime un numero que te lo pongo al cubo");
            cubo = sc.nextInt();

            cubo *=cubo * cubo;

            System.out.println("El cubo de tu numero es: " + cubo);
            return cubo;
    }

    static int multiplique(Scanner sc){
            int num1;
            int num2;
            int resultado;

            System.out.println("Dime el primer numero de la multiplicación");
            num1 = sc.nextInt();

            System.out.println("Dime el segundo numero de la multiplicación");
            num2 = sc.nextInt();

            resultado = num1*num2;

            System.out.println("El resultado de la multiplicación es " + resultado);

            return resultado;
    }

    static void tablas(Scanner sc, int multiplicacion){
        int contador;
        for (contador = 0; contador <= 10; contador++){
            System.out.println("---------------");
            System.out.println(multiplicacion + " * " + contador + " = " + (multiplicacion*contador));
        }
    }
    static void parimpar(Scanner sc){
        int num;
        System.out.println("Dime un numero");
        num = sc.nextInt();
        
        if (num % 2 == 0){
            System.out.println("Tu número es par");
        }else{
            System.out.println("Tu número es impar");
        }
    }
    static void menu(Scanner sc){
        int opcion;
        do{
            System.out.println("---------------");
            System.out.println("1.- Saludo");
            System.out.println("2.- Cubo");
            System.out.println("3.- Multiplicación");
            System.out.println("0.- Salir");
            System.out.println("---------------");
            opcion = sc.nextInt();
        }while(opcion == 0);
        switch(opcion){
            case 1:
                saludo(sc);
                break;
            case 2:
                cubo(sc);
                break;
            case 3:
                multiplique(sc);
                break;
            case 0:
                saludo(sc);
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
    }
    
}