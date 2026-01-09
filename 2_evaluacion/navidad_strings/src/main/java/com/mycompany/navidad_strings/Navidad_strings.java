/* 
    Nombre: Diego Alonso Martínez
    Fecha: 04-001-2026
    Grupo: MULWEB 1º
    Nombre del fichero: Navidad_strings.java
    Descripción: Este .java se encuentra toda una práctica en la que tienes un menú para seleccionar que ejercicio quieres probar. Todos tienen en comun que usan strings y poder practicar con ellas.
*/

package com.mycompany.navidad_strings;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Navidad_strings {
    static Scanner sc = null;

    public static void main(String[] args) {
        menu();
    }
    /**
     * Muestra el menú principal por consola y gestiona la selección del usuario
     * mediante una estructura switch.
     */
    static void menu() {

        sc = new Scanner(System.in);

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|           MENU DE EJERCICIOS DE STRINGS -  (NAVIDAD)            |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("|                                                                 |");
        System.out.println("|   1.- Formatear nombre (Primera mayúscula)                      |");
        System.out.println("|   2.- Mostrar letras separadas por espacios                     |");
        System.out.println("|   3.- Triángulo de letras de una palabra                        |");
        System.out.println("|   4.- Contar palabras y letras de un texto                      |");
        System.out.println("|   5.- Validar hora en formato HH:MM                             |");
        System.out.println("|   6.- Comprobar si una palabra es palíndromo                    |");
        System.out.println("|   7.- Comprobar si un String solo contiene letras               |");
        System.out.println("|   8.- Eliminar espacios en blanco de una cadena                 |");
        System.out.println("|   9.- Mostrar mensaje personalizado con datos del usuario       |");
        System.out.println("|  10.- Mostrar la palabra más larga (10 palabras)                |");
        System.out.println("|  11.- Cambiar mayúsculas/minúsculas y contar cambios            |");
        System.out.println("|  12.- Letra más repetida en una frase                           |");
        System.out.println("|  13.- Juego: Acierta la contraseña                              |");
        System.out.println("|  14.- Contar espacios en blanco de una frase                    |");
        System.out.println("|  15.- Mostrar nombre sin vocales                                |");
        System.out.println("|  16.- Contar apariciones de una palabra en una frase            |");
        System.out.println("|  17.- Traductor del idioma de Javalandia                        |");
        System.out.println("|  18.- Introducir frase palabra a palabra (fin para terminar)    |");
        System.out.println("|  19.- Cifrado de mensajes por sustitución de letras             |");
        System.out.println("|  20.- Comprobar si dos palabras son anagramas                   |");
        System.out.println("|  21.- Contar repeticiones de cada letra en una frase            |");
        System.out.println("|   0.- Salir                                                     |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("|                                                                 |");
        System.out.println("|                        ELIGE UNA OPCION                         |");
        System.out.println("|_________________________________________________________________|");

        String opcion = sc.nextLine();
        switch (opcion) {
            case "1":
                cambiar_nombre();
                break;

            case "2":
                separar_letras();
                break;

            case "3":
                triangulo_letras();
                break;

            case "4":
                conteo();
                break;

            case "5":
                validar_hora();
                break;

            case "6":
                es_palindromo();
                break;

            case "7":
                solo_letras();
                break;

            case "8":
                eliminar_espacios();
                break;

            case "9":
                mensaje_personalizado();
                break;

            case "10":
                palabra_mas_larga();
                break;

            case "11":
                cambiar_mayus_minus();
                break;

            case "12":
                letra_mas_repetida();
                break;

            case "13":
                juego_contraseña();
                break;

            case "14":
                contar_espacios();
                break;

            case "15":
                nombre_sin_vocales();
                break;

            case "16":
                // contar_apariciones_palabra();
                break;

            case "17":
                // traductor_javalandia();
                break;

            case "18":
                // introducir_frase_palabra();
                break;

            case "19":
                // cifrado_sustitucion();
                break;

            case "20":
                // son_anagramas();
                break;

            case "21":
                // repeticiones_letras();
                break;

            case "0":
                System.out.println("Saliendo del programa...");
                break;

            default:
                break;
        }

    }

    /**
     * Ejercicio 1: Formatea un nombre propio.
     * Convierte la primera letra a mayúscula y el resto a minúscula.
     */
    static void cambiar_nombre() {
        String nombre;
        char primera;
        String resto;
        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|       Me vas a pasar un nombre propio y te lo escribiré         |");
        System.out.println("|    con la primera letra en mayúscula y el resto en minúscula    |");
        System.out.println("|_________________________________________________________________|");

        System.out.print("Escribe un nombre propio:");
        nombre = sc.nextLine();

        primera = nombre.charAt(0);
        primera = Character.toUpperCase(primera);

        resto = nombre.substring(1);
        resto = resto.toLowerCase();

        System.out.println("El nombre bien escrito es: " + primera + resto);
    }

    /**
     * Ejercicio 2: Separa los caracteres de una palabra.
     * Recorre la cadena y muestra cada letra seguida de un espacio en blanco.
     */
    static void separar_letras() {
        String palabra;
        char letra;
        int longitud;
        int contador;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|        Me vas a pasar una palabra y te la escribiré con         |");
        System.out.println("|           las letras separadas por espacios en blanco           |");
        System.out.println("|_________________________________________________________________|");

        System.out.print("Escribe una palabra: ");
        palabra = sc.nextLine();

        longitud = palabra.length();

        for (contador = 0; contador < longitud; contador++) {
            letra = palabra.charAt(contador);
            System.out.print(letra + " ");
        }
    }

    /**
     * Ejercicio 3: Genera un triángulo progresivo.
     * Muestra subcadenas de la palabra introducida, añadiendo una letra en cada línea.
     */
    static void triangulo_letras() {
        String palabra;
        String auxiliar;
        int longitud;
        int contador;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|      Me vas a pasar una palabra y te mostraré un triángulo      |");
        System.out.println("|          con las letras de dicha palabra.                       |");
        System.out.println("|_________________________________________________________________|");
        System.out.print("Escribe una palabra: ");

        palabra = sc.nextLine();

        longitud = palabra.length();

        for (contador = 0; contador <= longitud; contador++) {
            auxiliar = palabra.substring(0, contador);

            System.out.println(auxiliar);
        }

    }

    /**
     * Ejercicio 4: Realiza un conteo de palabras y letras.
     * Basándose en los espacios en blanco, estima el número de palabras y cuenta el total de caracteres.
     */
    static void conteo() {
        String frase;
        int palabras = 1;
        int letras = 0;
        int i;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|       Me vas a pasar una frase y te contaré las palabras        |");
        System.out.println("|               y las letras que tiene dicha frase.               |");
        System.out.println("|_________________________________________________________________|");

        System.out.print("Escribe una frase: ");
        frase = sc.nextLine();

        for (i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c == ' ') {
                palabras++;
            } else {
                letras++;
            }
        }

        System.out.println("Palabras: " + palabras);
        System.out.println("Letras: " + letras);

    }

    /**
     * Ejercicio 5: Valida una hora en formato HH:MM.
     * Comprueba que el formato sea correcto y que las horas (0-23) y minutos (0-59) sean válidos.
     */
    static void validar_hora() {
        String hora;
        int hh;
        int mm;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|       Me vas a pasar una hora en formato HH:MM y te diré        |");
        System.out.println("|                   si es una hora válida o no.                   |");
        System.out.println("|_________________________________________________________________|");

        System.out.print("Introduce la hora (HH:MM): ");
        hora = sc.nextLine();

        if (hora.length() == 5 && hora.charAt(2) == ':') {

            hh = Integer.parseInt(hora.substring(0, 2));
            mm = Integer.parseInt(hora.substring(3, 5));

            if (hh >= 0 && hh <= 23 && mm >= 0 && mm <= 59) {
                System.out.println("La hora es valida");
            } else {
                System.out.println("La hora es invalida (valores fuera de rango)");
            }
        } else {
            System.out.println("Formato incorrecto. Debe ser HH:MM.");
        }
    }
    
    /**
     * Ejercicio 6: Comprueba si una palabra es un palíndromo.
     * Compara la palabra original con su versión invertida usando {@link StringBuilder#reverse()}.
     */
    static void es_palindromo(){
        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|    Me vas a pasar una palabra y te diré si es un palíndromo     |");
        System.out.println("|_________________________________________________________________|");

        System.out.print("Dime la palabra: ");
        String palabra = sc.next();

        char[] arrayCadenas = palabra.toLowerCase().toCharArray();
        
        String original = String.valueOf(arrayCadenas);
        
        String invertida = new StringBuilder(original).reverse().toString();

        if (original.equals(invertida)) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }

    /**
     * Ejercicio 7: Verifica si la cadena contiene solo letras.
     * Utiliza el método {@link Character#isLetter(char)} para validar cada carácter.
     */
    static void solo_letras(){
        String palabra;
        char c;
        int contador;
        boolean soloLetras = true;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|  Me vas a pasar una palabra y te diré si solo contiene letras   |");
        System.out.println("|_________________________________________________________________|");

        System.out.print("Escribe una palabra: ");
        palabra = sc.nextLine();

        for (contador = 0; contador < palabra.length(); contador++) {
            c = palabra.charAt(contador);
            if (!Character.isLetter(c)) {
                soloLetras = false;
                break;
            }
        }

        if (soloLetras) {
            System.out.println("La palabra solo contiene letras.");
        } else {
            System.out.println("La palabra contiene caracteres que no son letras.");
        }
    }

    /**
     * Ejercicio 8: Elimina todos los espacios en blanco.
     * Utiliza el método {@code replace(" ", "")} para limpiar la cadena.
     */
    static void eliminar_espacios(){
        String frase;
        String fraseSinEspacios;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|  Me vas a pasar una frase y te la devolveré sin espacios en     |");
        System.out.println("|                           blanco.                               |");
        System.out.println("|_________________________________________________________________|");

        System.out.print("Escribe una frase: ");
        frase = sc.nextLine();

        fraseSinEspacios = frase.replace(" ", "");

        System.out.println("Frase sin espacios: " + fraseSinEspacios);
    }

    /**
     * Ejercicio 9: Genera un mensaje personalizado.
     * Calcula la edad del usuario basándose en el año actual y formatea una respuesta con sus datos.
     */
    static void mensaje_personalizado(){
        String nombre;
        String apellidos;
        String ciudad;
        int anioNacimiento;
        int anioActual = Year.now().getValue();
        int edad;
        String mensaje;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|  Te pediré algunos datos personales y te mostraré un mensaje    |");
        System.out.println("|          personalizado con la información que me des.           |");
        System.out.println("|_________________________________________________________________|");

        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();

        System.out.print("Introduce tus apellidos: ");
        apellidos = sc.nextLine();

        System.out.print("Introduce tu año de nacimiento: ");
        anioNacimiento = sc.nextInt();
        edad = anioActual - anioNacimiento;
        sc.nextLine();

        System.out.print("Introduce tu ciudad de residencia: ");
        ciudad = sc.nextLine();

        mensaje = "Hola " + nombre + " " + apellidos + ". Ya se que tienes " + edad + " años y que vives en " + ciudad + ".";

        System.out.println(mensaje);
    }

    /**
     * Ejercicio 10: Encuentra la palabra más larga.
     * Solicita 10 palabras al usuario y determina cuál tiene la mayor longitud.
     */
    static void palabra_mas_larga(){
        String palabraLarga = "";
        String palabraActual;
        int contador;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|   Te pediré que introduzcas 10 palabras y te diré cuál es la    |");
        System.out.println("|                  más larga de todas ellas.                      |");
        System.out.println("|_________________________________________________________________|");
        System.out.println("Introduce las palabras:");

        for (contador = 1; contador <= 10; contador++) {
            System.out.print("Palabra " + contador + ": ");
            palabraActual = sc.nextLine();

            if (palabraActual.length() > palabraLarga.length()) {
                palabraLarga = palabraActual;
            }
        }

        System.out.println("La palabra más larga introducida es: " + palabraLarga);
    }

    /**
     * Ejercicio 11: Invierte mayúsculas y minúsculas.
     * Cambia cada carácter a su opuesto (mayúscula a minúscula y viceversa) y cuenta los cambios realizados.
     */
    static void cambiar_mayus_minus(){
        String resultado = "";
        int contador;
        int contadorCambios = 0;

        System.out.println(" _______________________________________________________________________");
        System.out.println("|                                                                       |");
        System.out.println("|      Me vas a pasar una línea de texto y te la devolveré con las      |");
        System.out.println("|   mayúsculas convertidas a minúsculas y las minúsculas a mayúsculas.  |");
        System.out.println("|          Además, te diré cuántos cambios he realizado.                |");
        System.out.println("|_______________________________________________________________________|");
        System.out.println("Introduce una línea de texto:");
        String entrada = sc.nextLine();

        for (contador = 0; contador < entrada.length(); contador++) {
            char caracterActual = entrada.charAt(contador);

            if (Character.isUpperCase(caracterActual)) {
                resultado += Character.toLowerCase(caracterActual);
                contadorCambios++;

            } else if (Character.isLowerCase(caracterActual)) {
                resultado += Character.toUpperCase(caracterActual);
                contadorCambios++;

            } else {
                resultado += caracterActual;
            }
        }

        System.out.println("Texto transformado: " + resultado);
        System.out.println("Número de cambios realizados: " + contadorCambios);
    }

    /**
     * Ejercicio 12: Identifica el carácter más frecuente.
     * Analiza la frecuencia de cada letra del abecedario dentro de una frase.
     */
    static void letra_mas_repetida(){
        String frase;
        char letraMasFrecuente = ' ';
        int maxApariciones = 0;
        int contador;
        char letra;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|   Me vas a pasar una frase y te diré cuál es la letra que más   |");
        System.out.println("|                  se repite en dicha frase.                      |");
        System.out.println("|_________________________________________________________________|");

        System.out.println("Introduce una frase:");
        frase = sc.nextLine().toLowerCase();

        letraMasFrecuente = ' ';
        maxApariciones = 0;

        for (letra = 'a'; letra <= 'z'; letra++) {
            int contadorActual = 0;

            for (contador = 0; contador < frase.length(); contador++) {
                if (frase.charAt(contador) == letra) {
                    contadorActual++;
                }
            }

            if (contadorActual > maxApariciones) {
                maxApariciones = contadorActual;
                letraMasFrecuente = letra;
            }
        }

        if (maxApariciones > 0) {
            System.out.println("La letra que más aparece es: '" + letraMasFrecuente + "'");
            System.out.println("Aparece un total de: " + maxApariciones + " veces.");
        } else {
            System.out.println("No se encontraron letras del alfabeto en la frase.");
        }
    }

    static void juego_contraseña(){
        System.out.println("No tengo ni idea de cómo hacer este ejercicio.");
    }

    /**
     * Ejercicio 14: Cuenta los espacios en blanco.
     * Recorre la frase y suma las ocurrencias del carácter ' '.
     */
    static void contar_espacios(){
        String frase;
        int contadorEspacios = 0;
        int contador;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|     Me vas a pasar una frase y te diré cuántos espacios en      |");
        System.out.println("|                          blanco tiene.                          |");
        System.out.println("|_________________________________________________________________|");

        System.out.println("Introduce una frase:");
        frase = sc.nextLine();

        contadorEspacios = 0;

        for (contador = 0; contador < frase.length(); contador++) {
            if (frase.charAt(contador) == ' ') {
                contadorEspacios++;
            }
        }

        System.out.println("La frase tiene " + contadorEspacios + " espacios en blanco.");
    }

    /**
     * Ejercicio 15: Filtra vocales.
     * Crea una nueva cadena omitiendo cualquier carácter que sea una vocal (incluyendo tildes y diéresis).
     */
    static void nombre_sin_vocales(){
        String nombreCompleto;
        String sinVocales = "";
        String vocales = "aeiouáéíóúü";
        char caracterActual = ' ';
        char caracterMinuscula = ' ';
        int contador = 0;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|   Me vas a pasar un nombre y te lo devolveré sin las vocales    |");
        System.out.println("|_________________________________________________________________|");

        System.out.print("Introduce tu nombre completo: ");
        nombreCompleto = sc.nextLine();

        for (contador = 0; contador < nombreCompleto.length(); contador++) {
            caracterActual = nombreCompleto.charAt(contador);
            caracterMinuscula = Character.toLowerCase(caracterActual);

            if (vocales.indexOf(caracterMinuscula) == -1) {
                sinVocales += caracterActual;
            }
        }

        System.out.println("Resultado: " + sinVocales);
    }
}
