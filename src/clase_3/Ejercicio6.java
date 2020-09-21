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
public class Ejercicio6 {

    /**
     * Escriba un programa que permita ingresar valores numéricos A, B, C, D,
     * E y decir si su promedio es mayor que o igual a 10
     */
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
        double promedio;
        Scanner numIngresado = new Scanner(System.in);
        
        System.out.println("Ingrese un primer número");
        num1 = numIngresado.nextInt();
        System.out.println("Ingrese un segundo número");
        num2 = numIngresado.nextInt();
        System.out.println("Ingrese un tercer número");
        num3 = numIngresado.nextInt();
        System.out.println("Ingrese un cuarto número");
        num4 = numIngresado.nextInt();
        System.out.println("Ingrese un quinto número");
        num5 = numIngresado.nextInt();

        promedio = (num1 + num2 + num3 + num4 + num5) / 5;
        
        if (promedio >= 10) {
            System.out.println("El promedio de los 5 números es mayor o igual a 10");
        } else {
            System.out.println("El promedio de los 5 números no es mayor o igual a 10");
        }
        
        //DEBUG
        System.out.println(promedio);
    }
    
}
