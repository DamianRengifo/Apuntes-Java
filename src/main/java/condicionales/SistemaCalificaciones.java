/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class SistemaCalificaciones {

    public static void main(String args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10");
        int nota = consola.nextInt();

        if (nota >= 9 && nota <= 10) {
            System.out.println('A');
        } else if (nota >= 8 && nota < 9) {
            System.out.println("B");
        } else if (nota >= 7 && nota < 8) {
            System.out.println("C");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("D");
        } else if (nota >= 0 && nota < 6) {
            System.out.println("F");
        } else {
            System.out.println("La calificacion no es valida");
        }

    }
}
