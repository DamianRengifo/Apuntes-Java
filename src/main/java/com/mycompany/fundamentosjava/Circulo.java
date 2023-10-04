/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentosjava;
import java.util.Scanner;
/**
 *
 * @author Aprendiz
 */
public class Circulo {
    // esto nos sirve para que el usuario pueda escribir en la consola
    Scanner reader = new Scanner(System.in);
    int x;
    int y;
    int radio;
    
    // metodo constructor
    public Circulo(int x, int y, int radio){
        // asi vinculamos los parametros con nuestros atributos en la clase xd
        
        this.x = x;
        this.y = y;
        this.radio = radio;
    }
    
    
    public static void main(String[] args) {
        Circulo circulo1;
        Circulo circulo2;
        
        circulo1 = new Circulo(5, 10 ,15);
        System.out.print("valor de x " + circulo1.x + "\n" );
        System.out.print("valor de y " + circulo1.y + "\n");
        System.out.print("valor del radio " + circulo1.radio + "\n");
        
        System.out.println("Atributos del objeto de circulo2 \n");
        
        circulo2 = new Circulo(15, 110 ,215);
        System.out.print("valor de x " + circulo2.x + "\n" );
        System.out.print("valor de y " + circulo2.y + "\n");
        System.out.print("valor del radio " + circulo2.radio + "\n");
    }
}


