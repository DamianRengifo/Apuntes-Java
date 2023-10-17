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
public class EstacionesAño {
    public static void main(String args[]){
        var consola = new Scanner(System.in);
        System.out.println("Por favor digite el mes actual");
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";
        
        if (mes == 1 || mes == 2 || mes == 12){
            estacion = "invierno";
        }
        else if (mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }
        else if (mes == 9 || mes == 10 || mes == 11){
            estacion = "Otoño";
        }
        
        System.out.println("estacion = " + estacion);
    }
}
