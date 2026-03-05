package com.diego.buscaminas;

import java.util.Random;
import java.util.Scanner;


public class BuscaminarDiegoAlonso {

    static char[][] tableroVisible;
    static char[][] tableroMinas;
    static int[][] tableroSolucion;
    static int filas;
    static int columnas;
    static Scanner sc = new Scanner(System.in);
    static int totalMinas;

    public static void main(String[] args) {
        String opcion;
        boolean salir;

        salir = false;


        while (!salir) {
            opcion = mostrarMenu();

            switch (opcion) {
                case "1":
                    iniciarTableros(3, 3, 1);
                    jugar(1);
                    break;
                case "2":
                    iniciarTableros(6, 6, 10);
                    jugar(10);
                    break;
                case "3":
                    iniciarTableros(10, 10, 30);
                    jugar(30);
                    break;
                case "4":
                    modoPersonalizado();
                    break;
                case "5":
                    salir = true;
                    System.out.println("¡Hasta la próxima! Gracias por jugar.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    /**
     * Muestra el menú principal y devuelve la opción elegida por el jugador.
     * @return opción seleccionada
     */
    static String mostrarMenu() {
        String opcion;
        System.out.println(" _____________________________________________________");
        System.out.println("|                                                     |");
        System.out.println("|         B U S C A M I N A S   D I G I T A L         |");
        System.out.println("|_____________________________________________________|");
        System.out.println("|                                                     |");
        System.out.println("|   ¡Cuidado donde pisas! Elige tu nivel de desafío:  |");
        System.out.println("|                                                     |");
        System.out.println("|   [1] PRINCIPIANTE   ->  Tablero 3x3   (1 Minas)    |");
        System.out.println("|   [2] INTERMEDIO     ->  Tablero 6x6 (10 Minas)     |");
        System.out.println("|   [3] EXPERTO        ->  Tablero 10x10 (30 Minas)   |");
        System.out.println("|   [4] PERSONALIZADO  ->  Elige tú el tamaño y minas |");
        System.out.println("|   [5] SALIR          ->  Abandonar el campo minado  |");
        System.out.println("|_____________________________________________________|");
        System.out.print(" --> SELECCIÓN: ");
        opcion = sc.nextLine();

        return opcion;
    }

    /**
     * Muestra el tablero por consola con numeración de filas y columnas.
     * - ■ para casillas ocultas
     * - * para minas descubiertas
     * - F para banderas
     */
    static void mostrarTablero() {
        int i, j;

        System.out.print("   ");
        for (j = 0; j < columnas; j++) {
            System.out.print(j + "  ");
        }
        System.out.println();

        System.out.print("   ");
        for (j = 0; j < columnas; j++) {
            System.out.print("───");
        }
        System.out.println();

        for (i = 0; i < filas; i++) {
            System.out.print(i + "│");
            for (j = 0; j < columnas; j++) {
                System.out.print(" " + tableroVisible[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Minas restantes: " + contarMinasRestantes());
    }

    /**
     * Inicializa los tres tableros (visible, minas y solución) y coloca las minas.
     * @param numFilas    número de filas del tablero
     * @param numColumnas número de columnas del tablero
     * @param numMinas    número de minas a colocar
     */
    static void iniciarTableros(int numFilas, int numColumnas, int numMinas) {
        int i, j;

        filas = numFilas;
        columnas = numColumnas;
        totalMinas = numMinas;

        tableroVisible = new char[filas][columnas];
        tableroMinas = new char[filas][columnas];
        tableroSolucion = new int[filas][columnas];

        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                tableroVisible[i][j]  = '■';
                tableroMinas[i][j]    = ' ';
                tableroSolucion[i][j] = 0;
            }
        }

        colocarMinas(numMinas);

        generarSolucion();
    }

    /**
     * Coloca las minas de forma aleatoria en el tablero de minas.
     * No permite posiciones repetidas.
     * @param numMinas número de minas a colocar
     */
    static void colocarMinas(int numMinas) {
        Random random;
        int minasColocadas, fila, col;

        random = new Random();
        minasColocadas = 0;

        while (minasColocadas < numMinas) {
            fila = random.nextInt(filas);
            col  = random.nextInt(columnas);

            if (tableroMinas[fila][col] != '*') {
                tableroMinas[fila][col] = '*';
                minasColocadas++;
            }
        }
    }

    /**
     * Calcula los números del tablero solución.
     * Cuenta minas en las 8 posiciones vecinas.
     * Marca las minas con -1 en el tablero solución.
     */
    static void generarSolucion() {
        int i, j, vecinaFila, vecinaCol, contador;
        int[] filas1;
        int[] columnas1;

        filas1 = new int[]{-1, -1, -1, 0, 0, 1, 1, 1};
        columnas1  = new int[]{-1,  0,  1,-1, 1,-1, 0, 1};

        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {

                if (tableroMinas[i][j] == '*') {
                    tableroSolucion[i][j] = -1;
                } else {
                    contador = 0;
                    for (int k = 0; k < 8; k++) {
                        vecinaFila = i + filas1[k];
                        vecinaCol  = j + columnas1[k];

                        if (coordenadaValida(vecinaFila, vecinaCol) && tableroMinas[vecinaFila][vecinaCol] == '*') {
                            contador++;
                        }
                    }
                    tableroSolucion[i][j] = contador;
                }
            }
        }
    }

    /**
     * Contiene el bucle principal del juego.
     * Pide coordenadas, destapa casillas y comprueba victoria o derrota.
     * @param cantidadMinas número de minas de la partida
     */
        static void jugar(int cantidadMinas) {
        int fila, col;
        boolean juegoActivo;
        boolean perdio;
        String accion;

        fila = 0;
        col  = 0;
        juegoActivo = true;
        perdio = false;
        accion = "";

        System.out.println("¡Partida iniciada! Buena suerte.");
        mostrarTablero();

        while (juegoActivo) {
            System.out.println("Opciones: [D] Descubrir | [B] Bandera | [P] Pista | [R] Rendirse");
            System.out.print("Acción: ");

            try {
                accion = sc.nextLine().toUpperCase();

                if (accion.equals("R")) {
                    System.out.println("Te has rendido. Aquí está la solución:");
                    mostrarTableroCompleto();
                    juegoActivo = false;
                    break;
                }

                if (accion.equals("P")) {
                    darPista();
                    mostrarTablero();
                    continue;
                }

                if (accion.equals("B")) {
                    System.out.print("Fila: ");
                    fila = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Columna: ");
                    col = sc.nextInt();
                    sc.nextLine();
                    marcarBandera(fila, col);
                    mostrarTablero();
                    continue;
                }

                if (accion.equals("D")) {
                    System.out.print("Fila: ");
                    fila = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Columna: ");
                    col = sc.nextInt();
                    sc.nextLine();
                } else {
                    System.out.println("Opción no válida. Usa D, B, P o R.");
                    continue;
                }

                if (!coordenadaValida(fila, col)) {
                    System.out.println("Coordenada fuera del tablero. Inténtalo de nuevo.");
                    continue;
                }

                if (tableroVisible[fila][col] != '■' && tableroVisible[fila][col] != 'F') {
                    System.out.println("Esa casilla ya está descubierta. Elige otra.");
                    continue;
                }

                if (tableroVisible[fila][col] == 'F') {
                    System.out.println("Esa casilla tiene una bandera. Quítala antes con la opción B.");
                    continue;
                }

                if (esMina(col, fila)) {
                    tableroVisible[fila][col] = '*';
                    System.out.println("¡BOOM! Pisaste una mina. ¡Has perdido!");
                    mostrarTableroCompleto();
                    juegoActivo = false;
                    perdio = true;
                } else {
                    destaparCasilla(fila, col);
                    mostrarTablero();

                    if (verificarVictoria()) {
                        System.out.println(" ¡ENHORABUENA HAS GANADO!");
                        juegoActivo = false;
                    }
                }

            } catch (Exception e) {
                System.out.println("Entrada no válida. Introduce números para fila y columna.");
                sc.nextLine();
            }
        }

        preguntarRevancha();
    }

    /**
     * Devuelve true si la casilla indicada contiene una mina.
     * @param col columna de la casilla
     * @param fi  fila de la casilla
     * @return true si hay mina, false en caso contrario
     */
    static boolean esMina(int col, int fi) {
        return tableroMinas[fi][col] == '*';
    }

    /**
     * Comprueba si el jugador ha ganado.
     * La victoria se produce cuando solo quedan ocultas las casillas con minas.
     * @return true si el jugador ha ganado
     */
    static boolean verificarVictoria() {
        int i, j;

        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                // Si hay una casilla oculta (■) que no es mina, no ha ganado aún
                if (tableroVisible[i][j] == '■' && tableroMinas[i][j] != '*') {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Comprueba si la coordenada existe dentro del tablero.
     * @param fila    fila a comprobar
     * @param columna columna a comprobar
     * @return true si la coordenada es válida
     */
    static boolean coordenadaValida(int fila, int columna) {
        return fila >= 0 && fila < filas && columna >= 0 && columna < columnas;
    }

    /**
     * Destapa la casilla indicada.
     * Si es mina, se deja que el método jugar() la gestione.
     * Si no es mina, copia el número de minas adyacentes al tablero visible.
     * Si el número es 0, descubre recursivamente las casillas vecinas.
     * @param fila fila de la casilla
     * @param col  columna de la casilla
     */
    static void destaparCasilla(int fila, int col) {
        int[] filas1;
        int[] columnas1;
        int vecinaFila, vecinaCol, k;

        if (!coordenadaValida(fila, col)){
            return;
        } 
        if (tableroVisible[fila][col] != '■') {
            return;
        }

        if (tableroMinas[fila][col] == '*') { 
            return;
        }

        tableroVisible[fila][col] = (char) ('0' + tableroSolucion[fila][col]);

        if (tableroSolucion[fila][col] == 0) {
            filas1 = new int[]{-1, -1, -1, 0, 0, 1, 1, 1};
            columnas1  = new int[]{-1,  0,  1,-1, 1,-1, 0, 1};

            for (k = 0; k < 8; k++) {
                vecinaFila = fila + filas1[k];
                vecinaCol  = col  + columnas1[k];
                destaparCasilla(vecinaFila, vecinaCol);
            }
        }
    }

    /**
     * Muestra el tablero completo con todas las minas reveladas.
     * Se usa al perder o rendirse.
     */
    static void mostrarTableroCompleto() {
        int i, j;
        char[][] tableroTemp;

        tableroTemp = new char[filas][columnas];

        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                tableroTemp[i][j] = tableroVisible[i][j];
                if (tableroMinas[i][j] == '*') {
                    tableroVisible[i][j] = '*';
                } else if (tableroVisible[i][j] == '■') {
                    tableroVisible[i][j] = (char)('0' + tableroSolucion[i][j]);
                }
            }
        }

        System.out.println("--- TABLERO COMPLETO ---");
        mostrarTablero();

        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                tableroVisible[i][j] = tableroTemp[i][j];
            }
        }
    }

    /**
     * Cuenta las minas que el jugador aún no ha descubierto (no marcadas como bandera).
     * @return número de minas restantes
     */
    static int contarMinasRestantes() {
        int i, j, banderas;

        banderas = 0;

        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                if (tableroVisible[i][j] == 'F') {
                    banderas++;
                }
            }
        }

        return totalMinas - banderas;
    }

    /**
     * Marca o desmarca una casilla con bandera (F).
     * Las banderas no se pueden descubrir directamente.
     * @param fila fila de la casilla
     * @param col  columna de la casilla
     */
    static void marcarBandera(int fila, int col) {
        if (!coordenadaValida(fila, col)) {
            System.out.println("Coordenada no válida.");
            return;
        }

        if (tableroVisible[fila][col] == '■') {
            tableroVisible[fila][col] = 'F';
            System.out.println("Bandera colocada en [" + fila + "," + col + "].");
        } else if (tableroVisible[fila][col] == 'F') {
            tableroVisible[fila][col] = '■';
            System.out.println("Bandera retirada de [" + fila + "," + col + "].");
        } else {
            System.out.println("No puedes colocar una bandera en esa casilla.");
        }
    }

    /**
     * Da una pista al jugador descubriendo automáticamente una casilla segura aleatoria.
     */
    static void darPista() {
        Random random;
        int fila, col, intentos;
        boolean encontrado;

        random = new Random();
        intentos = 0;
        encontrado = false;

        while (intentos < 1000 && !encontrado) {
            fila = random.nextInt(filas);
            col = random.nextInt(columnas);

            if (tableroVisible[fila][col] == '■' && tableroMinas[fila][col] != '*') {
                destaparCasilla(fila, col);
                System.out.println("Pista: se ha descubierto la casilla [" + fila + "," + col + "].");
                encontrado = true;
            }
            intentos++;
        }

        if (!encontrado) {
            System.out.println("No hay casillas seguras disponibles para mostrar.");
        }
    }

    /**
     * Modo personalizado: el jugador elige el tamaño del tablero y el número de minas.
     */
    static void modoPersonalizado() {
        int numFilas, numColumnas, numMinas, maxMinas;

        numFilas = 0;
        numColumnas = 0;
        numMinas = 0;
        maxMinas = 0;

        System.out.println("--- MODO PERSONALIZADO ---");

        try {
            System.out.print("Número de filas (mín. 2): ");
            numFilas = sc.nextInt();
            sc.nextLine();
            if (numFilas < 2) numFilas = 2;

            System.out.print("Número de columnas (mín. 2): ");
            numColumnas = sc.nextInt();
            sc.nextLine();
            if (numColumnas < 2) numColumnas = 2;

            maxMinas = (numFilas * numColumnas) - 1;
            System.out.print("Número de minas (máx. " + maxMinas + "): ");
            numMinas = sc.nextInt();
            sc.nextLine();

            if (numMinas < 1){
                numMinas = 1;
            }

            if (numMinas > maxMinas) {
                numMinas = maxMinas;
            }

            iniciarTableros(numFilas, numColumnas, numMinas);
            jugar(numMinas);

        } catch (Exception e) {
            System.out.println("Entrada no válida. Volviendo al menú principal.");
        }
    }

    /**
     * Pregunta al jugador si desea volver a jugar o salir.
     * Si elige volver, muestra el menú principal (la lógica principal lo recoge).
     */
    static void preguntarRevancha() {
        String respuesta;

        respuesta = "";

        System.out.print("¿Quieres volver a jugar? (S/N): ");
        try {
            respuesta = sc.nextLine().toUpperCase();
        } catch (Exception e) {
            respuesta = "N";
        }

        if (respuesta.equals("S")) {
            System.out.println("Volviendo al menú principal...");
        } else {
            System.out.println("Gracias por jugar. ¡Hasta pronto!");
            System.exit(0);
        }
    }
}
