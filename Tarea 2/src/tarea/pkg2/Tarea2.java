/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Tarea2 {
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        System.out.println(nombre);
        System.out.println("HOLA " + nombre);
    }
    
}
