/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

/**
 *
 * @author USUARIO
 */
public class TestArreglosObject {
    
    public static void main(String args[]){
        // esto es un arreglo de tipo objeto (Persona)
        Persona personas[] = new Persona[2];
        
        // guardamos un objeto o instanciamos en la posicion 0 xd
        personas[0] = new Persona("Damian");
        personas[1] = new Persona("Daniela");
        
        System.out.println("personas 0 = " + personas[0] );
        System.out.println("personas 1 = " + personas[1]);
        
        // asi accedemos a los getodos
        System.out.println(personas[1].getNombre());
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas = " + personas[i]);
        }
        
        // esta es una mejor manera de declarar arreglos en java
        String frutas[] = {"uva", "banano", "mora", "maracuya"};
        
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta: " + frutas[i]);
        }
    }
}
