/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosPOO.EjerciciosEstudiantesProfesores;

/**
 *
 * @author USUARIO
 */
public class ProfesorHora extends Profesor{
    public int Horas;
    
    public ProfesorHora(String ruta, String nombre, String Especialidad, int Horas){
        super(ruta,nombre,Especialidad);
        this.Horas = Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    public int getHoras() {
        return Horas;
    }
    
}
