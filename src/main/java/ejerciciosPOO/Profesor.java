/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosPOO;

import java.util.Scanner;

/**
 *
 * @author aprendiz
 */
public class Profesor extends Persona {
    
    private String idProfesor;

    public Profesor(String apellido, int edad, String nombre) {
        super(apellido, edad, nombre);
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public void imprimirDatos() {
        System.out.println("Codigo del Profesor: " + this.idProfesor + "\nNombre Completo del Profesor: " + this.nombre + " " + this.apellido + "\nEdad Del Profesor: " + this.edad);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Profesor Edgar;
        Profesor Lorena;
        Profesor profesorNuevo;
        Edgar = new Profesor("Joaquin Delgado", 50, "Edgar");
        Edgar.setIdProfesor("Edgar1234");
        
        Edgar.getIdProfesor();
        Edgar.imprimirDatos();
        
        Lorena = new Profesor("Caicedo", 28, "Maria Lorena");
        Lorena.setIdProfesor("Lorena1234");
        Lorena.imprimirDatos();
        
        System.out.println("Por favor ingrese el nombre del nuevo profesor: ");
        
        String apellidoProfesor = scanner.next();
        System.out.println("Por favor ingrese la edad del nuevo profesor: ");
        int edadProfesor = scanner.nextInt();
        System.out.println("Por favor ingrese el apellido del nuevo profesor: ");
        String apellidosProfesor = scanner.next();
        
        profesorNuevo = new Profesor(apellidoProfesor, edadProfesor, apellidosProfesor);
        profesorNuevo.setIdProfesor(profesorNuevo.getNombre() + "1234");
        profesorNuevo.imprimirDatos();
    }

}
