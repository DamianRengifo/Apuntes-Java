/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosPOO.EjerciciosEstudiantesProfesores;

/**
 *
 * @author USUARIO
 */
public class Alumno extends Persona {

    public String universidad;

    public Alumno(String ruta, String nombre, String universidad) {
        super(ruta, nombre);
        this.universidad = universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getUniversidad() {
        return universidad;
    }

}
