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
public class Ejercicio2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String persona = null, nombre = "", apellido = "";
        int hijos = 0;
        double sueldo = 0;
        double pasajes = 0;
        double bar = 0;
        double salidas = 0;
        double total_pasajes = 0;
        double total_bar = 0;
        double total_salidas = 0;
        double gasto_total = 0;
        double dinero = 50;
        boolean bandera = true;
        String cadena = "";
        while (bandera) {

            System.out.println("Ingrese el Nombre del Padre de Familia: ");
            nombre = entrada.next();
            System.out.println("Ingrese su apellido: ");
            apellido = entrada.next();
            System.out.println("Ingrese su sueldo Semanal: ");
            sueldo = entrada.nextDouble();
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
                gasto_total = total_pasajes + total_bar + total_salidas;
                cadena += String.format("Nombre de Padre de Familia:\t" + apellido
                        + "\t" + nombre + "\n"
                        + "Sueldo Semanal: \t" + sueldo + "\n"
                        + "Número de hijos: \t" + hijos + "\n\n");
                cadena += String.format("Reporte de gastos\n"
                        + "Persona\t\tPasajes\t\t\tBar\t\tSalidas\n");
                cadena += String.format(
                        "%s\t\t%.2f\t\t%.2f\t%.2f\t\n",
                        persona, pasajes, bar, salidas);
                cadena += String.format(
                        "Totales \t\t%.2f\t\t%.2f\t%.2f\t\n",
                        total_pasajes, total_bar, total_salidas);
            }

            if (gasto_total >= sueldo) {
                cadena += String.format("\nEl padre de familia\t" + apellido + "\t" + nombre + "\t[le falta ]dinero\n");
            } else if (gasto_total <= sueldo) {
                cadena += String.format("\nEl padre de familia\t" + apellido + "\t" + nombre + "\t[le sobra]dinero\n");

            } else if (gasto_total == sueldo) {

                cadena += String.format("\nEl padre de familia\t" + apellido + "\t" + nombre + "\t[le alcanza]dinero\n");

                entrada.nextLine();

            }
            System.out.println("¿Desea añadir otro reporte?");
            String temporal = entrada.nextLine();
            if (temporal.equals("no")) {
                bandera = false;
            }
        }

        System.out.printf("Reporte Gastos de Padres de Familia\n"
                + "%s", cadena);

    }
}