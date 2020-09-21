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
public class Ejercicio1 {

    /**
     * Escriba un programa que determine si un numero
     * ingresado es positivo, negativo o cero
     */
    public static void main(String[] args) {
        int numeroUsuario;
        Scanner numIngresado = new Scanner(System.in);

        System.out.println("Ingrese un número");
        numeroUsuario = numIngresado.nextInt();
        
        if (numeroUsuario > 0) {
            System.out.println("El número ingresado es positivo" );
        } else if (numeroUsuario == 0) {
            System.out.println("El número ingresado es cero" );
        } else {
            System.out.println("El número ingresado es negativo" );
        }
    }
    
}
