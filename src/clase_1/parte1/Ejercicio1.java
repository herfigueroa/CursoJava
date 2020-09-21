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
public class Ejercicio1 {

    /**
     * Escribir un algoritmo que halle el promedio de tres valores A, B, C ingresados.
     * El mismo debe mostrar los tres valores por separado y luego el valor promedio.
     */
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        int numA, numB, numC;
        
        System.out.println("Ingrese el primer número:");
        numA = entradaUsuario.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        numB = entradaUsuario.nextInt();
        
        System.out.println("Ingrese el tercer número:");
        numC = entradaUsuario.nextInt();
        
        int promedio = (numA + numB + numC) / 3;
        
        System.out.println("-----------------------------");
        System.out.println("El primer número es: " + numA);
        System.out.println("El segundo número es: " + numB);
        System.out.println("El tercer número es: " + numC);
        System.out.println("-----------------------------");
        System.out.println("El promedio es de: " + promedio);
    }
    
}
