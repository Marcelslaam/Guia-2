/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.pkg1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Programa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int suma = numero.nextInt();
        System.out.println("ingrese el segundo numero");
        suma = suma + numero.nextInt();
        System.out.println("la suma total es: " + suma);
     
    }
    
}
