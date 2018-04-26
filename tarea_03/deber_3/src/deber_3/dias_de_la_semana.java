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
public class dias_de_la_semana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        num = entrada.nextInt();
        switch (num) {
            case 1:
                System.out.println("lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Debe ingresar un numero del 1 al 7");
                ;

        }
    }

}
