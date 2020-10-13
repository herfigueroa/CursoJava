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
public class Ejercicio2 {

    /**
     * Pedir números hasta que se teclee uno negativo, y mostrar cuántos números
se han introducido.
     */
    public static void main(String[] args) {
        Scanner numIngresado = new Scanner(System.in);
        int numUsuario, contador;
        boolean preguntarNumero = true;
        System.out.println("Ingrese un número");
        numUsuario = numIngresado.nextInt();
        contador = 0;
        
        do {
            contador++;
            if (numUsuario >= 0) {
                System.out.println("El número es positivo");
            } else {
                System.out.println("La cantidad de numeros ingresados fueron " + contador);
                preguntarNumero = false;
            }
            System.out.println("-----------------------------");
            if (preguntarNumero) {
                System.out.println("Ingrese otro número");
                numUsuario = numIngresado.nextInt();
            }
        } while (preguntarNumero == true);
    }
    
}
