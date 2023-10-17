/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

/**
 *
 * @author USUARIO
 */
public class TestArreglos {
    public static void main(String args[]){
        // asi se declaran los arreglos en java, hay que definirles el tipo y luego instanciarlos especificando el numero de elementos
        int edades [] = new int[3];
        System.out.println("edades = " + edades);
        
        // asi arreglamos valores manualmente a los arreglos
        edades[0] = 5;
        System.out.println("edades 0 = " + edades[0]);
        
        edades[1] = 3;
        System.out.println("edades 1 = " + edades[1]);
        
        edades[2] = 9;
        System.out.println("edades 2 = " + edades[2]);
        
//        edades[3] = 19;
//        System.out.println("edades 3 = " + edades[3]);
//        
        // asi iteramos nuestro array xd
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades elementos = " + i + ": " + edades[i]);
        }
        
        // manejo de arreglos con foreach en java
        int edades1[] = {1, 5, 7, 9};
        for(int edad: edades1){
            System.out.println("edad = " + edad);
        }
        Persona personas[] = {new Persona("bonnyxd"), new Persona("Damian"), new Persona("Daniela")};
        
        for(Persona personitas: personas){
            System.out.println("personitas = " + personitas);
        }
    }
}
