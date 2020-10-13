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
public class Ejercicio4 {

    /**
     * Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 35000
     */
    public static void main(String[] args) {
        Scanner numIngresado = new Scanner(System.in);
        int sueldo, sueldoTotal, contadorSueldos, contadorSueldosMayores;
        contadorSueldosMayores = 0;
        sueldoTotal = 0;
        contadorSueldos = 1;
        
        do {
            if (contadorSueldos > 1) {
                System.out.println("Ingrese otra suma del sueldo");
            } else {
                System.out.println("Ingrese una suma del sueldo");
            }
            sueldo = numIngresado.nextInt();
            
            if (sueldo > 35000) {
                contadorSueldosMayores++;
            }
            sueldoTotal = sueldoTotal + sueldo;
            System.out.println("-----------------------------");
            contadorSueldos++;
        } while (contadorSueldos <= 10);
        System.out.println("El sueldo en total es de " + sueldoTotal + " y los sueldos mayores a 35.000 son " + contadorSueldosMayores);
    }
    
}
