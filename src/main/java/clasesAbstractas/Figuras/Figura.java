/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesAbstractas.Figuras;

/**
 *
 * @author Aprendiz
 */
public abstract class Figura {

    private int numLados;

    public Figura(int numLados) {
        this.numLados = numLados;
    }

    public abstract float area();

}
