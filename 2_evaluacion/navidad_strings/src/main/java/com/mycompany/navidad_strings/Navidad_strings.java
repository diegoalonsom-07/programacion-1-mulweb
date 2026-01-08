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

    static void triangulo_letras() {
        String palabra;
        String auxiliar;
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

        for (contador = 0; contador <= longitud; contador++) {
            auxiliar = palabra.substring(0, contador);

            System.out.println(auxiliar);
        }

    }

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
    
    static void es_palindromo(){
        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|    Me vas a pasar una palabra y te diré si es un palíndromo     |");
        System.out.println("|_________________________________________________________________|");

        System.out.print("Dime la palabra: ");
        String palabra = sc.next();

        // El enunciado pide usar arrays: toCharArray() convierte la cadena en un array de caracteres
        char[] arrayCadenas = palabra.toLowerCase().toCharArray();
        
        // Creamos el String procesado desde el array
        String original = String.valueOf(arrayCadenas);
        
        // El enunciado pide usar StringBuilder(original).reverse().toString()
        String invertida = new StringBuilder(original).reverse().toString();

        // Comparación simple
        if (original.equals(invertida)) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }

    static void solo_letras(){
        String palabra;
        char c;
        boolean soloLetras = true;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|  Me vas a pasar una palabra y te diré si solo contiene letras  |");
        System.out.println("|_________________________________________________________________|");

        System.out.print("Escribe una palabra: ");
        palabra = sc.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            c = palabra.charAt(i);
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

    static void eliminar_espacios(){
        String frase;
        String fraseSinEspacios;

        System.out.println(" _________________________________________________________________");
        System.out.println("|                                                                 |");
        System.out.println("|  Me vas a pasar una frase y te la devolveré sin espacios en    |");
        System.out.println("|                           blanco.                              |");
        System.out.println("|_________________________________________________________________|");

        System.out.print("Escribe una frase: ");
        frase = sc.nextLine();

        fraseSinEspacios = frase.replace(" ", "");

        System.out.println("Frase sin espacios: " + fraseSinEspacios);
    }

    static void mensaje_personalizado(){
        String nombre;
        String apellidos;
        String ciudad;
        int anioNacimiento;
        int anioActual = Year.now().getValue();
        int edad;
        String mensaje;

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

    static void palabra_mas_larga(){
        String palabraLarga = "";
        String palabraActual;
        int contador;

        System.out.println("Introduce 10 palabras:");

        for (contador = 1; contador <= 10; contador++) {
            System.out.print("Palabra " + contador + ": ");
            palabraActual = sc.nextLine();

            if (palabraActual.length() > palabraLarga.length()) {
                palabraLarga = palabraActual;
            }
        }

        System.out.println("La palabra más larga introducida es: " + palabraLarga);
    }

    static void cambiar_mayus_minus(){
        String resultado = "";
        int contador;
        int contadorCambios = 0;

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

            // Para cada letra del alfabeto, recorremos la frase
            for (contador = 0; contador < frase.length(); contador++) {
                if (frase.charAt(contador) == letra) {
                    contadorActual++;
                }
            }

            // Si esta letra aparece más veces que la máxima registrada hasta ahora
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

        // Recorremos la frase carácter por carácter
        for (contador = 0; contador < frase.length(); contador++) {
            // Comprobamos si el carácter en la posición i es un espacio
            if (frase.charAt(contador) == ' ') {
                contadorEspacios++;
            }
        }

        // Mostramos el resultado
        System.out.println("La frase tiene " + contadorEspacios + " espacios en blanco.");
    }

    static void nombre_sin_vocales(){
        String nombreCompleto = "";
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
