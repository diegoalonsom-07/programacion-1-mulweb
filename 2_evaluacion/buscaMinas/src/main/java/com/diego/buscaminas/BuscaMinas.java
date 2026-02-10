/**
 *
 * @author Diego
 */

package com.diego.buscaminas;
import java.util.Scanner;
import java.util.Arrays;


public class BuscaMinas {

    static Scanner sc = null;
    static char [][] tableroOculto;
    static char [][] tableroMinas;
    static int [][] tableroSolucion;
    static String [][] tableroActual;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        dificultad();
    }

    /**
     * Este metodo se utilizara para elegir la dificultad y poder volver a el para poder jugar otra partida
     */
    static void dificultad(){
        String opcion;

        System.out.println(" _____________________________________________________");
        System.out.println("|                                                     |");
        System.out.println("|         B U S C A M I N A S   D I G I T A L         |");
        System.out.println("|_____________________________________________________|");
        System.out.println("|                                                     |");
        System.out.println("|   ¡Cuidado donde pisas! Elige tu nivel de desafío:  |");
        System.out.println("|                                                     |");
        System.out.println("|   [1] PRINCIPIANTE   ->  Tablero 3x3   (11 Minas)   |");
        System.out.println("|   [2] INTERMEDIO     ->  Tablero 16x16 (40 Minas)   |");
        System.out.println("|   [3] EXPERTO        ->  Tablero 16x30 (99 Minas)   |");
        System.out.println("|_____________________________________________________|");
        System.out.print(" --> SELECCIÓN: ");
        opcion = sc.nextLine();
        System.out.println();

        switch (opcion) {
            case "1":
                System.out.println("Has escogido la opcion de principiante, ¿Tienes miedo?");
                iniciarTableros(3, 3, 1);
                break;
            case "2":
                System.out.println("Bueno no esta tan mal la dificultad intermedia");
                iniciarTableros(6, 6, 10);
                break;
            case "3":
                System.out.println("Muy bien eres un valiente para coger el modo experto");
                iniciarTableros(10, 10, 30);
                break;
            default:
                System.out.println("Esa opción no es valida. Vuelve a elegir");
                break;
        }
    }

    /**
     * Este metodo es el que se utiliza para ver el estado del tablero. Se utilizara durante toda la partida
     */
    static void mostrarTablero(){
        System.out.println(" ");
        for(int contador1 = 0; contador1 < tableroActual.length; contador1++){
            System.out.print(contador1);
        }

        for(int contador1 = 0; contador1 < tableroActual.length; contador1++){
            System.out.print(contador1);
            for(int contador2 = 0; contador2 < tableroActual[contador1].length; contador2++){
                System.out.print(tableroActual[contador1][contador2] + " ");
            }
            System.out.println();
        }


    }

    /**
     * Este método es el que se utilizará para crear los tableros, rellenarlos...
     * @param filas esto se determinara dependiendo de la dificultad del juego
     * @param columnas esto se determinara dependiendo de la dificultad del juego
     * @param totalMinas esto se determinara dependiendo de la dificultad del juego
     */
    static void iniciarTableros(int filas, int columnas, int totalMinas){
        tableroOculto = new char [filas][columnas];
        tableroMinas = new char [filas][columnas];
        tableroSolucion = new int [filas][columnas];
        tableroActual = new String [filas][columnas];

        for(int contador1 = 0; contador1 < tableroOculto.length; contador1++){
            for(int contador2 = 0; contador2 < tableroOculto[contador1].length; contador2++){
                tableroOculto[contador1][contador2] = '■';
                System.out.print(tableroOculto[contador1][contador2] + " ");
            }
            System.out.println();
        }
        
        for(int contador1 = 0; contador1 < tableroOculto.length; contador1++){
            for(int contador2 = 0; contador2 < tableroOculto[contador1].length; contador2++){
                tableroOculto[contador1][contador2] = '■';
                System.out.print(tableroOculto[contador1][contador2] + " ");
            }
            System.out.println();
        }

        jugar(1);
    }



    static void jugar(int cantidadMinas){
        
    }

    static boolean esMina(int col, int fi){
        return true;
    }

    static boolean verficarVictoria(){
        return true;
    }

    static boolean coordenadaValida(int fila, int columna){
        return true;
    }

    static void destaparCasilla(int fila, int col){

    }

}
