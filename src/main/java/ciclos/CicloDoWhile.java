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
public class CicloDoWhile {
    public static void main(String args[]){
        Scanner consola = new Scanner(System.in);
        var contador = 4;
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador <= 3);
        
        // ejercicio ingrese numeros positivos y se suman hasta que se ingrese un numero negativo
        
        int numeroUsuario;
        int numeroUsuario2;

        
        do{
            System.out.println("Por favor ingrese un numero y este los sumara, si digita un numero negativo se dejara de ejecutar este programa");
            numeroUsuario = consola.nextInt();
            System.out.println("Digite el segundo numero que desea sumar");
            numeroUsuario2 = consola.nextInt();
            
            if(numeroUsuario > 0 ){
                System.out.println( numeroUsuario + " + " + numeroUsuario2 + " = " + (numeroUsuario + numeroUsuario2));
            }else{
                System.out.println("Has digitado un numero que es negativo \nChao xd");
            }
        }while(numeroUsuario > 0 || numeroUsuario2 < 0);
        
    }
    
}
