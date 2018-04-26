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
public class Valores_x_y {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        int y;
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingresar el valor de x");
        x=entrada.nextInt();
        if (x<0) {
            y=3*x+10;
            System.out.printf("el valor de x es : %d y como resultado obtenemos el valor de y: %d",x,y);
            
        }else if(x>0) {
            y=x*2+6;
            System.out.printf("el valor de x es : %d y como resultado obtenemos el valor de y: %d",x,y);
            
        }else if(x==0) {
            y=1;
            System.out.printf("el valor de x es : %d y como resultado obtenemos el valor de y: %d",x,y);
            
        }
        
    }
    
}
