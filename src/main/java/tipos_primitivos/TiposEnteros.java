/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipos_primitivos;

/**
 *
 * @author USUARIO
 */
public class TiposEnteros {

    public static void main(String args[]) {
        short numeroShort = (short) 213876;
        System.out.println("numeroShort = " + numeroShort);

        System.out.println("El valor maximo del short es = " + Short.MAX_VALUE);
        System.out.println("El valor maximo del short es = " + Short.MIN_VALUE);

        int numeroInt = (int) 32147483648L;
        System.out.println("El valor maximo del int es = " + Integer.MAX_VALUE);
        System.out.println("El valor maximo del int es = " + Integer.MIN_VALUE);
        System.out.println("numeroInt = " + numeroInt);

        // long numeroLong = (long)92233720368547758072313D;
        long numeroLong = 30;
        System.out.println("El valor maximo del long es = " + Long.MAX_VALUE);
        System.out.println("El valor min del long es = " + Long.MIN_VALUE);

    }
}
