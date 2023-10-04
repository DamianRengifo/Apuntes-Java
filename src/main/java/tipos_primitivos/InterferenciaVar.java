/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipos_primitivos;

/**
 *
 * @author USUARIO
 */
public class InterferenciaVar {
    public static void main(String args[]){
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        
        // si no especificamos el F, siempre los valores con decimales seran double
        var numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
    }
}
