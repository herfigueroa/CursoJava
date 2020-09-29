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
public class Ejercicio2 {

    /**
     * Escribir un programa que simule una calculadora básica que realice
     * operaciones de suma, resta, multiplicación y división. Se deben recibir
     * como entrada dos números reales y un operador, que puede ser +, -, * ó /. La
     * salida del programa debe ser el resultado de la operación.
     */
    public static void main(String[] args) {
        Scanner numIngresado = new Scanner(System.in);
        double numeroUsuario1, numeroUsuario2, resultado;
        char operador;
        
        System.out.println("Ingrese un número");
        numeroUsuario1 = numIngresado.nextDouble();
        
        System.out.println("Ingrese el tipo de operacion (usando + para suma, - "
                + "para resta, * para multiplicacion y / para division.)");
        operador = numIngresado.next().charAt(0);
    
        System.out.println("Ingrese otro número");
        numeroUsuario2 = numIngresado.nextDouble();
        
        System.out.println("-----------------------------");
        
        switch (operador) {
            case '+':
                resultado = numeroUsuario1 + numeroUsuario2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '-':
                resultado = numeroUsuario1 - numeroUsuario2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '*':
                resultado = numeroUsuario1 * numeroUsuario2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '/':
                if (numeroUsuario2 != 0) {
                    resultado = numeroUsuario1 / numeroUsuario2;
                    System.out.println("El resultado es: " + resultado);
                } else {
                    System.out.println("No se puede dividir por 0.");
                }
                break;
                
            default:
                System.out.println("Operador invalido.");
                break;
        }
        
    }

}
