/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pqrs;

/**
 *
 * @author aprendiz
 */
public class tipoPqrs {

    private int codigoPqrs;
    private String tipoPqrs;
    private String descripcion;

    public tipoPqrs(int codigoPqrs, String tipoPqrs, String descripcion) {
        this.codigoPqrs = codigoPqrs;
        this.tipoPqrs = tipoPqrs;
        this.descripcion = descripcion;
    }

    public int getCodigoPqrs() {
        return codigoPqrs;
    }

    public String getTipoPqrs() {
        return tipoPqrs;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
