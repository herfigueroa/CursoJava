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
public class Ejercicio4 {

    /**
     * Dada una temperatura en grados centígrados, mostrarla en grados Fahrenheit
     */
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        double tempC, tempF;
        
        System.out.println("Ingrese la temperatura en centigrados:");
        tempC = entradaUsuario.nextDouble();
        
        tempF = (1.8*tempC) + 32;
        
        System.out.println("La temperatura en Fahrenheit es: " + tempF);
    }

}
