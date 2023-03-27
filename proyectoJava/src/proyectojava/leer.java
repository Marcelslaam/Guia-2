/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojava;

import java.util.Scanner;

/**
 *
 * @author HP
 */
class leer {

    public static void main(String[] args){
        
            Scanner leer = new Scanner(System.in);

int numero1;
int numero2;
int resultado;

System.out.println("introduce el primer numero");
numero1 = leer.nextInt();

System.out.println("Introduce el segundo numero");
numero2 = leer.nextInt();

resultado = numero1 + numero2;

System.out.println("el resultado de la suma es " + resultado);

    }
    
}
