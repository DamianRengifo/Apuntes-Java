/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosPOO.Vehiculos;

/**
 *
 * @author aprendiz
 */
public class Vehiculo {
    private String matricula;
    private String modelo;
    private String potenciaCV;

    public Vehiculo(String matricula, String modelo, String potenciaCV) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPotenciaCV() {
        return potenciaCV;
    }
    
    
}