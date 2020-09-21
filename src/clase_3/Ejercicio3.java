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
public class Ejercicio3 {

    /**
     * Escriba un programa que permita leer dos valores numéricos A y B. Si A
     * es mayor que B debe realizar la suma de ambos, caso contrario, se hace
     * el producto
     */
    public static void main(String[] args) {
        int num1, num2, numFinal;
        Scanner numIngresado = new Scanner(System.in);
        
        System.out.println("Ingrese un primer número");
        num1 = numIngresado.nextInt();
        System.out.println("Ingrese un segundo número");
        num2 = numIngresado.nextInt();

        // El enunciado dice encontrar el máximo de 2 valores
        // TODO: Preguntar si es cual es el mayor
        if (num1 > num2) {
            numFinal = num1 + num2;
        } else {
            numFinal = num1 * num2;
        }
        
        System.out.println("El número final es: " + numFinal);
    }
    
}
