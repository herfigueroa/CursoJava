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
public class Ejercicio4 {

    /**
     * Escribir un programa que pida 3 números y los ordene de mayor a
     * menor
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        int numMenor = 0;
        int numMedio = 0;
        int numMayor = 0;
        Scanner numIngresado = new Scanner(System.in);
        
        System.out.println("Ingrese un primer número");
        num1 = numIngresado.nextInt();
        System.out.println("Ingrese un segundo número");
        num2 = numIngresado.nextInt();
        System.out.println("Ingrese un tercer número");
        num3 = numIngresado.nextInt();
        
        if (num1 >= num2 && num1 >= num3) {
            numMayor = num1;
            if (num2 >= num3) {
                numMedio = num2;
                numMenor = num3;
            } else {
                numMedio = num3;
                numMenor = num2;
            }
        } else if (num1 >= num2 && num1 <= num3) {
            numMedio = num1;
            if (num2 >= num3) {
                numMayor = num2;
                numMenor = num3;
            } else {
                numMayor = num3;
                numMenor = num2;
            }
        } else if (num2 >= num3 && num2 >= num1) {
            numMayor = num2;
            if (num1 >= num3) {
                numMedio = num1;
                numMenor = num3;
            } else {
                numMedio = num3;
                numMenor = num1;
            }
        } else if (num2 >= num3 && num2 <= num1) {
            numMedio = num2;
            if (num1 >= num3) {
                numMayor = num1;
                numMenor = num3;
            } else {
                numMayor = num3;
                numMenor = num1;
            }
        } else if (num3 >= num1 && num3 >= num2) {
            numMayor = num3;
            if (num1 >= num2) {
                numMedio = num1;
                numMenor = num2;
            } else {
                numMedio = num2;
                numMenor = num1;
            }
        } else if (num3 >= num1 && num3 <= num2) {
            numMedio = num3;
            if (num1 >= num2) {
                numMayor = num1;
                numMenor = num2;
            } else {
                numMayor = num2;
                numMenor = num1;
            }
        }

        System.out.println("El numero mayor es: " + numMayor);
        System.out.println("El numero del medio es: " + numMedio);
        System.out.println("El numero menor es: " + numMenor);
    }
}
