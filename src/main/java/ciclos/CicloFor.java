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
public class CicloFor {
    
    public static void main(String args[]){
        Scanner consola =  new Scanner(System.in);
        for(int contador = 0; contador <= 3; contador++){
            System.out.println("contador = " + contador);
        }
        
        // ejercicio suma de numeros pares xd
        
        System.out.println("Por favor digite un numero par");
        var numeroPar = consola.nextInt();
        
        if(numeroPar % 2 == 0){
            int resultado = 0;
            
            for(int contador = 0; contador <= numeroPar; contador += 2){
                resultado += contador;
            }
            System.out.println("El valor de la suma entre todos los numeros anteriores a tu numero par es: " + resultado);
            
        }else{
            System.out.println("El numero " + numeroPar + " no es un numero par");
        }
    }
}
