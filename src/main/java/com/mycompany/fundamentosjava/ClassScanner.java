/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentosjava;

// asi importamos la clase Scanner
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class ClassScanner {
    
    public static void main(String args[]){
        
        System.out.println("Por favor escribe tu nombre");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Por favor digite su titulo");
        var titulo = consola.nextLine();
        System.out.println( "Bienvenido" + titulo + " " + usuario);
                
    }
    
}
