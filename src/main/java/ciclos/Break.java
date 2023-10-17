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
public class Break {
    
    public static void main(String args[]){
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Por favor digite el numero par al que quiere llegar");
        var numero = consola.nextInt();
        
            if(numero % 2 == 0) {
                inicio: // label
                for(int contador = 0; contador <= numero; contador ++){
                
                if( contador % 2 == 0){
                    continue inicio; // va a ir automaticamente a la siguiente iteracion, en este caso al label inicio
                }
                System.out.println(contador);
            }
            }else{
                System.out.println("El numero no es par");
            }
        
        
    }
}
