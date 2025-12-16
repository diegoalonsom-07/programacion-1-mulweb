/* 
    Nombre: Diego Alonso Martínez
    Fecha: 15-12-2025
    Grupo: MULWEB 1º
    Nombre del fichero: UT3_P1.java 
    Descripción: Este .java se encuentra toda una práctica en la que tienes un menú para seleccionar que ejercicio quieres probar.
*/ 
package com.diego.ut3_p1.ut3_p1;

import java.util.Scanner;

/**
 * @date 05/12/2025
 * @author Diego Alonso Martínez Grupo: MULWEB 1º Nombre del fichero:
 * UT3_P1.java Descripción: cliente de las clases Asignatura y Alumno;
 */

public class UT3_P1 {

    static Scanner sc = null;

    public static void main(String[] args) {
        menu();
    }
    
    /**
     * Muestra el menú principal de la aplicación y gestiona la selección del usuario.
     * Desde este menú se accede a todos los ejercicios disponibles.
     * Controla errores de entrada y permite volver a mostrarse en caso de fallo.
     */
    static void menu() {
        sc = new Scanner(System.in);

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|         MENU DE LOS EJERCICIOS DE LA PRACTICA UNO TEMA 3        |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("|                                                                 |");
        System.out.println("|   1.- Imprimir x veces un Eco                                   |");
        System.out.println("|   2.- Mostrar los numeros comprendidos entre 2 numeros          |");
        System.out.println("|   3.- Calcular el area o volumen de un cilindro                 |");
        System.out.println("|   4.- Calcular el maximo de dos numeros                         |");
        System.out.println("|   5.- Comprobar si un caracter es vocal                         |");
        System.out.println("|   6.- Comprobar si un numero es primo                           |");
        System.out.println("|   7.- Contar divisores primos de un numero                      |");
        System.out.println("|   8.- Calculadora basica (Sum/Res/Mul/Div)                      |");
        System.out.println("|   9.- Calcular el maximo de tres numeros                        |");
        System.out.println("|  10.- Calculo de MCD (Recursivo)                                |");
        System.out.println("|  11.- Serie de Fibonacci (Recursivo)                            |");
        System.out.println("|  12.- Juego: Piedra, Papel o Tijera (vs CPU)                    |");
        System.out.println("|   0.- Salir                                                     |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("|                                                                 |");
        System.out.println("|                        ELIGE UNA OPCION                         |");
        System.out.println("|_________________________________________________________________|");

        try {
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    menuejercicio1();
                    break;
                case "2":
                    menuejercicio2();
                    break;
                case "3":
                    menuejercicio3();
                    break;
                case "4":
                    menuejercicio4();
                    break;
                case "5":
                    ejercicio5();
                    break;
                case "6":
                    int n;
                    boolean ej6;

                    System.out.println();
                    System.out.println("Dime un numero y te digo si es primo o no");
                    n = sc.nextInt();

                    ej6 = esPrimo(n);

                    if (ej6) {
                        System.out.println();
                        System.out.println(n + " es un numero primo");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println(n + " no es un numero primo");
                        System.out.println();
                    }
                    break;
                case "7":
                    int contador;
                    System.out.println();
                    System.out.println("Dime un numero y te digo si es primo o no");
                    n = sc.nextInt();

                    contador = ejercicio7(n);
                    
                    System.out.println("Hay " + contador + " divisores de primos");
                    
                    break;
                case "8":
                    menuejercicio8();
                    break;
                case "9":
                    ejercicio9();
                    break;
                case "10":
                    inicioejercicio10();
                    break;
                case "11":
                    int numero;
                    int resultado;
                    System.out.println();
                    System.out.println("Inserte un número y te digo el enesimo termino de la serie de fibonacci");
                    numero = sc.nextInt();

                    resultado = ejercicio11(numero);
                    System.out.println("El enesimo termino es " + resultado);
                    break;
                case "12":
                    int vitoriasjug = 0;
                    int victoriasmaq = 0;
                    int ronda = 1;
                    ejercicio12(victoriasmaq, vitoriasjug, ronda);
                    break;
                case "0":
                case "exit":
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar un número entero.");
            System.out.println();
            menu();
        } finally {
            sc.close();
        }
    }

    /**
    * Muestra el submenú del ejercicio 1.
    * Permite imprimir una palabra un número determinado de veces
    * usando un bucle o recursividad.
    */
    static void menuejercicio1() {
        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|       Te mostrare una palabra tantas veces como deseees         |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("|                                                                 |");
        System.out.println("|   1.- Hacer mediante un while                                   |");
        System.out.println("|   2.- Hacerlo mediante metodos recursivos                       |");
        System.out.println("|   3.- Volver al menu anterior                                   |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("|                                                                 |");
        System.out.println("|                        ELIGE UNA OPCION                         |");
        System.out.println("|_________________________________________________________________|");

        try {
            int veces;
            String frase = "Eco ...";
            String opcion;
            opcion = sc.nextLine();

            if (opcion.equals("3")){
                menu();
            }

            System.out.println("Inserte la cantidad de veces que se va a repetir tu frase");
            veces = sc.nextInt();

            switch (opcion) {
                case "1":
                    ejercicio1a(veces, frase);
                    break;
                case "2":
                    ejercicio1b(veces, frase);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    System.out.println();
                    menuejercicio1();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar un número entero.");
            System.out.println();
            menuejercicio1();
        }
    }

    /**
    * Imprime una frase un número determinado de veces utilizando un bucle.
    *
    * @param veces número de repeticiones
    * @param frase texto que se imprimirá
    */
    static void ejercicio1a(int veces, String frase) {
        for (; veces >= 1; veces--) {
            System.out.println(veces + ".- " + frase);
        }
    }

    /**
    * Imprime una frase un número determinado de veces usando recursividad.
    *
    * @param veces número de repeticiones restantes
    * @param frase texto que se imprimirá
    */
    static void ejercicio1b(int veces, String frase) {
        if (veces < 1) {
            return;
        }
        System.out.println(veces + ".- " + frase);

        ejercicio1b(veces - 1, frase);
    }

    /**
     * Muestra el submenú del ejercicio 2.
     * Permite mostrar los números comprendidos entre dos valores
     * mediante bucles o recursividad.
     */    
    static void menuejercicio2() {
        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|      Te mostrare los numeros comprendidos entre otros dos       |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("|                                                                 |");
        System.out.println("|   1.- Hacer mediante un while                                   |");
        System.out.println("|   2.- Hacerlo mediante metodos recursivos                       |");
        System.out.println("|   3.- Volver al menu anterior                                   |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("|                                                                 |");
        System.out.println("|                        ELIGE UNA OPCION                         |");
        System.out.println("|_________________________________________________________________|");
        System.out.println();

        try {
            int numero1;
            int numero2;
            String opcion;

            opcion = sc.nextLine();
            
            if (opcion.equals("3")){
                menu();
            }

            System.out.println("Inserte un numero");
            numero1 = sc.nextInt();

            System.out.println("Inserte un número mayor");
            numero2 = sc.nextInt();

            switch (opcion) {
                case "1":
                    ejercicio2a(numero1, numero2);
                    break;
                case "2":
                    ejercicio2b(numero1, numero2);
                    break;
                case "3":
                    menu();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    System.out.println();
                    menuejercicio2();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar un número entero.");
            System.out.println();
            menuejercicio2();
        }
    }
    
    /**
     * Muestra los números comprendidos entre dos valores usando un bucle.
     *
     * @param numero1 número inicial
     * @param numero2 número final
     */
    static void ejercicio2a(int numero1, int numero2) {
        for (; numero1 <= numero2; numero1++) {
            if (numero1 == numero2) {
                System.out.print(numero1);
                return;
            }
            System.out.print(numero1 + " + ");
        }
    }

    /**
    * Muestra los números comprendidos entre dos valores usando recursividad.
    *
    * @param numero1 número actual
    * @param numero2 número final
    */
    static void ejercicio2b(int numero1, int numero2) {
        if (numero1 == numero2) {
            System.out.print(numero1);
            return;
        }
        System.out.print(numero1 + " + ");

        ejercicio2b(numero1 + 1, numero2);
    }

    /**
    * Muestra el submenú del ejercicio 3.
    * Permite elegir entre calcular el área o el volumen de un cilindro.
    */
    static void menuejercicio3() {
        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|         Te dejo elegir calcular el area o el volumen            |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("|                                                                 |");
        System.out.println("|   1.- Calcular area de un cilindro                              |");
        System.out.println("|   2.- Calcular volumen de un cilindro                           |");
        System.out.println("|   3.- Volver al menu anterior                                   |");
        System.out.println("|_________________________________________________________________|");
        System.out.println();

        try {
            int altura;
            int radio;

            System.out.println("Inserte la altura");
            altura = sc.nextInt();

            System.out.println("Inserte el radio");
            radio = sc.nextInt();

            sc.nextLine();

            System.out.println("------------------");
            System.out.println("Elige una opcion");
            System.out.println("------------------");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    ejercicio3a(altura, radio);
                    break;
                case "2":
                    ejercicio3b(altura, radio);
                    break;
                case "3":
                    menu();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    System.out.println();
                    menuejercicio3();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar un número entero.");
            System.out.println();
            menuejercicio3();
        }
    }

    /**
    * Calcula y muestra el área de un cilindro.
    *
    * @param altura altura del cilindro
    * @param radio radio del cilindro
    */
    static void ejercicio3a(int altura, int radio) {
        double area;
        area = 2 * Math.PI * radio * (radio + altura);
        System.out.println("------------------------------------");
        System.out.println("El area de tu cilindro es de " + area);
        System.out.println("------------------------------------");
    }

    /**
    * Calcula y muestra el volumen de un cilindro.
    *
    * @param altura altura del cilindro
    * @param radio radio del cilindro
    */
    static void ejercicio3b(int altura, int radio) {
        double volumen;
        volumen = Math.PI * (radio * radio) * altura;
        System.out.println("-------------------------------------------");
        System.out.println("El volumen de tu cilindro es de " + volumen);
        System.out.println("-------------------------------------------");
    }

    /**
    * Solicita dos números al usuario y muestra cuál de ellos es mayor.
    */
    static void menuejercicio4() {
        try {
            int numero1;
            int numero2;
            int mayor;

            System.out.println(" _________________________________________________________________");
            System.out.println("|                                                                 |");
            System.out.println("|         Te voy a decir cual de los dos numeros es mayor         |");
            System.out.println("|_________________________________________________________________|");
            System.out.println();

            System.out.println("Inserte el primer numero");
            numero1 = sc.nextInt();

            System.out.println("Inserte el segundo numero");
            numero2 = sc.nextInt();
            
            if (numero1 == numero2){
                System.out.println("Los dos números son iguales");
                return;
            }

            mayor = ejercicio4(numero1, numero2);
            
            System.out.println("El mayor numero es el " + mayor);
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar un número entero.");
            System.out.println();
            menuejercicio4();
        }
    }
    
    /**
     * Devuelve el mayor de dos números enteros.
     *
     * @param numero1 primer número
     * @param numero2 segundo número
     * @return el número mayor (o uno de ellos si son iguales)
     */
    static int ejercicio4(int numero1, int numero2){
            if (numero1 > numero2) {
                return (numero1);
            } else if (numero2 > numero1) {
                return (numero2);
            } else {
                return (numero1);
            }
    }
    
    /**
    * Comprueba si un carácter introducido por el usuario es una vocal.
    */
    static void ejercicio5() {
        try {
            String palabra;
            char letra;

            System.out.println(" _________________________________________________________________");
            System.out.println("|                                                                 |");
            System.out.println("|             Te voy a decir si la letra es una vocal             |");
            System.out.println("|_________________________________________________________________|");
            System.out.println();

            System.out.println("Inserte una letra");
            palabra = sc.nextLine();
            palabra = palabra.toLowerCase();
            letra = palabra.charAt(0);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("Lo que has insertado es una vocal");
            } else {
                System.out.println("Lo que has insertado NO es una vocal");
            }

        } catch (Exception e) {
            System.out.println("Error: Debes ingresar un número entero.");
            System.out.println();
            ejercicio5();
        }
    }

    /**
    * Comprueba si un número es primo.
    *
    * @param n número a comprobar
    * @return true si el número es primo, false en caso contrario
    */
    static boolean esPrimo(int n) {
        int i;
        boolean primo = true;

        if (n <= 1) {
            return false;
        }
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return (primo);
    }

    /**
    * Cuenta cuántos divisores primos tiene un número.
    *
    * @param n número a analizar
    * @return cantidad de divisores primos
    */
    static int ejercicio7(int n) {
        int contadorPrimos = 0;

        for (int i = 2; i <= n; i++) { // empezamos desde 2 porque 1 no es primo
            if (n % i == 0) { // i es divisor de n
                boolean esPrimo = true;
                // Comprobar si i es primo
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    contadorPrimos++;
                }
            }
        }
        return contadorPrimos;
    }

    /**
    * Muestra el menú de la calculadora básica y ejecuta la operación seleccionada.
    */
    static void menuejercicio8(){
        double num1;
        double num2;
        String opcion;
        
        System.out.println(" __________________________________");
        System.out.println("|                                  |");
        System.out.println("|           CALCULADORA            |");
        System.out.println("|__________________________________|");
        System.out.println("|                                  |");
        System.out.println("|   1.- Suma                       |");
        System.out.println("|   2.- Resta                      |");
        System.out.println("|   3.- Multiplicar                |");
        System.out.println("|   4.- Dividir                    |");
        System.out.println("|   5.- Menú principal             |");
        System.out.println("|__________________________________|");
        System.out.println("|                                  |");
        System.out.println("|         ELIGE UNA OPCION         |");
        System.out.println("|__________________________________|");
        
        try {
            opcion = sc.nextLine();
            
            if (opcion.equals("5")){
                menu();
            }
            
            System.out.println("---------------------");
            System.out.println("Dime el primer numero");
            System.out.println("---------------------");
            num1 = sc.nextInt();
            
            System.out.println("----------------------");
            System.out.println("Dime el segundo numero");
            System.out.println("----------------------");
            num2 = sc.nextInt();

            switch (opcion) {
                case "1":
                    ejercicio8sum(num1, num2);
                    break;
                case "2":
                    ejercicio8res(num1, num2);
                    break;
                case "3":
                    ejercicio8mul(num1, num2);
                    break;
                case "4":
                    ejercicio8div(num1, num2);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    System.out.println();
                    menuejercicio1();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: Debes ingresar un número entero.");
            System.out.println();
            menuejercicio1();
        }
    }

    /**
    * Realiza la suma de dos números.
    *
    * @param num1 primer operando
    * @param num2 segundo operando
    */
    static void ejercicio8sum(double num1, double num2) {
        double resultado;
        resultado = num1 + num2;
        System.out.println(resultado);
    }

    /**
    * Realiza la resta de dos números.
    *
    * @param num1 minuendo
    * @param num2 sustraendo
    */
    static void ejercicio8res(double num1, double num2) {
        double resultado;
        resultado = num1 - num2;
        System.out.println(resultado);
    }

    /**
    * Realiza la multiplicación de dos números.
    *
    * @param num1 primer factor
    * @param num2 segundo factor
    */
    static void ejercicio8mul(double num1, double num2) {
        double resultado;
        resultado = num1 * num2;
        System.out.println(resultado);
    }

    /**
    * Realiza la división de dos números.
    *
    * @param num1 dividendo
    * @param num2 divisor
    */
    static void ejercicio8div(double num1, double num2) {
        double resultado;
        resultado = num1 / num2;
        System.out.println(resultado); 
    }

    /**
    * Solicita tres números y muestra cuál es el mayor de ellos.
    */
    static void ejercicio9() {
        int n1;
        int n2;
        int n3;
        int mayor;
        System.out.println("Dime unos numeros y te dire cual es el mayor de los tres");
        System.out.println("--------------------------------------------------------");
        System.out.println("Dime el primer numero");
        n1 = sc.nextInt();
        System.out.println("Dime el segundo numero");
        n2 = sc.nextInt();
        System.out.println("Dime el tercer numero");
        n3 = sc.nextInt();

        
        mayor = ejercicio4 (n1, n2);
        
        if (n3 > mayor) {
            System.out.println(n3 + " es el mayor numero");
        } else if (mayor > n3) {
            System.out.println(mayor + " es el mayor numero");
        } else {
            System.out.println(n1 + " y " + mayor + " son los mayores iguales");
        }
        
        try {
            
        }catch (Exception e){
            System.out.println("Error: Debes ingresar un número entero.");
            System.out.println();
            ejercicio9();
        }
    }

    /**
    * Solicita dos números al usuario e inicia el cálculo del máximo común divisor.
    */
    static void inicioejercicio10() {
        int n1;
        int n2;
        int divisor;
        int resultado;
        try {
            System.out.println("Dime un numero");
            n1 = sc.nextInt();
        
            System.out.println("Dime otro numero");
            n2= sc.nextInt();
            
            divisor = Math.max(n1, n2);
            
            resultado = ejercicio10(n1, n2, divisor);
            
            System.out.println("El máximo comun divisor es el " + resultado);
            
        }catch (Exception e){
            System.out.println("Error: Debes ingresar un número entero.");
            System.out.println();
            ejercicio9();
        }
        
    }

    /**
    * Calcula el máximo común divisor (MCD) de dos números de forma recursiva.
    *
    * @param n1 primer número
    * @param n2 segundo número
    * @param divisor divisor actual en la recursión
    * @return el máximo común divisor
    */
    static int ejercicio10(int n1, int n2, int divisor) {

        if (n1 % divisor == 0 && n2 % divisor == 0) {
           return divisor;
        }
        divisor--;
        return ejercicio10(n1, n2, divisor);
    }

    /**
    * Calcula el enésimo término de la serie de Fibonacci de forma recursiva.
    *
    * @param numero posición de la serie
    * @return valor del término correspondiente
    */
    static int ejercicio11(int numero) {
        if (numero <= 1) {
            return numero;
        }
        return ejercicio11(numero - 1) + ejercicio11(numero - 2);
    }

    /**
    * Ejecuta el juego de Piedra, Papel o Tijera contra la máquina.
    * El juego se desarrolla en un máximo de tres rondas.
    *
    * @param victoriasmaq número de victorias de la máquina
    * @param victoriasjug número de victorias del jugador
    * @param ronda ronda actual del juego
    * @return opción elegida por la máquina
    */
    static int ejercicio12(int victoriasmaq, int victoriasjug, int ronda) {
        String opcionjug;
        int opcionjugnum;
        int opcionmaq;
        
        opcionmaq = (int) (Math.random() * 3) + 1;

        if (ronda == 4){
            System.out.println("-----------------------------");
            System.out.println("FIN DEL JUEGO");
            System.out.println("RESULTADOS FINALES:");
            System.out.println("Máquina: " + victoriasmaq + " victorias");
            System.out.println("Jugador: " + victoriasjug + " victorias");
            if (victoriasmaq > victoriasjug){
                System.out.println("Ha ganado la máquina");
            } else if (victoriasjug > victoriasmaq){
                System.out.println("Has ganado tú");
            } else {
                System.out.println("Empate");
            }
            return(0);
        }

        System.out.println();
        System.out.println("Ronda " + ronda);
        System.out.println("Elige una opción");
        System.out.println("\t 1 = Piedra");
        System.out.println("\t 2 = Papel");
        System.out.println("\t 3 = Tijera");
        System.out.println("\t 0 = Salir");
        System.out.println("-----------------------------");
        System.out.println("Elige una opción");

        try{
            opcionjug = sc.nextLine();
            opcionjugnum = Integer.parseInt(opcionjug);

            if (opcionjug.equals("0")){
                return(0);
            } else if (opcionjugnum == opcionmaq) {
                ejercicio12(victoriasmaq, victoriasjug, ronda);
            } else if (opcionjugnum == 1){
                System.out.println("-----------------------------");
                System.out.println("Tu elección: 1.- Piedra");
                if (opcionmaq == 2){
                    System.out.println("-----------------------------");
                    System.out.println("La máquina eligió: 2.- Papel");
                    System.out.println("-----------------------------");
                    victoriasmaq++;
                    System.out.println("       Maquina | Humano      ");
                    System.out.println("-----------------------------");
                    System.out.println("\t" + victoriasmaq + "  | " + victoriasjug);
                    System.out.println("Has perdido la ronda");
                    ronda++;
                    ejercicio12(victoriasmaq, victoriasjug, ronda);            
                } else if (opcionmaq == 3) {
                    System.out.println("-----------------------------");
                    System.out.println("La máquina eligió: 3.- Tijera");
                    System.out.println("-----------------------------");
                    victoriasjug++;
                    System.out.println("       Maquina | Humano      ");
                    System.out.println("-----------------------------");
                    System.out.println("\t" + victoriasmaq + "  | " + victoriasjug);
                    System.out.println("Has ganado la ronda");                    

                    ronda++;
                    ejercicio12(victoriasmaq, victoriasjug, ronda);  
                }
            } else if (opcionjugnum == 2){
                System.out.println("-----------------------------");
                System.out.println("Tu elección: 2.- Papel");
                if (opcionmaq == 1){
                    System.out.println("-----------------------------");
                    System.out.println("La máquina eligió: 1.- Piedra");
                    System.out.println("-----------------------------");
                    System.out.println("Has ganado la ronda");
                    
                    victoriasjug++;
                    
                    System.out.println("       Maquina | Humano      ");
                    System.out.println("-----------------------------");
                    System.out.println("\t" + victoriasmaq + "  | " + victoriasjug);
                    System.out.println("Has ganado la ronda"); 
                    
                    ronda++;
                    ejercicio12(victoriasmaq, victoriasjug, ronda);            
                } else if (opcionmaq == 3) {
                    System.out.println("-----------------------------");
                    System.out.println("La máquina eligió: 3.- Tijera");
                    System.out.println("-----------------------------");
                    System.out.println("Has perdido la ronda");
                    
                    victoriasmaq++;
                    
                    System.out.println("       Maquina | Humano      ");
                    System.out.println("-----------------------------");
                    System.out.println("\t" + victoriasmaq + "  | " + victoriasjug);
                    System.out.println("Has perdido la ronda");
                    
                    ronda++;
                    ejercicio12(victoriasmaq, victoriasjug, ronda);  
                }
            } else if (opcionjugnum == 3){
                System.out.println("-----------------------------");
                System.out.println("Tu elección: 3.- Tijera");
                if (opcionmaq == 1){
                    System.out.println("-----------------------------");
                    System.out.println("La máquina eligió: 1.- Piedra");
                    System.out.println("-----------------------------");
                    System.out.println("Has perdido la ronda");
                    
                    victoriasmaq++;
                    
                    System.out.println("       Maquina | Humano      ");
                    System.out.println("-----------------------------");
                    System.out.println("\t" + victoriasmaq + "  | " + victoriasjug);
                    System.out.println("Has perdido la ronda");
                    
                    ronda++;
                    ejercicio12(victoriasmaq, victoriasjug, ronda);
                } else if (opcionmaq == 2) {
                    System.out.println("-----------------------------");
                    System.out.println("La máquina eligió: 2.- Papel");
                    System.out.println("-----------------------------");
                    System.out.println("Has ganado la ronda");
                    
                    victoriasjug++;
                    
                    System.out.println("       Maquina | Humano      ");
                    System.out.println("-----------------------------");
                    System.out.println("\t" + victoriasmaq + "  | " + victoriasjug);
                    System.out.println("Has ganado la ronda"); 
                    
                    ronda++;
                    ejercicio12(victoriasmaq, victoriasjug, ronda);
                }
            }
        } catch (Exception e){
            System.out.println("Error: Debes ingresar algo válido");
            System.out.println();
            ejercicio12(victoriasmaq, victoriasjug, ronda);
        }
        return opcionmaq;
    }
    
}

