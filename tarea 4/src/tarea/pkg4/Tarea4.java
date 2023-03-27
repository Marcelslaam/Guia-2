/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Tarea4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double temp, faren;
        System.out.println("Ingrese temperatura en celcius:");
        temp = leer.nextDouble();
        faren = 32+((9*temp)/5);
        System.out.println("Su temperatura en Fahrenheit es: " + faren);
       
    }
    
}
