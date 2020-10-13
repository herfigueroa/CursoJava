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
public class Ejercicio7 {

    /**
     * Una cuenta bancaria tiene 30000 pesos de saldo. El usuario ingresará
valores que corresponden a extracciones vía cajero automático. Por
cada extracción se debe mostrar como quedó el saldo luego de la
operación. Una extracción que supere al saldo disponible se debe
rechazar indicando que no es posible la operación. El programa finaliza
cuando el saldo queda en cero.
     */
    public static void main(String[] args) {
        Scanner numIngresado = new Scanner(System.in);
        double saldoTotalBanco = 30000, cantidadExtraccion;
        do {
            System.out.println("Ingrese la cantidad a retirar:");
            System.out.println("Actualmente tiene: $" + saldoTotalBanco);
            cantidadExtraccion = numIngresado.nextDouble();
            if (cantidadExtraccion > saldoTotalBanco) {
                System.out.println("Saldo insuficiente para realizar esa operación");
            } else {
                saldoTotalBanco = saldoTotalBanco - cantidadExtraccion;
            }
            System.out.println("-----------------------------");
        } while (saldoTotalBanco > 0);
    }
}
