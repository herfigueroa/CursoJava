/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase_4;

/**
 *
 * @author hernan figueroa
 */
public class Ejercicio9 {

    /**
     * Escribir un programa que muestre el producto de los 10 primeros
     * números impares.
     */
    public static void main(String[] args) {
        double producto = 1;
        System.out.println("El producto de los primeros 10 números impares es: ");
        for (int numImpar = 1; numImpar <= 20; numImpar+=2) {
            producto = producto * numImpar;
        }
        System.out.println(producto);
    }

}
