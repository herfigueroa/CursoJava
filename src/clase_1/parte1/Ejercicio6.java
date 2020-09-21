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
public class Ejercicio6 {

    /**
     * Calcular los beneficios anuales que se obtiene de las ventas de
     * manzanas y peras. Sabiendo que el precio por kilo de la manzana es de
     * $80 y el de la pera $70.
     */
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        int costosAnuales, kgManzanas, kgPeras;
        double beneficiosAnuales;
        
        System.out.println("Ingrese los costos anuales:");
        costosAnuales = entradaUsuario.nextInt();
        
        System.out.println("Ingrese los kg de Manzanas vendidos anualmente");
        kgManzanas = entradaUsuario.nextInt();
        
        System.out.println("Ingrese los kg de Peras vendidas anualmente");
        kgPeras = entradaUsuario.nextInt();
        
        beneficiosAnuales = ((kgManzanas * 80) + (kgPeras*70)) - costosAnuales;

        System.out.println("-----------------------------");
        System.out.println("Los beneficios anuales en total son de: $" + beneficiosAnuales);
    }

}
