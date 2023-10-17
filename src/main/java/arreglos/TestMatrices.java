/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

/**
 *
 * @author USUARIO
 */
public class TestMatrices {

    public static void main(String args[]) {
        // asi declaramos las matrices xd
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;

        System.out.println("edades 0-0: " + edades[0][0]);
        System.out.println("edades 0-1: " + edades[0][1]);
        System.out.println("edades 1-0: " + edades[1][0]);
        System.out.println("edades 1-1: " + edades[1][1]);

        edades[0][0] = 2;
        edades[0][1] = 4;
        edades[1][0] = 5;
        edades[1][1] = 10;
        edades[2][0] = 13;
        edades [2][1] = 12 * 5;

        System.out.println("edades 0-0: " + edades[0][0]);
        System.out.println("edades 0-1: " + edades[0][1]);
        System.out.println("edades 1-0: " + edades[1][0]);
        System.out.println("edades 1-1: " + edades[1][1]);
        
        // por cada iteracion de la fila se iteraran siempre sus columnas con este codigo
        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("edades" + fila + "-" + col + ": " + edades[fila][col]);
            }
        }
        
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "mora"}};
        
        imprimir(frutas);
        
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Damian");
        personas[0][1] = new Persona("Daniela");
        personas[0][2] = new Persona("Natalia");
        personas[1][0] = new Persona("Juliana");
        personas[1][1] = new Persona("Angel");
        personas[1][2] = new Persona("Santiago");
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]){
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.println("matriz = " + fila + "-" + col + ": " + matriz[fila][col]);
            }
        }
    }
}
