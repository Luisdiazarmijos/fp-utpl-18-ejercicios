/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_extra_clase;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio2 {
public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String origen = null, marca = null;
        int cantidad_de_autos = 0;
        double costo = 0;
        double impuesto = 0;
        double sub_total;
        double suma = 0;
        double total_impuestos = 0;
        double total_ventas = 0;
        String cadena = "";
        int cant_arg = 0,cant_col = 0,cant_chi = 0,cant_otro = 0;
        String result = "Marca\t\tOrigen\t\t\tCosto\t\tImpuesto\t\tPrecio Venta";
        System.out.println("Ingrese Cantidad de autos: ");
        cantidad_de_autos = entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i < cantidad_de_autos; i++) {
            System.out.println("Ingrese Marca de auto: ");
            marca = entrada.nextLine();
            System.out.println("Ingrese Origen de auto:");
            origen = entrada.nextLine();
            System.out.println("Ingrese Precio de auto: ");
            costo = entrada.nextDouble();
            entrada.nextLine();
            if ("argentina".equals(origen)) {
                impuesto = costo * 20 / 100;
                cant_arg=cant_arg+1;
            } else if ("colombia".equals(origen)) {
                impuesto = costo * 25 / 100;
                 cant_col=cant_col+1;
            } else if ("chile".equals(origen)) {
                impuesto = costo * 30 / 100;
                 cant_chi=cant_chi+1;
            } else {
                impuesto = costo * 40 / 100;
             cant_otro=cant_otro+1;
            } 
            sub_total = costo + impuesto;
            suma = sub_total + suma;
            total_impuestos=sub_total+total_impuestos;
             total_ventas=total_ventas+suma;
            
            cadena += String.format("%s\t\t%s\t\t\t%.2f\t%.2f\t\t\t%.2f\t\n",
                    marca,origen,costo,  impuesto, sub_total);
        }

    

    System.out.printf (

"Factura\n"
                + "Reportes de autos importados \n"
                + "%s\t\t\t\t\t\n"
                + "%s\t\t\t\t\t\n"
                + "\nTotal de Autos\t\t%d\t\t "
                + "Tot imp. \t%.2f\t"
                + "\t Tot. pvp \t%.2f\n"
        + "Argentina%d\n"
        + "chile%d\n"
        + "colombia%d\n"
        + "resto de paises%d\n"
        + "", result, cadena, cantidad_de_autos, total_impuestos, total_ventas,cant_arg ,cant_col,cant_chi,cant_otro);
    }

}