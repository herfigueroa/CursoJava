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
public class Ejercicio10 {

    /**
     * Se ingresan 5 números. La computadora muestra cuál fue el mayor y en
     * qué orden apareció.
     */
    public static void main(String[] args) {
        Scanner numIngresado = new Scanner(System.in);
        int num1, num2, num3, num4, num5;

        System.out.println("Ingrese un número");
        num1 = numIngresado.nextInt();
        System.out.println("Ingrese un número");
        num2 = numIngresado.nextInt();
        System.out.println("Ingrese un número");
        num3 = numIngresado.nextInt();
        System.out.println("Ingrese un número");
        num4 = numIngresado.nextInt();
        System.out.println("Ingrese un número");
        num5 = numIngresado.nextInt();

        System.out.println("-----------------------------");

        if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5) {
            System.out.println("El numero mayor es " + num1 + " y estaba en la primer posicion");
        } else if (num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5) {
            System.out.println("El numero mayor es " + num2 + " y estaba en la segunda posicion");
        } else if (num3 >= num1 && num3 >= num2 && num3 >= num4 && num3 >= num5) {
            System.out.println("El numero mayor es " + num3 + " y estaba en la tercera posicion");
        } else if (num4 >= num1 && num4 >= num2 && num4 >= num3 && num4 >= num5) {
            System.out.println("El numero mayor es " + num4 + " y estaba en la cuarta posicion");
        } else {
            System.out.println("El numero mayor es " + num5 + " y estaba en la quinta posicion");
        }
    }

}
