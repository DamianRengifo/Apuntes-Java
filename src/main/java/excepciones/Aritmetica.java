/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author USUARIO
 */
public class Aritmetica {
    // con RuntimeException no nos obliga a lanzar una posible excepcion en la funcion
    public static int division(int numerador, int denominador) // throws OperacionExcepcion
    {
        if(denominador == 0){
            throw new OperacionExcepcion("No se puede dividir entre cero");
        }
        return numerador / denominador;
    }
}
