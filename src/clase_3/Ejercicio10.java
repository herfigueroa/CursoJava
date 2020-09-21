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
public class Ejercicio10 {

    /**
     * Escribir un programa que al ingresar un numero entero indique cuantas
     * cifras de 0 al 99.999
     */
    public static void main(String[] args) {
        int numUsuario;
        Scanner numIngresado = new Scanner(System.in);
        
        System.out.println("Ingrese un número entre 0 a 99.999");
        numUsuario = numIngresado.nextInt();
        
        if (numUsuario >= 0 && numUsuario <= 9){
            System.out.println("El número tiene 1 cifra");
        } else if (numUsuario >= 10 && numUsuario <= 99){
            System.out.println("El número tiene 2 cifras");
        } else if (numUsuario >= 100 && numUsuario <= 999){
            System.out.println("El número tiene 3 cifras");
        } else if (numUsuario >= 1000 && numUsuario <= 9999){
            System.out.println("El número tiene 4 cifras");
        } else if (numUsuario >= 10000 && numUsuario <= 99999){
            System.out.println("El número tiene 5 cifras");
        } else {
            System.out.println("Número no válido en el rango");
        }
    }
}
