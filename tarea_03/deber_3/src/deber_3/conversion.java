/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_3;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class conversion {

    public static void main(String[] args) {
        // TODO code application logic here
        int f;
        int c;
        int opcion;
        int grados;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escoja una opcion de convercion: \n"
                + "[1]  La conversión de grados Celcius (C) a Fahrenheit (F)\n"
                + "[2] La conversión de Fahrenheit (F) a grados Celcius (C)\n");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            System.out.println("ingrese los grados  Celcius a convertir: \n");
            c = entrada.nextInt();
            f = (9 / 5) * c + 32;
            System.out.printf("La conversión de %d  grados Celcius (C) a Fahrenheit (F)es : %d ", c, f);
        } else if (opcion == 2) {
            System.out.println("ingrese los grados  Fahrenheit a convertir: \n");
            f = entrada.nextInt();
            c = (f - 32) * 5 / 9;
            System.out.printf("La conversión de %d Fahrenheit (F) a grados Celcius (C) es : %d ", f, c);

        }

    }
}
