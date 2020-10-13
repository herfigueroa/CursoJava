/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_5;

import java.util.Scanner;

/**
 *
 * @author hernán figueroa
 */
public class Ejercicio1 {

    /**
     * Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta
que se introduzca un 0.
     */
    public static void main(String[] args) {
        Scanner numIngresado = new Scanner(System.in);
        int numUsuario;
        boolean preguntarNumero = true;
        System.out.println("Ingrese un número");
        numUsuario = numIngresado.nextInt();
        
        do {
            if (numUsuario > 0) {
                System.out.println("El número es positivo");
            } else if (numUsuario < 0) {
                System.out.println("El numero es negativo");
            } else {
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
