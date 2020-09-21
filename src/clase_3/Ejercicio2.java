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
public class Ejercicio2 {

    /**
     * Escribir un programa que sea capaz de encontrar
     * el máximo de 2 valores (M y N)
     */
    public static void main(String[] args) {
        int numeroM, numeroN;
        Scanner numIngresado = new Scanner(System.in);
        
        System.out.println("Ingrese un primer número");
        numeroM = numIngresado.nextInt();
        System.out.println("Ingrese un segundo número");
        numeroN = numIngresado.nextInt();

        // El enunciado dice encontrar el máximo de 2 valores
        // TODO: Preguntar si es cual es el mayor
        if (numeroM > numeroN) {
            System.out.println("El máximo de los 2 valores es: " + numeroM);
        } else {
            System.out.println("El máximo de los 2 valores es: " + numeroN);
        }
        
    }
    
}
