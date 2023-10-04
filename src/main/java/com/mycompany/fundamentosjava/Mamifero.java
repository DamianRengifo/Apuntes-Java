package com.mycompany.fundamentosjava;
import java.util.Scanner;
public class Mamifero {

    private String nombre;
    private String origen;
    private int patas;
    public int orejas;

    public Mamifero(String nombre, String origen, int patas){
        this.nombre = nombre;
        this.origen = origen;
        this.patas = patas;

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getOrigen(){
        return origen;
    }

    public void setOrigen(String origen){
        this.origen = origen;
    }

    public int getPatas(){
        return patas;
    }

    public void setPatas(int patas){
        this.patas = patas;
    }
    /*
    public static void main(String args[]){
        Scanner consola = new Scanner(System.in);
        Mamifero perro;
        perro = new Mamifero("perro", "Herencia del lobo", 4);
        System.out.println("nombre del Mamifero = " + perro.nombre);
        System.out.println("Origen del Mamifero = " + perro.origen);
        System.out.println("Numero de patas = " + perro.patas);

    }*/
}

