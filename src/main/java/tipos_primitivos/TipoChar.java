/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipos_primitivos;

/**
 *https://en.wikipedia.org/wiki/List_of_Unicode_characters para la lista de los caracteres especiales unicode
 * @author USUARIO
 */
public class TipoChar {
    public static void main(String args[]){
        char miCaracterChar = 'a';
        System.out.println("miCaracterChar = " + miCaracterChar);
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSymbol = '!';
        System.out.println("varCharSymbol = " + varCharSymbol);
        
        var varChar1 = '\u0021';
        System.out.println("varChar = " + varChar1);
        
        var varCharDecimal1 = (char)33;
        System.out.println("varCharDecimal = " + varCharDecimal1);
        
        var varCharSymbol2 = '!';
        System.out.println("varCharSymbol = " + varCharSymbol2);
    }
}
