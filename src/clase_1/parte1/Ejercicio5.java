/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase_1.parte1;

import java.util.Scanner;

/**
 *
 * @author hernan figueroa
 */
public class Ejercicio5 {

    /**
     * Dado una edad, expresarla en dias, horas, minutos y segundos.
     */
    public static void main(String[] args) {

        Scanner entradaUsuario = new Scanner(System.in);
        int edad, edadD, edadH, edadM, edadS;
        
        System.out.println("Ingrese una edad:");
        edad = entradaUsuario.nextInt();
        
        edadD = (int) (edad * 365.25);
        edadH = edad * 8766;
        edadM = edad * 525960;
        edadS = edad * 31557600;

        System.out.println("-----------------------------");
        System.out.println(edad + " años son: " + edadD + " días, " + edadH + " horas, " + edadM + " minutos y " + edadS + " segundos");
    }

}
