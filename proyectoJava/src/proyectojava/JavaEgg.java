
package proyectojava;

import java.util.Scanner;

public class JavaEgg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
      System.out.println("Ingrese nombre: ");
        String nombre = leer.nextLine();
        
        System.out.println("hola "+ nombre + "ten un buen dia");
        
    }
    
}
