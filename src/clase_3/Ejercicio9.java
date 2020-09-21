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
public class Ejercicio9 {

    /**
     * Escribir un programa que cuando el usuario ingrese el mes, me diga
     * cuantos días tiene.
     */
    public static void main(String[] args) {
        int numMes;
        String mesNombre = "";
        Scanner numIngresado = new Scanner(System.in);
        
        System.out.println("Ingrese un mes (en un rango de 1 a 12)");
        numMes = numIngresado.nextInt();
        
        switch (numMes) {
            case 1:
                mesNombre = "Enero";
                break;
            case 2:
                mesNombre = "Febrero";
                break;
            case 3:
                mesNombre = "Marzo";
                break;
            case 4:
                mesNombre = "Abril";
                break;
            case 5:
                mesNombre = "Mayo";
                break;
            case 6:
                mesNombre = "Junio";
                break;
            case 7:
                mesNombre = "Julio";
                break;
            case 8:
                mesNombre = "Agosto";
                break;
            case 9:
                mesNombre = "Septiembre";
                break;
            case 10:
                mesNombre = "Octubre";
                break;
            case 11:
                mesNombre = "Noviembre";
                break;
            case 12:
                mesNombre = "Diciembre";
                break;
            default:
                break;
        }

        if (numMes >=1 && numMes <= 12) {
            System.out.println("Es el mes de " + mesNombre);
        } else {
            System.out.println("Número de mes inválido");
        }
    }
}
