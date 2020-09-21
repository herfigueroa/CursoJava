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
public class Ejercicio7 {

    /**
     * Escribir un programa que dada una nota del 1 al 10 diga
     * - Aplazado de 1 al 3
     * - Regular de 4 a 5
     * - Bueno de 6 a 7
     * - Muy bueno de 8 a 9
     * - Sobresaliente si es 10
     */
    public static void main(String[] args) {
        int nota;
        Scanner numIngresado = new Scanner(System.in);
        
        System.out.println("Ingrese un nota");
        nota = numIngresado.nextInt();
        
        
        if (nota >= 1 && nota <= 3){
            System.out.println("Aplazado");
        } else if (nota >= 4 && nota <= 5){
            System.out.println("Regular");
        } else if (nota >= 6 && nota <= 7){
            System.out.println("Bueno");
        } else if (nota >= 8 && nota <= 9){
            System.out.println("Muy bueno");
        } else if (nota == 10){
            System.out.println("Sobresaliente");
        }
    }
}
