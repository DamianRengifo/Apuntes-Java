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
public class ConverstionTipos {
    
    public static void main(String args[]){
    // Convertir tipos String a entero
//        var edad = Integer.parseInt("20");
//        System.out.println("edad = " + (edad + 1));
//        
//        var valorPI = Double.parseDouble("3.1416");
//        System.out.println("valorPI = " + valorPI);
//        
        var consola = new Scanner(System.in);
//        System.out.println("Por favor digita tu edad");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
        
        // El metodo valueOf es para convertir un tipo proporcionado a string
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        // con el metotdo charAt recibe un entero y con ese entero puede recorrer
        var caracter = "hola".charAt(2);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Por favor digite un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}
