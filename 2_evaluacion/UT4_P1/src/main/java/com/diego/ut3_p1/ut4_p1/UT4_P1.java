
package com.diego.ut3_p1.ut4_p1;
import java.util.Scanner;
import java.util.Arrays;

public class UT4_P1 {

    static Scanner sc = null;
    public static void main(String[] args) {
        menu();
    }

    /**
     * Muestra el menú principal de la aplicación y gestiona la lógica de selección de ejercicios.
     * Utiliza un bloque try-catch para manejar errores de entrada y recursividad para volver al menú.
     */
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
        System.out.println("|   7.- ¿Cuál es tu numero favorito?                              |");
        System.out.println("|   8.- Insertar numero y desplazar a la derecha                  |");
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
                    
                    System.out.println(" _________________________________________________________________");
                    System.out.println("|                                                                 |");
                    System.out.println("|      El numero mas grande de los " + numeros4.length + " que has insertado es: " + max + "      |");
                    System.out.println("|_________________________________________________________________|");
                    
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
                    int[] numeros6;

                    numeros6 = pedirArray();

                    Arrays.sort(numeros6);

                    int[] arrayLimpio = sinRepetidos(numeros6);

                    System.out.println("Array ordenado y sin repeticiones:");
                    for (int contador = 0; contador < arrayLimpio.length; contador++) {
                        System.out.print(arrayLimpio[contador] + " ");
                    }
                    System.out.println();

                    menu();
                    break;
                case "7":
                    ejercicio7();
                    menu();
                    break;
                case "8":
                    ejercicio8();
                    menu();
                    break;
                case "0":
                case "exit":
                    System.out.println("HASTA LA PROXIMA");
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
    
    /**
     * Ejercicio 1: Genera y muestra por pantalla un array de 10 números enteros aleatorios (0-99).
     */
    static void ejercicio1(){
        int contador;
        int[] numeros = new int[10];

        for (contador = 0; contador < numeros.length; contador++) {
            numeros[contador] = (int) (Math.random() * 100);
            System.out.println("Numero " + (contador + 1) + ": " + numeros[contador]);
	}
    }
    
    /**
     * Ejercicio 2: Solicita N números al usuario, calcula la media de los positivos, 
     * la media de los negativos y cuenta el número de ceros introducidos.
     */
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
    
    /**
     * Ejercicio 3: Solicita un array al usuario y muestra sus elementos en orden inverso.
     */
    static void ejercicio3(){
        int contador;
        int [] numeros;
        
        numeros = pedirArray();
        
        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|         Ahora te mostrare lo insertado en orden inverso         |");
        System.out.println("|_________________________________________________________________|");

        for (contador = numeros.length; contador > 0; contador--) {
            System.out.println(numeros[contador - 1] + " ");
        }
    }
    
    /**
     * Busca el valor máximo dentro de un array de enteros.
     * @param numeros Array de enteros a evaluar.
     * @return El valor entero más alto encontrado en el array.
     */
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

    /**
     * Realiza una búsqueda secuencial en un array para encontrar una clave específica.
     * @param numeros Array en el que buscar.
     * @param clave Valor entero que se desea localizar.
     * @return El índice de la primera aparición de la clave, o -1 si no se encuentra.
     */
    static int buscar (int [] numeros, int clave){
        int contador;
        for (contador = 0; contador < numeros.length; contador++) {
            if (numeros[contador] == clave){
                return contador;
            }
        } 
        return -1;
    }
    
    /**
     * Solicita al usuario el tamaño de un array y los valores para rellenarlo.
     * @return Un array de enteros inicializado con los valores del usuario.
     */
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
    
    /**
     * Ordena un array de enteros de menor a mayor utilizando el algoritmo de la burbuja.
     * @param arrayDesordenado El array original a ordenar.
     * @return El mismo array ordenado ascendentemente.
     */
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
    


    /**
     * Crea un nuevo array eliminando los elementos duplicados de un array dado.
     * @param t Array de entrada.
     * @return Un nuevo array que contiene solo valores únicos.
     */
    static int[] sinRepetidos(int[] t) {
        int[] temporal;
        int[] resultado;
        int contadorUnicos = 0;
        int contador1;
        int contador2;
        int numeroActual;
        boolean esRepetido;

        if (t == null || t.length == 0) {
            return new int[0];
        }

        temporal = new int[t.length];

        for (contador1 = 0; contador1 < t.length; contador1++) {
            numeroActual = t[contador1];
            esRepetido = false;

            for (contador2 = 0; contador2 < contadorUnicos; contador2++) {
                if (temporal[contador2] == numeroActual) {
                    esRepetido = true;
                    break;
                }
            }

            if (!esRepetido) {
                temporal[contadorUnicos] = numeroActual;
                contadorUnicos++;
            }
        }

        resultado = new int[contadorUnicos];

        for (contador1 = 0; contador1 < contadorUnicos; contador1++) {
            resultado[contador1] = temporal[contador1];
        }

        return resultado;
    }

