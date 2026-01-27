
package com.diego.ut3_p1.ut4_p1;
import java.util.Scanner;

public class UT4_P1 {

    static Scanner sc = null;
    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        sc = new Scanner(System.in);

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|         MENU DE LOS EJERCICIOS DE LA PRACTICA UNO TEMA 4        |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("|                                                                 |");
        System.out.println("|   1.- 10 numeros aleatorios                                     |");
        System.out.println("|   2.- Insertar N numeros y hacer medias con ellos               |");
        System.out.println("|   3.- Insertar N numeros y mostrarlos en orden inverso          |");
        System.out.println("|   4.- Te dire el maximo numero dentro de un array               |");
        System.out.println("|   5.- Te buscare un numero dentro de un array                   |");
        System.out.println("|   6.- Ordenar y eliminar numeros aleatorios de un array         |");
        System.out.println("|   7.- Contar divisores primos de un numero                      |");
        System.out.println("|   8.- Calculadora basica (Sum/Res/Mul/Div)                      |");
        System.out.println("|   0.- Salir                                                     |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("|                                                                 |");
        System.out.println("|                        ELIGE UNA OPCION                         |");
        System.out.println("|_________________________________________________________________|");

        try {
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    
                    System.out.println(" _________________________________________________________________");
                    System.out.println("|                                                                 |");
                    System.out.println("|             Te voy a meter 10 numeros aleatorios en             |");
                    System.out.println("|                             un array                            |");
                    System.out.println("|_________________________________________________________________|");
                    System.out.println();
                    
                    ejercicio1();
                    menu();
                    break;
                case "2":
                    ejercicio2();
                    menu();
                    break;
                case "3":
                    ejercicio3();
                    menu();
                    break;
                case "4":
                    int [] numeros4;
                    int max = 0;
                    
                    numeros4 = pedirArray();
                    
                    max = maximo(numeros4);
                    
                    System.out.println("El numero mas grande de los " + numeros4.length + " que has insertado es: " + max);
                    
                    menu();
                    break;

                case "5":
                    int [] numeros5;
                    int resultado = 0;
                    int clave = 0;

                    numeros5 = pedirArray();
                    
                    System.out.print("Dime el numero que quieres buscar: ");
                    clave = sc.nextInt();
                    
                    resultado = buscar(numeros5, clave);
                    
                    if (resultado == -1){
                        System.out.println("No se ha encontrado el numero");
                    } else {
                        System.out.println("El numero que estabas buscando esta en la posición nº: " + resultado);
                    }
                    
                    System.out.println();
                    
                    menu();
                    break;
                case "6":
                    int [] numeros6;
                    int [] numeros6or;
                    
                    numeros6 = pedirArray();
                    
                    numeros6or = ordenarArray(numeros6);
                    
                    sinRepetidos(numeros6or);
                    
                    
                    menu();
                    break;
                case "7":
                    //ejercicio7();
                    menu();
                    break;
                case "8":
                    //ejercicio8();
                    menu();
                    break;
                case "9":
                    //ejercicio9();
                    menu();
                    break;
                }
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar lo que se te pide");
            System.out.println();
            menu();
        } finally {
            sc.close();
        }
    }
    static void ejercicio1(){
        int contador;
        int[] numeros = new int[10];

        for (contador = 0; contador < numeros.length; contador++) {
            numeros[contador] = (int) (Math.random() * 100);
            System.out.println("Numero " + (contador + 1) + ": " + numeros[contador]);
	}
    }
    
    static void ejercicio2(){
        int largura;
        int contador;
        int [] numeros;
        double positivos = 0.0;
        int contadorPositivos = 0;
        double mediaPositivos = 0.0;
        int negativos = 0;
        double contadorNegativos = 0.0;
        double mediaNegativos = 0.0;
        int contadorCero = 0;
        
                
        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|              Dime cuantos numeros quieres insertar              |");
        System.out.println("|                      y te digo las medias                       |");
        System.out.println("|_________________________________________________________________|");
        
        largura = sc.nextInt();
        numeros = new int [largura];
        
        for (contador = 0; contador < numeros.length; contador++) {
            System.out.print("Inserte el " + contador + " numero: ");
            numeros[contador] = sc.nextInt();
            if (numeros[contador] > 0){
                positivos += numeros[contador];
                contadorPositivos++;
            } else if (numeros[contador] < 0){
                negativos += numeros[contador];
                contadorNegativos++;
            } else {
                contadorCero++;
            }
	}
        mediaPositivos = positivos/contadorPositivos;
        mediaNegativos = negativos/contadorNegativos;
        
        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println("La meida de los numeros positivos es: " + mediaPositivos);
        System.out.println("La meida de los numeros positivos es: " + mediaNegativos);
        System.out.println("El contador de 0 es: " + contadorCero);
        System.out.println("-------------------------------------------------------");
        System.out.println();
    }
    
    static void ejercicio3(){
        int largura;
        int contador;
        int [] numeros;
        
        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|              Dime cuantos numeros quieres insertar              |");
        System.out.println("|                      y te digo las medias                       |");
        System.out.println("|_________________________________________________________________|");
        
        largura = sc.nextInt();
        numeros = new int [largura];
        
        for (contador = 0; contador < numeros.length; contador++) {
            System.out.print("Inserte el " + (contador + 1) + " numero: ");
            numeros[contador] = sc.nextInt();
        }
        
        for (contador = largura; contador > 0; contador--) {
            System.out.print(numeros[contador - 1] + " ");
        }
    }
    
    static int maximo(int [] numeros){
        int contador;
        int max = 0;
        
        for (contador = 0; contador < numeros.length; contador++) {
            if (numeros[contador] > max){
                max = numeros[contador];
            }
        }
        return max;
    }
    
    static int buscar (int [] numeros, int clave){
        int contador;
        for (contador = 0; contador < numeros.length; contador++) {
            if (numeros[contador] == clave){
                return contador;
            }
        } 
        return -1;
    }
    
    static int [] pedirArray (){
        int contador;
        int [] arrayHecho; 
        
        int largura;
        
        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|              Dime la longitud del array y despues               |");
        System.out.println("|                          lo rellenamos                          |");
        System.out.println("|_________________________________________________________________|");
        
        largura = sc.nextInt();
        arrayHecho = new int [largura];
        
        for (contador = 0; contador < arrayHecho.length; contador++) {
            System.out.print("Inserte el " + (contador + 1) + " numero: ");
            arrayHecho[contador] = sc.nextInt();
        }
        return arrayHecho;
    }
    
    static int [] ordenarArray (int [] arrayDesordenado){
        int aux;
        int contador1;
        int contador2;
        
        for (contador1 = 0; contador1 < arrayDesordenado.length; contador1++){
            for (contador2 = 0; contador2 < arrayDesordenado.length - contador1 -1; contador2++){
                if (arrayDesordenado[contador2] > arrayDesordenado[contador2 + 1]){
                    aux = arrayDesordenado[contador2];
                    arrayDesordenado[contador2] = arrayDesordenado[contador2 +1];
                    arrayDesordenado[contador2 +1] = aux;                    
                }
            }
        }
        
        
        return arrayDesordenado;
    }
    
    static int [] sinRepetidos (){
        
    }
}
