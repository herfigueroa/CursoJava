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
public class Ejercicio2 {

    /**
     * Escribir un algoritmo que lea un número y escriba su cuadrado
     */
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        int numCuadrado, numUsuario;
        
        System.out.println("Ingrese un número:");
        numUsuario = entradaUsuario.nextInt();
        
        numCuadrado = numUsuario * numUsuario;
        
        System.out.println("-----------------------------");
        System.out.println("El número al cuadrado: " + numCuadrado);
    }
    
}
