package com.mycompany.navidad_strings;

import java.util.Scanner;
import java.time.Year; //para poder trabajar con el calendario y sacar el año, actual del sistema
//se puede usar Calendar o LocalDate para que sea más compatible con versiones antiguas de Java.
import java.util.Arrays; //Métodos de Arrays

/**
 * Clase que contiene métodos para los ejerciciosde Strings de U.D.03 de
 * programación. Cada ejercicio está implementado como un método estático. El
 * main permite seleccionar y ejecutar cualquier ejercicio hasta que el usuario
 * decida salir.
 */
public class SolString {

    /**
     * Scanner global para todos los métodos
     */
    static Scanner sc = new Scanner(System.in);

    /**
     * Método principal que permite seleccionar y ejecutar ejercicios hasta que
     * se introduce 0.
     *
     * @param args Argumentos de línea de comandos (no usados)
     */
    public static void main(String[] args) {
        int ejercicio = -1; //opción para elegir el ejercicio, iniciado a -1

        // Bucle principal
        while (ejercicio != 0) {
            System.out.println("\nSeleccione el ejercicio a ejecutar (1-21), o 0 para salir:");
            try {
                ejercicio = sc.nextInt();
                sc.nextLine(); // Limpiar buffer

                switch (ejercicio) {
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                    case 1:
                        ejercicio1();
                        break;
                    case 2:
                        ejercicio2();
                        break;
                    case 3:
                        ejercicio3();
                        break;
                    case 4:
                        ejercicio4();
                        break;
                    case 5:
                        ejercicio5();
                        break;
                    case 6:
                        ejercicio6();
                        break;
                    case 7:
                        ejercicio7();
                        break;
                    case 8:
                        ejercicio8();
                        break;
                    case 9:
                        ejercicio9();
                        break;
                    case 10:
                        ejercicio10();
                        break;
                    case 11:
                        ejercicio11();
                        break;
                    case 12:
                        ejercicio12();
                        break;
                    case 13:
                        ejercicio13();
                        break;
                    case 14:
                        ejercicio14();
                        break;
                    case 15:
                        ejercicio15();
                        break;
                    case 16:
                        ejercicio16();
                        break;
                    case 17:
                        ejercicio17();
                        break;
                    case 18:
                        ejercicio18();
                        break;
                    case 19:
                        ejercicio19();
                        break;
                    case 20:
                        ejercicio20();
                        break;
                    case 21:
                        ejercicio21();
                        break;
                    default:
                        System.out.println("Ejercicio no disponible. Introduce un número entre 0 y 21.");
                }

            } catch (Exception e) { // Captura errores cuando el usuario no introduce un número
                System.out.println("Entrada inválida. Por favor, introduce un número entero.");
                sc.nextLine(); // Limpiar buffer del error
            }
//            finally{ // se cierra el recurso
//                sc.close();
//            }
        }
    }

    // -------------------- EJERCICIOS --------------------
    /**
     * Ejercicio 1: Convierte la primera letra a mayúscula y el resto a
     * minúscula.
     */
    public static void ejercicio1() {
        String nombre;    // Nombre introducido por el usuario
        String resultado; // Nombre formateado correctamente

        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();

        resultado = nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();

//        // Primera letra en mayúscula usando charAt(0)
//        char primera = Character.toUpperCase(nombre.charAt(0));
//        String resto = nombre.substring(1).toLowerCase(); // el resto en minúscula
//
//        String resultado = primera + resto;
        System.out.println("Resultado: " + resultado);
    }

    /**
     * Ejercicio 2: Imprime las letras de un nombre separadas por espacios.
     */
    public static void ejercicio2() {
        String nombre;

        System.out.print("Introduce un nombre: ");
        nombre = sc.nextLine();

        // Recorremos la cadena carácter a carácter
        System.out.print("Letras separadas: ");
        for (int i = 0; i < nombre.length(); i++) {
            System.out.print(nombre.charAt(i) + " ");
        }
//        // Convertir la cadena a un array de caracteres
//        char[] letras = nombre.toCharArray();
//
//        System.out.print("Letras separadas: ");
//        for (char c : letras) { // int i=0;i<letras.length;i++
//            System.out.print(c + " ");
//        }
//        
        System.out.println();
    }

