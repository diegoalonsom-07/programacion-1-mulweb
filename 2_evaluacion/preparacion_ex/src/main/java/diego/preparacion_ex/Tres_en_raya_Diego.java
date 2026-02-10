/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package diego.preparacion_ex;

/**
 *
 * @author Diego
 */
import java.util.Scanner;
import java.util.Arrays;

public class Tres_en_raya_Diego {

    static Scanner sc = null;
    static char [][] tablero = new char [4][4];
    static boolean tableroLleno = false;
    static boolean coorVal = false;
    static boolean hayGan = false;
    static boolean usada = true;
    static char jugadorX = 'X';
    static char jugadorO = 'O';
    static int fila;
    static int columna;
    
    /**
     * Funcion principal en la que se llama al metodo donde se ejecutara el juego
     * @param args 
     */
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println(" _______________________________________");
        System.out.println("|                                       |");
        System.out.println("|        BIENVENIDO AL 3 EN RAYA        |");
        System.out.println("|                                       |");
        System.out.println("|             ¿ESTAS LISTO?             |");
        System.out.println("|_______________________________________|");
        System.out.println();
        try{
            tablero [0][0] = ' ';
            tablero [0][1] = '0';
            tablero [0][2] = '1';
            tablero [0][3] = '2';
            tablero [1][0] = '0';
            tablero [1][1] = '-';
            tablero [1][2] = '-';
            tablero [1][3] = '-';
            tablero [2][0] = '1';
            tablero [2][1] = '-';
            tablero [2][2] = '-';
            tablero [2][3] = '-';
            tablero [3][0] = '2';
            tablero [3][1] = '-';
            tablero [3][2] = '-';
            tablero [3][3] = '-';
           
            jugar();
        } catch (ArithmeticException r){
            System.out.println("Se ha introducido un valor fuera de rango");
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println("A habido un problema con los arrays");
        } catch (Exception e){
            System.out.println("Fallo generico");
        } finally{
            jugar();
        }
        
    }
    /**
     * Funcion para mostrar como va la partida
     */
    static void mostrarTablero(){
        for(int contador1 = 0; contador1 < tablero.length; contador1++){
            for(int contador2 = 0; contador2 < tablero[contador1].length; contador2++){
                System.out.print(tablero[contador1][contador2]);
            }
            System.out.println();
        }
    }
    
    /**
     * 
     * @param fila  Es la fila en la que quiere poner el jugador, se le suma uno para ponerlo en la psicion real del array
     * @param columna Es la columna en la que quiere poner el jugador, se le suma uno para ponerlo en la psicion real del array
     * @return devuelve un booleano e indica si la opcion es valida
     */
    static boolean coordenadaValida(int fila, int columna){
        if (fila > 3 || columna > 3){
            System.out.println("Has introducido la fila y la columna mal ");
            return false;
        }else if (tablero[fila + 1][columna + 1] == 'X' || tablero[fila + 1][columna + 1] == 'O'){
            System.out.println("Esa casilla ya esta usada");
            return false;
        }
        return true;
    }
    /**
     * Es el metodo para que los usuarios elijan donde poner la ficha
     * @param jugador 
     */
    static void turnoJugador(char jugador){
        System.out.println(" _______________________________________");
        System.out.println("|                                       |");
        System.out.println("|          Es turno de " + jugador + "         |");
        System.out.println("|_______________________________________|");
        System.out.println(" Introduce fila: ");
        fila = sc.nextInt();
        sc.nextLine();
        System.out.println(" Introduce columna: ");
        columna = sc.nextInt();
        coorVal = coordenadaValida(fila, columna);
    }
    
    static boolean verificarGanador(char jugador){
        return true;
    }
    /**
     * Indica si el tablero esta lleno
     * @return devuelve un booleano para poder acabar el juego
     */
    static boolean tableroLleno(){
        int contador = 0;
        for(int contador1 = 1; contador1 < tablero.length; contador1++){
            for(int contador2 = 1; contador2 < tablero[contador1].length; contador2++){
                if(tablero[contador1][contador2] == 'X' || tablero[contador1][contador2] == 'O'){
                    contador++;
                }
            }
        }
        if (contador == 9){
            return true;
        } else{
        return false;
        }

    }
    /**
     * Metodo principal que se ejecuta el juego
     */
    static void jugar(){
        do{
            mostrarTablero();
            if (tableroLleno() == false){
                turnoJugador(jugadorX);
                if (coorVal == false){
                    turnoJugador(jugadorX);
                } else {
                    tablero [fila + 1][columna + 1] = 'X';
                }
            } else  {
                 hayGan = verificarGanador(jugadorX);
                 if (hayGan){
                    System.out.println("Felicidades, ha ganado el Jugador X");
                }
            }
            
            mostrarTablero();
            
            coorVal = false;
            
            turnoJugador(jugadorO);
            if (tableroLleno() == false){
                turnoJugador(jugadorO);
                if (coorVal == false){
                    turnoJugador(jugadorO);
                } else {
                    tablero [fila + 1][columna + 1] = 'O';
                }
            } else {
                hayGan = verificarGanador(jugadorO);
                if (hayGan){
                    System.out.println("Felicidades, ha ganado el Jugador O");
                }
            }
            
            mostrarTablero();
            
        } while (tableroLleno == true || hayGan == true);
    }
    
}
