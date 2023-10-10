/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesPerros;

/**
 *
 * @author Aprendiz
 */
public abstract class SerVivo {
    private int esperanzaVida;
    private boolean estaVivo;
    private int edad;
    
    public SerVivo(int esperanzaVida, boolean estaVivo, int edad){
        this.esperanzaVida = esperanzaVida;
        this.estaVivo = estaVivo;        
    }
    
    public abstract void morir();
    
    
}
