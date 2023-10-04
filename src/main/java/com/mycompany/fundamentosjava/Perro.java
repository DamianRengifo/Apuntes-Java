package com.mycompany.fundamentosjava;
import java.util.Scanner;

public class Perro extends Mamifero{
    // atributos de la nueva clase de Perro
    private String raza;

    // al heredar siempre hay que crear el constructor
    public Perro(String nombre, String origen, int patas, String raza) {
        // la funcion super nos sirve para declarar los atributos de nuestra clase padre con los atributos de nuestro constructor de esta subclase
        super(nombre, origen, patas);
        this.raza = raza;
    }
}
