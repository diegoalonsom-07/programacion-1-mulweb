/*
 * ====================================================================
 * EJERCICIOS DE PROGRAMACIÓN EN JAVA
 * Temas: Condicionales (UT2_P1) y Bucles/Estructuras de Repetición (UT2_P2)
 * ====================================================================
 *
 * ## EJERCICIOS DE CONDICIONALES
 * --------------------------------------------------------------------
 *
 * 1. Día Laborable o Fin de Semana:
 * Diseña una aplicación que solicite al usuario un número del 1 al 7
 * (donde 1 es Lunes y 7 es Domingo) e indique si el día corresponde a un
 * día laborable (Lunes a Viernes) o a un fin de semana (Sábado y Domingo).
 * Si el número no está en el rango, debe indicarlo.
 *
 * 2. Clasificación de Temperatura:
 * Pide al usuario que introduzca un número entero que represente una
 * temperatura en grados Celsius. El programa debe indicar si la temperatura es:
 * - Helada (menor o igual a 0°C).
 * - Fría (mayor a 0°C y menor o igual a 10°C).
 * - Templada (mayor a 10°C y menor o igual a 25°C).
 * - Calurosa (mayor a 25°C).
 *
 * 3. Cálculo de Área de Figuras:
 * Implementa un programa que pida al usuario que elija entre calcular el
 * área de un cuadrado (1) o de un círculo (2).
 * - Si elige el cuadrado, debe pedir el lado y mostrar el área (Lado^2).
 * - Si elige el círculo, debe pedir el radio y mostrar el área (π * Radio^2).
 * - Debe manejar cualquier otra entrada como una opción no válida.
 *
 * 4. Clasificación del Triángulo:
 * Solicita las longitudes de los tres lados de un triángulo. Indica si el
 * triángulo es Equilátero, Isósceles o Escaleno. Primero, verifica si con
 * esas longitudes se puede formar un triángulo (la suma de dos lados siempre
 * debe ser mayor que el tercer lado).
 *
 *
 * ## EJERCICIOS DE BUCLES Y ESTRUCTURAS DE REPETICIÓN
 * --------------------------------------------------------------------
 *
 * 5. Media de Números Positivos:
 * Escribe un programa que pida al usuario números enteros. La aplicación debe
 * detenerse cuando se introduzca un número negativo. Al finalizar, debe
 * mostrar la cantidad de números positivos introducidos y la media aritmética
 * de solo esos números positivos.
 *
 * 6. Dibujar un Triángulo Rectángulo con Carácter:
 * Crea un programa que solicite un número entero N (la altura) y un carácter
 * de relleno. Luego, dibuja un triángulo rectángulo de altura N utilizando el
 * carácter proporcionado.
 *
 * 7. Tabla de Múltiplos Dentro de un Rango:
 * Solicita al usuario un número M (el múltiplo) y dos límites, un mínimo A
 * y un máximo B. El programa debe listar todos los múltiplos de M que se
 * encuentran en el rango [A, B] (incluyendo A y B si son múltiplos).
 *
 * 8. Suma de Dígitos de un Número:
 * Diseña un programa que pida un número entero positivo y calcule la suma de
 * cada uno de sus dígitos. No se pueden usar variables de tipo String.
 *
 * 9. Adivina la Palabra Secreta:
 * Implementa un juego que guarde una palabra secreta (ej: "java"). El programa
 * debe pedir al usuario que introduzca una palabra hasta que acierte la palabra
 * secreta. Al final, debe mostrar cuántos intentos fueron necesarios.
 *
 * 10. Listar Divisores Propios:
 * Pide un número N y lista todos sus divisores propios (divisores excluyendo
 * el propio número N).
 *
 * ====================================================================
 */
/**
 * ## 📊 Contador de Paridad en Arreglos
 *
 * Desarrolla un método estático llamado `contarParesEImpares`.
 *
 * Este método debe aceptar un único parámetro: un **arreglo de números
 * enteros** (`int[]`).
 *
 * El objetivo es recorrer todos los elementos del arreglo de entrada
 * utilizando un **bucle** y, mediante una **estructura condicional**,
 * determinar cuántos números son **pares** y cuántos son **impares**.
 *
 * @param numeros El arreglo de números enteros a procesar.
 * @return Un nuevo arreglo de enteros de dos posiciones (`int[2]`) donde:
 * <ul>
 * <li>La posición `0` almacena el **total de números pares**.</li>
 * <li>La posición `1` almacena el **total de números impares**.</li>
 * </ul>
 * Si el arreglo de entrada es `null` o está vacío, debe devolver
 * `{0, 0}`.
 */
// public static int[] contarParesEImpares(int[] numeros) { ... }

//* ====================================================================

// **Ejercicio de Programación en Java Avanzado: Múltiplos y Estrellas**
//
// Desarrolla la lógica del siguiente programa dentro del método `main`.
//
// El programa debe realizar dos tareas principales que se apoyan en bucles y condicionales:
//
// ## Tarea 1: Suma de Múltiplos en un Rango
//
// 1.  Define una variable entera `limiteSuperior` con el valor **100**.
// 2.  Utiliza un **bucle `for` simple** para iterar desde **1** hasta `limiteSuperior`.
// 3.  Dentro de este bucle, usa una **estructura condicional** (`if/else if`) para verificar:
//     * Si el número actual es **múltiplo de 3** (pero no de 5).
//     * Si el número actual es **múltiplo de 5** (pero no de 3).
// 4.  Crea tres contadores: `sumaMultiplos3`, `sumaMultiplos5` y `sumaAmbos` (para múltiplos de 15).
// 5.  Suma el número actual a su contador correspondiente. Si es múltiplo de 15, súmalo a `sumaAmbos` **en lugar de** a los otros dos.
// 6.  Al finalizar el bucle, imprime por consola la suma total de cada categoría.
//
// ## Tarea 2: Impresión de un Triángulo de Patrones
//
// 1.  Define una variable entera `altura` con el valor **7**.
// 2.  Utiliza **bucles anidados** (un bucle principal y uno o más internos) para imprimir por consola
//     un triángulo rectángulo de altura 7, donde cada línea alterna entre caracteres:
//     * Las líneas **impares** deben consistir únicamente en el carácter `*` (asterisco).
//     * Las líneas **pares** deben consistir únicamente en el carácter `#` (almohadilla).
//
// ### Ejemplo de salida esperada para la Tarea 2:
//
// *
// ##
// ***
// ####
// *****
// ######
// *******
//
// **Nota:** Todo el código (declaración de variables, bucles y salidas) debe estar estrictamente
// dentro del método `public static void main (String[]args)`.