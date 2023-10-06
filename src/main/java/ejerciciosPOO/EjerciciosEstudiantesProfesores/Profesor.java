/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosPOO.EjerciciosEstudiantesProfesores;

/**
 *
 * @author USUARIO
 */
public class Profesor extends Persona {
    public String Especialidad;
    
    public Profesor(String ruta, String nombre, String Especialidad){
        super(ruta,nombre);
        this.Especialidad = Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getEspecialidad() {
        return Especialidad;
    }
    
    
}
