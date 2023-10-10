/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Aprendiz
 */
public interface OperacionesInterface {
    public String insertarEmpleado(int id, String nombre);
    public String actualizarEmpleado(String nombre);
    public String borrarEmpleado(int id);
    public String consultarEmpleado(int id);
}
