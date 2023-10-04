/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosPOO.Vehiculos;

import java.util.Scanner;

/**
 *
 * @author aprendiz
 */
public class Taxi extends Vehiculo {

    private String numeroLicencia;

    public Taxi(String matricula, String modelo, String potenciaCV) {
        super(matricula, modelo, potenciaCV);

    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void consultarDatos() {
        System.out.println("Matricula del taxi: " + this.getMatricula() + "\nModelo del taxi: " + this.getModelo() + "\npotencia del taxi: " + this.getPotenciaCV()
                + "\nNumero de Licencia: " + this.numeroLicencia);
    }

    public static void main(String args[]) {
        Taxi taxi1;
        Taxi taxi2;
        Scanner consola = new Scanner(System.in);
        taxi1 = new Taxi("ABC3000", "Taxi R3000", "70w");
        taxi1.setNumeroLicencia("DFC-354");
        taxi1.consultarDatos();

        System.out.println("Por favor digite la matricula del taxi");
        String matriculaTaxi = consola.next();
        System.out.println("Por favor digite el modelo del taxi");
        String modeloTaxi = consola.next();
        System.out.println("Por favor digite la potencia del taxi");
        String potenciaTaxi = consola.next();
        System.out.println("Por favor digite el numero de licencia del taxi");
        String numeroLicenciaTaxi = consola.next();

        taxi2 = new Taxi(matriculaTaxi, modeloTaxi, potenciaTaxi);
        taxi2.setNumeroLicencia(numeroLicenciaTaxi);
        taxi2.consultarDatos();

    }
}
