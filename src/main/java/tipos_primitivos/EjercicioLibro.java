/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipos_primitivos;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class EjercicioLibro {
    
    public static void main(String args[]){
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre");
        var nombre = consola.nextLine();
        
        System.out.println("Proporciona el id del libro");
        var id = Integer.parseInt(consola.nextLine());
        
        System.out.println("Proporciona el precio del libro");
        var precio = Double.parseDouble(consola.nextLine());
        
        System.out.println("Proporciona el envio gratuito S/N");
        var envio = consola.nextBoolean();
        
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envio);
      
        
    }
}
