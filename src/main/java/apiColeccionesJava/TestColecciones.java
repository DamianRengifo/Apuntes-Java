/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apiColeccionesJava;

import java.util.*;

/**
 *
 * @author USUARIO
 */
public class TestColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        
        // las listas son en realidad objetos por lo cual en el for debemos pasarla como si fuera un objeto
        System.out.println("Iterando la lista con foreach");
        for (Object elemento : miLista) {
            System.out.println(elemento);
        }
        
        System.out.println("Iterando la lista con funciones lambda");
        // con esta funcion lambda podemos mejorar mucho mas el codigo
        miLista.forEach(elemento -> {
            System.out.println(elemento);
        });
        
        // asi declaramos un set en java
        System.out.println("Iterando un set con la funcion de imprimir");
        Set miSet =  new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        
        imprimir(miSet);
        
        Map miMapa = new HashMap();
        miMapa.put("nombre", "Damian");
        miMapa.put("nombre2", "Daniela");
        miMapa.put("nombre3", "Juliana");
        miMapa.put("nombre4", "Bonny");
        
        String elemento = (String) miMapa.get("nombre");
        System.out.println("elemento = " + elemento);
        
        // asi podemos llamar todos las llaves de nuestro mapa
        imprimir(miMapa.keySet());
        // asi podemos llamar todos los valores de nuestro mapa
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection coleccion){
        coleccion.forEach(elemento->{
            System.out.println("elemento = " + elemento);
        });
    }

}
