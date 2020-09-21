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
public class Ejercicio8 {

    /**
     * Dadas las horas de trabajo calcular el sueldo de un empleado. Sabiendo
     * que el valor hora es de $250 y las horas extras se pagan al doble y solo
     * al mes pueden hacer 15 hs extras.
     */
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        int horasTrabajo, horasExtra, sueldoExtra, sueldoTotal;
        
        System.out.println("Ingrese las horas en total trabajadas:");
        horasTrabajo = entradaUsuario.nextInt();
        
        System.out.println("Ingrese las horas extras trabajadas");
        horasExtra = entradaUsuario.nextInt();

        if (horasExtra > 15) {
            horasExtra = 15;
        }
        
        sueldoExtra = (250 * 2) * horasExtra;
        sueldoTotal = (250 * horasTrabajo) + sueldoExtra;
        
        System.out.println("-----------------------------");
        System.out.println("El sueldo en total es de: $" + sueldoTotal);
    }

}
