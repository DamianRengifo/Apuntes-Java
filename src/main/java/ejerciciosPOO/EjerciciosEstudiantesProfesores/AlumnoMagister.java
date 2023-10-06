/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosPOO.EjerciciosEstudiantesProfesores;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class AlumnoMagister extends Alumno {

    public String Tesis;

    public AlumnoMagister(String ruta, String nombre, String universidad, String Tesis) {
        super(ruta, nombre, universidad);
        this.Tesis = Tesis;
    }

    public void setTesis(String Tesis) {
        this.Tesis = Tesis;
    }

    public String getTesis() {
        return Tesis;
    }

    public void obtenerDatos() {
        System.out.println("Nombre Estudiante: " + this.getNombre() + "\nRuta del Estudiante: "
                + this.ruta + "\nUniversidad: " + this.getUniversidad() + "\nTitulo de tesis: " + this.getTesis());
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        AlumnoMagister alumnoxd;

        System.out.println("Por favor digite la ruta del alumno");
        String ruta = consola.next();
        System.out.println("Por favor digite el nombre del alumno");
        String nombre = consola.next();
        System.out.println("Por favor digite el nombre de la universidad del alumno");
        String universidad = consola.next();
        System.out.println("Por favor digite el titulo de tesis del estudiante");
        String Tesis = consola.next();

        alumnoxd = new AlumnoMagister(ruta, nombre, universidad, Tesis);
        alumnoxd.obtenerDatos();
    }

}
