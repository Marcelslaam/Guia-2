/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg5;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Tarea5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num;
        num = leer.nextDouble();
        
        System.out.println("Doble: " + num*2);
        System.out.println("Triple" + num*3);
        System.out.println("Raiz" + Math.sqrt(num));
        
    }
    
}
