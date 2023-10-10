/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesAbstractas.Figuras;

import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class Cuadrado extends Figura {

    private int valorLado;

    // Scanner consola = new Scanner(System.in);
    public Cuadrado(int valorLado) {
        super(4);
        this.valorLado = valorLado;
    }

    @Override
    public float area() {
        return (this.valorLado * this.valorLado);
    }

    public static void main(String args[]) {
        var cuadrado1 = new Cuadrado(13);
        System.out.println(cuadrado1.area());
    }

}
