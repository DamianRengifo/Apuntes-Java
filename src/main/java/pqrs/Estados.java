/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pqrs;

/**
 *
 * @author aprendiz
 */
public class Estados extends tipoPqrs {

    private int idEstado;
    private String nomEstado;
    private String descripcion;

    public Estados(int codigoPqrs, String tipoPqrs, String descripcion, int idEstado, String nomEstado) {
        super(codigoPqrs, tipoPqrs, descripcion);
        this.idEstado = idEstado;
        this.nomEstado = nomEstado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public String getNomEstado() {
        return nomEstado;
    }

    public void setNomEstado(String nomEstado) {
        this.nomEstado = nomEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
