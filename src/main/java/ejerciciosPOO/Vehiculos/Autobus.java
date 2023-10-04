/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosPOO.Vehiculos;

/**
 *
 * @author aprendiz
 */
public class Autobus extends Vehiculo {

    private int numeroPlazas;

    public Autobus(String matricula, String modelo, String potenciaCV) {
        super(matricula, modelo, potenciaCV);
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }
    

    public static void main(String args[]) {
        Autobus autobusSeleccionColombia;
        
    }
}
