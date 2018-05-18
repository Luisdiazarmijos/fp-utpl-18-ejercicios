/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String persona = null;
        int hijos = 0;
        double pasajes = 0;
        double bar = 0;
        double salidas = 0;
        double total_pasajes = 0;
        double total_bar = 0;
        double total_salidas = 0;
        double suma = 0;
        double dinero = 50;
        String cadena = "";
        String result = "Persona\t\tPasajes\t\t\tBar\t\tSalidas";

        System.out.println("Ingrese el numero de hijos: ");
        hijos = entrada.nextInt();

        for (int contador = 1; contador <= hijos; contador++) {

            persona = String.format("hijo %d", contador);
            System.out.println("Ingrese total de gastos de pasajes: ");
            pasajes = entrada.nextDouble();
            System.out.println("Ingrese total gastos del bar: ");
            bar = entrada.nextDouble();
            System.out.println("Ingrese total gastos salidas");
            salidas = entrada.nextDouble();
            entrada.nextLine();
            total_pasajes = total_pasajes + pasajes;
            total_bar = total_bar + bar;
            total_salidas = total_salidas + salidas;
            suma = total_pasajes + total_bar + total_salidas;
            cadena += String.format("%s\t\t%.2f\t\t\t%.2f\t%.2f\t\n",
                    persona, pasajes, bar, salidas);
        }

        
         System.out.printf ("Gastos Familia\n"
                + "%s\t\t\t\t\t\n"
                + "%s\t\t\t\t\t\n"
          
        + "", result, cadena, total_pasajes, total_bar, total_salidas,suma);
    
    
    if (suma >= dinero) {
            System.out.println("El padre de familia le falta dinero");
        } else if (suma <= dinero) {
            System.out.println("El padre de familia le sobra dinero");

       
        }
}
}