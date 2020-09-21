/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_3;

import java.util.Scanner;

/**
 *
 * @author hernan figueroa
 */
public class Ejercicio11 {

    /**
     * Construiri un programa que dado la categoría y el sueldo de un
     * trabajador, calcule el aumento correspondiente teniendo en cuenta la
     * siguiente información
     * - Categoría 1: 15%
     * - Categoría 2: 10%
     * - Categoría 3: 8%
     * - Categoría 4: 5%
     */
    public static void main(String[] args) {
        int categoria, porDescuento;
        double sueldo, aumento;
        Scanner numIngresado = new Scanner(System.in);

        System.out.println("Ingrese la categoría del trabajador");
        categoria = numIngresado.nextInt();
        System.out.println("Ingrese el sueldo del trabajador");
        sueldo = numIngresado.nextInt();

        switch (categoria) {
            case 1:
                porDescuento = 15;
                break;
            case 2:
                porDescuento = 10;
                break;
            case 3:
                porDescuento = 8;
                break;
            case 4:
                porDescuento = 5;
                break;
            default:
                porDescuento = 0;
                break;
        }

        aumento = (sueldo * porDescuento) / 100;        
        sueldo = sueldo + aumento;

        System.out.println("El empleado de categoría " + categoria +
              " va a recibir un aumento de " + aumento + " y su sueldo final es"
              + " de " + sueldo);
    }
    
}
