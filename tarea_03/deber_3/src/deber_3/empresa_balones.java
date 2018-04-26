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
public class empresa_balones {

  public static void main(String[] args) {
        // TODO code application logic here
        int cantidad;
        double precio;
        double subtotal;
        double precio_final;
        double descuento;
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingresar cantidad de balones comprados");
        cantidad=entrada.nextInt();
        System.out.println("ingresar precio de balon");
        precio=entrada.nextInt();
        if (cantidad==1) {
            subtotal=cantidad*precio;
            descuento=subtotal*50/100;
            precio_final=subtotal-descuento;
          System.out.printf("cantidad de balones : %d \n precio unitario: %.2f \n valor final a cancelar: %.2f",cantidad,precio,precio_final);  
        }else if(cantidad==2) {
            subtotal=cantidad*precio;
            descuento=subtotal*70/100;
            precio_final=subtotal-descuento;
           System.out.printf("cantidad de balones : %d \n precio unitario: %.2f \n valor final a cancelar: %.2f",cantidad,precio,precio_final);  
            
        }else if(cantidad>=3) {
           subtotal=cantidad*precio;
            descuento=subtotal*80/100;
            precio_final=subtotal-descuento;
           System.out.printf("cantidad de balones : %d \n precio unitario: %.2f \n valor final a cancelar: %.2f",cantidad,precio,precio_final);  
            
        }
        
    }
}
