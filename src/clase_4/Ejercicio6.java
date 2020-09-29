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
public class Ejercicio6 {

    /**
     * Dado un entero N entre 1 y 10 (inclusive), la computadora muestra la
     * tabla de multiplicar de N.
     */
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        int numUsuario, resultado;
        
        System.out.println("Ingrese un numero para mostrar su tabla:");
        numUsuario = entradaUsuario.nextInt();
        System.out.println("-----------------------------");
        
        if (numUsuario >= 1 && numUsuario <= 10) {
            System.out.println("Tabla del " + numUsuario);
            System.out.println("-----------------------------");
            for (int contador = 1; contador <= 10; contador++) {
                resultado = numUsuario * contador;
                System.out.println(numUsuario + " * " + contador + " = " + resultado);
            }
        } else {
            System.out.println("El numero tiene que estar entre el 1 y el 10");
        }
    }

}
