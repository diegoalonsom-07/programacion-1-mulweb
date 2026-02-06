package diego.preparacion_ex;

import java.lang.runtime.SwitchBootstraps;

/**
 *
 * @author diego
 */

import java.util.Scanner;

public class Preparacion_ex {

        static Scanner sc = null;
    public static void main(String[] args) {
        menu();
    }

    static void menu(){
        sc = new Scanner(System.in);
        String opcion = "";

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|         MENU DE LOS EJERCICIOS DE PREPARACION DE EXAMEN         |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("|                                                                 |");
        System.out.println("|   1.-  Suma de dígitos                                          |");
        System.out.println("|   2.-  Múltiplos condicionales                                  |");
        System.out.println("|   3.-  Factorial                                                |");
        System.out.println("|   4.-  Triángulo de asteriscos                                  |");
        System.out.println("|   5.-  Contador de tipos                                        |");
        System.out.println("|-----------------------------------------------------------------|");
        System.out.println("|   6.-  Función esBisiesto(int anio)                             |");
        System.out.println("|   7.-  Potencia recursiva                                       |");
        System.out.println("|   8.-  Conversor de temperatura                                 |");
        System.out.println("|   9.-  Suma del 1 al N recursivo                                |");
        System.out.println("|   10.- Menú de áreas                                            |");
        System.out.println("|-----------------------------------------------------------------|");
        System.out.println("|   11.- Contador de vocales                                      |");
        System.out.println("|   12.- Inversión de frase                                       |");
        System.out.println("|   13.- Censura de palabras                                      |");
        System.out.println("|   14.- Generador de correos                                     |");
        System.out.println("|   15.- Validar contraseña                                       |");
        System.out.println("|-----------------------------------------------------------------|");
        System.out.println("|   16.- Mínimo y Máximo                                          |");
        System.out.println("|   17.- Intercambio de posiciones                                |");
        System.out.println("|   18.- Suma de posiciones pares                                 |");
        System.out.println("|   19.- Busca y reemplaza                                        |");
        System.out.println("|   20.- Copia inversa                                            |");
        System.out.println("|-----------------------------------------------------------------|");
        System.out.println("|   0.- Salir                                                     |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("|                                                                 |");
        System.out.println("|                        ELIGE UNA OPCION                         |");
        System.out.println("|_________________________________________________________________|");

        try {
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    sumaDigitos();
                    break;
                case "2":
                    decirMultiplos();
                    break;
                case "3":
                    factorial();
                    break;
                case "4":
                    trianguloAsteriscos();
                    break;
                case "5":
                    contarTipos();
                    break;
                case "6":
                    int año;
                    boolean bisiesto = false;
                    System.out.println("Dime un año: ");
                    año = sc.nextInt();

                    bisiesto = esBisiesto(año);

                    if (bisiesto == false) {
                        System.out.println("El " + año + " no es bisiesto");
                    } else {
                        System.out.println("El " + año + " es bisiesto");
                    }
                    
                    menu();
                    break;

                case "7":
                    int resultado;
                    int elevado;
                    System.out.println("Inserte el número y te lo elevo a lo que tu quieras: ");
                    resultado = sc.nextInt();
                    elevado = sc.nextInt();
                    resultado = potenciaRecursiva(resultado, elevado);

                    System.out.println(resultado);
                    break;
                case "8":
                    int temperatura;
                    System.out.println(" _________________________________________________________________");
                    System.out.println("|                                                                 |");
                    System.out.println("|   INSERTAME UNA TEMPERATURA Y TE LO PASO A LO QEU TU QUIERAS    |");
                    System.out.println("|_________________________________________________________________|");
                    temperatura = sc.nextInt();
                    System.out.println(" _________________________________________________________________");
                    System.out.println("|                                                                 |");
                    System.out.println("|   1.- Fahrenheit                                                |");
                    System.out.println("|   2.- Kelvin                                                    |");
                    System.out.println("|   0.- Salir                                                     |");
                    System.out.println("|_________________________________________________________________|");
                    opcion = sc.nextLine();

                    switch (opcion) {
                        case "1":
                            temperatura = farenheit(temperatura);
                            break;
                        case "2":
                            temperatura = kelvin(temperatura);
                            break;
                        default:
                            break;
                    }
                    System.out.println("La temperatura es de: " + temperatura);
                    break;
                case "9":
                    int numero;
                    System.out.println("Dime el numero y te saco la suma de ese hasta el 1");
                    numero = sc.nextInt();

                    numero = sumaRecursiva(numero);

                    System.out.println(numero);
                    break;
                case "10":
                    double resultado1;
                    System.out.println(" _________________________________________________________________");
                    System.out.println("|                                                                 |");
                    System.out.println("|     INTRODUCE UNA OPCIÓN Y TE CALCULARÉ EL AREA DE LA MISMA     |");
                    System.out.println("|_________________________________________________________________|");
                    System.out.println("|                                                                 |");
                    System.out.println("|   1.- Cuadrado                                                  |");
                    System.out.println("|   2.- Triangulo                                                 |");
                    System.out.println("|   3.- Circulo                                                   |");
                    System.out.println("|   0.- Salir                                                     |");
                    System.out.println("|_________________________________________________________________|");
                    opcion = sc.nextLine();

                    switch (opcion) {
                        case "1":
                            System.out.println("Dime el tamaño de un lado");
                            double lado = sc.nextInt();
                            resultado1 = cuadrado(lado);
                            break;
                        case "2":
                            System.out.println("Dime la altura de tu triangulo");
                            double altura = sc.nextInt(); 

                            System.out.println("Dime la base de tu triangulo");
                            double base = sc.nextInt();

                            resultado1 = triangulo(altura, base);
                            break;
                        case "3":
                            System.out.println("Dime el radio de tu circulo");
                            double radio = sc.nextInt(); 

                            resultado1 = circulo(radio);
                            break;
                        default:
                            resultado1 = -1;
                            break;
                    }
                    System.out.println(resultado1);

                    break;
                case "11":
                    contadorDeVocales();
                    break;
                case "12":
                    fraseInversa();
                    break;
                case "13":
                    
                    break;
                case "14":
                    
                    break;
                case "15":
                    
                    break;
                case "16":
                    
                    break;
                case "17":
                    
                    break;
                case "18":
                    
                    break;
                case "19":
                    
                    break;
                case "20":
                    
                    break;
                case "0":
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
            
                default:
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    static void sumaDigitos(){

        int numero;
        int contador;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|         Dime un numero y te digo la suma de sus cifras          |");
        System.out.println("|_________________________________________________________________|");

        numero = sc.nextInt();

        contador = 0;
        while (numero > 0) {
            contador += numero % 10;
            numero = numero / 10;
        }

        System.out.println("La suma de sus cifras es: " + contador);
    }

    static void decirMultiplos(){
        int contador;

        for (contador = 1; contador <=200; contador++){
            if (contador % 5 == 0 || contador % 3 == 0){
                System.out.print(contador + ", ");
            }
        }
    }

    static void factorial(){
        int contador;
        int num;
        int resultado;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|          Dime un numero y te hago el factorial de ese           |");
        System.out.println("|_________________________________________________________________|");
        num = sc.nextInt();
        resultado = num;

        for(contador = 1; contador < num; contador++ ){
            resultado *= contador;
        }

        System.out.println(resultado);
    }

    static void trianguloAsteriscos(){
        int contador1;
        int contador2;
        int altura;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|          Dime la altura que quiere tener tu triangulo           |");
        System.out.println("|_________________________________________________________________|");
        altura = sc.nextInt();

        for(contador1 = 0; contador1 <= altura; contador1++){
            for(contador2 = 0; contador2 < contador1; contador2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void contarTipos(){
        int contadorPares = 0;
        int contadorImpares = 0;
        int num;

        System.out.println("Se ingresaran numeros hasta que introduzcas un 0");

        do{
            System.out.println("Ingresa un numero: ");
            num = sc.nextInt();

            if(num % 2 == 0){
                contadorPares++;
            } else if(num % 2 != 0){
                contadorImpares++;
            }
        }while(num != 0);

        System.out.println("Impares: " + contadorImpares);
        System.out.println("Pares: " + contadorPares);
    }

    static boolean esBisiesto(int anio){
        if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)){
            return true;
        }

        return false;
    }

    static int potenciaRecursiva(int resultado, int elevado){
        if (elevado == 1){
            return resultado;
        }
        return resultado * potenciaRecursiva(resultado, elevado - 1);
    }

    static int farenheit(int temperatura){
        temperatura = (temperatura * (9/5)) + 32;
        return temperatura;
    }

    static int kelvin(int temperatura){
        temperatura += 273;
        return temperatura;
    }

    static int sumaRecursiva(int numero){
        if (numero == 1) {
            return numero;
        }
        return numero + sumaRecursiva(--numero);
    }

    static double cuadrado(double lado){
        lado *= lado;
        return lado;
    }

    static double triangulo(double altura, double base){
        altura = base * altura / 3;
        return altura;
    }

    static double circulo(double radio){
        radio = Math.PI * (radio * radio);
        return radio;
    }

    static void contadorDeVocales(){
        String frase;
        String vocales = "aeiouáéíóúü";
        int contador;
        int contadorVocales = 0;
        char caracterActual = ' ';
        char caracterMinuscula = ' ';
        System.out.println("Dime una frase y te dire la cantidad de vocales que tiene");
        frase = sc.nextLine();

        for (contador = 0; contador < frase.length(); contador++) {
            caracterActual = frase.charAt(contador);
            caracterMinuscula = Character.toLowerCase(caracterActual);

            if (vocales.indexOf(caracterMinuscula) >= 0) {
                contadorVocales++;
            }
        }
        System.out.println(contadorVocales);
    }

    static void fraseInversa(){
        String frase;
        String fraseInversa = "";
        int contador;

        System.out.println("Dime una frase y te la devuelvo al revés");
        frase = sc.nextLine();

        for (contador = frase.length() - 1; contador >= 0; contador--) {
            fraseInversa += frase.charAt(contador);
        }
        System.out.println(fraseInversa);
    }

    
}
