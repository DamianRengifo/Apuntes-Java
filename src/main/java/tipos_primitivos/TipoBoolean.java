/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipos_primitivos;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class TipoBoolean {
    
    
    public static void main(String args[]){
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean){
            System.out.println("La bandera es verdadera");
        }
        else{
            System.out.println("La vandera no es verdadera");
        }
        
        var edad = 30;
        var esAdulto = edad >= 18;
        
        if(esAdulto){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
    }
}
