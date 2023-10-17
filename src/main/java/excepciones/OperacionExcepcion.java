/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author USUARIO
 */
public class OperacionExcepcion extends RuntimeException //Exception
    {
    // asi definimos nuestra propia clase de excepcion
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