    /**
     * Ejercicio 3: Muestra un triángulo de letras a partir de una palabra.
     */
    public static void ejercicio3() {
        String palabra;

        System.out.print("Introduce una palabra: ");
        palabra = sc.nextLine();

        // Se van mostrando subcadenas cada vez más largas
        System.out.println("Triángulo de letras:");
        for (int i = 1; i <= palabra.length(); i++) {
            System.out.println(palabra.substring(0, i));
        }

        // Convertimos la palabra en un array de caracteres
//        char[] letras = palabra.toCharArray();
//        // Construimos el triángulo
//        for (int i = 1; i <= letras.length; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(letras[j]);
//            }
//            System.out.println();
//        }
    }

    /**
     * Ejercicio 4: Cuenta la cantidad de palabras y letras de una frase.
     */
    public static void ejercicio4() {
        String frase;
        String[] palabras;
        int letras;

        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();

        //trim quita los espacios al principio y al final
        //split divide la cadena por la cadena pasada
//      \s en regex significa cualquier carácter de espacio en blanco:
        //Espacio normal " "
        //Tabulación \t
        //Salto de línea \n
        //Retorno de carro \r
        //+ significa uno o más.
//      \\s+ → uno o más espacios/tabs consecutivos.
//       si ponemos solo " " solo cogemos los espacios en blanco sencillos
        palabras = frase.trim().split("\\s+"); // separar por espacios
        letras = frase.replace(" ", "").length();   // contar letras ignorando espacios

        //otra forma de contrar las letras teniendo en cuenta que en cada uno de los 
        //espacios del array hay una palabra contamos su longuitud
//        int letras = 0;
//        for (String palabra : palabras) { int i=o;i<palabras.length;i++
//            letras += palabra.length();
//        }
        System.out.println("Palabras: " + palabras.length);
        System.out.println("Letras: " + letras);
    }

    /**
     * Ejercicio 5: Valida si una cadena tiene formato de hora HH:MM.
     */
    public static void ejercicio5() {
        String hora;
        boolean valida;

        System.out.print("Introduce una hora (HH:MM): ");
        hora = sc.nextLine();

        // Comprobación carácter a carácter del formato
        valida = hora.length() == 5 //se puede hacer en más instrucciones poniendo if anidados
                && Character.isDigit(hora.charAt(0))
                && Character.isDigit(hora.charAt(1))
                && hora.charAt(2) == ':'
                && Character.isDigit(hora.charAt(3))
                && Character.isDigit(hora.charAt(4));

        System.out.println(valida ? "Hora válida" : "Hora no válida");
    }

    /**
     * Ejercicio 6: Comprueba si una palabra es palíndromo. En Java, String es
     * inmutable, lo que significa que no puedes cambiar el contenido de un
     * String una vez creado. Cada vez que modificas un String (concatenando,
     * reemplazando, etc.), se crea un nuevo objeto en memoria.
     *
     * StringBuilder es una clase mutable que permite modificar el contenido de
     * la cadena sin crear nuevos objetos.
     */
    public static void ejercicio6() {
        String palabra;
        String invertida;

        System.out.print("Introduce una palabra: ");
        palabra = sc.nextLine();

        // Invertimos la palabra usando StringBuilder
        invertida = new StringBuilder(palabra).reverse().toString();

        // Comparamos ignorando mayúsculas y minúsculas
        System.out.println(palabra.equalsIgnoreCase(invertida) ? "Es palíndromo" : "No es palíndromo");

        //usando arrayd
//        Char[] letras = palabra.toCharArray(); // Convertir String a array de caracteres
//        int n = letras.length;
//        char temp; //varibale auxiliar para poder realizar el intercambio
//        // Intercambiar los caracteres desde los extremos
//        for (int i = 0; i < n / 2; i++) { //solo cambiamos hasta la mitad del array
//            temp = letras[i];
//            letras[i] = letras[n - 1 - i]; // coger el character espejo con respecto al centro
//            letras[n - 1 - i] = temp;
//        }
//
//        return new String(letras); // Convertir array de vuelta a String
    }

    /**
     * Ejercicio 7: Comprueba si todos los caracteres son letras.
     */
    public static void ejercicio7() {
        String texto;
        boolean soloLetras = true;

        System.out.print("Introduce un texto: ");
        texto = sc.nextLine();

        soloLetras = true;

        // Recorremos el texto comprobando cada carácter
        for (int i = 0; i < texto.length(); i++) {
            if (!Character.isLetter(texto.charAt(i))) {
                soloLetras = false;
                break;
            }
        }
        System.out.println(soloLetras ? "Todos son letras" : "No todos son letras");
    }

