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
public class Switch {
    public static void main(String args[]){
        var consola = new Scanner(System.in);
        var estacion = "Estacion desconocida";
        var mes = Integer.parseInt(consola.nextLine());
        /*
        switch(mes){
            // asi se representaria una
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "otoño";
                break;
            default:
                System.out.println("Estacion no valida");
                break;
        }*/
        
        System.out.println("estacion = " + estacion);
        
        // el codigo anterior tambien se puede escribir de la siguiente manera 
        
         switch(mes){
            case 1, 2, 12 -> estacion = "Invierno";
            case 3, 4, 5 -> estacion = "Primavera";
            case 6, 7, 8 -> estacion = "Verano";
            case 9, 10, 11 -> estacion = "otoño";
            default -> System.out.println("Estacion no valida");
        }

        
    }
}
