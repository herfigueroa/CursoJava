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
public class Ejercicio3 {

    /**
     * Pedir números hasta que se teclee un 0, mostrar la suma de todos los números
introducidos.
        Scanner numIngresado = new Scanner(System.in);
        int numUsuario;
        boolean preguntarNumero = true;
        System.out.println("Ingrese un número");
        numUsuario = numIngresado.nextInt();
        
        do {
            if (numUsuario == 0) {
                preguntarNumero = false;
            }
            System.out.println("-----------------------------");
            if (preguntarNumero) {
                System.out.println("Ingrese otro número");
                numUsuario = numIngresado.nextInt();
            }
        } while (preguntarNumero == true);
     */
    public static void main(String[] args) {
        Scanner numIngresado = new Scanner(System.in);
        int numUsuario;
        boolean preguntarNumero = true;
        System.out.println("Ingrese un número");
        numUsuario = numIngresado.nextInt();
        
        do {
            if (numUsuario == 0) {
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
