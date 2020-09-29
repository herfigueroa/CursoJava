/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase_4;

import java.util.Scanner;

/**
 *
 * @author hernan figueroa
 */
public class Ejercicio7 {

    /**
     * Diseñar un algoritmo que realice el promedio de 4 números. Los
     * números podrán ser decimales y serán ingresados por pantalla por el
     * usuario.
     */
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        double sumaNumeros, promedio;
        int cantNumerosIngresar = 4;
        sumaNumeros = 0;
        
        for (int contador = 1; contador <= cantNumerosIngresar; contador++) {
            System.out.println("Ingrese un número (" + contador + " de " + cantNumerosIngresar
            + "):");
            sumaNumeros = sumaNumeros + entradaUsuario.nextInt();
        }
        System.out.println("-----------------------------");
        promedio = sumaNumeros / cantNumerosIngresar;
        System.out.println("El promedio de los " + cantNumerosIngresar + " numeros es: " + promedio);
    }
}
