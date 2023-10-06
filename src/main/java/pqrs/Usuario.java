/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pqrs;

import java.util.Scanner;

/**
 *
 * @author aprendiz
 */
public class Usuario {

    private String nombre;
    private String apellidos;
    private String numeroIdentificacion;
    private String contraseña;
    private int edad;

    public Usuario(String nombre, String apellidos, String numeroIdentificacion, String contraseña, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
        this.contraseña = contraseña;
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setContraseña() {
        Scanner consola = new Scanner(System.in);
        int intentos = 1;
        String contUsuario = "";
        while (intentos < 3) {
            System.out.println("Por favor digite su contraseña");
            contUsuario = consola.next();

            if (contUsuario.equals(this.contraseña)) {
                System.out.println("Por favor digite su nueva contraseña nueva");
                contraseña = consola.next();
                this.contraseña = contraseña;
                System.out.println("La nueva contraseña es: " + this.contraseña);
                break;
            } else {
                System.out.println("Contraseña incorrecta");
                contraseña = consola.next();
                intentos++;
            }

        }
    }

    public void consultarDatos() {
        System.out.println("Nommbre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nNumero de identificacion: " + this.numeroIdentificacion + "\nEdad: " + this.edad);
    }

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        Usuario usuario1;

        usuario1 = new Usuario("Damian", "Rengifo", "10168342", "bonnyxd9", 18);
        usuario1.consultarDatos();
        usuario1.setContraseña();
    }

}
