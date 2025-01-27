/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contextoStatico;

/**
 *
 * @author USUARIO
 */
public class Persona {

    private int idPersona;
    private String nombre;
    // este atributo se asocia principalmente con la clase no con los objetos
    private static int contadorPersonas;

    public Persona(String nombre) {
        this.nombre = nombre;
        // incrementar el contador por cada objeto nuevo
        Persona.contadorPersonas++;
        // asignamos el nuevo valor ya incrementado
        this.idPersona = Persona.contadorPersonas;

    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }

}
