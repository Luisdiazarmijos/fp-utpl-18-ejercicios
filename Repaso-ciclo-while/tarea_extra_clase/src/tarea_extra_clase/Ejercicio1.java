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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String articulo, nom, apellido = "";
        double cantidad = 0;
        double precio_unitario = 0;
        double precio_total = 0;
        int op;
        double sub_total;
        double suma = 0;
        String cadena;
        String result = "Articulo cantidad precio_unitario precio_total";
        System.out.println("Ingrese el nombre del cliente: ");
        nom = entrada.next();
        System.out.println("Ingrese su apellido: ");
        apellido = entrada.next();
        do {
            System.out.println("Ingresar Nombre del articulo: ");
            articulo = entrada.next();
            System.out.println("Ingrese Cantidad de articulos: ");
            cantidad = entrada.nextInt();
            System.out.println("Ingrese Precio unitario de cada artículo.");
            precio_unitario = entrada.nextDouble();

            sub_total = precio_unitario * cantidad;
            suma = sub_total + suma;
            cadena = String.format("%s\t %.2f %.2f %.2f",
                    articulo, cantidad, precio_unitario, sub_total);

            System.out.println("Desea ingresar otro producto: 1.Si 2:No"); // es un mensaje 
            op = entrada.nextInt();//lectura del mensaje

        } while (op != 2);// se repite la sentencia mientras la condicion sea 1
        double sub_final = suma * 12 / 100;
        precio_total = suma + sub_final;
        System.out.printf("Factura"
                + "\n supermecado"
                + "\n nombre del cliente: %s\t%s"
                + "\n%s"
                + "\n%s"
                + "\n\t subtotal %.2f\n "
                + "\t iva14 %.2f\n"
                + "\t total %.2f", nom, apellido, result, cadena,suma, sub_final, precio_total);

    }

}