    /**
     * Ejercicio 8: Elimina los espacios en blanco de un texto. Solo los que son
     * simples
     */
    public static void ejercicio8() {
        String texto;

        System.out.print("Introduce un texto: ");
        texto = sc.nextLine();

        // Sustituimos los espacios por cadena vacía
        System.out.println("Sin espacios: " + texto.replace(" ", ""));
    }

    /**
     * Ejercicio 9: Muestra un mensaje personalizado usando nombre, apellidos,
     * año y ciudad.
     */
    public static void ejercicio9() {
        String nombre, apellidos, ciudad;
        int anio, edad;

        System.out.print("Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Apellidos: ");
        apellidos = sc.nextLine();

        System.out.print("Año de nacimiento: ");
        anio = sc.nextInt();

        sc.nextLine(); //limpieza del escaner

        System.out.print("Ciudad: ");
        ciudad = sc.nextLine();

        // Cálculo de la edad usando el año actual
        edad = Year.now().getValue() - anio; //año actual menos año de nacimiento

        System.out.println("Hola, me llamo " + nombre + " " + apellidos + ", tengo " + edad + " años y vivo en " + ciudad + ".");
    }

    /**
     * Ejercicio 10: Muestra la palabra más larga de 10 introducidas por el
     * usuario.
     */
    public static void ejercicio10() {
        String mayor = ""; //Donde vamos a guardar la palabra más larga
        String palabra = ""; //Donde vamos a guardar la palabra introducida por teclado

        for (int i = 1; i <= 10; i++) {
            System.out.print("Palabra " + i + ": ");
            palabra = sc.nextLine();

            // Comprobamos si es más larga que la actual
            if (palabra.length() > mayor.length()) {
                mayor = palabra;
            }
        }
        System.out.println("La palabra más larga es: " + mayor);
    }

    /**
     * Ejercicio 11: Cambia mayúsculas/minúsculas de un texto y cuenta los
     * cambios.
     */
    public static void ejercicio11() {
        String texto;
        char[] caracteres;
        int cambios = 0;
        String resultado = "";

        System.out.print("Introduce un texto: ");
        texto = sc.nextLine();
        caracteres = texto.toCharArray();

        for (char c : caracteres) {
            if (Character.isUpperCase(c)) {
                resultado += Character.toLowerCase(c);
                cambios++;
            } else if (Character.isLowerCase(c)) {
                resultado += Character.toUpperCase(c);
                cambios++;
            } else {
                resultado += c; // Otros caracteres no se modifican
            }
        }

        System.out.println("Texto transformado: " + resultado);
        System.out.println("Número de cambios: " + cambios);
    }

