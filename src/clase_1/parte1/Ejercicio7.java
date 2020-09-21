/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase_1.parte1;

import java.util.Scanner;

/**
 *
 * @author hernan figueroa
 */
public class Ejercicio7 {

    /**
     * Se desea calcular la longitud y el área de un círculo
     */
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        double radioCirculo, longitudCirculo, areaCirculo;
        
        System.out.println("Ingrese el radio de un círculo");
        radioCirculo = entradaUsuario.nextDouble();
        
        longitudCirculo = 2 * 3.14 * radioCirculo;
        areaCirculo = (radioCirculo * radioCirculo) * 3.14;
        
        System.out.println("La longitud del círculo es " + longitudCirculo + " y el area del circulo es " + areaCirculo);
    }

}
