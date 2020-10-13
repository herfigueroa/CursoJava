/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_5;

import java.util.Scanner;

/**
 *
 * @author hernan figueroa
 */
public class Ejercicio5 {

    /**
     * Realizar un programa que solicite los valores mínimo y máximo de un rango a
continuación solicitara por teclado un número que debe estar dentro del rango.
Si el valor introducido no pertenece al rango , la aplicación volverá a pedir otro
valor y así repetida veces hasta que el valor este dentro del rango.
     */
    public static void main(String[] args) {
        Scanner numIngresado = new Scanner(System.in);
        double numeroComparacion, rangoMin, rangoMax;
        boolean numeroDentroDeRango = false;
        System.out.println("Ingrese el valor mínimo de un rango");
        rangoMin = numIngresado.nextDouble();
        System.out.println("Ingrese el valor máximo de un rango");
        rangoMax = numIngresado.nextDouble();
        System.out.println("Ingrese un numero (debe estar dentro del rango):");
        numeroComparacion = numIngresado.nextDouble();

        do {
            if (numeroComparacion < rangoMin || numeroComparacion > rangoMax) {
                System.out.println("El número esta fuera de rango, por favor, ingrese un numero (debe estar dentro del rango):");
                numeroComparacion = numIngresado.nextDouble();
            } else {
                System.out.println("El número está dentro del rango");
                numeroDentroDeRango = true;
            }
        } while (numeroDentroDeRango == false);
    }
    
}
