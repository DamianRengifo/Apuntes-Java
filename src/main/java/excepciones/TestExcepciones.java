/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

// importamos el metodo estatico division de la clase de aritmetica
import static excepciones.Aritmetica.division;
import excepciones.OperacionExcepcion;
/**
 *
 * @author USUARIO
 */
public class TestExcepciones {

    public static void main(String args[]) {
        // como estamos en RuntimeExcepcion no estamos obligados a declarar try catch
        // int resultado = 0;
        // try{
        // resultado = 10/0;
        // resultado = division(10, 0);
        // }catch(Exception e){
        // System.out.println("Ha ocurrido un error:");
        //e.printStackTrace(System.out);
        // System.out.println(e.getMessage());
        //}
        // System.out.println("resultado = " + resultado);

        int resultado = 0;
        try {
            // resultado = 10 / 0;
            resultado = division(10, 0);
        }catch (OperacionExcepcion e){
            System.out.println("Ha ocurrido un error de tipo OperacionExepcion");
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Ha ocurrido un error de tipo Exception");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Adios amiguitos");
        }
        System.out.println("resultado = " + resultado);
    }
}
