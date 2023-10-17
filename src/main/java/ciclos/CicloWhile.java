/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class CicloWhile {
    public static void main(String args[]){
        Scanner consola = new Scanner(System.in);
        var contador = 0;
        while(contador <= 10){
            System.out.println(contador);
            contador++;
            
            if(contador == 5){
                System.out.println("Estamos a mitad del ciclo: " + contador);
            }
        }
        
        // tablas de multiplicar 
        System.out.println("Por favor digite el numero que desea consultar su tabla de multiplicar");
        int tablaMultiplicar = Integer.parseInt(consola.nextLine());
        int numero = 1;
        
        while(numero <= 10){
            System.out.println( tablaMultiplicar + " * " + numero + " = " + (tablaMultiplicar * numero));
            numero++;
        }
        
    }
}
