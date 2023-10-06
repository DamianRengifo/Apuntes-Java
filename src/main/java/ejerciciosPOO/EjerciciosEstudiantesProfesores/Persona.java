/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosPOO.EjerciciosEstudiantesProfesores;



/**
 *
 * @author USUARIO
 */
public class Persona {

    public String ruta;
    public String nombre;

    public Persona(String ruta, String nombre) {
        this.ruta = ruta;
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
