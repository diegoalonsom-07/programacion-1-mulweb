/*
    Nombre: Diego Alonso Martinez
    Fecha: 28/10/2025
    Grupo: MULWEB 1º
    Nombre del ficher: Ejercicio16
    Descripción: de numeros a letras
 */
package com.diego.ut1_p2.ut2_p1_diego_alonso;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un número y te lo digo con palabras");
        int numero = sc.nextInt();
        int d = (numero / 10) % 10;
        int u = numero % 10;
        String uno = "uno";
        String dos = "dos";
        String tres = "tres";
        String cuatro = "cuatro";
        String cinco = "cinco";
        String seis = "seis";
        String siete = "siete";
        String ocho = "ocho";
        String nueve = "nueve";
        String diez = "Diez";
        String once = "Once";
        String doce = "Doce";
        String trece = "Trece";
        String catorce = "Catorce";
        String quince = "Quince";
        String diezi = "Dieci";
        String veinte = "Veinte";
        String veinti = "Veinti";
        String treinta = "Creinta";
        String treintai = "Creinta y";
        String cuarenta = "Cuarenta";
        String cuarentai = "Cuarenta y ";
        String cincuenta = "Cincuenta";
        String cincuentai = "Cincuenta y ";
        String sesenta = "Sesenta";
        String sesentai = "Sesenta y ";
        String setenta = "Setenta";
        String setentai = "Setenta y ";
        String ochenta = "Ochenta";
        String ochentai = "Ochenta y ";
        String noventa = "Noventa";
        String noventai = "Noventa y ";

        if (numero == 1) {
            System.out.println(uno);
        } else if (numero == 2) {
            System.out.println(dos);
        } else if (numero == 3) {
            System.out.println(tres);
        } else if (numero == 4) {
            System.out.println(cuatro);
        } else if (numero == 5) {
            System.out.println(cinco);
        } else if (numero == 6) {
            System.out.println(seis);
        } else if (numero == 7) {
            System.out.println(siete);
        } else if (numero == 8) {
            System.out.println(ocho);
        } else if (numero == 9) {
            System.out.println(nueve);
        } else if (numero == 10) {
            System.out.println(diez);
        } else if (numero == 11) {
            System.out.println(once);
        } else if (numero == 12) {
            System.out.println(doce);
        } else if (numero == 13) {
            System.out.println(trece);
        } else if (numero == 14) {
            System.out.println(catorce);
        } else if (numero == 15) {
            System.out.println(quince);
        } else if (numero == 20) {
            System.out.println(veinte);
        } else if (numero == 30) {
            System.out.println(treinta);
        } else if (numero == 40) {
            System.out.println(cuarenta);
        } else if (numero == 50) {
            System.out.println(cincuenta);
        } else if (numero == 60) {
            System.out.println(sesenta);
        } else if (numero == 70) {
            System.out.println(setenta);
        } else if (numero == 80) {
            System.out.println(ochenta);
        } else if (numero == 90) {
            System.out.println(noventa);
        } else if (d == 1) {
            System.out.print(diezi);
            if (u == 6) {
                System.out.println(seis);
            } else if (u == 7) {
                System.out.println(siete);
            } else if (u == 8) {
                System.out.println(ocho);
            } else if (u == 9) {
                System.out.println(nueve);
            }
        } else if (d == 2) {
            System.out.print(veinti);
            if (u == 1) {
                System.out.println(uno);
            } else if (u == 2) {
                System.out.println(dos);
            } else if (u == 3) {
                System.out.println(tres);
            } else if (u == 4) {
                System.out.println(cuatro);
            } else if (u == 5) {
                System.out.println(cinco);
            } else if (u == 6) {
                System.out.println(seis);
            } else if (u == 7) {
                System.out.println(siete);
            } else if (u == 8) {
                System.out.println(ocho);
            } else if (u == 9) {
                System.out.println(nueve);
            }
        } else if (d == 3) {
            System.out.print(treintai);
            if (u == 1) {
                System.out.println(uno);
            } else if (u == 2) {
                System.out.println(dos);
            } else if (u == 3) {
                System.out.println(tres);
            } else if (u == 4) {
                System.out.println(cuatro);
            } else if (u == 5) {
                System.out.println(cinco);
            } else if (u == 6) {
                System.out.println(seis);
            } else if (u == 7) {
                System.out.println(siete);
            } else if (u == 8) {
                System.out.println(ocho);
            } else if (u == 9) {
                System.out.println(nueve);
            }
        } else if (d == 4) {
            System.out.print(cuarentai);
            if (u == 1) {
                System.out.println(uno);
            } else if (u == 2) {
                System.out.println(dos);
            } else if (u == 3) {
                System.out.println(tres);
            } else if (u == 4) {
                System.out.println(cuatro);
            } else if (u == 5) {
                System.out.println(cinco);
            } else if (u == 6) {
                System.out.println(seis);
            } else if (u == 7) {
                System.out.println(siete);
            } else if (u == 8) {
                System.out.println(ocho);
            } else if (u == 9) {
                System.out.println(nueve);
            }
        } else if (d == 5) {
            System.out.print(cincuentai);
            if (u == 1) {
                System.out.println(uno);
            } else if (u == 2) {
                System.out.println(dos);
            } else if (u == 3) {
                System.out.println(tres);
            } else if (u == 4) {
                System.out.println(cuatro);
            } else if (u == 5) {
                System.out.println(cinco);
            } else if (u == 6) {
                System.out.println(seis);
            } else if (u == 7) {
                System.out.println(siete);
            } else if (u == 8) {
                System.out.println(ocho);
            } else if (u == 9) {
                System.out.println(nueve);
            }
        } else if (d == 6) {
            System.out.print(sesentai);
            if (u == 1) {
                System.out.println(uno);
            } else if (u == 2) {
                System.out.println(dos);
            } else if (u == 3) {
                System.out.println(tres);
            } else if (u == 4) {
                System.out.println(cuatro);
            } else if (u == 5) {
                System.out.println(cinco);
            } else if (u == 6) {
                System.out.println(seis);
            } else if (u == 7) {
                System.out.println(siete);
            } else if (u == 8) {
                System.out.println(ocho);
            } else if (u == 9) {
                System.out.println(nueve);
            }
        } else if (d == 7) {
            System.out.print(setentai);
            if (u == 1) {
                System.out.println(uno);
            } else if (u == 2) {
                System.out.println(dos);
            } else if (u == 3) {
                System.out.println(tres);
            } else if (u == 4) {
                System.out.println(cuatro);
            } else if (u == 5) {
                System.out.println(cinco);
            } else if (u == 6) {
                System.out.println(seis);
            } else if (u == 7) {
                System.out.println(siete);
            } else if (u == 8) {
                System.out.println(ocho);
            } else if (u == 9) {
                System.out.println(nueve);
            }
        } else if (d == 8) {
            System.out.print(ochentai);
            if (u == 1) {
                System.out.println(uno);
            } else if (u == 2) {
                System.out.println(dos);
            } else if (u == 3) {
                System.out.println(tres);
            } else if (u == 4) {
                System.out.println(cuatro);
            } else if (u == 5) {
                System.out.println(cinco);
            } else if (u == 6) {
                System.out.println(seis);
            } else if (u == 7) {
                System.out.println(siete);
            } else if (u == 8) {
                System.out.println(ocho);
            } else if (u == 9) {
                System.out.println(nueve);
            }
        } else if (d == 7) {
            System.out.print(noventai);
            if (u == 1) {
                System.out.println(uno);
            } else if (u == 2) {
                System.out.println(dos);
            } else if (u == 3) {
                System.out.println(tres);
            } else if (u == 4) {
                System.out.println(cuatro);
            } else if (u == 5) {
                System.out.println(cinco);
            } else if (u == 6) {
                System.out.println(seis);
            } else if (u == 7) {
                System.out.println(siete);
            } else if (u == 8) {
                System.out.println(ocho);
            } else if (u == 9) {
                System.out.println(nueve);
            }
        }
    }
}
