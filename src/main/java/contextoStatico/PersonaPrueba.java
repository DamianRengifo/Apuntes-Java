/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contextoStatico;

/**
 *
 * @author USUARIO
 */
public class PersonaPrueba {
    
    public static void main(String args[]){
        Persona persona1 = new Persona("Damian");
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona("Daniela");
        System.out.println("persona2 = " + persona2);
        imprimir(persona1);
        imprimir(persona2);
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
}
