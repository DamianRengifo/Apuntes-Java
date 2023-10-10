/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesAbstractas;

/**
 *
 * @author Aprendiz
 */
public class Operaciones extends OperacionesAbstract {

    private int a;
    private int b;

    public Operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int suma(int a, int b) {
        return (a + b);
    }
    
    @Override
    public int resta(int a, int b) {
        return(a - b);
    }
    
    @Override
    public int multiplicar(int a, int b){
        return(a * b);
    }
    
    @Override
    public int dividir(int a, int b){
        return(a / b);
    }
    
    //funciones propias de la clase
    
    public int potenciacion(int a){
        return (a * a);
    }
    
    public void mostrarDatos(){
        System.out.println("a = " + this.a + " b= " + this.b);
    }
    
    public int teoremaPitagoras(){
        return(this.a * this.a) + (this.b * this.b);
    }

    public static void main(String args[]) {
        var operacion1 = new Operaciones(5, 5);

        System.out.println("Suma = " + operacion1.suma(operacion1.a, operacion1.b));
        System.out.println("Resta = " + operacion1.resta(operacion1.a, operacion1.b));
        System.out.println("Multiplicar = " + operacion1.multiplicar(operacion1.a, operacion1.b));
        System.out.println("Dividir = " + operacion1.dividir(operacion1.a, operacion1.b));
        operacion1.mostrarDatos();
        System.out.println("Teorema de pitagoras = " + operacion1.teoremaPitagoras());

    }

}
