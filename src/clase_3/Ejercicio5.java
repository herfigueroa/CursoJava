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
public class Ejercicio5 {

    /**
     * Escribir un programa que al ingresar un número diga si este es par
     * impar o nulo
     */
    public static void main(String[] args) {
        int numeroUsuario;
        Scanner numIngresado = new Scanner(System.in);

        System.out.println("Ingrese un número");
        numeroUsuario = numIngresado.nextInt();
        
        if (numeroUsuario == 0) {
            System.out.println("El número es nulo");
        } else if (numeroUsuario % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
