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
    public void consultarDatos(){
        System.out.println("Matricula del autobus: " + this.getMatricula() + "\nModelo del autobus: " + this.getModelo() + 
                "\nPotencia del autobus: " + this.getPotenciaCV() + "\nNumero de plazas: " + this.getNumeroPlazas());
    }
    

    public static void main(String args[]) {
        Autobus autobusSeleccionColombia;
        autobusSeleccionColombia = new Autobus("Autobus-324423", "Modelo-at-3000", "4000w");
        autobusSeleccionColombia.setNumeroPlazas(35);
        autobusSeleccionColombia.consultarDatos();
    }
}
