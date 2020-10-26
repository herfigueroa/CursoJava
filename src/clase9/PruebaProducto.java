/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

/**
 *
 * @author hernan figueroa
 */
public class PruebaProducto {

    /**
     * prueba para mostrar la info
     */
    public static void main(String[] args) {
        Laboratorio labColgate = new Laboratorio("Colgate S.A", "Scalabrini Ortiz 5524", "54-11-4239-8447");
        labColgate.mostrar();
        Producto prodJabon = new Producto("Perfumería", "Jabon Deluxe", 5.25, labColgate);
        prodJabon.mostrar();
    }
    
}
