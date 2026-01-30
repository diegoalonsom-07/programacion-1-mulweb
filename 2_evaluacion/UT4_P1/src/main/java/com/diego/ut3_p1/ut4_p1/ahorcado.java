
package com.diego.ut3_p1.ut4_p1;
import java.util.Scanner;

public class ahorcado {
    
    static Scanner sc = null;
    
    public static void main (String[]args){
        sc = new Scanner (System.in);
        String palabraIni = "";
        char [] palabraArray;
        char [] palabraSecreta;

        palabraIni = modoJuego();

        palabraIni = palabraIni.toUpperCase();

        palabraArray = convertirArray(palabraIni);

        palabraSecreta = esconderPalabra(palabraArray);

        juegoAhorcado(palabraArray, palabraSecreta);

    }
    
    static String modoJuego(){
        String opcion = "";
        System.out.println(" ______________________________________________");
        System.out.println("|                                              |");
        System.out.println("|                   AHORCADO                   |");
        System.out.println("|______________________________________________|");
        System.out.println("|                                              |");
        System.out.println("|   1.- Elegir tu la palabra                   |");
        System.out.println("|   2.- 1 vs 1 Contra la máquina               |");
        System.out.println("|   0.- Salir                                  |");
        System.out.println("|______________________________________________|");
        System.out.println("|                                              |");
        System.out.println("|               ELIGE UNA OPCION               |");
        System.out.println("|______________________________________________|");

        opcion = sc.nextLine();

        switch (opcion) {
            case "1":
                return modoJugadores();
            case "2":
                return modoMaquina();
            case "0":
                System.out.println(" ______________________________________________");
                System.out.println("|                                              |");
                System.out.println("|               GRACIAS POR JUGAR              |");
                System.out.println("|______________________________________________|");
                System.exit(0);
            default:
                System.out.println(" ______________________________________________");
                System.out.println("|                                              |");
                System.out.println("|            OPCIÓN NO VÁLIDA                  |");
                System.out.println("|______________________________________________|");
                return modoJuego();
        }

    }

    static String modoJugadores(){
        System.out.println(" ______________________________________________");
        System.out.println("|                                              |");
        System.out.println("|                   AHORCADO                   |");
        System.out.println("|______________________________________________|");
        System.out.println("|                                              |");
        System.out.println("|      INSERTE LA PALABRA CON LA QUE JUGAR     |");
        System.out.println("|______________________________________________|");
        return sc.nextLine();
    }

    static String modoMaquina(){
        String [] palabras;
        palabras = new String [15];
        palabras [0] = "ordenador";
        palabras [1] = "albaricoque";
        palabras [2] = "perro";
        palabras [3] = "guitarra";
        palabras [4] = "programacion";
        palabras [5] = "casa";
        palabras [6] = "cmelon";
        palabras [7] = "libro";
        palabras [8] = "pescado";
        palabras [9] = "fuego";
        palabras [10] = "pelinegro";
        palabras [11] = "camion";
        palabras [12] = "aeropuerto";
        palabras [13] = "pan";
        palabras [14] = "estrella";

        int randomIndex = (int) (Math.random() * 15);
        return palabras[randomIndex];
    }

    static char [] convertirArray(String palabraIni){
        char [] palabraSeparada = new char[palabraIni.length()];
        int contador;

        for (contador=0; contador < palabraSeparada.length; contador ++){
            palabraSeparada[contador] = palabraIni.charAt(contador);
        }
        return palabraSeparada;
    }

    static char [] esconderPalabra(char [] palabraArray){
        char [] palabraEscondida = new char [palabraArray.length + (palabraArray.length -1)];
        int contador;

        for (contador=0; contador < palabraEscondida.length; contador ++){
            if (contador % 2 == 1){
                palabraEscondida[contador] = ',';
            } else {
                palabraEscondida[contador] = '_';
            }
        }
        return palabraEscondida;
    }

    static void juegoAhorcado(char [] palabraArray, char [] palabraSecreta){
        int vidas = 6;
        String letraIngresada = "";
        boolean letraCorrecta = false;
        while (vidas >= 0){

            System.out.println();
            System.out.println(palabraSecreta);
            System.out.println();
            System.out.println(" ______________________________________________");
            System.out.println("|                                              |");
            System.out.println("|        TIENES " + vidas + " VIDAS RESTANTES         |");
            System.out.println("|______________________________________________|");
            System.out.println("|                                              |");
            System.out.println("|             INTRODUCE UNA LETRA:             |");
            System.out.println("|______________________________________________|");

            letraIngresada = sc.nextLine();
            letraIngresada = letraIngresada.toUpperCase();

            letraCorrecta = false;

            for (int i=0; i < palabraArray.length; i++){
                if (letraIngresada.charAt(0) == palabraArray[i]){
                    palabraSecreta[i*2] = letraIngresada.charAt(0);
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta){
                vidas --;
                muñeco(vidas);
            }

            if (String.valueOf(palabraSecreta).equals(String.valueOf(palabraArray))){
                System.out.println(" ______________________________________________");
                System.out.println("|                                              |");
                System.out.println("|                 ¡HAS GANADO!                 |");
                System.out.println("|______________________________________________|");
                System.exit(0);
            }
        }



    }

    static void muñeco(int opcion){
        String respuesta = "";
        switch (opcion) {
            case 5:
                System.out.println("   +----+");
                System.out.println("        |");
                System.out.println("        |");
                System.out.println("        |");
                System.out.println("        |");
                System.out.println("        |");
                System.out.println(" =========");
                break;
            case 4:
                System.out.println("   +----+");
                System.out.println("   |    |");
                System.out.println("        |");
                System.out.println("        |");
                System.out.println("        |");
                System.out.println("        |");
                System.out.println(" ========");
                break;
            case 3:
                System.out.println("  +----+");
                System.out.println("   |    |");
                System.out.println("   O    |");
                System.out.println("        |");
                System.out.println("        |");
                System.out.println("        |");
                System.out.println(" =======");
                break;
            case 2:
                System.out.println("   +----+");
                System.out.println("   |    |");
                System.out.println("   O    |");
                System.out.println("  /|\\   |");
                System.out.println("        |");
                System.out.println("        |");
                System.out.println(" =======");
                break;
            case 1:
                System.out.println("   +----+");
                System.out.println("   |    |");
                System.out.println("   O    |");
                System.out.println("  /|\\   |");
                System.out.println("  / \\   |");
                System.out.println("        |");
                System.out.println(" =======");
                break;
            case 0:
                System.out.println("   +----+");
                System.out.println("   |    |");
                System.out.println("        |");
                System.out.println("        |");
                System.out.println("        |");
                System.out.println(" o->-<  |");
                System.out.println(" =======");
                System.out.println();
                
                System.out.println(" ______________________________________________");
                System.out.println("|                                              |");
                System.out.println("|                  HAS MUERTO                  |");
                System.out.println("|______________________________________________|");
                System.out.println("|                                              |");
                System.out.println("|           ¿QUIERES JUGAR DE NUEVO?           |");
                System.out.println("|                  SI / NO                     |");
                System.out.println("|______________________________________________|");
                respuesta = sc.nextLine();

                if (respuesta.equalsIgnoreCase("SI") || respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("S") || respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("Si")){
                    main (null);
                } else {
                    System.out.println(" ______________________________________________");
                    System.out.println("|                                              |");
                    System.out.println("|               GRACIAS POR JUGAR              |");
                    System.out.println("|______________________________________________|");
                    System.exit(0);
                }
                break;

            default:
                break;
        }
    }
}
