/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

/**
 *
 * @author USUARIO
 */
public class CondicionalesBasicas {
    public void main(String args[]){
     var a = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultado = a >= 0 && a <= 10;
        if(resultado){
            System.out.println("Dentro de rango");
        }
        else{
            System.out.println("Fuera de rango");
        }
        
        var vacaciones = false;
        var diaDescanso = true;
        
        if( vacaciones || diaDescanso){
            System.out.println("Padre puede asisitir al juego del hijo");
        }
        else{
            System.out.println("El padre esta ocupado");
        }
        
        // uso de operador ternario que se usa solamente en casos que no necesiten una estructura de if else compleja
        var numero = 8;
        var resultado2 = (numero % 2 == 0) ? "El numero es Par" : "El numero no es par";
        System.out.println("resultado2 = " + resultado2);
    }
}
