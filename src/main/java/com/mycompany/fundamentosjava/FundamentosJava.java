/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fundamentosjava;

/**
 *
 * @author USUARIO
 */
public class FundamentosJava {

    public static void main(String[] args) {
        System.out.println("Sout + tab nos sirve para autocompletar el System.out.println");
        System.out.println("Hello World!");
        int numero1 = 5;
        int numero2 = 5;
        String miVariableCadena = "Hola xd";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios xd";
        System.out.println(miVariableCadena);
        
        // uso de la palabra reservada var que infiere automaticamente el tipo de la variable
        var miVariable2 = 10;
        System.out.println("var " + miVariable2);
        
        var miVariableCadena2 = "Solo mcdonals";
        
        // soutv es un atajo para que me imprima automaticamente la ultima variable que he declarado
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        System.out.println("La suma de los numeros " + numero1 + " + " + numero2 + " = " + numero1 + numero2);
        
        // asi funciona la concatenacion de cadena
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        System.out.println(i + " + " + j + " = " + (i + j));// uso de parentesis modifican la prioridad
        System.out.println(i + j + " " + usuario); // la suma de izquierda a derecha, me realiza la suma
        System.out.println(usuario + " = " + i + j); // operacion de izquierda a derecha solo se hace la concatenacion, no se hace ninguna operacion
        
        // uso de los caracteres especiales para string
        var nombre = "Karla";
        System.out.println("Nueva linea = \n" + nombre);
        System.out.println("tabulador =\t" + nombre);
        System.out.println("Retroceso: \b" + nombre); // me quita un caracter
        System.out.println("Comilla simple: \'" + nombre + "'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
        if(numero1 == 5){
            System.out.println(numero1 * numero2);
        }else{
            System.out.println("No se puede hacer una operacion");
        }
    }
}
