/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresAritmeticos;

/**
 *
 * @author USUARIO
 */
public class OperadoresUnarios {

    public static void main(String args[]) {
        var a = 3;

        // operador para cambiar el valor de la variable a para que sea negativo
        var b = -a;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        // incremento
        // para usar bien este operador primero se debe poner el incremento antes de la variable ++e
        var e = 3;
        var f = ++e; // primero se incrementa la variable e y luego se le agrega ese valor a f
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        // postincremento usa su simbolo despues de la variable
        
        var g = 5;
        var h = g++; // primero hace el incremento pero a la variable original y esta variable h queda con el valor original de g
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        var i = 2;
        var j = --i;
        System.out.println("i= " + i);
        System.out.println("j = " + j);
        
        // postdecremento
        
        var k = 3;
        var l = k--;
        
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
