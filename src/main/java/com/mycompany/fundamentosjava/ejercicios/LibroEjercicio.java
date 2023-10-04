/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentosjava.ejercicios;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class LibroEjercicio {
    
    public static void main(String args[]){
        Scanner consola =  new Scanner(System.in);
        
        System.out.println("Proporciona el titulo: ");
        var titulo = consola.nextLine();
        System.out.println("Proporciona el autor: ");
        var autor = consola.nextLine();
        
        System.out.println(titulo + "fue escrito por: " + titulo);
        
    }
}
