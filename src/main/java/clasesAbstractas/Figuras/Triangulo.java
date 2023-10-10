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
public class Triangulo extends Figura {
    private int valorBase;
    private int valorAltura;

    public Triangulo(int valorBase, int valorAltura) {
        super(3);
        this.valorBase = valorBase;
        this.valorAltura = valorAltura;
    }
    
    @Override
    public float area(){
        return(this.valorBase * this.valorAltura / 2);
    }
    
    public static void main(String args[]){
        Triangulo triangulo1 = new Triangulo(13, 13);
        var consola = new Scanner(System.in);
        System.out.println(triangulo1.area());
        
        System.out.println("Por favor digite la base del triangulo");
        var valorBase = consola.nextInt();
        
        System.out.println("Por favor digite la altura del triangulo");
        var valorAltura = consola.nextInt();
        
        Triangulo triangulo2 = new Triangulo(valorBase, valorAltura);
        System.out.println("Area de tu triangulo = " + triangulo2.area());
    }
    
    
}
