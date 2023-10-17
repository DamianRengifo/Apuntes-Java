/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Rectangulo {
    
    public static void main(String args[]){
        var consola = new Scanner(System.in);
        /*
        System.out.println("Proporciona el alto");
        var alto = consola.nextInt();
        System.out.println("Proporciona el ancho");
        var ancho = consola.nextInt();
        
        var area = alto * ancho;
        var perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        */
        System.out.println("Proporciona el primer numero");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el segundo numero");
        var numero2 = Integer.parseInt(consola.nextLine());
        
        var resultado = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("El numero mayor es:\n" + resultado);
    }
 
}
