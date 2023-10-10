/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;
import java.util.Scanner;
/**
 *
 * @author Aprendiz
 */
public class OperacionesInterfaces implements OperacionesInterface {

    private int id;
    private String nombre;

    public OperacionesInterfaces(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }    

    @Override
    public String insertarEmpleado(int id, String nombre) {
        System.out.println("Se inserto correctamente el empleado");
        System.out.println("Datos del nuevo empleado:" + "\nnombre =" + nombre + "\nIdentificacion = " + id);
        return "OK-INSERT";
    }

    @Override
    public String actualizarEmpleado(String nombre) {
        System.out.println("Se actualizo correctamente el usuario con nombre de " + this.nombre + " Nuevo nombre = " + nombre);
        return "OK-UPDATE";
    }

    @Override
    public String borrarEmpleado(int id) {
        System.out.println("Se borro correctamente el usuario con identificacion = " + this.id);
        return "OK-DELETE";
    }

    @Override
    public String consultarEmpleado(int id) {
        System.out.println("Se consulto correctamente el usuario");
        return "OK-QUERY";
    }
    
    public static void main(String args[]){
        Scanner consola = new Scanner(System.in);
        var empleado1 = new OperacionesInterfaces(1, "Damian");
        
        System.out.println(empleado1.insertarEmpleado(2, "Juini"));
        System.out.println(empleado1.actualizarEmpleado("Damian Felipe"));
        System.out.println(empleado1.borrarEmpleado(1));
        System.out.println(empleado1.consultarEmpleado(1));
    }
}