    /**
     * Ejercicio 12: Muestra la letra más frecuente de una frase.
     */
    public static void ejercicio12() {
        String frase;
        int[] contador = new int[26]; //Donde se va a guardar el total de cada letra teniendo en cuenta su posición en el alfabeto
        int max = 0; //cantidad máxima de repeticiones encontrada
        char letra = 'a'; //letra que se repite más veces.

        System.out.print("Introduce una frase: ");
        frase = sc.nextLine().toLowerCase(); //para no distinguir entre mayusculas y minusculas

        // Contamos las apariciones de cada letra
        for (char c : frase.toCharArray()) {
            if (c >= 'a' && c <= 'z') {//Character.isLetter(c)
                contador[c - 'a']++;
//                aumentamos el contador de esa letra:
//                Ejemplo: si c = 'c', 'c' - 'a' = 2 → contador[2]++
// los caracteres (char) tienen un valor numérico según la tabla Unicode (ASCII para letras básicas).
//'a' tiene el valor 97
//
//'b' → 98
//
//'c' → 99
            }
        }

//      Recorremos el array contador para encontrar la letra que más se repite.
//
//contador[i] > max → si la letra i tiene más repeticiones que max, la actualizamos.
//
//(char) ('a' + i) → convertimos la posición del alfabeto de nuevo a la letra:
//
//Ejemplo: i = 2 → 'a' + 2 = 'c'
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > max) {
                max = contador[i];
                letra = (char) ('a' + i);
            }
        }
        System.out.println("Letra más frecuente: " + letra + " (" + max + " veces)");
    }

    // --------------------------------------------------
    // EJERCICIO 13
    // --------------------------------------------------
    /**
     * Menú del ejercicio 13 juego «Acierta la contraseña». La mecánica del
     * juego es la siguiente: el primer jugador introduce la contraseña; a
     * continuación, el segundo jugador debe teclear palabras hasta que la
     * acierte.
     */
    public static void ejercicio13() {

        int opcion;            // Opción del menú (1 o 2)
        String contrasena;     // Contraseña a adivinar
        String intento = "";   // Palabra introducida por el jugador 2
        int intentos = 0;      // Contador de intentos realizados

        // Mostrar menú de versiones
        System.out.println("1. Versión 1 (mayor / menor)");
        System.out.println("2. Versión 2 (aciertos parciales)");
        System.out.print("Elige opción: ");
        opcion = sc.nextInt();
        sc.nextLine();

        // Jugador 1 introduce la contraseña
        System.out.print("Jugador 1, contraseña: ");
        contrasena = sc.nextLine().toLowerCase(); // Se pasa a minúsculas para comparar mejor

        // Según la opción elegida, se ejecuta una versión u otra
        switch (opcion) {
            case 1:
                ejercicio13Version1(contrasena, intento, intentos);
                break;
            case 2:
                ejercicio13Version2(contrasena, intento, intentos);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    /**
     * Ejercicio 13 - Versión 1 la primera se facilita el juego indicando si la
     * palabra introducida es mayor o menor alfabéticamente que la contraseña.
     *
     * @param contrasena palabra que se está intentando encontrar
     * @param intento palabra que pasa el usuario para acertar
     * @param intentos total de intentos que se entán realizando
     */
    public static void ejercicio13Version1(String contrasena, String intento, int intentos) {
        // El bucle continúa mientras no se acierte la contraseña
        do {
            System.out.print("Jugador 2, palabra: ");
            intento = sc.nextLine().toLowerCase();
            intentos++;

            // compareTo:
            // < 0 → intento es menor alfabéticamente
            // > 0 → intento es mayor alfabéticamente
            if (intento.compareTo(contrasena) < 0) {
                System.out.println("Es menor alfabéticamente");
            } else if (intento.compareTo(contrasena) > 0) {
                System.out.println("Es mayor alfabéticamente");
            }

        } while (!intento.equals(contrasena) || !intento.equals("0"));

        System.out.println("Correcto en " + intentos + " intentos");
    }

    /**
     * Ejercicio 13 - Versión 2 el programa mostrará la longitud de la
     * contraseña y una cadena con caracteres acertados en sus lugares
     * respectivos y asteriscos en los no acertados.
     *
     * @param contrasena palabra que se está intentando encontrar
     * @param intento palabra que pasa el usuario para acertar
     * @param intentos total de intentos que se entán realizando
     */
    public static void ejercicio13Version2(String contrasena, String intento, int intentos) {
        char[] aciertos = new char[contrasena.length()]; // Array que guarda los aciertos en cada posición
        Arrays.fill(aciertos, '*'); // Rellenamos el array con asteriscos

        System.out.print("Jugador 2, palabra: ");
        intento = sc.nextLine().toLowerCase();

        // El bucle continúa hasta acertar la contraseña o escribir "0"
        while (!intento.equals(contrasena) || !intento.equals("0")) {
            System.out.print("Jugador 2, palabra: ");
            intento = sc.nextLine().toLowerCase();
            intentos++;

            // Comprobamos letra a letra
            for (int i = 0; i < Math.min(intento.length(), contrasena.length()); i++) {
                if (intento.charAt(i) == contrasena.charAt(i)) {
                    aciertos[i] = contrasena.charAt(i);
                }
            }

            // Mostramos el estado de los aciertos
            System.out.println("Aciertos: " + new String(aciertos));
        }

        if (!intento.equals("0")) {
            System.out.println("Correcto en " + intentos + " intentos");
        }
    }

    /**
     * Ejercicio 14: Cuenta la cantidad de espacios en una frase.
     */
    public static void ejercicio14() {
        String frase;
        int espacios = 0;

        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();

        // Recorremos la frase carácter a carácter
        for (char c : frase.toCharArray()) {
            if (c == ' ') {
                espacios++;
            }
        }
        System.out.println("Número de espacios: " + espacios);
    }

    /**
     * Ejercicio 15: Elimina todas las vocales de un texto.
     */
    public static void ejercicio15() {
        String texto;
        String resultado = "";

        System.out.print("Introduce un texto: ");
        texto = sc.nextLine();

        // Solo añadimos al resultado los caracteres que no son vocal
        for (char c : texto.toCharArray()) {
            if (!esVocal(c)) {
                resultado += c;
            }
        }
        System.out.println("Texto sin vocales: " + resultado);
    }

    /**
     * Método auxiliar para comprobar si un carácter es vocal
     */
    public static boolean esVocal(char c) {
        String vocales = "aeiouáéíóúüAEIOUÁÉÍÓÚÜ";
        return vocales.indexOf(c) != -1;
    }

    /**
     * Ejercicio 16: Cuenta cuántas veces aparece una palabra en una frase.
     */
    public static void ejercicio16() {
        String frase;
        String palabra;
        String[] palabras;
        int contador = 0;

        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();
        System.out.print("Introduce una palabra: ");
        palabra = sc.nextLine();

        // Dividimos la frase en palabras
        palabras = frase.split("\\s+");

        // Contamos coincidencias
        for (String p : palabras) {
            if (p.equalsIgnoreCase(palabra)) {
                contador++;
            }
        }
        System.out.println("La palabra aparece " + contador + " veces");
    }

    /**
     * Ejercicio 17: Traductor de frases del idioma de Javalandia.
     */
    public static void ejercicio17() {
        String frase;
        final String prefijo = "Javalín, javalón,";
        final String sufijo = " javalén, len, len";

        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();

        if (frase.startsWith(prefijo)) {
            System.out.println("Mensaje traducido: " + frase.substring(prefijo.length()).trim());
        } else if (frase.endsWith(sufijo)) {
            System.out.println("Mensaje traducido: " + frase.substring(0, frase.length() - sufijo.length()).trim());
        } else {
            System.out.println("No es idioma de Javalandia");
        }
    }

    /**
     * Ejercicio 18: Leer palabras hasta que se escriba "fin".
     */
    public static void ejercicio18() {

        String frase = "";
        String palabra;

        System.out.println("Introduce palabras (escribe 'fin' para terminar):");
        palabra = sc.next();

        while (!palabra.equalsIgnoreCase("fin")) {
            palabra = sc.next();
            frase += palabra + " ";
        }

        sc.nextLine(); // limpiar buffer
        System.out.println("Frase completa: " + frase.trim());
    }

    /**
     * Ejercicio 19: Cifrado según correspondencia de letras.
     */
    public static void ejercicio19() {
        String c1 = "elkmpqrstuv"; // Letras originales
        String c2 = "pvlumterkqs"; // Letras sustitutas
        String cifrado = "";
        String texto;
        char[] letras;

        System.out.print("Introduce texto a cifrar: ");
        texto = sc.nextLine().toLowerCase();
        letras = texto.toCharArray();

        for (char c : letras) {
            int pos = c1.indexOf(c); //se encuentra la posición de la letra en la string c1
            // si no aparece devuelve -1
            /*
            Si la posición es distinta de -1 sustituimos por la letra en la misma posición en el otro array
             */
            cifrado += (pos != -1) ? c2.charAt(pos) : c;

//            //otra forma
//            if (pos != -1) {
//                cifrado += c2.charAt(pos); // sustituimos la letra
//            } else {
//                cifrado += c;              // dejamos la letra igual
//            }
        }
        System.out.println("Texto cifrado: " + cifrado);
    }

    /**
     * Ejercicio 20: Comprobar si dos palabras son anagramas.
     */
    public static void ejercicio20() {
        String palabra1;
        String palabra2;
        char[] a1;
        char[] a2;

        System.out.print("Introduce la primera palabra: ");
        palabra1 = sc.nextLine();
        System.out.print("Introduce la segunda palabra: ");
        palabra2 = sc.nextLine();

        // Convertimos las palabras en arrays de caracteres
        a1 = palabra1.toCharArray();
        a2 = palabra2.toCharArray();

        // Ordenamos los arrays
        Arrays.sort(a1);
        Arrays.sort(a2);

        // Si son iguales, son anagramas
        System.out.println(Arrays.equals(a1, a2) ? "Son anagramas" : "No son anagramas");
    }

    /**
     * Ejercicio 21: Contar repeticiones de letras en una frase.
     */
    public static void ejercicio21() {
        String frase;
        int[] contador = new int[26]; // Una posición por cada letra

        System.out.print("Introduce una frase: ");
        frase = sc.nextLine().toLowerCase();

        // Contamos las letras
        for (char c : frase.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                contador[c - 'a']++;
            }
        }
        // Mostramos solo las letras que aparecen
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > 0) {
                System.out.println((char) ('a' + i) + ": " + contador[i] + " veces");
            }
        }
    }

}