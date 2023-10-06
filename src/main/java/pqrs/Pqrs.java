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
public class Pqrs extends Estados {
    
    private int idPqrs;
    private String tituloPqrs;
    private String descPqrs;
    private String respuestaPqrs;

    public Pqrs(int codigoPqrs, String tipoPqrs, String descripcion, int idEstado, String nomEstado, int idPqrs, String tituloPqrs, String descPqrs) {
        super(codigoPqrs, tipoPqrs, descripcion, idEstado, nomEstado);
        this.idPqrs = idPqrs;
        this.tituloPqrs = tituloPqrs;
        this.descPqrs = descPqrs;
    }

    public int getIdPqrs() {
        return idPqrs;
    }

    public String getTituloPqrs() {
        return tituloPqrs;
    }

    public String getDescPqrs() {
        return descPqrs;
    }

    public String getRespuestaPqrs() {
        if (this.respuestaPqrs == null) {
            return "El reporte por el momento no tiene respuesta";
        } else {
            return respuestaPqrs;
        }

    }
    
    
    public void contestarPqrs(String respuestaPqrs, String estadoPqrs){
       this.respuestaPqrs = respuestaPqrs;
       this.setNomEstado(estadoPqrs);
    }

    public void setTituloPqrs(String tituloPqrs) {
        this.tituloPqrs = tituloPqrs;
    }
    
    public void consultarPqrs(){
        System.out.println("Codigo del reporte: " + this.idPqrs + "\nTitulo del Reporte: " + this.tituloPqrs + "\nDescripcion: " + this.descPqrs +"\nTipo de Reporte: "
                + this.getTipoPqrs() + "\nEstado de Reporte" + this.getNomEstado() + "\nRespuesta del Reporte: " + this.getRespuestaPqrs() );
    }
    
    public static void main(String args[]){
        Scanner consola = new Scanner(System.in);
        Pqrs pqrs1;
        Pqrs pqrs2;
        
        pqrs1 = new Pqrs(1, "Queja", "Queja en contra de los malos productos", 1, "Pendiente", 1, "Que falta de respeto lo del pc", "Me entregaron un pc de 200000 en mal estado");
        pqrs1.contestarPqrs("Sin pruebas no podemos hacer nada, probablemente sea un error del envio", "Rechazado");
        pqrs1.consultarPqrs();
        System.out.println(pqrs1.getDescPqrs());
        System.out.println(pqrs1.getTituloPqrs());
        
        System.out.println("Por favor digite el tipo de reporte");
        var tipReporte = consola.next();
        System.out.println("Por favor digite el codigo del pqrs");
        var codigoPqrs = consola.nextInt();
        System.out.println("Por favor digite el titulo del pqrs");
        var tituloPqrs = consola.next();
        System.out.println("Por favor digite lo sucedido");
        var descPqrs = consola.next();
        pqrs2 = new Pqrs(1, tipReporte, "Queja es un tipo de reporte",1, "Pendiente", 2, tituloPqrs, descPqrs);
        pqrs2.consultarPqrs();
        
    }

}