    /**
     * Ejercicio 7: Calculando unas medias de tus numeros favoritos, se saca tu numero de la suerte
     */
    static void ejercicio7() {
        int[] listaNumeros;
        int[] nuevaLista;
        int largoActual;
        int indiceAzar1;
        int indiceAzar2;
        int val1;
        int val2;
        int media;
        int contador1;
        int contador2;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|                  CALCULO DEL NUMERO DE LA SUERTE                |");
        System.out.println("|_________________________________________________________________|");

        listaNumeros = pedirArray();

        listaNumeros = ordenarArray(listaNumeros);

        while (listaNumeros.length > 1) {
            largoActual = listaNumeros.length;

            indiceAzar1 = (int) (Math.random() * largoActual);
            do {
                indiceAzar2 = (int) (Math.random() * largoActual);
            } while (indiceAzar1 == indiceAzar2);

            val1 = listaNumeros[indiceAzar1];
            val2 = listaNumeros[indiceAzar2];
            media = (val1 + val2) / 2;

            nuevaLista = new int[largoActual - 1];
            contador2 = 0; 

            for (contador1 = 0; contador1 < largoActual; contador1++) {
                if (contador1 != indiceAzar1 && contador1 != indiceAzar2) {
                    nuevaLista[contador2] = listaNumeros[contador1];
                    contador2++;
                }
            }

            nuevaLista[contador2] = media;

            listaNumeros = nuevaLista;

            listaNumeros = ordenarArray(listaNumeros);
        }

        System.out.println();
        System.out.println("===========================================");
        System.out.println(" TU NUMERO DE LA SUERTE ES: " + listaNumeros[0]);
        System.out.println("===========================================");
        System.out.println();
    }
    
    /**
    * Ejercicio 8: Inserta un número en una posición específica de un array de tamaño fijo (12),
    * desplazando los elementos a la derecha y perdiendo el último valor.
    */
    static void ejercicio8() {
        int[] numeros;
        int i;
        int numeroNuevo;
        int posicion;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|             INSERTAR NUMERO Y DESPLAZAR A LA DERECHA            |");
        System.out.println("|_________________________________________________________________|");

        numeros = new int[12];
        
        System.out.println("--- Array Original ---");
        System.out.println("Indice         Valor");
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 201);
            System.out.println(i + "               " + numeros[i]);
        }


        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|             INTRODUCE EL NUMERO QUE QUIERES INSERTAR            |");
        System.out.println("|_________________________________________________________________|");
        numeroNuevo = sc.nextInt();

        do {
            System.out.print("Introduce la posicion donde quieres insertarlo (0-11): ");
            posicion = sc.nextInt();
            if (posicion < 0 || posicion > 11) {
                System.out.println("Error: La posicion debe estar entre 0 y 11.");
            }
        } while (posicion < 0 || posicion > 11);

        for (i = numeros.length - 1; i > posicion; i--) {
            numeros[i] = numeros[i - 1];
        }

        numeros[posicion] = numeroNuevo;

        System.out.println("--- Array Modificado (El ultimo se ha perdido) ---");
        System.out.println("Indice         Valor");
        for (i = 0; i < numeros.length; i++) {

            if (i == posicion) {
                System.out.println(i + "               " + numeros[i] + " <--- NUEVO");
            } else {
                System.out.println(i + "               " + numeros[i]);
            }
        }

        System.out.println(" ___________________________________________________________________________________");
        System.out.println("|                                                                                   |");
        System.out.println("|   PREGUNTA: Que habria que hacer para que el ultimo numero no se pierda?          |");
        System.out.println("|                                                                                   |");
        System.out.println("|   RESPUESTA: Habría que crear un array nuevo con una posicion mas (tamaño 13),    |");
        System.out.println("|              copiar los elementos y luego hacer el desplazamiento.                |");
        System.out.println("|___________________________________________________________________________________|");
    }
}
