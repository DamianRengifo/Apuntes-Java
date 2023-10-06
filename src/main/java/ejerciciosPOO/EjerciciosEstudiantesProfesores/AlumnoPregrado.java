/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosPOO.EjerciciosEstudiantesProfesores;

/**
 *
 * @author USUARIO
 */
public class AlumnoPregrado extends Alumno{

    public String Carrera;

    public AlumnoPregrado(String ruta, String nombre, String universidad, String Carrera) {
        super(ruta,nombre,universidad);
        this.Carrera = Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getCarrera() {
        return Carrera;
    }

}
