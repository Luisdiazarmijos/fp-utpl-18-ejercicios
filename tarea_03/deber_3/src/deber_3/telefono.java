
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
public class telefono {

    public static void main(String[] args) {

        // TODO code application logic here
        String nombre;
        String apellido;
        int cant_cel;
        double precio_cel;
        int tipo;
        double subtotal = 0;
        double descuento;
        double valor_final;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tipo de cliente ");
        tipo = entrada.nextInt();
        if (tipo == 1) {
            entrada.nextLine();
            System.out.println("Nombre");
            nombre = entrada.nextLine();
            System.out.println("Cantidad de Celulares");
            cant_cel = entrada.nextInt();
            System.out.println("Precio por cada celular");
            precio_cel = entrada.nextDouble();
            subtotal = cant_cel * precio_cel;
            descuento = subtotal * 10 / 100;
            valor_final = subtotal - descuento;
            System.out.printf(" Reporte \n "
                    + "Nombre: %s "
                    + "\nTipo de Cliente: %d "
                    + "\n Cantidad de Celulares: %d "
                    + "\nPrecio por cada celular: %.2f "
                    + "\nSubtotal a pagar: %.2f "
                    + "\nDescuento: %.2f "
                    + "\n valor final a cancelar: %.2f", nombre, tipo, cant_cel, precio_cel, subtotal, descuento, valor_final);

        }

    }
}
