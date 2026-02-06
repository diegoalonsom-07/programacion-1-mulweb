package diego.preparacion_ex;

public class EjercicoArraysSOL {

    /*
    Escribe un programa que solicite los elementos de una matriz de tamaño 4 x 4.
    La aplicación debe decidir si la matriz introducida corresponde a una matriz 
    mágica, que es aquella donde la suma de los elementos de cualquier fila o de 
    cualquier columna valen lo mismo.
     */
    /**
     *  // Comprueba si una matriz 4x4 es mágica (todas las filas y columnas
     * suman lo mismo)
     *
     * @param matriz matriz que quiero ver si es mágica
     * @return true si es magica, false si no
     */
    public static boolean esMagica(int[][] matriz) {
        int sumaReferencia = 0; //donde se va a guardar el valor a comparar
        int sumaFila = 0; // suma de toda la fila
        int sumaColumna = 0; // suma de las filas

        //Si quiero que sea para todas las matrices en lugar de 4 poner 
        //matriz[0].length teniendo en cuenta que sea cuadrada
        // Tomamos la suma de la primera fila como referencia
        for (int colum = 0; colum < 4; colum++) {
            sumaReferencia += matriz[0][colum];
        }

        // Comprobamos la suma de todas las filas
        for (int fila = 0; fila < 4; fila++) {
            sumaFila = 0;
            for (int column = 0; column < 4; column++) {
                sumaFila += matriz[fila][column];
            }
            if (sumaFila != sumaReferencia) {
                return false; // Si alguna fila no coincide, no es mágica
            }
        }

        // Comprobamos la suma de todas las columnas
        for (int column = 0; column < 4; column++) {
            sumaColumna = 0;
            for (int fila = 0; fila < 4; fila++) {
                sumaColumna += matriz[fila][column];
            }
            if (sumaColumna != sumaReferencia) {
                return false; // Si alguna columna no coincide, no es mágica
            }
        }

        return true; // Todas las filas y columnas coinciden
    }

    /*
    Debes desarrollar una aplicación que ayude a gestionar las notas de un 
    centro educativo. Los alumnos se organizan en grupos compuestos por 5 
    personas. Leer las notas (números enteros) del primer, segundo y tercer 
    trimestre de un grupo. Debes mostrar al final la nota media del grupo en 
    cada trimestre y la media del alumno que se encuentra en una posición dada 
    (que el usuario introduce por teclado).
     */
    /**
     *  // Calcula la media de un alumno específico
     *
     * @param notas matriz donde cada fila es un alumno y cada col un trimestre
     * 3X5
     * @param alumno la fila identificatoria del alumno
     * @return la media
     */
    public static double mediaAlumno(int[][] notas, int alumno) {
        double suma = 0;
        for (int trimestre = 0; trimestre < 3; trimestre++) {
            suma += notas[alumno][trimestre]; // sumamos los 3 trimestres
        }
        return suma / 3; // dividimos entre 3 para obtener la media
    }

    /**
     * // Calcula la media de un trimestre del grupo
     *
     * @param notas matriz donde cada fila es un alumno y cada col un trimestre
     * 3X5
     * @param trimestre trimestre en el que se quiere la media de todos los
     * alumnos
     * @return la media de todos los alumnos
     */
    public static double mediaTrimestre(int[][] notas, int trimestre) {
        double suma = 0;
        for (int alumno = 0; alumno < 5; alumno++) {
            suma += notas[alumno][trimestre]; // sumamos las notas de ese trimestre
        }
        return suma / 5; // dividimos entre 5 para obtener la media del grupo
    }

    /*
    Implementa la función: int[] suma(int t[], int numElementos), que crea y 
    devuelve un array con las sumas de los numElementos elementos consecutivos
    de t. Veamos un ejemplo, sea t = [10, 1, 5, 8, 9, 2]. Si los elementos de t
    se agrupan de 3 en 3, se harán las sumas: 10 + 1 + 5. Igual a 16. 1 + 5 + 8.
    Igual a 14. 5 + 8 + 9. Igual a 22. 8 + 9 + 2. Igual a 19. Por lo tanto, la 
    función devolverá un array con los resultados: [16, 14, 22, 19].
     */
 /*
    t = [10, 1, 5, 8, 9, 2], numElementos = 3
    t.length = 6
    totalSumasConsecu = 6 - 3 + 1 = 4
    Hay 4 grupos posibles de 3 elementos consecutivos:

    [10,1,5], [1,5,8], [5,8,9], [8,9,2]
     */
    /**
     *
     * @param t matriz que quiero sumar
     * @param numElementos cantidad de números consecutivos a sumar
     * @return Devuelve un array con las sumas de 'numElementos' consecutivos de
     * t
     */
    public static int[] suma(int t[], int numElementos) {
        int totalSumasConsecu = t.length - numElementos + 1; // tamaño del array resultante
        int suma = 0;
        int posicionActualEnArray = 0;
        int[] resultado = new int[totalSumasConsecu]; // vector a devolver donde se guardan las sumas

        //cada grupo consecutivo
        for (int posicionSumaEmpieza = 0; posicionSumaEmpieza < totalSumasConsecu; posicionSumaEmpieza++) {
            suma = 0;
            //sumar los elementos del grupo
            for (int posActualGrupo = 0; posActualGrupo < numElementos; posActualGrupo++) {
                posicionActualEnArray = posicionSumaEmpieza + posActualGrupo; // posición real en el array
                suma += t[posicionActualEnArray]; // sumamos los elementos consecutivos
            }
            resultado[posicionSumaEmpieza] = suma; // guardamos la suma en el array resultado
        }

        return resultado;
    }

}
