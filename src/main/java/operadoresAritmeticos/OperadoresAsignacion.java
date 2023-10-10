/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresAritmeticos;

/**
 *
 * @author USUARIO
 */
public class OperadoresAsignacion {
    
    public static void main(String args[]){
        int a = 3, b = 2;
        int c = a + 5 - b;
        System.out.println("a = " + c);
        
        a += 1; // a = a + 1
        System.out.println("a = " + a);
        
        a += 3; // a = a + 3
        System.out.println("a = " + a);
        
        a -= 2;
        System.out.println("a = " + a);
        
        a *= 2;
        System.out.println("a = " + a);
        
        a /= 2;
        System.out.println("a = " + a);
        
        a %= 2;
        System.out.println("a = " + a);
    }
}
