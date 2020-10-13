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
public class Ejercicio6 {

    /**
     * Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que
miden más de 1.75.
     */
    public static void main(String[] args) {
        Scanner numIngresado = new Scanner(System.in);
        int edadTotal = 0, edadIngresada, edadPromedio, contadorMayores = 0, contadorAltos = 0;
        double estaturaTotal = 0, estaturaIngresada, estaturaPromedio;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese la edad del alumno " + i + ":");
            edadIngresada = numIngresado.nextInt();
            edadTotal = edadTotal + edadIngresada;
            if (edadIngresada > 18) {
                contadorMayores++;
            }

            System.out.println("Ingrese la estatura del alumno " + i + ":");
            estaturaIngresada = numIngresado.nextDouble();
            estaturaTotal = estaturaTotal + estaturaIngresada;
            if (estaturaIngresada >= 1.75) {
                contadorAltos++;
            }
        }
        
        edadPromedio = edadTotal / 5;
        estaturaPromedio = estaturaTotal / 5;
        
        System.out.println("-----------------------------");
        System.out.println("La edad promedio es de: " + edadPromedio);
        System.out.println("La estatura promedio es de: "  + estaturaPromedio);
        System.out.println("Hay " + contadorMayores + " alumnos mayores de 18 años");
        System.out.println("Hay " + contadorAltos + " alumnos que miden más de 1.75");
    }
    
}
